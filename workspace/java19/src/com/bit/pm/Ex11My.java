package com.bit.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * �л��������� ���α׷�(ver 0.3.0)
 * 
 * ���α׷� �ε��� data.obj���Ͽ��� �о�鿩
 * ���� ����
 * ���α׷� ����� ����.
 * ������ �Է��ߴ� ���� ������� �� �ֵ���
 * */

public class Ex11My {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		byte studNum = 0;
		int cnt = 0;
		List<byte[]> stuList = new ArrayList<byte[]>();
		byte[] stuData = new byte[4];
		File file = new File("backup\\data.obj"); //�б�
		FileInputStream fis = null;
		try {
			file.createNewFile();
			fis = new FileInputStream(file);
			while(true){
				int su=fis.read(stuData);
				if(su==-1){break;}
				byte[] obj=Arrays.copyOf(stuData, 4);
				stuList.add(obj);
				cnt++;
			}
			studNum = (byte)cnt;
		}catch (FileNotFoundException e) {			
					e.printStackTrace();
		
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {fis.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("�л������������α׷�(ver 0.3.0)");
		System.out.println("-----------------------------------------------------");
		
		while (true) {
			
				System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>");
				input = sc.nextLine();
				System.out.println("-----------------------------------------------------");
				if (input.equals("0")) {break;}
				if (input.equals("1")) {
					System.out.println("-----------------------------------------------------");
					System.out.println("�й�\t����\t����\t����");
					System.out.println("-----------------------------------------------------");
					for(int i=0; i<stuList.size();i++){
						for(int j=0; j<stuData.length; j++){	
							
							System.out.print(stuList.get(i)[j]+"\t");
							
						}
						System.out.println();	
					}
					
					
				} else if (input.equals("2")) {
					stuData = new byte[4];
					System.out.print("����>");
					input = sc.nextLine();
					stuData[1] = Byte.parseByte(input);
					System.out.print("����>");
					input = sc.nextLine();
					stuData[2] = Byte.parseByte(input);
					System.out.print("����>");
					input = sc.nextLine();
					stuData[3] = Byte.parseByte(input);
					stuData[0] = ++studNum;
					
					stuList.add(stuData);
					
				} else if (input.equals("3")) {
					System.out.print("�й�>");
					int target = Integer.parseInt(sc.nextLine());
					int i = 0;
					for(i=0;i<stuList.size();i++){
						for(int j=0; j<stuData.length; j++){
							if(target==stuData[0]){break;}
						}
					}if(i==stuList.size()){
						continue;
					}
					stuData = stuList.get(i);
					System.out.print("����>");
					input = sc.nextLine();
					stuData[1] = Byte.parseByte(input);
					System.out.print("����>");
					input = sc.nextLine();
					stuData[2] = Byte.parseByte(input);
					System.out.print("����>");
					input = sc.nextLine();
					stuData[3] = Byte.parseByte(input);
					
//					stuList.add(stuData);

				} else if (input.equals("4")) {

				}

			}

		}
		FileOutputStream fos = null;
		for(int i=0; i<stuList.size(); i++){
			System.out.println(Arrays.toString(stuList.get(i)));
		}
		try {
			fos=new FileOutputStream(file);
			for(int i=0; i<stuList.size(); i++){
				byte[] test = stuList.get(i);
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
		
		System.out.println("�̿����ּż� �����մϴ�.");
	}

}
