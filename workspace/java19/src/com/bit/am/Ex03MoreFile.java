package com.bit.am;

import java.io.File;
import java.io.IOException;

public class Ex03MoreFile {


	public static void main(String[] args) {
//		String input = ".\\test\\temp01.txt";
//		File file = new File(input);
//		try {
//			System.out.println("���ϻ��� : " + file.createNewFile()); //���ϻ��� ������ true ���н� false
//																	//�̹� ������쿡�� false ���.
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		String path = ".\\test03\\test";
//		File file2 = new File(path);
////		System.out.println("���丮 ���� : "+ file2.mkdir()); //���丮����, ������ true ���н� false
//																// �̹� ������쿡�� false ���
//		
//		System.out.println("���丮 ���� : "+ file2.mkdirs()); //�ѹ��� �������� ���丮�� ������ ��.
		
//		String path = "C:\java\eclipse\workspace\java19"; 
//		String path = ".\\test\\temp01.txt"; 
//		File file3 = new File(path);
//		System.out.println(file3.getParent()); //�������丮�� �������.
		
		//���� �̸��ٲٱ�
		//temp01.txt -> abc01.txt
//		File file4 = new File(".\\test"); //�ٲ� ��� //file, directory ��� ����.
//		File dest = new File(".\\test01"); //�ٲ� �̸� ����. //file, directory ��� ����.
//											//��, directory�� ��� ���ο� file�� ������� ��� ����
//		boolean result = file4.renameTo(dest);
//		System.out.println("�����̸����� : " + result);

		//����
		File file5 = new File(".\\test03");
		System.out.println(file5.delete()); //directory������ ������ ���� �Ǵ� ���丮�� �����ÿ� ������ �Ұ����ϴ�. 
		
	}

}
