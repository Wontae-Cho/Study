package com.bit.day12;

public class Ex02CopyArray {

	public static void main(String[] args) {
		// 배열 복사
		int[] arr1 = new int[]{1,3,5,7,9,11,13};
		// 배열의 얕은복사 - 자연스럽게 이뤄지는 경우가 대부분.
//		int[] arr2 = arr1; //이름은 arr2이지만 객체는 arr1이 가지고있는것을 가르킴.
		
		//배열의 깊은복사 - 다른객체를 가르키고 있으나 그 크기와 내용은 같은 배열을 만드는것.
//		int[] arr2 = new int[arr1.length]; //arr1과 같은 크기의 객체생성.
		//arr1의 i번째를 추출해 arr2의 i번째에 넣는다. > 내용의 복사.
//		for(int i=0; i < arr2.length; i++){
//			arr2[i]=arr1[i];
//		}
		//{5,7,9,11,13}
		int[] arr2= new int[10];
		// arraycopy(원본배열이름, 원본시작위치, copy배열이름,copy의 시작위치,시작위치로부터 몇개.
//		java.lang.System.arraycopy(arr1/*원본*/, 0/*시작지점*/, arr2, 0, 4); //전체의 복사
		java.lang.System.arraycopy(arr1,2,arr2,5,5);
		//arraycopy 라는 기능.
		arr1[1] = 100;
		
		System.out.println(java.util.Arrays.toString(arr2));
		//자바 유틸에 Arrays클래스의 toString()을 이용한다면 for문을 찍지 않고도 내용을 꺼낼 수 있다.
		
		arr1[1] =30; //따라서 arr1을 수정했는데
		
//		for(int i=0; i<arr2.length; i++){ //arr2가 영향을 받음.
//			System.out.println(arr2[i]);
//		}

	}

}
