package com.bit.charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04Convert {
	// 문자열 스트림으로 바꿔보자.

	public static void main(String[] args) {
		File file = new File("files\\ch03.txt");
		InputStream is =null; 
		
		InputStreamReader isr = null; //바이트스트림 => 문자열스트림
		BufferedReader br = null;
		try {
			is = new FileInputStream(file); //file을 inputStream으로 .
			isr = new InputStreamReader(is);	//inputStream을 InputStreamReader로
			br = new BufferedReader(isr);			//InputStreamReader를 BufferedReader로 필터처리.
			
			while(true){
				String msg = br.readLine();
				if(msg==null){break;}
				System.out.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){br.close();}
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
