package com.bit.am;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex08Set {


	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1111);
		set1.add(2222);
		set1.add(3333);
		set1.add(1111);
		
		Iterator<Integer> ite = set1.iterator(); //Iterator���� ���׸��� �ٿ��� ���ϴ� ����Ÿ������ ���� �� �ִ�.
													//default�� Object
		while(ite.hasNext()){
			Integer msg = ite.next();
			System.out.println(msg);
		}
		///////////////////////////////////////////
		System.out.println("---------------------------------");
		ArrayList<Integer> arr2 = new ArrayList<Integer>(set1);
		for(int i=0; i<arr2.size(); i++){
			System.out.println(arr2.get(i));
		}

	}

}
