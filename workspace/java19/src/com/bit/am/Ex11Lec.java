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
		ArrayList<byte[]> list=new ArrayList<byte[]>(); // byte배열을 갖는 ArrayList
		File file=new File(".\\backup");				// 현재 디렉토리 기준으로 backup 생성
		file.mkdir();									// backup이 없을경우 만들어.
		file=new File(".\\backup\\data.obj");			// backup디렉토리 안에 data.obj라는 파일을 생성.
		try {
			file.createNewFile();						// 파일을 생성.
		} catch (IOException e) {						// 생성과정에서 생길 수 있는 에러에 대해서 try - catch
			e.printStackTrace();						//
		}												//
		
		FileInputStream fis=null;						// 입력스트림 기본값 null
		byte[] buff=new byte[4];						// buff라는 byte배열은 4개의 값을 가진다. 학번,국어,영어,수학
		try {											// 입력과정에서 생길 수 있는 에러에 대해서 try - catch
			fis=new FileInputStream(file);				// 입력을하는데 file(경로-.\\backup에 해당)에 있는 file(.\\backup\\data.obj)의 값을 입력함.
			while(true){
				int su=fis.read(buff);					// buff에 있는 값을 가져올때마다 su에 대입됨. 이때 가져오는 값은 byte이므로 int로 받는것은 가능. 
				if(su==-1){break;}						// fis.read는 더 이상 값을 가지지 않을 때 -1이 되는데 그 경우에 반복문을 탈출 할 수 있도록함.
				//System.arraycopy(buff, 0, obj, 0, 4); // 배열의 깊은복사 방법1.
				byte[] obj=Arrays.copyOf(buff, 4);		// 배열의 깊은복사 방법2. 얕은복사를 할경우 값이 덮어씌워짐으로 깊은복사를 해야함.
				list.add(obj);							// 복사한 배열을 list에 추가
				System.out.println(Arrays.toString(buff)); //어떤배열이 들어갔는지 확인하기 위해.
			}
			System.out.println("--------------");
		} catch (FileNotFoundException e) {				// 해당경로에서 파일을 찾을 수 없을 때 생기는 에러에 대한 대비
			e.printStackTrace();
		} catch (IOException e) {						// 데이터를 읽는과정에서의 에러대비
			e.printStackTrace();
		} finally{
				try {
					if(fis!=null){						// fis==null일경우 아예 입력이 진행되지 않으므로 그렇지 않을 경우에만 입력을 닫아준다.
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
		System.out.println("학생성적관리 프로그램(ver 0.3.0) ");
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

