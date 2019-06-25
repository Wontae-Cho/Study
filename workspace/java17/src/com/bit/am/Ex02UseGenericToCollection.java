package com.bit.am;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex02UseGenericToCollection {


	public static void main(String[] args) {
		ArrayList<Integer[]> arr1=new ArrayList<Integer[]>(); // ArrayList를 <String>만 받도록 제약.
															// 명시하지 않는다면, Object임.
															// 기본자료형 int,double 등은 허용하지 않고 class만 허용함으로
															// 래퍼클래스인 Integer, Double 을 사용해야한다.
		arr1.add(new Integer[]{1,2,3});
		arr1.add(new Integer[]{2222});
		arr1.add(new Integer[]{33,33});
		
		
		
		for(int i=0; i<arr1.size(); i++){
			Integer[] arr = arr1.get(i);		// cast할 필요가 없어짐
			System.out.println(Arrays.toString(arr));
		}
	}

}
