package com.bit.am;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01File {


	public static void main(String[] args) {
		// "\"�� \\ ���� ǥ���������.
		
		//�����θ� �̿��ϴ� ��� ////////////////////////////////////////////////////
//		String filepath = "C:\\java\\eclipse\\io\\testfile1.txt"; //  = ���� 
//		String filepath = "C:\\java\\eclipse\\io\\directory"; // = ���丮
//		String filepath = "C:\\java\\eclipse\\workspace\\java19\\test\\target1.txt"; // = ����.
//		String filepath = "C:\\java\\eclipse\\workspace\\java19\\test"; // = ���丮
		//////////////////////////////////////////////////////////////////////////////
		
		//����θ� �̿��ϴ� ���////////////////////////////////////////////////////
//		. 	������丮
//		.. 	�������丮
		//String filepath = ".\\test\\target1.txt"; // . �� �ϳ��� ���丮��ġ�� �ν���.
//		String filepath = ".\\..\\..\\io\\testfile1.txt";
		String filepath = "."; //���� ��� ��ο� �ִ��� Ȯ��.
		/////////////////////////////////////////////////////////////////////////////////
		
		java.io.File file1 = new File(filepath); //����Ʈ �����ڰ� �������� �ʴ´�. api java.io.file
		
		System.out.println("�������� : " + file1.exists()); //�ش������� �����ϴ��� Ȯ�� .exists() true of false ��.
		System.out.println("���丮���� : " + file1.isDirectory()); //�ش������� ���丮���� Ȯ�� .isDirectory() true of false ��.
		System.out.println("�������� : "+file1.isFile()); //�ش������� �������� ���丮���� Ȯ�� .isFile() true of false ��.
		
		System.out.println("��� : " + file1.getPath()); //�ش� ������ ��θ� �˾� �� �� ����. 
											//�����θ� ���� �� ������, ����θ� ������ ����η� ǥ�õ�.
		System.out.println("������(1) : "+file1.getAbsolutePath()); //����θ� �ִ� �����θ� �ִ� �����ηθ� �������.
		try {
			System.out.println("������(2) : "+file1.getCanonicalPath());
		} catch (IOException e) { //Ȥ�� �߸��� ��θ� �� ���� �־� try catch �� �ϵ��� �Ǿ�����.
			e.printStackTrace();
		}
		System.out.println("���ϳ��� : "+file1.getName()); //�ش������� �̸��� Ȯ���� �� ����.
		System.out.println("r(�б�)���� : " +file1.canRead()); //�ش������� �б������ �ִ��� ������
		System.out.println("w(����)���� : " +file1.canWrite()); //�ش������� ��������� �ִ��� ������
		System.out.println("x(����)���� : " +file1.canExecute()); //�ش������� ��������� �ִ��� ������.
		long time1 = file1.lastModified(); //���������� ������ �ð��� �޾� �� �� ����
		Date date = new Date(time1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(date);
		System.out.println(sdf.format(date));
		System.out.println("������ ũ�� : "+file1.length()+"byte"); //.length() ������ ũ�� byte
		String[] flist = file1.list(); //�ش���丮�� ����� ��Ʈ�� �迭�� ���� �� �ִ�.
		for(int i=0; i<flist.length; i++){
			System.out.println(flist[i]);
		}

	}

}
