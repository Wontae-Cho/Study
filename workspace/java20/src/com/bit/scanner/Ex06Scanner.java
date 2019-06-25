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
			System.out.println(sc.hasNextBoolean()); //������ boolean���� �ֳ� ? true or false
			System.out.println(sc.hasNextInt());	//������ int���� �ֳ� ? true of false
			//sc.hasNextByte(), sc.hasNextDouble �� �� ����.
			while(sc.hasNext()){ // �������� ������. ������ false�������� �˾Ƽ� ����.
//				String msg = sc.nextLine(); // �� ���� ����.
//				String msg = sc.next();		// ����� ��Ŵ. //��Ʈ��
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
