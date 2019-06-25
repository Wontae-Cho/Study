package com.bit.am;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Ex17TreeSet {


	public static void main(String[] args) {
		Set<Target> tree = new TreeSet<Target>(); //중복검출, 오름차순 정렬까지 됨.
								// 단, 크다 작다 등의 대소판단이 불가능한 경우에는 오류가 발생 할 수 있다.
								// 하지만 조건을 걸어줌으로써 그러한 상황을 피할 수 있다.
//		tree = new HashSet();
		tree.add(new Target());
		tree.add(new Target());
		tree.add(new Target());
		tree.add(new Target());

		Iterator<Target> ite = tree.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		

	}

}
