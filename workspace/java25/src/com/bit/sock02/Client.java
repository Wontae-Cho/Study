package com.bit.sock02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {


	public static void main(String[] args) {
//		String msg = "ó���Դϴ�\n���δ�����\n�����ϴ�\n";
		Scanner sc = new Scanner(System.in);
//		String ip = "192.168.0.34";
		String ip = "192.168.0.19";
					// 127.0.0.1 �ڱ��ڽ��� ��Ÿ���� ip
		int port = 5000; //5000�� ��Ʈ�� ����������� �ű�� ������ �ؾ���
		
		Socket sock = null;
		OutputStream os = null;
		
		
		try {
			sock = new Socket(ip,port);//�����ڸ� ���� �� ������ �ǹ̸� �����ϰ� ����.
			os = sock.getOutputStream();
			for(int i=0; i<5; i++){
				System.out.print(">>>");
				String msg = sc.nextLine();
				if(msg.equals("����")){break;}
				msg+="\n";
				os.write(msg.getBytes());
				os.flush();
			}
//			os.write(msg.getBytes());
//			os.flush(); // �ٷιٷ� �о �� �ְ�.
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(os!=null){os.close();}
				if(sock!=null){sock.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
