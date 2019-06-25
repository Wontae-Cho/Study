package com.bit.am;

import java.io.File;
import java.io.FileOutputStream;

public class Ex12More {


	public static void main(String[] args) {
		String data = "";
		File file = new File("backup");
		file.mkdir();
		file=new File("backup\\data.txt");
		byte[] buff = new byte[512];
		System.out.println("-----------------------------------------------------");
		System.out.println("切积己利包府橇肺弊伐(ver 0.3.0)");
		System.out.println("-----------------------------------------------------");
		
		int num = 201901;
		int kor =11;
		int eng = 21;
		int math = 31;
		if(!data.isEmpty()){data+="\n";}
		data+=num+","+kor+","+eng+","+math;
		num = 201902;
		kor =12;
		eng = 22;
		math = 32;
		if(!data.isEmpty()){data+="\n";}
		data+=num+","+kor+","+eng+","+math;
		num = 201903;
		kor =13;
		eng = 23;
		math = 33;
		if(!data.isEmpty()){data+="\n";}
		data+=num+","+kor+","+eng+","+math;
		System.out.println(data);
		
		FileOutputStream fos = null;
		fos=new FileOutputStream(file);

	}

}
