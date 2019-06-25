package com.bit.io;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
	/*
	 * �л������������α׷� (ver 0.3.1)
	 */
	public static void main(String[] args) { // dataStream�� ���.
		// ���α׷��� ���۵Ǳ� ���� �о����. ������ ����. read = input
		Scanner sc = new Scanner(System.in);

		File file = new File("backup");
		file.mkdir();
		file = new File("backup\\studata.bin");
		
		InputStream is = null;
//		DataInputStream dis = null;
		ByteArrayOutputStream baos = null;
		
		OutputStream os = null;
//		DataOutputStream dos = null;
		ByteArrayInputStream bais = null;
		
		String data = "";
		String input = "";
		byte stuNum = 0; //�й�
		byte[] studata = null;

		byte[] buff = new byte[8];
		if (file.exists()) { // �б����� ������ �ִ��� Ȯ��.
			try {
				is = new FileInputStream(file);
//				dis = new DataInputStream(is);
				baos = new ByteArrayOutputStream();
				while (true) {
					int su = is.read(buff); // �ִٸ� buff�� ����� ���� su��.
					if (su == -1) {break;} // �� �̻� �Էµ� ���� ������ �극��ũ.
					baos.write(buff, 0, su); // ���� ���� baos�� ����.
				}
				studata = baos.toByteArray();
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (baos != null) {baos.close();}
//					if (dis != null) {dis.close();}
					if (is != null) {is.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}else{
			try {
				file.createNewFile();
				System.out.println("����");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		System.out.println("-----------------------------------------------------");
		System.out.println("�л������������α׷�(ver 0.3.1)");
		System.out.println("-----------------------------------------------------");

		while (true) {

			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>");
			input = sc.nextLine();
			System.out.println("-----------------------------------------------------");
			if (input.equals("0")) {
				break;
			}
			if (input.equals("1")) {
				System.out.println("-----------------------------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("-----------------------------------------------------");
				for(int i=0; i<studata.length; i++){
					System.out.print(studata[i]+" "); // ����� �� ����.	
				}
				System.out.println();
			} else if (input.equals("2")) {
				studata = new byte[4];
				studata[0] = ++stuNum;
				//�й��� �����.
				
				//���������� �����.
				System.out.print("����>");
				input = sc.nextLine();
				studata[1] = Byte.parseByte(input);
				System.out.print("����>");
				input = sc.nextLine();
				studata[2] = Byte.parseByte(input);
				System.out.print("����>");
				input = sc.nextLine();
				studata[3] = Byte.parseByte(input);
				
				buff = studata;
				
				
			} else if (input.equals("3")) {

			} else if (input.equals("4")) {

			}

		}
		
		
		try {
			os=new FileOutputStream(file);
			bais = new ByteArrayInputStream(studata);
			while(true){
				int su = bais.read(buff);
				if(su==-1){break;}
				os.write(buff,0,su);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
				try {
					if(bais!=null){bais.close();}
//					if(dos!=null){dos.close();}
					if(os!=null){os.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		System.out.println("�̿����ּż� �����մϴ�.");
		//����� ���� ���� �����.

	}

}
