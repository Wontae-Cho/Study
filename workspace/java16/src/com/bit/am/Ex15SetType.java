package com.bit.am;

import java.util.HashSet;
import java.util.Iterator;

public class Ex15SetType {
			//����
	
	public static void main(String[] args) {
		//set(����)
		java.util.Set set1 = new HashSet();//�������̽�
		
		//�Է�
		set1.add("ù��°");
		set1.add("�ι�°");
		set1.add("����°");
		set1.add(new String("ù��°"));
		set1.add("�ι�°");
		set1.add("����°");
		
		System.out.println(set1.size()); // 6���� �Է������� �ߺ��� ���� ���ܵǼ� ������� �ٲ� �� ����
		
		Iterator ite = set1.iterator(); // set�� index�ѹ��� ��� ������ ����.
										// ���� ��ũ����, ���Ϳ� ����ϰ� �� ������ �̾Ƴ� �� �ִ�.
										// iterator ��ü�� ��ȸ���̴�.
										// ��¿� ��ü 
		
//		System.out.println(ite.hasNext()); //������ �ð��� �ֳľ���. true or false ���� ����.
//		System.out.println(ite.next()); // ���
//		System.out.println(ite.next());
//		System.out.println(ite.next());
		while(ite.hasNext()){
			String msg = (String)ite.next();
			msg="�ٲ�";
			System.out.println(msg);
		}
		System.out.println("-------------------------------------------");
		//iterator ��ü�� ��� ��󠺱� ������ �Ʒ������� ������� ���Ѵ�.
		
		ite = set1.iterator(); //�ٽ� �������شٸ� ��밡��
		
		while(ite.hasNext()){
			String msg = (String)ite.next();
			System.out.println(msg);
		}
	}

}
