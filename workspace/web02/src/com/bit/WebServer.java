package com.bit;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

	public static void main(String[] args) {
//		String msg = "HELLO MY PAGE ! ! !";
		String root = "www";
		String index = "index.txt";
		
		File file = null;
		ServerSocket serve = null;
		Socket sock = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream is = null;
		byte[] buf = new byte[2048];
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			System.out.println("���� ����");
			serve = new ServerSocket(80); 			// 80�� ��Ʈ�� �����
			sock = serve.accept();					// ���� ��ü�� ���Ͽ� ����.
			os = sock.getOutputStream();
			is = sock.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
//			System.out.println(">>>"+br.readLine());
			String msg2 = br.readLine();
			String[] arr = msg2.split(" ");
			////
			if(arr[1].equals("/")){
				arr[1]="/"+index;
			}
			file = new File("./"+root+arr[1]);
			
//			dos = new DataOutputStream(os);
//			
//			dos.writeUTF(msg);
//			dos.flush();
			is = new FileInputStream(file);
			int su = 0;
			// ���� ������ �ʴ� ������ ������ ���� = HEADER �κ�.
				// ������ Ÿ��, ����, ���۹�� ���� ����.
			os.write("HTTP/1.1 200 OK \r\n".getBytes());
			os.write("Content-type: text/html \r\n".getBytes());
			os.write("\r\n".getBytes());
			
			while((su=is.read(buf))!=-1){
				os.write(buf,0,su);
			}
			
			System.out.println("�޽��� ���� �Ϸ�");
//			dos.close();
			os.close();
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