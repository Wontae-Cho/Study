package com.bit.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex03DataStreamOut {
	// 다양한 타입의 자료를 받을 수 있고 데이터의 자료형을 유지할 수 있다는 장점이 있다.
	// 하지만 넣어준 순서 그대로 넣어야 하고 그렇게 되지 않을시 에러가 아닌 이상한 값이 나온다.
	// 따라서 에러가 아니기 때문에 사용할 때 유의해야 할 부분이다.

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

			dos.write(65); // 기본 write
			dos.writeByte(97); // byte형 write
			dos.writeInt(1234); // int형 write
			dos.writeLong(123121); // long형 write
			dos.writeFloat(3.14f); // float형 write
			dos.writeDouble(3.14); // double형 write
			dos.writeChar('가'); // char형 write
			dos.writeBoolean(false);// boolean형 write
			dos.writeUTF("문자열 데이터도 보냅니다.");
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
