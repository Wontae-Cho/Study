package com.bit.am;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Ex17TreeSet {


	public static void main(String[] args) {
		Set<Target> tree = new TreeSet<Target>(); //�ߺ�����, �������� ���ı��� ��.
								// ��, ũ�� �۴� ���� ����Ǵ��� �Ұ����� ��쿡�� ������ �߻� �� �� �ִ�.
								// ������ ������ �ɾ������ν� �׷��� ��Ȳ�� ���� �� �ִ�.
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
