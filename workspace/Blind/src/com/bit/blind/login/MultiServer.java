package com.bit.blind.login;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * ��� Ŭ���̾�Ʈ�� TCP ��û�� accept �� ó���� �� ���� ��ü�� �����Ѵ�. ������ �����ϱ� ���� �����带 �����ϰ� �� �����带 ������ Collection�� �����Ѵ�
 * 
 * 
 */

public class MultiServer {
	private ArrayList<MultiServerThread> serverList;				//��Ƽ���������带 ������ Collection
	private Socket socket;
	
	public MultiServer(){
		int port = 5000;
		this.serverList = new ArrayList<MultiServerThread>();	//��ü ������ ���� �����带 ������ ����Ʈ�� ���� �� �ʱ�ȭ �Ѵ�.
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(port);				//���� ������ ��Ʈ��ȣ�� 5000������ �ʱ�ȭ
		} catch (IOException e) {
			e.printStackTrace();
		}		
		MultiServerThread mst = null;							//��Ƽ���������� ��ü�� �����Ѵ�.
		
		boolean isStop = false;
		
		while(!isStop){
			System.out.println("Server ready...");
			try {
				this.socket = serverSocket.accept();
				System.out.println("connected ...");//���� �Ǳ⸦ ��ٸ���.
			} catch (IOException e) {
				e.printStackTrace();
			}						
			mst = new MultiServerThread(this);					//Runnable ��Ƽ���������带 �����?
			this.serverList.add(mst);							//��������Ʈ�� ������� ��Ƽ���������带 �߰��Ѵ�.
			Thread thr = new Thread(mst);						//��Ƽ����������� �����带 ����� 
			thr.start();										//�����带 �����Ѵ�.
		}
	}
	
	//���������带 �����ϴ� serverList�� ��ȯ�ϴ� �޼���
	public ArrayList<MultiServerThread> getList(){
		return this.serverList;
	}
	
	//����� ������ ��ȯ�ϴ� �޼���
	public Socket getSocket(){
		return this.socket;
	}

	public static void main(String[] args) {
		MultiServer me = new MultiServer();
	}

}
