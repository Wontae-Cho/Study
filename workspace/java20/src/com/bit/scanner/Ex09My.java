package com.bit.scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Ex09My {

/*
 * (���ڿ� ��Ʈ��) data = txt���Ͽ�.
 * �л������������α׷�(ver0.3.2)
 * 
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�о�;��ϴµ�. ������ ����. read.
		File file = new File("backup2");
		file.mkdir();
		file = new File("backup2\\studata.txt");
		Reader fr = null;
		BufferedReader br = null;
		String input = "";
		String data = "";
//		String msg = "";
		int num = 2019000;
		
		
		
		if(file.exists()){ //������ �����Ҷ�. - �о��.
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				while(true){ //������ �ϳ� �� ���� ó��. �ӽ��� ó��.
					String tempdata = br.readLine(); 
					if(tempdata==null){break;}
					data += tempdata;
					System.out.println(data);
				}
				
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}finally{
				try {
					if(br!=null){br.close();}
					if(fr!=null){fr.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
		}else{	//������ �������� ������. - ����
			try {
				file.createNewFile();
				System.out.println("����");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String[] arr = data.split("\\|");
		
		
		System.out.println("---------------------------------------------");
		System.out.println("�л������������α׷�(ver 0.3.2)");
		System.out.println("---------------------------------------------");
		
		while(true){
			System.out.println("---------------------------------------------");
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>");
			input=sc.nextLine();
			System.out.println("---------------------------------------------");
			if(input.equals("0")){break;}
			if(input.equals("1")){//��ü�����ֱ�.
				System.out.println("�й�\t����\t����\t����");
				for(int i=0; i<arr.length; i++){
					System.out.print(arr[i]);
					if(i!=0){
						System.out.print("\t");
					}
					if(i!=0&&i%4==0){
						System.out.print("\n");
					}
					
				}
			}else if(input.equals("2")){ // �Է�
				//�й�ó��. �������� ������.num
				
				for(int i=0; i<arr.length; i++){
					if(arr.length%4==0){
						num = Integer.parseInt(arr[arr.length-5]);		
					}
				}
				data += "|"+ ++num;
				System.out.print("����>");
				input = sc.nextLine();
				data += "|"+input;
				System.out.print("����>");
				input = sc.nextLine();
				data += "|"+input;
				System.out.print("����>");
				input = sc.nextLine();
				data += "|"+input;
				
			}else if(input.equals("3")){ // ����
				
			}else if(input.equals("4")){ // ����
				
			}
		}
		//�����ϱ����� �����Ͱ��� �����. �� ������ �о�� ���ϰ� ����.
		Writer fw = null;
		BufferedWriter bw = null;
		PrintWriter pw =null;
//		char[] source = data.toCharArray();
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			//�Էºκ�.
			pw.println(data);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(pw!=null){pw.close();}
				if(bw!=null){bw.close();}
				if(fw!=null){fw.close();}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		System.out.println("�̿����ּż� �����մϴ�.");

	}

}
