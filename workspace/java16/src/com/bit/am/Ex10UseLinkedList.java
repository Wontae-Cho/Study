package com.bit.am;

import java.util.LinkedList;

public class Ex10UseLinkedList {


	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add(1111);
		list1.add(2222);
		list1.add(4444);
		list1.add(5555);
		
		//�߰�
		list1.add(2,"�����"); // add(index,value)
		
		//����
		list1.remove(3); //remove(index) 
		
		//����
		list1.set(1,"��������"); //set(index,value)
		
		System.out.println(list1);

	}

}
