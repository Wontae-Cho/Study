package com.bit.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08ByteStream { 	// �̹��� ���� �ҷ�����.
								// ByteStream�� ���� �⺻�̵�. ����־�� �ſ� �� ���� ������ ������ �����ش�.
								// ������ 1byte�� �����ϴٺ��� �ӵ��� ������.
								// ������ ���徿 �ű�°Ͱ� ����.

	public static void main(String[] args) {
		File source = new File(".\\test\\WildLife.wmv");
		File dest = new File(".\\copy\\Wild.wmv");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			dest.createNewFile();
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			while(true){
				int su = fis.read();
				if(su==-1){break;} //���̻� �о���ϰ� ������.
				fos.write(su);
			}
			fos.close();
			fis.close();			
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("ī�ǿϷ�");
		
	}

}
