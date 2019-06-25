package com.bit.charStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex01CharWrite {
	// �̹����� ������ ���ϰ��� ���� ���� �� ������, ����Ʈ ������ Ȧ���� ��쿡 �̹����� �����ų� �������� �����ų� �� �� �ִ�.
	// ���� ���ڿ���Ʈ���� ���ڿ��� �ٷ궧�� �ٷ� �� �ֵ��� ����.
	// ����, �ѱ������̳� �������� ��� ���ڿ��� �ٷ�ٰ� �ؼ� ���ڿ� ��Ʈ���� ����� �� �ִ� �͵� �ƴϴ�.
	// �ֳ��ϸ� �� ���� ������ ��ġ���� ���� ���ԵǸ鼭 2byte�� �ƴ� 1byte�� �� ���� �ֱ� �����̴�.

	
	public static void main(String[] args) {
		File file = new File("files\\ch01.txt");
		Writer fw = null;
		BufferedWriter bw = null;
		PrintWriter pw =null;
		String msg = "���۸� �̿��� ���ڿ� �Է�";
		char[] source = msg.toCharArray(); //������ 2����Ʈ�� char�� ���� �� ����.
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			
			pw.println("ù��°");
			pw.println("�ι�°");
			pw.println("����°");
			pw.println("�׹�°");
			pw.println("�ټ���°");
			pw.println("������°");
//			pw.flush();
			
			
//			bw.write("ù��°");
//			bw.write("\r\n"); 	// �����쿡���� ������ 
//			bw.write("�ι�°");
//			bw.write('\n');		// �� �ܿ����� ������
//			bw.write("����°");
//			bw.newLine();		// �� �ٸ� ������ = ��������� �ü���� ���缭 ����.
//			fw.write(source);
//			for(int i=0; i<source.length; i++){
//				fw.write(source[i]);
//			}
			
//			fw.flush();
//			bw.flush();
			
		} catch (IOException e) {

			e.printStackTrace();
		} finally{
			try {
				if(pw!=null){pw.close();}
				if(bw!=null){bw.close();}
				if(fw!=null){fw.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
