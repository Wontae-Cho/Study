package com.bit.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex01Write {
	/*
	 * ���⸸ �Ѵٸ� �װ͸� �������� ���� �ִ����� ��������.
	 * ���� ���� ������ ����ϰ� �ʹٸ� ���� ���� �о 
	 * ���� ���뿡 ������ �߰��ϴ� ���·� �ؾ��Ѵ�.
	 * �� ���� �� ���� �� ���ϸ��� �������� ���� ���������� �ݾƾ� �Ѵ�.
	 * ���� �ݰԵǸ� �ٸ����� ������ ���� ������ ����ä�� ������ �����̴�.
	 * ��� streamŬ������ ���� InputStream, OutputStream�� ��ӹ޾Ƽ� ������� ��ü��.
	 * InputStream, OutputStream�� �߻�Ŭ���� �̴�.
	 */
	public static void main(String[] args) {
		File file = new File(".\\files");
		file.mkdir();
		file=new File(".\\files\\ex01.bin");
		OutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			if(file.createNewFile()){
				System.out.println("������ ����ϴ�.");
			}else{
				System.out.println("������ �����մϴ�.");
			}
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
//			ps = new PrintStream(fos); //���� ���� ����
			ps = new PrintStream(bos); //���۸� �ް� ���� - �Ϲ������� �����¸� �����.
//			ps = new PrintStream(bos,true); //����Ʈ �Ҷ����� �ڵ����� flush�� ����.
						//print��� ������ �־ ���� outputstream�� �����Ѵ�.
			
//			fos.write("������ �����߽��ϴ�.".getBytes());
//			fos.flush();
//			bos.write("���۸� ����ؼ� �ۼ��մϴ�.".getBytes());
//			bos.write("\r\n".getBytes()); //���� ������� 
////			bos.write("\n".getBytes());	// ���� �� ��
//			bos.flush();
//			bos.write("�׷��� �� �����ϴ�!@#$%".getBytes());
//			bos.flush();
			////////////////PrintStream/////////////////
			ps.println("����Ʈ��Ʈ��");
			ps.print("�����ͽ�Ʈ���� ����ϰ� �Ǹ�");	//�ռ� ������ �ü���� ���� �ٸ��Ͱ� �޸� PrintStream�� �˾Ƽ� ó�����ش�.
			ps.println(" �̷��� ��µ˴ϴ�.");
			ps.println(1234); //�پ��� �ڷ������� ����س� �� �ֵ��� �����ε� �Ǿ� �ִ�.
							// ���� ����� System.out.println�� ���� �͵��� ��� �̷� ����Ʈ��Ʈ���� ����� ���̶�� �� �� �ִ�.
			///////////////////////////////////////////
			
			System.out.println("�ۼ��� �������ϴ�.");
			// System�̶�� Ŭ������ out�̶�� static�� Ŭ���� ����.
						
		} catch (IOException e) {
			e.printStackTrace();
		}finally{	//���� �� ���ǻ��� : ���� ���� �������� ���� �������� �ݾƾ� �Ѵ�.
				try {
					if(ps!=null){ps.close();}
					if(bos!=null){bos.close();}
					if(fos!=null){fos.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}

	}

}
