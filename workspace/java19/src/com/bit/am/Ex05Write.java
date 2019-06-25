package com.bit.am;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05Write {

	public static void main(String[] args) {
		File file = new File(".\\test01\\ex05.txt");
		if(file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String msg = "abcdefg\ntest ok";
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			for(int i=0; i<msg.length(); i++){
				fos.write(msg.charAt(i));
			}
//			fos.write(65);
//			fos.write(66);
//			fos.write(67);
//			fos.write(68);
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("작성완료");		

	}

}
