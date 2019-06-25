package com.bit.am;

import java.io.File;
import java.io.IOException;

public class Ex03MoreFile {


	public static void main(String[] args) {
//		String input = ".\\test\\temp01.txt";
//		File file = new File(input);
//		try {
//			System.out.println("파일생성 : " + file.createNewFile()); //파일생성 성공시 true 실패시 false
//																	//이미 있을경우에도 false 출력.
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		String path = ".\\test03\\test";
//		File file2 = new File(path);
////		System.out.println("디렉토리 생성 : "+ file2.mkdir()); //디렉토리생성, 성공시 true 실패시 false
//																// 이미 있을경우에도 false 출력
//		
//		System.out.println("디렉토리 생성 : "+ file2.mkdirs()); //한번에 여러개의 디렉토리를 생성할 때.
		
//		String path = "C:\java\eclipse\workspace\java19"; 
//		String path = ".\\test\\temp01.txt"; 
//		File file3 = new File(path);
//		System.out.println(file3.getParent()); //상위디렉토리가 어떤것인지.
		
		//파일 이름바꾸기
		//temp01.txt -> abc01.txt
//		File file4 = new File(".\\test"); //바뀔 대상 //file, directory 모두 가능.
//		File dest = new File(".\\test01"); //바꿀 이름 설정. //file, directory 모두 가능.
//											//단, directory의 경우 내부에 file이 들어있을 경우 실패
//		boolean result = file4.renameTo(dest);
//		System.out.println("파일이름수정 : " + result);

		//삭제
		File file5 = new File(".\\test03");
		System.out.println(file5.delete()); //directory삭제시 하위에 파일 또는 디렉토리가 있을시에 삭제가 불가능하다. 
		
	}

}
