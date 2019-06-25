package com.bit.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class JServer extends Thread{ // �����带 ��ӹ޾� ���� ������
	Socket sock;	// ������ �޾� ���� �ֵ���.
	static ArrayList<Socket> list = new ArrayList<Socket>();
	
	// ������.
	public JServer(Socket sock) { 
		this.sock = sock; //�޾ƿ� ������ �ʵ�� �ø�.
	}
	// ���������� ���� ��ü�� �����ϰ� �� �κ�.
	public void run() {
		// ��ü�� ����ִ� ������ ���� �о�� ��.
		InputStream is = null;
		// ��ü�� ����ִ� ������ ���ڿ��̹Ƿ� ���ڿ� ��Ʈ���� ����.
		InputStreamReader isr = null;
		// ���ڿ� ��Ʈ���� �� �� ���ϰ� ���� �б� ���ؼ� ���۵帮�� ����.
		BufferedReader br = null;
		
		try {
			// sock ��ü�κ��� ������ �о�鿩�� ��.
			is = sock.getInputStream();
			// ���ڿ� ���� ����.
			isr = new InputStreamReader(is);
			// ���۵� ���� ����.
			br = new BufferedReader(isr);
			
			while(true){
				// ���۵帮���� ���� ���� ������ msg�� ����.
				String msg = br.readLine();
				// msg�� ���๮�ڸ� �ٿ��� sayAll�޼���� ����.
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
	// ��� Ŭ���̾�Ʈ���� �޼����� �ѷ��� ����� ���� �޼���.
	public static void sayAll(String msg){ 
		// �ݺ���. ArrayList<Socket>�� ����� �Ϳ� ������.
		for(int i=0; i<list.size(); i++){
			// �ݺ������� �ϳ��� ��ü�� ������ �װ��� Ŭ���̾�Ʈ�� ��.
			Socket sock = list.get(i);
			try {
				// �� ����(Ŭ���̾�Ʈ)���� �������. 
				OutputStream out = sock.getOutputStream();
				// ���޹��� msg�� ����Ʈ �迭�� �޾Ƽ� ���´�.
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
			// serve ��� ���������� �����ϴµ� �̴� port�� ���ؼ��� ������.
			serve = new ServerSocket(port);
			
			// ��� ������ ������ �𸣱� ������ ���ѹݺ�.
			while(true){
				// serve.accept()�� �ϸ� ��ȯ�� socket�̱� ������. socket�� ���� ����.
				Socket sock = serve.accept();
				// ������ �� ��ü.
				// ������ �� ��ü�� ���ϸ���Ʈ�� ����.
				list.add(sock);
				JServer thr = new JServer(sock); // sock�� ������ ������ ��ü ����.
				thr.start(); //������ ��ü ����.
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
