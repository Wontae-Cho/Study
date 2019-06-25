package com.bit.charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02CharRead {
		//���������� �о�鿴���� 2����Ʈ
	public static void main(String[] args) {
		File file = new File("files\\ch01.txt"); //�ִٰ� ������
		Reader fr = null;
		BufferedReader br = null;
		char[] cbuf=new char[8];
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(true){
				String msg = br.readLine();	// ���δ����� �д´�. ������ ����������.
				if(msg==null){break;}		// String�̱� ������ �ƹ��͵� �������Ҷ��� Ż������.
				System.out.println(msg);
//				int ch=fr.read();
//				if(ch==-1){break;}
//				System.out.print((char)ch);
//				int su = fr.read(cbuf); //�о���� ����.
//				if(su==-1){break;}
//				String msg = new String(cbuf,0,su); //�о���� ������ŭ�� ���ڿ��� ����.
//													//�����ִ� �����͸� �� �������� �ʱ� ���ؼ�.
//				System.out.println(msg);
				
			}
			
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(br!=null){br.close();}
				if(fr!=null){fr.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
