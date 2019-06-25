package com.bit.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09FastByteStream {


	public static void main(String[] args) {
		File source = new File("test\\WildLife.wmv");
		File dest = new File("copy\\copy.wmv");
//		File source = new File("test\\ex05.txt");
//		File dest = new File("test\\ex07.txt");
		FileInputStream fis = null; //입력할때 필요
		FileOutputStream fos = null; //출력할때 필요
		
		//앞서말한 느린속도에 대해 대처하는 방법.
		//버퍼를 많이주면 대부분은 빠르겠지만. 결국은 case by case. 작은걸 옮기는데 많이 잡을필요가 없다.
		byte[] buff = new byte[256];
		try {
			dest.createNewFile();
			fis = new FileInputStream(source); //읽어드려야 할 대상
			fos = new FileOutputStream(dest); //쓸 대상
			
			while(true){
				int su = fis.read(buff);
				if(su==-1){break;}
				fos.write(buff,0,su); //쓴다. 버퍼 0부터 su까지.
//				fos.write(buff); //나머지자리에 필요없는 값이 들어가 있다. 
			}
			
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("카피 완료");

	}

}
