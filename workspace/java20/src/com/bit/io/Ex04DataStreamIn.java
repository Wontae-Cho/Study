package com.bit.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex04DataStreamIn {
	// 다양한 타입의 자료를 받을 수 있고 데이터의 자료형을 유지할 수 있다는 장점이 있다.
	// 하지만 넣어준 순서 그대로 넣어야 하고 그렇게 되지 않을시 에러가 아닌 이상한 값이 나온다.
	// 따라서 에러가 아니기 때문에 사용할 때 유의해야 할 부분이다.

	public static void main(String[] args) {
		File file = new File("files\\data.bin");
		InputStream is = null;
		DataInputStream dis = null;	//넣었던 타입을 그대로 받아내야한다.
		if(file.exists()){
			try {
				is=new FileInputStream(file);
				dis = new DataInputStream(is);
				int su1 = dis.read();
				System.out.println("su1="+su1);
				byte su2 = dis.readByte();
				System.out.println("su2="+su2);
				int su3 = dis.readInt();
				System.out.println("su3="+su3);
				long su4 = dis.readLong();
				System.out.println("su4="+su4);
				float su5 = dis.readFloat();
				System.out.println("su5="+su5);
				double su6 = dis.readDouble();
				System.out.println("su6="+su6);
				char ch1 = dis.readChar();
				System.out.println("ch1="+ch1);
				boolean boo = dis.readBoolean();
				System.out.println("boolean="+boo);
				String msg = dis.readUTF();
				System.out.println("msg="+msg);
				
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				try {
					if(dis!=null){dis.close();}
					if(is!=null){is.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
			
			
		}else{
			System.out.println("파일이 없습니다.");
		}

	}

}
