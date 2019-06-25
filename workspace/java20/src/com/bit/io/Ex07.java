package com.bit.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex07 {


	public static void main(String[] args) {
		File file = new File("files\\data.bin");
		OutputStream os = null;
		InputStream is = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		try {
			os = new FileOutputStream(file);
			dos = new DataOutputStream(os);
//			dos.write(1);					//반복의 여부를 확인. 자료와 자료사이를 구분하는 경계가 됨.
			dos.writeInt(1000);
			dos.writeInt(1011);
//			dos.write(1);					//데이타의 누수가 일어남.
			dos.writeInt(1202);
			dos.writeInt(3003);
			dos.flush();
			
			is = new FileInputStream(file);
			dis = new DataInputStream(is);
			int cnt = 0;
			while(true){
				int su = dis.read(); //맨처음읽은 것을 su에 담고
				if(su==-1){break;}
				cnt++;
			}
//			System.out.println(cnt/4);
//			System.out.println(file.length());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(is!=null){is.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
