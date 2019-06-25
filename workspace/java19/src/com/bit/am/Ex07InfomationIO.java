package com.bit.am;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07InfomationIO {
//	��ǻ�Ϳ��� ���̰� �Է��ϴ� ��� ������ In Out�̴�.
//	In(�Է�) : ��ǻ�Ϳ� ����� �����ϴ� ��. 
	// ex) Ű����, ���콺 ���.
	
//	Out(���) : ��ǻ�Ϳ� ����� ���� �����Ŀ� �����ִ� ���.
	//�����, ������ ��
	
//	Stream : �⺻���� ��Ʈ�������� �Ϲ������̴�. �Է°� ����� ���ÿ� �� ���� ���°�.
//	������ ����� �Ǵ��Ŀ� ���� InputStream�� OutputStream�� �� �� �ִ� ���̰� �� �ݴ뵵 �� �� �ִ�.
	//stream�� �⺻������ byte��Ʈ��. ���� �⺻������ 1byte.

	public static void main(String[] args) {
		File file = new File(".\\test\\ex07.txt");
		FileOutputStream fos = null;
		String msg = "��";
		byte[] by = msg.getBytes();
		try {
			file.createNewFile();
			fos = new FileOutputStream(file);
			fos.write(97);	// 0000 0000 0000 97; 
							// ������ byte�̹Ƿ� �տ��� ���õǰ� 97���� �Է¹ް� �ȴ�. �ѹ� �����ϱ� 1����Ʈ.
//			fos.write('��');	// '��'�� 2byte�̹Ƿ� ó���Ұ�.
			fos.write(by[0]);	// ���� 1byte +
			fos.write(by[1]);	// 1byte �ؼ� ���ļ� 2byte�� ���ؼ� ó���Ѵ�.
								// �ڹٴ� �⺻������ 2byte�� ����ϴµ� 1byte�� ����ص� �ȴٸ� 1byte�� ��������ν� �ڿ��� ����ȭ�� ���Ѵ�.
//			fos.write(127);	
//			fos.write(128);	
//			fos.write(256);	
			fos.close();	//������ �ݵ�� Ŭ���� ����� �Ѵ�.
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����Ϸ�");
	}

}
