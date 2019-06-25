package com.bit.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex05RandomAccess {

	public static void main(String[] args) {
		File file = new File("files\\data2.bin");
//		"r"=읽기전용 "rw"=읽기와 쓰기전용 "rws", or "rwd"
		String mode = "rw";
		byte[] buf = new byte[8];
		
		RandomAccessFile raf = null;
		
		try {
			raf = new RandomAccessFile(file,mode); //하나로 읽기와 쓰기 모두가 가능.
			raf.write("RandomAccessWhatToDo".getBytes());
			raf.seek(0);  // flush와 같은 역할.
			raf.write("SuperSuperSonSon".getBytes());
			raf.seek(0);  // 덮어씌움.
			//바이트코드를 덮어쓰기 때문에 기존데이타가 남아서 출력될 수 있다.
			
			
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
