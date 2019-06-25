package com.bit.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex01Write {
	/*
	 * 쓰기만 한다면 그것만 쓰여지고 전에 있던것은 지워진다.
	 * 따라서 전에 쓴것을 기억하고 싶다면 쓰기 전에 읽어서 
	 * 읽은 내용에 쓴것을 추가하는 형태로 해야한다.
	 * 다 쓰고난 뒤 닫을 때 제일먼저 열었던걸 제일 마지막으로 닫아야 한다.
	 * 먼저 닫게되면 다른곳에 쓰여진 값이 써지지 못한채로 닫히기 때문이다.
	 * 모든 stream클래스는 기존 InputStream, OutputStream을 상속받아서 만들어진 객체다.
	 * InputStream, OutputStream은 추상클래스 이다.
	 */
	public static void main(String[] args) {
		File file = new File(".\\files");
		file.mkdir();
		file=new File(".\\files\\ex01.bin");
		OutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			if(file.createNewFile()){
				System.out.println("파일을 만듭니다.");
			}else{
				System.out.println("파일이 존재합니다.");
			}
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
//			ps = new PrintStream(fos); //버퍼 없이 쓸때
			ps = new PrintStream(bos); //버퍼를 달고 쓸때 - 일반적으로 이형태를 사용함.
//			ps = new PrintStream(bos,true); //프린트 할때마다 자동으로 flush를 해줌.
						//print라는 목적이 있어서 오직 outputstream만 존재한다.
			
//			fos.write("내용을 수정했습니다.".getBytes());
//			fos.flush();
//			bos.write("버퍼를 사용해서 작성합니다.".getBytes());
//			bos.write("\r\n".getBytes()); //개행 윈도우용 
////			bos.write("\n".getBytes());	// 개행 그 외
//			bos.flush();
//			bos.write("그래서 참 빠릅니다!@#$%".getBytes());
//			bos.flush();
			////////////////PrintStream/////////////////
			ps.println("프린트스트림");
			ps.print("프린터스트림을 사용하게 되면");	//앞서 개행이 운영체제에 따라 다른것과 달리 PrintStream은 알아서 처리해준다.
			ps.println(" 이렇게 출력됩니다.");
			ps.println(1234); //다양한 자료형들은 출력해낼 수 있도록 오버로드 되어 있다.
							// 자주 사용한 System.out.println과 같은 것들이 모두 이런 프린트스트림을 사용한 것이라고 볼 수 있다.
			///////////////////////////////////////////
			
			System.out.println("작성이 끝났습니다.");
			// System이라는 클래스에 out이라는 static인 클래스 변수.
						
		} catch (IOException e) {
			e.printStackTrace();
		}finally{	//닫을 때 주의사항 : 제일 먼저 열었던걸 제일 마지막에 닫아야 한다.
				try {
					if(ps!=null){ps.close();}
					if(bos!=null){bos.close();}
					if(fos!=null){fos.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}

	}

}
