package com.bit.project;

import java.io.*;
import java.net.*;
import java.util.*;

public class JMultiServer {
		// ArrayList 제네릭 MultiServerThread 선언.
		private ArrayList<JMultiServerThread> list;
		// socket 선언.
		private Socket socket;
		
		// 멀티서버 생성자.
		public JMultiServer() throws IOException{
			// 생성자에서 앞서 선언했던 ArrayList<MultiServerThread> 생성.
			list = new ArrayList<JMultiServerThread>();
			// 서버소켓 생성(포트5000).
			ServerSocket serverSocket = new ServerSocket(5000);
			// MultiServerThread mst 선언.
			JMultiServerThread mst = null;
			// 서버동작 여부를 확인하기 위한 boolean 변수 선언.
			boolean isStop = false;
			// isStop이 true라면 아래 내용통과, false라면 그냥 반복문 재낌
			while(!isStop){
				System.out.println("Server ready...");
				// 소켓은 서버소켓을 accept 받은것.
				socket = serverSocket.accept();
				// 멀티서버스레드에 지금의 객체를 넣은 것을 mst라고 한다.
				mst = new JMultiServerThread(this);
				// list에 지금의 멀티서버스레드를 추가.
				list.add(mst);
				// 멀티서버스레드를 가진 스레드 t를 생성.
				Thread t = new Thread(mst);
				// 스레드 스타트.
				t.start();
			}
		}
		
		public ArrayList<JMultiServerThread> getList(){
			return list;
		}
		public Socket getSocket(){
			return socket;
		}
		public static void main(String[] args)throws IOException{
			new JMultiServer();
		}

}
