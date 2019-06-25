package com.bit.example;

import java.net.*;
import java.io.*;

// 스레드.
public class MultiServerThread implements Runnable{
	private Socket socket;
	private MultiServer ms;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	public MultiServerThread(MultiServer ms){
		this.ms = ms;
	}
	public synchronized void run(){
		boolean isStop = false;
		try{
			// 소켓이 private 선언이 되어있기 때문에 get매서드를 사용해서 가져옴.
			socket = ms.getSocket();
			// 소켓에 있는 내용을 inputstream으로 읽고 또 objectinputstream으로 필터처리.
			ois = new ObjectInputStream(socket.getInputStream());
			// 위와 마찬가지. outputstream 소켓에 있는 내용을 쓰는데에 활용.
			oos = new ObjectOutputStream(socket.getOutputStream());
			// 소켓내용을 담을곳을 만듦.
			String message = null;
			while(isStop){
				// ois를 통해서 object로부터 읽은 내용을 (String)으로 캐스팅해서 message에 저장.
				message = (String)ois.readObject();
				// message를 #을 기준으로 자른 것을 String배열에 저장.
				String[] str = message.split("#");
				// String배열에 저장된 내용중 1번째가 "exit" 일 경우.
				if(str[1].equals("exit")){
					// broadCasting매서드에 message를 전달하고
					broadCasting(message);
					// isStop를 true로 바꿔 정지되도록.
					isStop = true;
					// String배열에 저장된 내용중 첫번째가 exit가 아닐경우
				}else{
					// broadCasting매서드에 message를 전달
					broadCasting(message);
				}
			}
			// 정상적으로 종료했을 시.
			// 멀티서버에서 리스트를 받아와서 그 객채를 지움.
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress()+"정상적으로 종료하셨습니다");
			System.out.println("list size : "+ms.getList().size());
		}catch(Exception e){
			// 비정상적으로 종료했을 시.
			// 멀티서버에서 리스트를 받아와서 그 객채를 지움.
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress()+"비정상적으로 종료하셨습니다");
			System.out.println("list size : "+ms.getList().size());
		}
	}
	// 다른 소켓에게 메세지를 보내는 메서드.
	public void broadCasting(String message)throws IOException{
		// 멀티서버에서 list를 가져와서 모든 소켓의 내용을 꺼냄.
		for(MultiServerThread ct : ms.getList()){
			// 꺼낸 메세지를 send메서드에 전달함.
			ct.send(message);
		}
	}
	// 해당객체에 message를 쓰는 역할.
	public void send(String message)throws IOException{
		// broadCasting으로 전달받은 내용을 oos를 통해서 Object에 씀.
		oos.writeObject(message);
	}
}
