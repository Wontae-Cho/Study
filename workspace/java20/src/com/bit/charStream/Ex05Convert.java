package com.bit.charStream;

import java.io.*;

public class Ex05Convert {

	public static void main(String[] args) {
		File file = new File("files\\ch05.txt");
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintWriter pw = null;
		
		try {
			os=new FileOutputStream(file);
			osw=new OutputStreamWriter(os);
			pw = new PrintWriter(osw,true);
			
			pw.println("���پ���");
			pw.println("�� ���پ���");
			pw.print("���������� �ѹ� �� ����");
			pw.println("�����ϴ�");
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}finally{
			try {
				if(pw!=null){pw.close();}
				if(osw!=null){osw.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
