package com.bit.am;

import java.util.Iterator;
import java.util.Set;

public class Ex01Map {
	static class Test{}


	public static void main(String[] args) {
		// Map (key, value) key�� index�� �ش��Ѵٰ� �� �� �ִ�.
						// key, value�� � �ڷ����̵� �������.
						// key�� �ߺ��̵Ǹ� ������ �̷����⶧���� �ߺ��� �Ұ��ϴ�.
						// value ���� �ߺ��� �������. �ش� key�� ������ value�̱� ������.
		java.util.Map map1 = new java.util.HashMap();
		map1.put(0, "ab");
//		map1.put(1, "abced");
		map1.put(5, 1);
		map1.put("a", null);
		map1.put('a',123434);
		map1.put(null, 'a');
//		map1.put(new Test(), 'a');
		
		
		//����
		map1.remove(5);
		
		Set keys = map1.keySet();
		
		//map�� ��ü������ ����ϴ� ���1 - �Ϲ����� ���
		Iterator ite = keys.iterator();
		while(ite.hasNext()){
			Object key =ite.next();
			System.out.println("key : "+key+", value : "+map1.get(key));
		}
		
		//map�� ��ü������ ����ϴ� ���2 - �ڷᰡ � ���� ���� Ư���� ���.
//		Object[] keys = {0,5,"a",'a',null};
//		for (int i = 0; i < keys.length; i++) {
//			System.out.println(map1.get(keys[i]));
//		}
		
		//���� ���� ���� ���� ���� key(index)���� ã�� �� �ִ�.
//		System.out.println(map1.get(3));
//		System.out.println(map1.get(5));
//		System.out.println(map1.get(10));
		
		//����
//		map1.put(5, "1234a"); // �ߺ��� key�� ������ �̷�����.
		
		//����
//		map1.put(5, null); //���� ���� ������ ���� ������� null�� �־��ָ� ����.
		
		
	}

}
