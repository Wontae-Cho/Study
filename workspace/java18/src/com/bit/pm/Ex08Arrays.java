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
		System.out.println(target==target2); //false 참조값 비교이기 때문에
		System.out.println(target.equals(target2)); //서로 다른 해시코드값
		System.out.println(Arrays.equals(target, target2)); // 가지고 있는 밸류값들은 같기 때문에 true

//		Test[] target3 = {new Test(),new Test(),new Test()};
//		Test[] target4 = {new Test(),new Test(),new Test()};
//		System.out.println(Arrays.equals(target3, target4)); //객체마다 주소가 다르기 떄문에.
		Test test1 = new Test(4);
		Test test2 = new Test(5);
		Test test3 = new Test(2);
		Test[] target3 = {test1,test2,test3};
		Test[] target4 = {test1,test2,test3};
		System.out.println(Arrays.equals(target3, target4)); //true 객체를 안에서 찍은것이 아니라 찍혀있는 것들 배열로 가지고 있기 때문에.
		System.out.println("---------------------------------------");
		
		int[] target5 = {1,32,5,23,11};
		Arrays.sort(target5);
		Arrays.sort(target4); 
		System.out.println(Arrays.toString(target5));
		System.out.println(Arrays.toString(target4));
		System.out.println("---------------------------------------");
		
		System.out.println(Arrays.binarySearch(target5, 23)); //위치를 찾아줌 (index)
															// 단, 정렬이 되어있지 않다면 값이 잘못나올 수 있다. 2진탐색이 기본이기 때문에.
	}
	
	static class Test implements Comparable{
		int val;
		
		public Test(int val){
			this.val=val;
		}
		
		@Override
		public int compareTo(Object o) {

//			return this.val-((Test)o).val; // sort
			return ((Test)o).val-this.val; //역순으로 sort
		}
		
		public String toString(){
			return val+" ";
		}
	}

}
