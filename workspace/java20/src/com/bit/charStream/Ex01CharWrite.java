package com.bit.charStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex01CharWrite {
	// 이미지나 동영상 파일같은 것을 읽을 수 있지만, 바이트 단위가 홀수일 경우에 이미지나 깨지거나 동영상이 깨지거나 할 수 있다.
	// 따라서 문자열스트림은 문자열을 다룰때만 다룰 수 있도록 하자.
	// 또한, 한글파일이나 워드파일 등에서 문자열을 다룬다고 해서 문자열 스트림을 사용할 수 있는 것도 아니다.
	// 왜냐하면 그 파일 이전에 위치정보 등이 포함되면서 2byte가 아닌 1byte가 올 수도 있기 때문이다.

	
	public static void main(String[] args) {
		File file = new File("files\\ch01.txt");
		Writer fw = null;
		BufferedWriter bw = null;
		PrintWriter pw =null;
		String msg = "버퍼를 이용한 문자열 입력";
		char[] source = msg.toCharArray(); //어차피 2바이트는 char를 읽을 수 있음.
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			
			pw.println("첫번째");
			pw.println("두번째");
			pw.println("세번째");
			pw.println("네번째");
			pw.println("다섯번째");
			pw.println("여섯번째");
//			pw.flush();
			
			
//			bw.write("첫번째");
//			bw.write("\r\n"); 	// 윈도우에서의 개행방법 
//			bw.write("두번째");
//			bw.write('\n');		// 그 외에서의 개행방법
//			bw.write("세번째");
//			bw.newLine();		// 또 다른 개행방법 = 실행시점에 운영체제에 맞춰서 동작.
//			fw.write(source);
//			for(int i=0; i<source.length; i++){
//				fw.write(source[i]);
//			}
			
//			fw.flush();
//			bw.flush();
			
		} catch (IOException e) {

			e.printStackTrace();
		} finally{
			try {
				if(pw!=null){pw.close();}
				if(bw!=null){bw.close();}
				if(fw!=null){fw.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
