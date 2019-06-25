package com.bit.example;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiServer {
		// ArrayList ���׸� MultiServerThread ����.
		private ArrayList<MultiServerThread> list;
		// socket ����.
		private Socket socket;
		
		// ��Ƽ���� ������.
		public MultiServer() throws IOException{
			// �����ڿ��� �ռ� �����ߴ� ArrayList<MultiServerThread> ����.
			list = new ArrayList<MultiServerThread>();
			// �������� ����(��Ʈ5000).
			ServerSocket serverSocket = new ServerSocket(5000);
			// MultiServerThread mst ����.
			MultiServerThread mst = null;
			// �������� ���θ� Ȯ���ϱ� ���� boolean ���� ����.
			boolean isStop = false;
			// isStop�� true��� �Ʒ� �������, false��� �׳� �ݺ��� �糦
			while(!isStop){
				System.out.println("Server ready...");
				// ������ ���������� accept ������.
				socket = serverSocket.accept();
				// ��Ƽ���������忡 ������ ��ü�� ���� ���� mst��� �Ѵ�.
				mst = new MultiServerThread(this);
				// list�� ������ ��Ƽ���������带 �߰�.
				list.add(mst);
				// ��Ƽ���������带 ���� ������ t�� ����.
				Thread t = new Thread(mst);
				// ������ ��ŸƮ.
				t.start();
			}
		}
		
		public ArrayList<MultiServerThread> getList(){
			return list;
		}
		public Socket getSocket(){
			return socket;
		}
		public static void main(String[] args)throws IOException{
			new MultiServer();
		}

}
