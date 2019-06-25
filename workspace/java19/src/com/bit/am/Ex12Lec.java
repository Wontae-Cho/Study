package com.bit.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex12Lec {


	public static void main(String[] args) {
		String data = "";
		File file = new File("backup");
		file.mkdir();
		file=new File("backup\\data.txt");
		byte[] buff = new byte[512];
		FileInputStream fis = null;
		try {
			file.createNewFile();
			fis=new FileInputStream(file);
			while(true){
				int su = fis.read(buff);
				if(su==-1){break;}
				data+=new String(buff,0,su);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("-----------------------------------------------------");
		System.out.println("切积己利包府橇肺弊伐(ver 0.3.0)");
		System.out.println("-----------------------------------------------------");
		
	}

}
