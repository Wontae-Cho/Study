package com.bit.am;
import java.io.File;
import java.io.IOException;


public class Ex04TempFolder {


	public static void main(String[] args) {
		// 임시파일
		File target = new File(".\\test\\abc01.txt");
		try {
			System.out.println(target.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
//			createTempFile(prifix,suffix);
//			prefilx 파일명 3글자이상.
//			suffix 확장자	없을시 확장자가 없는 상태로 만들어짐.
//			temp는 어디까지나 임시기때문에 수정,삭제라는 개념이 존재하지 않는다.
//			3번째 인자로 지정할 시 지정된 위치에 임시파일을 만들고 저장한다.
//			
			File temp = File.createTempFile("abcabcabcabc", ".txt");
			System.out.println(temp.exists());
			System.out.println(temp.getParent());
			System.out.println(temp.getCanonicalPath());
			System.out.println(temp.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
