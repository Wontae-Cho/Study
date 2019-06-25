package com.bit.my;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ip = "localhost";
		int port = 5000;
		
		Socket soc = null;
		OutputStream os = null;
		OutputStream 
		InputStream is = null;
		
		try {
			soc = new Socket(ip,port);
			os = soc.getOutputStream();
			is = soc.getInputStream();
			
			String msg = "";
			while(true){
				System.out.print(">>>");
				msg = sc.nextLine();
				if(msg.equals("Á¾·á")){break;}
				bw.write(msg);
				bw.newLine();
				bw.flush();
				String msg2=br.readLine();
				System.out.println(msg2);
					
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
