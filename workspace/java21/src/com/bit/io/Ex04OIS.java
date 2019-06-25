package com.bit.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex04OIS {
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
				is=new FileInputStream(file);
				ois = new ObjectInputStream(is);
				
				//읽기
				ArrayList list1 = (ArrayList) ois.readObject();
				LinkedList list2 = (LinkedList)ois.readObject();
				HashSet set1 = (HashSet) ois.readObject();
				TreeSet set2 = (TreeSet) ois.readObject();
				HashMap map1 = (HashMap) ois.readObject();
				TreeMap map2 = (TreeMap) ois.readObject();
				String msg1 = (String) ois.readObject();
				StringBuffer msg2 = (StringBuffer)ois.readObject();
				int[] arr1 = (int[]) ois.readObject();
				int[][] arr2 = (int[][]) ois.readObject();
				Car car = (Car) ois.readObject();
				
				//쓰기
				System.out.println(list1);	//어레이리스트
				System.out.println(list2);	//링크드리스트
				System.out.println(set1);	//해쉬셋
				System.out.println(set2);	//트리셋
				System.out.println(map1);	//해쉬맵
				System.out.println(map2);	//트리맵
				System.out.println(msg1);	//스트링
				System.out.println(msg2);	//스트링버퍼
				System.out.println(arr1);	//인트배열(주소값)
				System.out.println(Arrays.toString(arr1)); //인트배열(밸류)
				System.out.println(arr2);	//인트배열 배열(주소값)
				for(int i =0; i<arr2.length; i++){
					System.out.println(Arrays.toString(arr2[i]));	//인트 다중배열 밸류값.
				}
				System.out.println(car);	//카 클래스.(주소값)
//				car.speedup(100);
				System.out.println(car.speed);
				System.out.println(car.min);
				System.out.println(car.max);
				System.out.println(car.model);

				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {	//해당의 클래스가 없을 때.
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					if(ois!=null){ois.close();}
					if(is!=null){is.close();}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
