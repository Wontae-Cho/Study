package com.bit.am;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex05CompareHashTree {


	public static void main(String[] args) {
//		Set<Integer> set = new TreeSet<Integer>();
//		//문자열의 경우에도 트리셋으로 정렬가능
//		set.add(1111);
//		set.add(4444);
//		set.add(3333);
//		set.add(2222);
		Set<Target4> set = new TreeSet<Target4>();
		set.add(new Target4(2222));
		set.add(new Target4(9999));
		set.add(new Target4(9999));
		set.add(new Target4(7777));
		set.add(new Target4(7777));
		set.add(new Target4(3333));
		
		
		Iterator<Target4> ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}

	}

}
