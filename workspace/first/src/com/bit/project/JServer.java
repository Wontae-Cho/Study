package com.bit.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class JServer extends Thread{ // 쓰레드를 상속받아 내가 쓰레드
	Socket sock;	// 런에서 받아 쓸수 있도록.
	static ArrayList<Socket> list = new ArrayList<Socket>();
	
	// 생성자.
	public JServer(Socket sock) { 
		this.sock = sock; //받아온 소켓을 필드로 올림.
	}
	// 실질적으로 들어온 객체가 실행하게 될 부분.
	public void run() {
		// 객체가 들고있는 정보를 먼저 읽어야 함.
		InputStream is = null;
		// 객체가 들고있는 정보가 문자열이므로 문자열 스트림을 적용.
		InputStreamReader isr = null;
		// 문자열 스트림을 좀 더 편하고 쉽게 읽기 위해서 버퍼드리더 적용.
		BufferedReader br = null;
		
		try {
			// sock 객체로부터 정보를 읽어들여야 함.
			is = sock.getInputStream();
			// 문자열 필터 적용.
			isr = new InputStreamReader(is);
			// 버퍼드 필터 적용.
			br = new BufferedReader(isr);
			
			while(true){
				// 버퍼드리더를 통해 읽은 라인을 msg로 저장.
				String msg = br.readLine();
				// msg를 개행문자를 붙여서 sayAll메서드로 전달.
				sayAll(msg+'\n');
			}
		} catch (IOException e) {
//			e.printStackTrace();
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
	// 모든 클라이언트에게 메세지를 뿌려줄 기능을 가진 메서드.
	public static void sayAll(String msg){ 
		// 반복문. ArrayList<Socket>에 저장된 것에 끝까지.
		for(int i=0; i<list.size(); i++){
			// 반복문에서 하나의 객체를 꺼내면 그것은 클라이언트가 됨.
			Socket sock = list.get(i);
			try {
				// 각 소켓(클라이언트)에게 써줘야함. 
				OutputStream out = sock.getOutputStream();
				// 전달받은 msg를 바이트 배열로 받아서 적는다.
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
			// serve 라는 서버소켓을 생성하는데 이는 port를 통해서만 열린다.
			serve = new ServerSocket(port);
			
			// 몇개의 소켓이 들어올지 모르기 때문에 무한반복.
			while(true){
				// serve.accept()를 하면 반환이 socket이기 때문에. socket을 만들어서 받음.
				Socket sock = serve.accept();
				// 접속이 된 객체.
				// 접속이 된 객체를 소켓리스트에 넣음.
				list.add(sock);
				JServer thr = new JServer(sock); // sock를 주입한 쓰레드 객체 생성.
				thr.start(); //쓰레드 객체 실행.
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
