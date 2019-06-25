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

class Car implements Serializable/*Externalizable*/{ //�Ϲ������� �ø����� ����Ѵ�.
	// ��ſ� ��ü�� �ƴ�.
	// ��ſ� ��ü��� ������ ���� �ʿ���. (interface Serializable)
	private static final long serialVersionUID = 1L; //������ �������ν� ������ �����Ǿ �״�� �� ��ü��.
											//���������� ������ �ʿ��� ���
											//������ ������ �ڵ����� ��.
	
//	transient int speed=100; 	// transient ����ȭ���� ���ܽ�Ŵ, �� ��쿡 �ڷ����� ����Ʈ���� ���.
								// static���� transient�� �ٿ��� ��쿡�� null�� ��µȴ�.
	int speed = 100;
	int max = 200;	
	final static int min=0;
	String model="���";
	
	public Car() {
	
	}
//	public void speedup(int speed){
//		this.speed = 0;
//	}

//	@Override
//	public void readExternal(ObjectInput in) throws IOException,
//			ClassNotFoundException {
//		System.out.println("readExternal");
//		//���� ��
//		in.readInt(); 
//		in.readUTF();
//		
//	}

//	@Override
//	public void writeExternal(ObjectOutput out) throws IOException {
//		System.out.println("writeExternal");
//		//�� ��
//		out.writeInt(speed); //�����ϰ�����͸� ������ �� ����.
//		out.writeUTF(model);
//		
//	}
}

public class Ex03OOS {
	// �о �� ������� ���� ������� ������ �߻��� ���� ������
	// �����ڵ� ���� ������ �߻��� �� �ִ�. �̷��� ��� ġ������ �� �ֱ� ������ �����ؾ��Ѵ�.
	/*	ObjectStream�� �������
	 * 	��ü�� ������ �Ϳ� �־ �޴� ����� �׷��� ��ü�� �־�� ���� �� �ִٴ� ���̴�.
	 * 	��, �ڹٰ� ���ų� �ش�Ŭ������ ������ ���� �ʰų� �� ��쿡 ������ ���� �� ���ٴ� ���̴�.
	 * 	���� � ������ ��, ����� �������� �� �־ ����� �����ϱ⿡�� ��ƴ�.
	 * 	��ü�� ����� �����ϱ� ���ؼ� ����ȭ(����Ʈ�ڵ�� �ٲٴ°�)�� �ʿ��ѵ� ����� ����ȭ�� �� ����.
	 * 	���ʿ� ��ü�� ����� ��ü�� ������ �ִ� ���� �ƴϴ�.
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
			list1.add("��°");
			list1.add('3');
			
			oos.writeObject(list1); 
			
			LinkedList list2 = new LinkedList();
			list2.add(1111);
			list2.add("��°");
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
			
			String msg1 = new String("���ڿ� : String");
			oos.writeObject(msg1);
			
			StringBuffer msg2 = new StringBuffer();
			msg2.append("���ڿ� : ");
			msg2.append("StringBuffer");
			oos.writeObject(msg2);
			
			int[] arr1={1,3,5,7,9};
			oos.writeObject(arr1);
			
			int[][] arr2={
					{1,2},{1,3,5},{1,4,7,9}
			};
			oos.writeObject(arr2);
			
			Car car = new Car(); // �Ϲ����� ��ü�� �� Ŭ�������� �� �Ѿ�µ� ���� ���� �Ϳ��� �����߻�.
			
			oos.writeObject(car);	// ���� ��ſ밴ü��� ���� �����ָ� �������� �� ���ư��� ��.
			
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
		System.out.println("�ۼ��Ϸ�");

	}

}
