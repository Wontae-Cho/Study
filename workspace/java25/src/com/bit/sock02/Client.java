package com.bit.sock02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {


	public static void main(String[] args) {
//		String msg = "처음입니다\n라인단위로\n보냅니다\n";
		Scanner sc = new Scanner(System.in);
//		String ip = "192.168.0.34";
		String ip = "192.168.0.19";
					// 127.0.0.1 자기자신을 나타내는 ip
		int port = 5000; //5000번 포트를 열어놓았으니 거기로 접속을 해야함
		
		Socket sock = null;
		OutputStream os = null;
		
		
		try {
			sock = new Socket(ip,port);//생성자를 줬을 때 접속의 의미를 내포하고 있음.
			os = sock.getOutputStream();
			for(int i=0; i<5; i++){
				System.out.print(">>>");
				String msg = sc.nextLine();
				if(msg.equals("종료")){break;}
				msg+="\n";
				os.write(msg.getBytes());
				os.flush();
			}
//			os.write(msg.getBytes());
//			os.flush(); // 바로바로 밀어낼 수 있게.
			
			
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
