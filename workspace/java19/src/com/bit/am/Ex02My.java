package com.bit.am;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;





//C:\java\eclipse\io>dir
// C ����̺��� ����: �����
// ���� �Ϸ� ��ȣ: 7695-1B3B
//
// C:\java\eclipse\io ���͸�
//
//2019-04-22  ���� 09:47    <DIR>          .
//2019-04-22  ���� 09:47    <DIR>          ..
//2019-04-22  ���� 09:47    <DIR>          directory
//2019-04-22  ���� 10:53                15 testfile1.txt
//               1�� ����                  15 ����Ʈ
//               3�� ���͸�  78,892,220,416 ����Ʈ


public class Ex02My {


	public static void main(String[] args) {
		String filepath = "C:\\java\\eclipse\\workspace\\java19";
		java.io.File java19 = new File(filepath);
		
		String[] javapath = java19.list();
		for(int i=0; i<javapath.length; i++){
			int dir =0;
			int fil = 0;
			long time = java19.lastModified(); //�����ð�.
			Date date = new Date(time); //�ð��� �˾Ƴ���
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm"+"\t");
			String filepath1 = filepath +"\\"+javapath[i];
			File file = new File(filepath1);
			System.out.print(sdf.format(date));
			if(file.isDirectory()){ //���丮���� Ȯ��.
				System.out.print("<DIR>"+"\t");
				System.out.println(file.getName());
				dir++;
			}else{ //false = file�� ���
				System.out.print(file.length());
				System.out.println(file.getName());
				fil++;
			}
//			System.out.println(sdf.format(date) + javapath[i]);
		}

	}

}
