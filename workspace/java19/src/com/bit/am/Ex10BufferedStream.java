package com.bit.am;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10BufferedStream {
	//�ý����� ���� buffer�� Ȱ���ؼ� ByteStream�� �ӵ��� �����ٴ� ������ �غ��ϴ� ���.


	public static void main(String[] args) {
//		File source = new File("test\\ex07.txt");
//		File dest = new File("test\\ex09.txt");
		File source = new File("test\\WildLife.wmv");
		File dest = new File("copy\\copy.wmv");
		FileOutputStream fos = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		

		
		try {
			dest.createNewFile();
			fis = new FileInputStream(source); //bytestream�� �䱸��
			fos = new FileOutputStream(dest);
			bis = new BufferedInputStream(fis); 
			bos = new BufferedOutputStream(fos);
			
			while(true){
				int su = bis.read();
				if(su==-1){break;}
				bos.write(su);
			}
			bos.flush();//close��Ȳ���� �̷����� ������ �����Ͽ����� �ʿ��� ���� �ִ�.
			//buffered�ȿ� �ִ� �͵��� �о�� ������ �ϸ� �����ϸ� ���ִ� ���� ����.
			//buffered�� �������� �з������µ� flush�� �� ���� ����ϰ� ���� �� �ִ�.
			
//			byte[] buff = new byte[32];
//			while(true){
//				int su = bis.read(buff);
//				if(su==-1){break;}
//				bos.write(buff,0,su);
//			}
			 
			System.out.println("����");
		} catch (IOException e) {

			e.printStackTrace();
		} finally{
			try {

				if(fis!=null){fis.close();}//���������� io�� ������ �������̱� ������ ������ �ʴ´�.
				if(fos!=null){fos.close();}//���������� io�� ������ �������̱� ������ ������ �ʴ´�.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
