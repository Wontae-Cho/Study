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
 * (문자열 스트림) data = txt파일에.
 * 학생성적관리프로그램(ver0.3.2)
 * 
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//읽어와야하는데. 없으면 생성. read.
		File file = new File("backup2");
		file.mkdir();
		file = new File("backup2\\studata.txt");
		Reader fr = null;
		BufferedReader br = null;
		String input = "";
		String data = "";
//		String msg = "";
		int num = 2019000;
		
		
		
		if(file.exists()){ //파일이 존재할때. - 읽어옴.
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				while(true){ //변수를 하나 더 만들어서 처리. 임시적 처리.
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
			
			
		}else{	//파일이 존재하지 않을때. - 생성
			try {
				file.createNewFile();
				System.out.println("생성");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String[] arr = data.split("\\|");
		
		
		System.out.println("---------------------------------------------");
		System.out.println("학생성적관리프로그램(ver 0.3.2)");
		System.out.println("---------------------------------------------");
		
		while(true){
			System.out.println("---------------------------------------------");
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
			input=sc.nextLine();
			System.out.println("---------------------------------------------");
			if(input.equals("0")){break;}
			if(input.equals("1")){//전체보여주기.
				System.out.println("학번\t국어\t영어\t수학");
				for(int i=0; i<arr.length; i++){
					System.out.print(arr[i]);
					if(i!=0){
						System.out.print("\t");
					}
					if(i!=0&&i%4==0){
						System.out.print("\n");
					}
					
				}
			}else if(input.equals("2")){ // 입력
				//학번처리. 데이터의 마지막.num
				
				for(int i=0; i<arr.length; i++){
					if(arr.length%4==0){
						num = Integer.parseInt(arr[arr.length-5]);		
					}
				}
				data += "|"+ ++num;
				System.out.print("국어>");
				input = sc.nextLine();
				data += "|"+input;
				System.out.print("영어>");
				input = sc.nextLine();
				data += "|"+input;
				System.out.print("수학>");
				input = sc.nextLine();
				data += "|"+input;
				
			}else if(input.equals("3")){ // 수정
				
			}else if(input.equals("4")){ // 삭제
				
			}
		}
		//종료하기전에 데이터값을 써야해. 쓸 파일은 읽어온 파일과 동일.
		Writer fw = null;
		BufferedWriter bw = null;
		PrintWriter pw =null;
//		char[] source = data.toCharArray();
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			//입력부분.
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
		System.out.println("이용해주셔서 감사합니다.");

	}

}
