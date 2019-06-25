package com.bit.am;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex05CompareLinkedArray {


	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		LinkedList list = new LinkedList();
		long before = System.currentTimeMillis();
		for(int i=0; i<1000000; i++){
			list.add(i);
		}
		long after = System.currentTimeMillis();
		System.out.println(after - before);

	}

}
