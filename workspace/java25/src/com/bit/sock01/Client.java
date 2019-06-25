package com.bit.sock01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	// 클라이언트 만들기
	// Socket[addr=/192.168.0.19,port=50079,localport=5000]
	//        //접속한 사람의 주소, 포트


	public static void main(String[] args) {
		// 서버에 접속 = 서버의 주소가 필요.
		//본인의 ip
		String url="192.168.0.19";
		// 포트번호 필요.
		int port = 500;
		
		Socket sock = null;
		InputStream is = null;
		InputStreamReader isr = null; //문자열을 읽어야함으로 문자열 스트림.
		try {
			// 생성자의 인자로 IP와 port번호를 줌.
			sock = new Socket(url,port);
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			int su = 0;
			while((su=isr.read())!=-1){
				System.out.print((char)su);
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
				if(sock!=null){sock.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
