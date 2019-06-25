package com.bit.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09FastByteStream {


	public static void main(String[] args) {
		File source = new File("test\\WildLife.wmv");
		File dest = new File("copy\\copy.wmv");
//		File source = new File("test\\ex05.txt");
//		File dest = new File("test\\ex07.txt");
		FileInputStream fis = null; //�Է��Ҷ� �ʿ�
		FileOutputStream fos = null; //����Ҷ� �ʿ�
		
		//�ռ����� �����ӵ��� ���� ��ó�ϴ� ���.
		//���۸� �����ָ� ��κ��� ����������. �ᱹ�� case by case. ������ �ű�µ� ���� �����ʿ䰡 ����.
		byte[] buff = new byte[256];
		try {
			dest.createNewFile();
			fis = new FileInputStream(source); //�о����� �� ���
			fos = new FileOutputStream(dest); //�� ���
			
			while(true){
				int su = fis.read(buff);
				if(su==-1){break;}
				fos.write(buff,0,su); //����. ���� 0���� su����.
//				fos.write(buff); //�������ڸ��� �ʿ���� ���� �� �ִ�. 
			}
			
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("ī�� �Ϸ�");

	}

}
