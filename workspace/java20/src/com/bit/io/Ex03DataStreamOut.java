package com.bit.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex03DataStreamOut {
	// �پ��� Ÿ���� �ڷḦ ���� �� �ְ� �������� �ڷ����� ������ �� �ִٴ� ������ �ִ�.
	// ������ �־��� ���� �״�� �־�� �ϰ� �׷��� ���� ������ ������ �ƴ� �̻��� ���� ���´�.
	// ���� ������ �ƴϱ� ������ ����� �� �����ؾ� �� �κ��̴�.

	public static void main(String[] args) {
		File file = new File("files");
		file.mkdir();
		file = new File("files\\data.bin");
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			file.createNewFile();
			os = new FileOutputStream(file);
			dos = new DataOutputStream(os);

			dos.write(65); // �⺻ write
			dos.writeByte(97); // byte�� write
			dos.writeInt(1234); // int�� write
			dos.writeLong(123121); // long�� write
			dos.writeFloat(3.14f); // float�� write
			dos.writeDouble(3.14); // double�� write
			dos.writeChar('��'); // char�� write
			dos.writeBoolean(false);// boolean�� write
			dos.writeUTF("���ڿ� �����͵� �����ϴ�.");
			dos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			{
				try {
					if (dos != null) {
						dos.close();
					}
					if (os != null) {
						os.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}
}
