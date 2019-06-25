package com.bit.am;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01File {


	public static void main(String[] args) {
		// "\"는 \\ 개로 표현해줘야함.
		
		//절대경로를 이용하는 방법 ////////////////////////////////////////////////////
//		String filepath = "C:\\java\\eclipse\\io\\testfile1.txt"; //  = 파일 
//		String filepath = "C:\\java\\eclipse\\io\\directory"; // = 디렉토리
//		String filepath = "C:\\java\\eclipse\\workspace\\java19\\test\\target1.txt"; // = 파일.
//		String filepath = "C:\\java\\eclipse\\workspace\\java19\\test"; // = 디렉토리
		//////////////////////////////////////////////////////////////////////////////
		
		//상대경로를 이용하는 방법////////////////////////////////////////////////////
//		. 	현재디렉토리
//		.. 	상위디렉토리
		//String filepath = ".\\test\\target1.txt"; // . 도 하나의 디렉토리위치로 인식함.
//		String filepath = ".\\..\\..\\io\\testfile1.txt";
		String filepath = "."; //현재 어느 경로에 있는지 확인.
		/////////////////////////////////////////////////////////////////////////////////
		
		java.io.File file1 = new File(filepath); //디폴트 생성자가 존재하지 않는다. api java.io.file
		
		System.out.println("파일유무 : " + file1.exists()); //해당파일이 존재하는지 확인 .exists() true of false 값.
		System.out.println("디렉토리인지 : " + file1.isDirectory()); //해당파일이 디렉토리인지 확인 .isDirectory() true of false 값.
		System.out.println("파일인지 : "+file1.isFile()); //해당파일이 파일인지 디렉토리인지 확인 .isFile() true of false 값.
		
		System.out.println("경로 : " + file1.getPath()); //해당 파일의 경로를 알아 볼 수 있음. 
											//절대경로를 줬을 시 절대경로, 상대경로를 줬을시 상대경로로 표시됨.
		System.out.println("절대경로(1) : "+file1.getAbsolutePath()); //상대경로를 넣던 절대경로를 넣던 절대경로로만 출력해줌.
		try {
			System.out.println("절대경로(2) : "+file1.getCanonicalPath());
		} catch (IOException e) { //혹시 잘못된 경로를 줄 수도 있어 try catch 를 하도록 되어있음.
			e.printStackTrace();
		}
		System.out.println("파일네임 : "+file1.getName()); //해당파일의 이름을 확인할 수 있음.
		System.out.println("r(읽기)권한 : " +file1.canRead()); //해당파일의 읽기권한이 있는지 없는지
		System.out.println("w(쓰기)권한 : " +file1.canWrite()); //해당파일의 쓰기권한이 있는지 없는지
		System.out.println("x(실행)권한 : " +file1.canExecute()); //해당파일의 실행권한이 있는지 없는지.
		long time1 = file1.lastModified(); //마지막으로 수정한 시간을 받아 볼 수 있음
		Date date = new Date(time1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(date);
		System.out.println(sdf.format(date));
		System.out.println("파일의 크기 : "+file1.length()+"byte"); //.length() 파일의 크기 byte
		String[] flist = file1.list(); //해당디렉토리의 목록을 스트링 배열로 만들 수 있다.
		for(int i=0; i<flist.length; i++){
			System.out.println(flist[i]);
		}

	}

}
