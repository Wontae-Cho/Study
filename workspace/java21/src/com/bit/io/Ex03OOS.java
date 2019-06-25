package com.bit.io;

import java.io.Externalizable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

class Car implements Serializable/*Externalizable*/{ //일반적으로 시리얼을 사용한다.
	// 통신용 객체가 아님.
	// 통신용 객체라는 정보의 명세가 필요함. (interface Serializable)
	private static final long serialVersionUID = 1L; //버전을 명세함으로써 정보가 수정되어도 그대로 그 객체임.
											//지속적으로 관리가 필요할 경우
											//명세하지 않으면 자동으로 줌.
	
//	transient int speed=100; 	// transient 직렬화에서 제외시킴, 그 경우에 자료형의 디폴트값이 출력.
								// static에서 transient를 붙였을 경우에는 null로 출력된다.
	int speed = 100;
	int max = 200;	
	final static int min=0;
	String model="모닝";
	
	public Car() {
	
	}
//	public void speedup(int speed){
//		this.speed = 0;
//	}

//	@Override
//	public void readExternal(ObjectInput in) throws IOException,
//			ClassNotFoundException {
//		System.out.println("readExternal");
//		//읽을 때
//		in.readInt(); 
//		in.readUTF();
//		
//	}

//	@Override
//	public void writeExternal(ObjectOutput out) throws IOException {
//		System.out.println("writeExternal");
//		//쓸 때
//		out.writeInt(speed); //전달하고싶은것만 전달할 수 있음.
//		out.writeUTF(model);
//		
//	}
}

public class Ex03OOS {
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
		
		OutputStream os = null;
		ObjectOutputStream oos = null;
		
		try {
			os = new FileOutputStream(file);
			oos = new ObjectOutputStream(os);
			
			ArrayList list1 = new ArrayList();
			list1.add(1111);
			list1.add("둘째");
			list1.add('3');
			
			oos.writeObject(list1); 
			
			LinkedList list2 = new LinkedList();
			list2.add(1111);
			list2.add("둘째");
			list2.add('3');
			
			oos.writeObject(list2);
			
			HashSet set1 = new HashSet();
			set1.add(111);
			set1.add(2222);
			set1.add(111);
			set1.add(33);
			
			oos.writeObject(set1);
			
			TreeSet set2 = new TreeSet();
			set2.add(111);
			set2.add(2222);
			set2.add(111);
			set2.add(33);
			
			oos.writeObject(set2);
			
			HashMap map1 = new HashMap();
			map1.put("key1", "value1");
			map1.put("key2", "value2");
			map1.put("key3", "value3");
			
			oos.writeObject(map1);
			
			TreeMap map2 = new TreeMap();
			map2.put("key1", "value1");
			map2.put("key2", "value2");
			map2.put("key3", "value3");
			
			oos.writeObject(map2);
			
			String msg1 = new String("문자열 : String");
			oos.writeObject(msg1);
			
			StringBuffer msg2 = new StringBuffer();
			msg2.append("문자열 : ");
			msg2.append("StringBuffer");
			oos.writeObject(msg2);
			
			int[] arr1={1,3,5,7,9};
			oos.writeObject(arr1);
			
			int[][] arr2={
					{1,2},{1,3,5},{1,4,7,9}
			};
			oos.writeObject(arr2);
			
			Car car = new Car(); // 일반적인 객체로 된 클래스들은 잘 넘어가는데 내가 만든 것에서 에러발생.
			
			oos.writeObject(car);	// 따라서 통신용객체라는 것을 명세해주면 에러없이 잘 돌아가게 됨.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(oos!=null){oos.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("작성완료");

	}

}
