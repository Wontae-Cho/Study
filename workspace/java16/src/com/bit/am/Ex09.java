package com.bit.am;

import java.util.ArrayList;

public class Ex09 {


	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		System.out.println(list1.isEmpty()); //����� ? ����
		System.out.println(list1.size());	// Ȯ��
		list1.add("1111");
		list1.add("2222");
		list1.add("3333");
		list1.add("4444");
		list1.add("5555");
		System.out.println(list1.isEmpty()); //����� ? ����
		System.out.println(list1.size());	// Ȯ��
		for(int i=0; i<list1.size(); i++){  //romove�� ä���� ������ ����.
			list1.remove(i);
		}
		System.out.println(list1.isEmpty()); //����� ? ����
		System.out.println(list1.size());    // ?? ��? �̹� ������ ������ �Ҵ��ϴ� �ּҰ��� �ֱ⶧���� .

	}

}
