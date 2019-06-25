package com.bit.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

// 다중의 접속. 
	// accept를 했을 때 접속된 소켓 객체를 반환함.
	// accept를 무한루프 (몇명이 들어올지 모르기 때문에)
 	// 그때마다 소켓 객체를 반환함.
// 다중의 메시지를 읽어다가 모든 아웃풋스트림에 뿌려줘야함.
	// 소켓에서는 IO를 뽑아낼 수 있음. InputStream, OutputStream
	// 이는 몇개가 될지 모르기 때문에 자료구조에 소켓을 담아서.
	// 또는 OutputStream만 자료구조에 담는 것도 가능.
// 입력이 다중채널로 들어옴.
	// 입력을 감시해야함. (InputStream을 감지)
	// 접속하나당 하나의 쓰레드로 만들고 그 쓰레드를 리드라인.
	// 입력이 들어오면 msg를 만들고 이 msg를 전체한테 뿌려주는 기능이 필요함.(IO를 통해서)
// 서버는 입력만 받고. 메인에서는 입력된 것을 뿌려주는 기능을 해야함.

public class Server extends Thread{
	Socket sock;	// 런에서 받아 쓸수 있도록.
	static ArrayList<Socket> list = new ArrayList<Socket>();
	
	public Server(Socket sock) {
		this.sock = sock; //받아온 소켓을 필드로 올림.
	}

	public void run() {
		//쓰레드 하나당 하나의 클라이언트. 이는 클라이언트에서 들어오는 메세지를 감시하는 역할.
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			while(true){
				String msg = br.readLine();
				String temp = "";
//				System.out.println(this.sock.getInetAddress());
//				if(this.sock.getInetAddress().toString().equals("/127.0.0.1")){
//					temp = "나";
//				}else{
//					temp = "상대방";
//				}
				sayAll(/*temp+" : "+*/msg+'\n');
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){br.close();}
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void sayAll(String msg){ // 모든 클라이언트에게 메세지를 뿌려줄 기능을 가진 메서드.
		for(int i=0; i<list.size(); i++){
			Socket sock = list.get(i);
			try {
				OutputStream out = sock.getOutputStream(); // 소켓으로부터 뽑아야 하니.
				out.write(msg.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		ServerSocket serve = null;
		int port = 5000;
		
		try {
			serve = new ServerSocket(port);
			
			while(true){
				Socket sock = serve.accept(); // 어셉트하면 소켓객체를 반환.
								// 한명만 받는 것이 아니라 여려명을 받기 때문에 무한루프.
				list.add(sock);
				Server thr = new Server(sock); // 쓰레드. 서버클래스쓰레드
				thr.start();
				// 들어온 객체가 나갈 때 발생하는 에러메세지를 어떻게 바꾸는 것이 관건.
//				System.out.println(sock);
			} 
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(serve!=null){serve.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
