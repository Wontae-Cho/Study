package com.bit.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08ByteStream { 	// 이미지 파일 불러오기.
								// ByteStream이 가장 기본이됨. 제어에있어서도 매우 폭 넓은 제어의 범위를 보여준다.
								// 하지만 1byte씩 진행하다보니 속도가 느리다.
								// 벽돌은 한장씩 옮기는것과 같음.

	public static void main(String[] args) {
		File source = new File(".\\test\\WildLife.wmv");
		File dest = new File(".\\copy\\Wild.wmv");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			dest.createNewFile();
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			while(true){
				int su = fis.read();
				if(su==-1){break;} //더이상 읽어들일게 없으면.
				fos.write(su);
			}
			fos.close();
			fis.close();			
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("카피완료");
		
	}

}
