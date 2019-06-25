package com.bit.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Ex02ObjectInputStream {
	// 읽어낼 때 순서대로 읽지 않을경우 에러가 발생할 수도 있지만
	// 에러코드 없이 에러가 발생할 수 있다. 이러한 경우 치명적일 수 있기 때문에 주의해야한다.
	/*	ObjectStream의 제약사항
	 * 	객체를 보내는 것에 있어서 받는 사람도 그러한 객체가 있어야 받을 수 있다는 것이다.
	 * 	즉, 자바가 없거나 해당클래스를 가지고 있지 않거나 할 경우에 정보를 읽을 수 없다는 것이다.
	 * 	또한 어떤 정보의 값, 결과는 전달해줄 수 있어도 기능을 전달하기에는 어렵다.
	 * 	객체의 기능을 전달하기 위해선 직렬화(바이트코드로 바꾸는것)이 필요한데 기능을 직렬화할 수 없다.
	 * 	애초에 객체의 기능은 객체가 가지고 있는 것이 아니다.
	 */


	public static void main(String[] args) {
		File file = new File("files\\data.bin");
		InputStream is = null;
		ObjectInputStream ois = null;
		
		if(file.exists()){
			try {
				is = new FileInputStream(file);
				ois = new ObjectInputStream(is);
				//int double boolean utf
				
				// 읽기
				int su1 = ois.readInt();
				double su2 = ois.readDouble();
				boolean boo = ois.readBoolean();
				String msg = ois.readUTF();
				Object obj = ois.readObject();
				Object obj2 = ois.readObject();
				
				// 출력
				System.out.println("int:"+su1);
				System.out.println("double:"+su2);
				System.out.println("boolean:"+su1);
				System.out.println("String"+su1);
				Vector vec = (Vector)obj;
				Vector vec2 = (Vector)obj2;
				Vector<String> vec3 = (Vector<String>)vec2.get(0); //객체에 객체를 담아서.
				
				Enumeration eles = vec.elements();
				while(eles.hasMoreElements()){
					System.out.println(eles.nextElement());
				}
				System.out.println("----------");
				Enumeration<String> eles2 = vec3.elements();
				while(eles2.hasMoreElements()){
					System.out.println(eles2.nextElement());
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}finally{
				try {
					if(ois!=null){ois.close();}
					if(is!=null){is.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
