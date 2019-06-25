package com.bit.my;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer {
	// 내 서버는 읽고, 써줘야해.
	// 읽는다 => in 에코

	public static void main(String[] args) {
//		List<Socket> soclist = new ArrayList<Socket>();
		ServerSocket ser = null;

		InputStream is = null;
//		InputStreamReader isr = null;
		
		OutputStream os = null;
//		OutputStreamWriter osw = null;

			try {
				ser = new ServerSocket(5000);
				Socket sock = ser.accept();
//				soclist.add(sock);
				
				is = sock.getInputStream();
				os = sock.getOutputStream();
//				isr = new InputStreamReader(is);
				byte[] buf = new byte[1024];
				int su;
				while(true){
					su = is.read(buf);
					if(su == -1){break;}
					os.write(buf,0,su);
				}
				
//				osw = new OutputStreamWriter(os);
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					if(os!=null){os.close();}
					if(is!=null){is.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

	}

}
