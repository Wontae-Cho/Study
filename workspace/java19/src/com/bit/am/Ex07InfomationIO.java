package com.bit.am;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07InfomationIO {
//	컴퓨터에서 보이고 입력하는 모든 과정이 In Out이다.
//	In(입력) : 컴퓨터에 명령을 전달하는 것. 
	// ex) 키보드, 마우스 등등.
	
//	Out(출력) : 컴퓨터에 명령한 것을 연산후에 보여주는 결과.
	//모니터, 프린터 등
	
//	Stream : 기본적인 스트림에서는 일방통행이다. 입력과 출력이 동시에 될 수는 없는것.
//	기준이 어떤것이 되느냐에 따라서 InputStream이 OutputStream이 될 수 있는 것이고 그 반대도 될 수 있다.
	//stream은 기본적으로 byte스트림. 따라서 기본단위는 1byte.

	public static void main(String[] args) {
		File file = new File(".\\test\\ex07.txt");
		FileOutputStream fos = null;
		String msg = "가";
		byte[] by = msg.getBytes();
		try {
			file.createNewFile();
			fos = new FileOutputStream(file);
			fos.write(97);	// 0000 0000 0000 97; 
							// 단위가 byte이므로 앞에는 무시되고 97만을 입력받게 된다. 한번 썻으니까 1바이트.
//			fos.write('가');	// '가'는 2byte이므로 처리불가.
			fos.write(by[0]);	// 따라서 1byte +
			fos.write(by[1]);	// 1byte 해서 합쳐서 2byte를 통해서 처리한다.
								// 자바는 기본적으로 2byte를 사용하는데 1byte만 사용해도 된다면 1byte를 사용함으로써 자원의 최적화를 꾀한다.
//			fos.write(127);	
//			fos.write(128);	
//			fos.write(256);	
			fos.close();	//썻으면 반드시 클로즈 해줘야 한다.
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행완료");
	}

}
