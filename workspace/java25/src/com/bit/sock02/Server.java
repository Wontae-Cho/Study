package com.bit.sock02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	// 포트가 다른곳에서 사용중이라면 오류발생.

	public static void main(String[] args) {
		ServerSocket serve = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			serve=new ServerSocket(5000);
			Socket sock = serve.accept(); //서버가 생생해버리면 클라이언트와 연결된 소켓이아님.
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String msg = "";
//			while((msg=br.readLine())!=null){
//				System.out.println(msg);
//			}
			while(true){
				msg = br.readLine();
				if(msg==null){break;}
				System.out.println(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){br.close();}
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
				if(serve!=null){serve.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
