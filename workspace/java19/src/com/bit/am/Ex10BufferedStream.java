package com.bit.am;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10BufferedStream {
	//시스템이 가진 buffer를 활용해서 ByteStream의 속도가 느리다는 단점을 극복하는 모습.


	public static void main(String[] args) {
//		File source = new File("test\\ex07.txt");
//		File dest = new File("test\\ex09.txt");
		File source = new File("test\\WildLife.wmv");
		File dest = new File("copy\\copy.wmv");
		FileOutputStream fos = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		

		
		try {
			dest.createNewFile();
			fis = new FileInputStream(source); //bytestream을 요구함
			fos = new FileOutputStream(dest);
			bis = new BufferedInputStream(fis); 
			bos = new BufferedOutputStream(fos);
			
			while(true){
				int su = bis.read();
				if(su==-1){break;}
				bos.write(su);
			}
			bos.flush();//close상황에서 이뤄지기 때문에 생략하였지만 필요할 때가 있다.
			//buffered안에 있는 것들을 밀어내는 역할을 하며 가능하면 써주는 것이 좋다.
			//buffered는 가득차야 밀려나오는데 flush는 그 전에 출력하게 해줄 수 있다.
			
//			byte[] buff = new byte[32];
//			while(true){
//				int su = bis.read(buff);
//				if(su==-1){break;}
//				bos.write(buff,0,su);
//			}
			 
			System.out.println("종료");
		} catch (IOException e) {

			e.printStackTrace();
		} finally{
			try {

				if(fis!=null){fis.close();}//닫지않으면 io가 끝나지 않은것이기 때문에 써지지 않는다.
				if(fos!=null){fos.close();}//닫지않으면 io가 끝나지 않은것이기 때문에 써지지 않는다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
