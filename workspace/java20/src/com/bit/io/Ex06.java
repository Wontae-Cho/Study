package com.bit.io;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
	/*
	 * 학생성적관리프로그램 (ver 0.3.1)
	 */
	public static void main(String[] args) { // dataStream을 사용.
		// 프로그램이 시작되기 전에 읽어야함. 기존의 값을. read = input
		Scanner sc = new Scanner(System.in);

		File file = new File("backup");
		file.mkdir();
		file = new File("backup\\studata.bin");
		
		InputStream is = null;
//		DataInputStream dis = null;
		ByteArrayOutputStream baos = null;
		
		OutputStream os = null;
//		DataOutputStream dos = null;
		ByteArrayInputStream bais = null;
		
		String data = "";
		String input = "";
		byte stuNum = 0; //학번
		byte[] studata = null;

		byte[] buff = new byte[8];
		if (file.exists()) { // 읽기전에 파일이 있는지 확인.
			try {
				is = new FileInputStream(file);
//				dis = new DataInputStream(is);
				baos = new ByteArrayOutputStream();
				while (true) {
					int su = is.read(buff); // 있다면 buff에 저장된 값을 su에.
					if (su == -1) {break;} // 더 이상 입력된 값이 없으면 브레이크.
					baos.write(buff, 0, su); // 가진 값을 baos에 저장.
				}
				studata = baos.toByteArray();
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (baos != null) {baos.close();}
//					if (dis != null) {dis.close();}
					if (is != null) {is.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}else{
			try {
				file.createNewFile();
				System.out.println("생성");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		System.out.println("-----------------------------------------------------");
		System.out.println("학생성적관리프로그램(ver 0.3.1)");
		System.out.println("-----------------------------------------------------");

		while (true) {

			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
			input = sc.nextLine();
			System.out.println("-----------------------------------------------------");
			if (input.equals("0")) {
				break;
			}
			if (input.equals("1")) {
				System.out.println("-----------------------------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-----------------------------------------------------");
				for(int i=0; i<studata.length; i++){
					System.out.print(studata[i]+" "); // 저장된 값 보기.	
				}
				System.out.println();
			} else if (input.equals("2")) {
				studata = new byte[4];
				studata[0] = ++stuNum;
				//학번을 써야함.
				
				//국어점수를 써야함.
				System.out.print("국어>");
				input = sc.nextLine();
				studata[1] = Byte.parseByte(input);
				System.out.print("영어>");
				input = sc.nextLine();
				studata[2] = Byte.parseByte(input);
				System.out.print("수학>");
				input = sc.nextLine();
				studata[3] = Byte.parseByte(input);
				
				buff = studata;
				
				
			} else if (input.equals("3")) {

			} else if (input.equals("4")) {

			}

		}
		
		
		try {
			os=new FileOutputStream(file);
			bais = new ByteArrayInputStream(studata);
			while(true){
				int su = bais.read(buff);
				if(su==-1){break;}
				os.write(buff,0,su);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
				try {
					if(bais!=null){bais.close();}
//					if(dos!=null){dos.close();}
					if(os!=null){os.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		System.out.println("이용해주셔서 감사합니다.");
		//저장된 값을 이제 써야함.

	}

}
