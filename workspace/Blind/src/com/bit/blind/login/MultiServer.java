package com.bit.blind.login;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * 모든 클라이언트의 TCP 요청을 accept 로 처리한 후 소켓 객체를 생성한다. 소켓을 유지하기 위한 스레드를 생성하고 이 스레드를 저장할 Collection을 생성한다
 * 
 * 
 */

public class MultiServer {
	private ArrayList<MultiServerThread> serverList;				//멀티서버스레드를 관리할 Collection
	private Socket socket;
	
	public MultiServer(){
		int port = 5000;
		this.serverList = new ArrayList<MultiServerThread>();	//객체 생성시 서버 스레드를 관리할 리스트를 생성 및 초기화 한다.
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(port);				//서버 소켓의 포트번호를 5000번으로 초기화
		} catch (IOException e) {
			e.printStackTrace();
		}		
		MultiServerThread mst = null;							//멀티서버스레드 객체를 생성한다.
		
		boolean isStop = false;
		
		while(!isStop){
			System.out.println("Server ready...");
			try {
				this.socket = serverSocket.accept();
				System.out.println("connected ...");//연결 되기를 기다린다.
			} catch (IOException e) {
				e.printStackTrace();
			}						
			mst = new MultiServerThread(this);					//Runnable 멀티서버스레드를 만들고?
			this.serverList.add(mst);							//서버리스트에 만들어진 멀티서버스레드를 추가한다.
			Thread thr = new Thread(mst);						//멀티서버스레드로 스레드를 만들고 
			thr.start();										//스레드를 시작한다.
		}
	}
	
	//서버스레드를 관리하는 serverList를 반환하는 메서드
	public ArrayList<MultiServerThread> getList(){
		return this.serverList;
	}
	
	//연결된 소켓을 반환하는 메서드
	public Socket getSocket(){
		return this.socket;
	}

	public static void main(String[] args) {
		MultiServer me = new MultiServer();
	}

}
