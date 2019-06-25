package com.bit.blind;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 각각의 클라이언트의 소켓 객체를 유지하기 위한 클래스
 * 서버의 Socket 객체를 유지하고 MultiServer의 Collection을 가지고 잇기 때문에 다른 클라이언트에게 메세지를 보낼 수 있다.
 * 
 * msg를 object로 주고 받음
 */
public class MultiServerThread implements Runnable {
	public Socket socket;
	public MultiServer ms;
	public ObjectInputStream ois;
	public ObjectOutputStream oos;

	public MultiServerThread(MultiServer multiServer) {
		this.ms = multiServer;	//
		
		
	}

	public void run() {
		boolean isStop = false;
		
		socket = ms.getSocket();		//MultiServer에서 생성된 객체를 반환한다.
		try {
			ois = new ObjectInputStream(socket.getInputStream());	//Socket 객체로 바이트입력스트림을 생성하고, 이것으로 ois 객체를 생성한다.
			oos = new ObjectOutputStream(socket.getOutputStream());	//Socket 객체로 바이트출력스트림을 생성하고, 이것으로 oos 객체를 생성한다.
			
			String msg = null;
			
			
			if(this.ms.getList().size()==2){
				broadCasting("id#Q#q0");
			}
			
			while(!isStop){
				
				msg = (String)ois.readObject();			//입력받은 ois을 문자열로 읽는다.
				String[] str  = msg.split("#");			//전송된 문자열은 <아이디>#<chat>#msg로 이루어져 있다.
				if(str[2].equals("exit")){
					broadCasting(msg);					//받은 내용을 알린다.
					isStop = true;						//문자열 받기를 마친다.
				}else{
					broadCasting(msg);					//받은 내용을 알린다.
				}
			}
			
			ms.getList().remove(this);					//멀티서버에 있는 스레드를 관리하는 collection에서 이 스레드를 제거한다.
			System.out.println(socket.getInetAddress() +" 정상적으로 종료하였습니다.");	//해당 소켓의 종료 메세지 출력
			System.out.println("serverList size : "+ ms.getList().size());		//해당 소켓이 제거된 collection의 크기를 출력
		} catch (Exception e) {	//예외 상황이 발생한 경우
			e.printStackTrace();
			ms.getList().remove(this);		//해당 소켓을 제거
			System.out.println(socket.getInetAddress() +" 비정상적으로 종료하였습니다.");	//해당 소켓의 종료 메세지 출력
			System.out.println("serverList size : "+ ms.getList().size());		//해당 소켓이 제거된 collection의 크기를 출력
		}
		
	}


	//해당 스레드가 collection 에 있는 모든 멀티서버스레드를 불러와 메세지를 보낸다.
	public void broadCasting(String msg) {
		for (MultiServerThread tempMst : ms.getList()) {
			tempMst.send(msg);
		}
	}

	//메세지를 오브젝트로 써서 보낸다.
	public void send(String msg) {
		try {
			oos.writeObject(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}