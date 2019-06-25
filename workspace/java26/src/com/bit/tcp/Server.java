package com.bit.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

// ������ ����. 
	// accept�� ���� �� ���ӵ� ���� ��ü�� ��ȯ��.
	// accept�� ���ѷ��� (����� ������ �𸣱� ������)
 	// �׶����� ���� ��ü�� ��ȯ��.
// ������ �޽����� �о�ٰ� ��� �ƿ�ǲ��Ʈ���� �ѷ������.
	// ���Ͽ����� IO�� �̾Ƴ� �� ����. InputStream, OutputStream
	// �̴� ��� ���� �𸣱� ������ �ڷᱸ���� ������ ��Ƽ�.
	// �Ǵ� OutputStream�� �ڷᱸ���� ��� �͵� ����.
// �Է��� ����ä�η� ����.
	// �Է��� �����ؾ���. (InputStream�� ����)
	// �����ϳ��� �ϳ��� ������� ����� �� �����带 �������.
	// �Է��� ������ msg�� ����� �� msg�� ��ü���� �ѷ��ִ� ����� �ʿ���.(IO�� ���ؼ�)
// ������ �Է¸� �ް�. ���ο����� �Էµ� ���� �ѷ��ִ� ����� �ؾ���.

public class Server extends Thread{
	Socket sock;	// ������ �޾� ���� �ֵ���.
	static ArrayList<Socket> list = new ArrayList<Socket>();
	
	public Server(Socket sock) {
		this.sock = sock; //�޾ƿ� ������ �ʵ�� �ø�.
	}

	public void run() {
		//������ �ϳ��� �ϳ��� Ŭ���̾�Ʈ. �̴� Ŭ���̾�Ʈ���� ������ �޼����� �����ϴ� ����.
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
//					temp = "��";
//				}else{
//					temp = "����";
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
	public static void sayAll(String msg){ // ��� Ŭ���̾�Ʈ���� �޼����� �ѷ��� ����� ���� �޼���.
		for(int i=0; i<list.size(); i++){
			Socket sock = list.get(i);
			try {
				OutputStream out = sock.getOutputStream(); // �������κ��� �̾ƾ� �ϴ�.
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
				Socket sock = serve.accept(); // ���Ʈ�ϸ� ���ϰ�ü�� ��ȯ.
								// �Ѹ� �޴� ���� �ƴ϶� �������� �ޱ� ������ ���ѷ���.
				list.add(sock);
				Server thr = new Server(sock); // ������. ����Ŭ����������
				thr.start();
				// ���� ��ü�� ���� �� �߻��ϴ� �����޼����� ��� �ٲٴ� ���� ����.
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
