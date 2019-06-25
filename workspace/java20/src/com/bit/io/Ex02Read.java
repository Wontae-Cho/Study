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
		File file = new File("files\\ex01.bin"); //�о���̴� �� �̱� ������ �ݵ�� �־�� ��.
		InputStream fis = null;
		BufferedInputStream bis = null;
		
		List<Byte> list = new ArrayList<Byte>(); //�о�� �����͸� ���� ��.
		
		if(file.exists()){						// ���� ������ �����ϴ��� ���� Ȯ���ؾ���.
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				byte[] buf = new byte[8];
				
				while(true){ //�󸶳� �����Ͱ� �ִ��� �𸣱� ������ �ݺ���.
					
					/////////////////���� fis�� �̿��ϴ� ���///////////////////
//					int su = fis.read(); //�о���� ������ 10�̶�� su = 10
//										// �о�� �����Ͱ� �ִµ� �����Ͱ� �ȵ��ִ� ���� 0 ex)����.
//					if(su==-1){break;}	//�о�� �����Ͱ� ���� ���� -1
//					list.add((byte)su); //�о�� �����͸� ���� ���� ����� �߰�.
					//////////////////////////////////////////////////////////
					
					/////bis�� �̿��ϴ� ���//////////////////////////////////
					int su = bis.read(buf);
					if(su==-1){break;}
					for(int i=0; i<su; i++){
						list.add(buf[i]);	//buf[i] ���� ����Ʈ�� ����.
					}
					/////////////////////////////////////////////////////////
				}
				///////////fis �� �̿��ϴ� ���/////////////////
				Object[] arr = list.toArray(); //����Ʈ�� ��� �� �������� ���� �۾�. ����Ʈ�� Object �迭�� �ٲ�.
				byte[] arr2 = new byte[arr.length]; //
				for(int i=0; i<arr2.length; i++){	// Object�迭�� byte�迭�� �ٲٴ� ����.
					arr2[i]=(Byte)arr[i];			//
				}
				String msg = new String(arr2); //�����ڿ� ����Ʈ �迭�� �־ ���ڿ��� �ٲ�.
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
			System.out.println("������ �������� �ʽ��ϴ�.");
		}

	}

}
