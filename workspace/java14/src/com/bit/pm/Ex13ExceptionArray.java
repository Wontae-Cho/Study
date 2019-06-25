package com.bit.pm;

public class Ex13ExceptionArray {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,4,5};
		try{
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		}catch(java.lang.NumberFormatException e/*참조변수명*/){ //맞는 에러명이 아니기 때문에 오류발생
		}catch(java.lang.ArrayIndexOutOfBoundsException e/*참조변수명*/){
			//에러의 내용을 보고 적용을 시켜야 한다.
			System.out.println("에러해결함");
		}
		//에러는 국내에서와 해외에서의 취급이 다르다.
		// 국내 : 에러를 무조건적으로 피하려고 한다.
		// 해외 : 일부러 에러를 내기도 함.
				//에러시나리오라면 그냥 에러가 있는 것을 알고있음에도 만듬.

	}

}
