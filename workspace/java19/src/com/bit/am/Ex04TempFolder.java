package com.bit.am;
import java.io.File;
import java.io.IOException;


public class Ex04TempFolder {


	public static void main(String[] args) {
		// �ӽ�����
		File target = new File(".\\test\\abc01.txt");
		try {
			System.out.println(target.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
//			createTempFile(prifix,suffix);
//			prefilx ���ϸ� 3�����̻�.
//			suffix Ȯ����	������ Ȯ���ڰ� ���� ���·� �������.
//			temp�� �������� �ӽñ⶧���� ����,������� ������ �������� �ʴ´�.
//			3��° ���ڷ� ������ �� ������ ��ġ�� �ӽ������� ����� �����Ѵ�.
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
