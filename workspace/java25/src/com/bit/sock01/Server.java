package com.bit.sock01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	// 서버만들기.
	
	public static void main(String[] args) {
		// 서버소켓생성
		ServerSocket serve = null;
		OutputStream os = null;
		
		try {
			// 포트 문을 열어놔야 접속이 가능하므로 열어놔야함.
			serve = new ServerSocket(500);
			// 접속이 들어오기 까지 대기를 해야함.
			// 접속이 되는순간 대화를 해야하기 때문에. socket이 필요.
			Socket sock = serve.accept();
//			System.out.println(sock);
//			System.out.println("접속이 들어왔음");
			String msg = "ㅎㅇ";
			//소켓에서 스트림을 얻어냄.
			os = sock.getOutputStream();
			
			os.write(msg.getBytes());
			os.flush();
			
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(os!=null){os.close();}
				if(serve!=null){serve.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
