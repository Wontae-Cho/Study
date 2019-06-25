package com.bit.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex05RandomAccess {

	public static void main(String[] args) {
		File file = new File("files\\data2.bin");
//		"r"=�б����� "rw"=�б�� �������� "rws", or "rwd"
		String mode = "rw";
		byte[] buf = new byte[8];
		
		RandomAccessFile raf = null;
		
		try {
			raf = new RandomAccessFile(file,mode); //�ϳ��� �б�� ���� ��ΰ� ����.
			raf.write("RandomAccessWhatToDo".getBytes());
			raf.seek(0);  // flush�� ���� ����.
			raf.write("SuperSuperSonSon".getBytes());
			raf.seek(0);  // �����.
			//����Ʈ�ڵ带 ����� ������ ��������Ÿ�� ���Ƽ� ��µ� �� �ִ�.
			
			
			while(true){
				int su=raf.read(buf);
				if(su==-1){break;}
				System.out.println(new String(buf,0,su));
			}
			
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(raf!=null){raf.close();}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		

	}

}
