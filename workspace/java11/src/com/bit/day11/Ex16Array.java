package com.bit.day11;

public class Ex16Array {

	public static void main(String[] args) {
		int[] arr1; //선언
		arr1 = new int[]{1,3,5,7,9}; //초기화

		// 얕은 복사 - 다 같은것이기에 하나를 제어하면 모두가 바뀜
		// int[] arr2=arr1;
		
		// 깊은 복사 - 다른객체인데 똑같이 만든것.
		int[] arr2 = new int[arr1.length];
		for(int i=0; i<arr2.length;i++){
			arr2[i] = arr1[i];
		}
		
		arr1[2]=100;
		
		//int[] arr1/*참조변수*/=new int[5]; //변수의 선언이고 초기화
		for(int i=0; i<arr1.length/*필드*/; i++){
			System.out.println(arr1[i]);
		}
		System.out.println("-------------------------------------------------");
		for(int i=0; i<arr2.length/*필드*/; i++){
			System.out.println(arr2[i]);
		}
		System.out.println("-------------------------------------------------");
		int su=100;
		func1(su);
		System.out.println(su);
		func2(arr2);
		System.out.println(arr2[0]); //얕은 복사
	}
	
	public static void func1(int a){
		a=2000;
	}
	
	public static void func2(int[] arr){
		arr[0]=2000;
	}

}
