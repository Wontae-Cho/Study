package com.bit.pm;

import java.util.Arrays;
import java.util.List;

public class Ex08Arrays {

	public static void main(String[] args) {
		char[] target={'a','b','c','d'};
		System.out.println(Arrays.toString(target));
		
		List<Character> list = Arrays.asList('A','B','C','D','E');
		Object[] arr = list.toArray();
		
		System.out.println(Arrays.toString(arr));
		String[] sts = new String[4];
		Arrays.fill(sts,1,2, "test");
		System.out.println(Arrays.toString(sts));
		System.out.println("---------------------------------------");
		
		char[] target2={'a','b','c','d'};
		System.out.println(target==target2); //false ������ ���̱� ������
		System.out.println(target.equals(target2)); //���� �ٸ� �ؽ��ڵ尪
		System.out.println(Arrays.equals(target, target2)); // ������ �ִ� ��������� ���� ������ true

//		Test[] target3 = {new Test(),new Test(),new Test()};
//		Test[] target4 = {new Test(),new Test(),new Test()};
//		System.out.println(Arrays.equals(target3, target4)); //��ü���� �ּҰ� �ٸ��� ������.
		Test test1 = new Test(4);
		Test test2 = new Test(5);
		Test test3 = new Test(2);
		Test[] target3 = {test1,test2,test3};
		Test[] target4 = {test1,test2,test3};
		System.out.println(Arrays.equals(target3, target4)); //true ��ü�� �ȿ��� �������� �ƴ϶� �����ִ� �͵� �迭�� ������ �ֱ� ������.
		System.out.println("---------------------------------------");
		
		int[] target5 = {1,32,5,23,11};
		Arrays.sort(target5);
		Arrays.sort(target4); 
		System.out.println(Arrays.toString(target5));
		System.out.println(Arrays.toString(target4));
		System.out.println("---------------------------------------");
		
		System.out.println(Arrays.binarySearch(target5, 23)); //��ġ�� ã���� (index)
															// ��, ������ �Ǿ����� �ʴٸ� ���� �߸����� �� �ִ�. 2��Ž���� �⺻�̱� ������.
	}
	
	static class Test implements Comparable{
		int val;
		
		public Test(int val){
			this.val=val;
		}
		
		@Override
		public int compareTo(Object o) {

//			return this.val-((Test)o).val; // sort
			return ((Test)o).val-this.val; //�������� sort
		}
		
		public String toString(){
			return val+" ";
		}
	}

}
