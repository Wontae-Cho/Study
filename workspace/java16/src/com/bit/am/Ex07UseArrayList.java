package com.bit.am;

import java.util.ArrayList;


class Target{
	int su=1111;
}

public class Ex07UseArrayList {


	public static void main(String[] args) {
		java.util.ArrayList arr = new java.util.ArrayList();
		
		arr.add(111);
		arr.add("string");
		arr.add('a');
		arr.add(false);
		Target tar = new Target();
		arr.add(tar);
		arr.add(new int[]{1,3,5,9});
			// �ڷ����� ���� �����Ұ���.
		
//		System.out.println(arr.get(1));
//		String msg = (String)arr.get(1);
//		System.out.println(msg);
//		int su = (int)/*(Integer)*/arr.get(0);
//		System.out.println(su);
//		Target target = (Target)arr.get(4);
//		System.out.println(target.su);
//		int[] temp=(int[])arr.get(4);
		
//		System.out.println(java.util.Arrays.toString(temp));
		
//		System.out.println(arr.size());
		
		//���� remove(index or value)
		arr.remove(1);
		arr.remove(false); //���ڰ� �ƴ� ��� �Է��� value���� ã�Ƽ� ���� ���� ������ ������.
		arr.remove(tar);
		
		//����
		arr.set(2,1234);
		
		//�����ֱ� = add(index,value)
		arr.add(1,"�ι�°");
		
			
		for(int i=0; i<arr.size();i++){
			System.out.println(arr.get(i));
		}
		
		System.out.println("---------------------------------------------");
		System.out.println(arr.indexOf("�ι�°")); //value���� ��� �ִ��� ã��.� index�� ���ִ��� ������ -1
													// indexOf(value)
		ArrayList arr2 = new ArrayList();
		System.out.println(arr2.isEmpty());			// ������ ������� true or false
//		arr.clear(); 								// ������ �� ����.
//		arr2.removeAll(arr); //�ּҰ��� ���ؼ� ���� ���� ������ �� ���� ����.
		System.out.println("---------------------------------------------");

		//����
		ArrayList arr3 = new ArrayList(arr); //�������� ���ڷ� �÷��������ӿ�ũ�� ��������� ������.
//		ArrayList arr3= (ArrayList)arr.clone(); //clone()�� Object�� ��ȯ�� ���� ��������ȯ �ؾ��Ѵ�.
		for(int i=0; i<arr3.size(); i++){
			System.out.println(arr3.get(i));
		}
		
		System.out.println("---------------------------------------------");
		
		Object[] objs = arr.toArray();
		for(int i=0; i<objs.length; i++){
			Object obj=objs[i];
			System.out.println(obj);
		}
		

	}

}
