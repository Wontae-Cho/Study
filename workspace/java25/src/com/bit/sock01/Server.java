package com.bit.sock01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	// ���������.
	
	public static void main(String[] args) {
		// �������ϻ���
		ServerSocket serve = null;
		OutputStream os = null;
		
		try {
			// ��Ʈ ���� ������� ������ �����ϹǷ� ���������.
			serve = new ServerSocket(500);
			// ������ ������ ���� ��⸦ �ؾ���.
			// ������ �Ǵ¼��� ��ȭ�� �ؾ��ϱ� ������. socket�� �ʿ�.
			Socket sock = serve.accept();
//			System.out.println(sock);
//			System.out.println("������ ������");
			String msg = "����";
			//���Ͽ��� ��Ʈ���� ��.
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
