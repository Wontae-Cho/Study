package com.bit.day11;

public class Ex16Array {

	public static void main(String[] args) {
		int[] arr1; //����
		arr1 = new int[]{1,3,5,7,9}; //�ʱ�ȭ

		// ���� ���� - �� �������̱⿡ �ϳ��� �����ϸ� ��ΰ� �ٲ�
		// int[] arr2=arr1;
		
		// ���� ���� - �ٸ���ü�ε� �Ȱ��� �����.
		int[] arr2 = new int[arr1.length];
		for(int i=0; i<arr2.length;i++){
			arr2[i] = arr1[i];
		}
		
		arr1[2]=100;
		
		//int[] arr1/*��������*/=new int[5]; //������ �����̰� �ʱ�ȭ
		for(int i=0; i<arr1.length/*�ʵ�*/; i++){
			System.out.println(arr1[i]);
		}
		System.out.println("-------------------------------------------------");
		for(int i=0; i<arr2.length/*�ʵ�*/; i++){
			System.out.println(arr2[i]);
		}
		System.out.println("-------------------------------------------------");
		int su=100;
		func1(su);
		System.out.println(su);
		func2(arr2);
		System.out.println(arr2[0]); //���� ����
	}
	
	public static void func1(int a){
		a=2000;
	}
	
	public static void func2(int[] arr){
		arr[0]=2000;
	}

}
