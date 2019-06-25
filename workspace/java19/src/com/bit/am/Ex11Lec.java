package com.bit.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex11Lec {

	public static void main(String[] args) {
		ArrayList<byte[]> list=new ArrayList<byte[]>(); // byte�迭�� ���� ArrayList
		File file=new File(".\\backup");				// ���� ���丮 �������� backup ����
		file.mkdir();									// backup�� ������� �����.
		file=new File(".\\backup\\data.obj");			// backup���丮 �ȿ� data.obj��� ������ ����.
		try {
			file.createNewFile();						// ������ ����.
		} catch (IOException e) {						// ������������ ���� �� �ִ� ������ ���ؼ� try - catch
			e.printStackTrace();						//
		}												//
		
		FileInputStream fis=null;						// �Է½�Ʈ�� �⺻�� null
		byte[] buff=new byte[4];						// buff��� byte�迭�� 4���� ���� ������. �й�,����,����,����
		try {											// �Է°������� ���� �� �ִ� ������ ���ؼ� try - catch
			fis=new FileInputStream(file);				// �Է����ϴµ� file(���-.\\backup�� �ش�)�� �ִ� file(.\\backup\\data.obj)�� ���� �Է���.
			while(true){
				int su=fis.read(buff);					// buff�� �ִ� ���� �����ö����� su�� ���Ե�. �̶� �������� ���� byte�̹Ƿ� int�� �޴°��� ����. 
				if(su==-1){break;}						// fis.read�� �� �̻� ���� ������ ���� �� -1�� �Ǵµ� �� ��쿡 �ݺ����� Ż�� �� �� �ֵ�����.
				//System.arraycopy(buff, 0, obj, 0, 4); // �迭�� �������� ���1.
				byte[] obj=Arrays.copyOf(buff, 4);		// �迭�� �������� ���2. �������縦 �Ұ�� ���� ����������� �������縦 �ؾ���.
				list.add(obj);							// ������ �迭�� list�� �߰�
				System.out.println(Arrays.toString(buff)); //��迭�� ������ Ȯ���ϱ� ����.
			}
			System.out.println("--------------");
		} catch (FileNotFoundException e) {				// �ش��ο��� ������ ã�� �� ���� �� ����� ������ ���� ���
			e.printStackTrace();
		} catch (IOException e) {						// �����͸� �д°��������� �������
			e.printStackTrace();
		} finally{
				try {
					if(fis!=null){						// fis==null�ϰ�� �ƿ� �Է��� ������� �����Ƿ� �׷��� ���� ��쿡�� �Է��� �ݾ��ش�.
						fis.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		for(int i=0; i<list.size(); i++){
			byte[] temp=list.get(i);
			System.out.println(Arrays.toString(temp));
		}
		System.out.println("-------------------------------------");
		System.out.println("�л��������� ���α׷�(ver 0.3.0) ");
		System.out.println("-------------------------------------");
		
		
		byte[] stu=new byte[]{1,90,80,70};
		list.add(stu);
		stu=new byte[]{2,91,81,71};
		list.add(stu);
		stu=new byte[]{3,92,82,72};
		list.add(stu);
		FileOutputStream fos=null;
		
		for(int i=0; i<list.size(); i++){
			System.out.println(Arrays.toString(list.get(i)));
		}
		
		try {
			fos=new FileOutputStream(file);
			for(int i=0; i<list.size(); i++){
				byte[] test = list.get(i);
				fos.write(test);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
				try {
					if(fos!=null){
						fos.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	

}

