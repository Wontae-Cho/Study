package com.bit.charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02CharRead {
		//마찬가지로 읽어들였을때 2바이트
	public static void main(String[] args) {
		File file = new File("files\\ch01.txt"); //있다고 쳤을때
		Reader fr = null;
		BufferedReader br = null;
		char[] cbuf=new char[8];
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(true){
				String msg = br.readLine();	// 라인단위로 읽는다. 개행을 기준으로함.
				if(msg==null){break;}		// String이기 때문에 아무것도 읽지못할때의 탈출조건.
				System.out.println(msg);
//				int ch=fr.read();
//				if(ch==-1){break;}
//				System.out.print((char)ch);
//				int su = fr.read(cbuf); //읽어들인 갯수.
//				if(su==-1){break;}
//				String msg = new String(cbuf,0,su); //읽어들인 갯수만큼만 문자열을 만듬.
//													//들어와있는 데이터를 또 보여주지 않기 위해서.
//				System.out.println(msg);
				
			}
			
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){br.close();}
				if(fr!=null){fr.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
