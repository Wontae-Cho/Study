package com.bit.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex02Read {


	public static void main(String[] args) {
		File file = new File("files\\ex01.bin"); //읽어들이는 것 이기 때문에 반드시 있어야 함.
		InputStream fis = null;
		BufferedInputStream bis = null;
		
		List<Byte> list = new ArrayList<Byte>(); //읽어온 데이터를 담을 곳.
		
		if(file.exists()){						// 따라서 파일이 존재하는지 부터 확인해야함.
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				byte[] buf = new byte[8];
				
				while(true){ //얼마나 데이터가 있는지 모르기 때문에 반복문.
					
					/////////////////기존 fis를 이용하는 방법///////////////////
//					int su = fis.read(); //읽어들일 갯수가 10이라면 su = 10
//										// 읽어올 데이터가 있는데 데이터가 안들어가있는 경우면 0 ex)공백.
//					if(su==-1){break;}	//읽어올 데이터가 없는 경우는 -1
//					list.add((byte)su); //읽어온 데이터를 담을 곳을 만들고 추가.
					//////////////////////////////////////////////////////////
					
					/////bis를 이용하는 방법//////////////////////////////////
					int su = bis.read(buf);
					if(su==-1){break;}
					for(int i=0; i<su; i++){
						list.add(buf[i]);	//buf[i] 값을 리스트에 넣음.
					}
					/////////////////////////////////////////////////////////
				}
				///////////fis 를 이용하는 방법/////////////////
				Object[] arr = list.toArray(); //리스트에 담긴 걸 꺼내오기 위한 작업. 리스트를 Object 배열을 바꿈.
				byte[] arr2 = new byte[arr.length]; //
				for(int i=0; i<arr2.length; i++){	// Object배열을 byte배열로 바꾸는 과정.
					arr2[i]=(Byte)arr[i];			//
				}
				String msg = new String(arr2); //생성자에 바이트 배열을 넣어서 문자열로 바꿈.
				System.out.println(msg);
				////////////////////////////////////////////////
				
				
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(fis!=null){fis.close();}
					if(bis!=null){bis.close();}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			
			
			
			
		}else{
			System.out.println("파일이 존재하지 않습니다.");
		}

	}

}
