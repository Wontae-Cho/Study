package com.bit.scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex06Scanner {


	public static void main(String[] args) {
		File file = new File("files\\ch03.txt");
		InputStream is = null;
		Scanner sc =null;
		try {
			is=new FileInputStream(file);
			sc=new Scanner(is);		// is = "files\\ch03.txt"
			System.out.println(sc.hasNextBoolean()); //다음에 boolean값이 있냐 ? true or false
			System.out.println(sc.hasNextInt());	//다음에 int값이 있냐 ? true of false
			//sc.hasNextByte(), sc.hasNextDouble 등 이 있음.
			while(sc.hasNext()){ // 다음값이 있으면. 없으면 false값임으로 알아서 끝남.
//				String msg = sc.nextLine(); // 한 줄을 읽음.
//				String msg = sc.next();		// 띄어쓰기로 끊킴. //스트링
//				System.out.println(msg);
				int su = sc.nextInt();
				System.out.println(su);
			}
//			System.out.println(sc.nextLine());
//			System.out.println(sc.nextLine());
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}finally{
			try {
				if(is!=null){is.close();}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
