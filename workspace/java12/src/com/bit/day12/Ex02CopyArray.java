package com.bit.day12;

public class Ex02CopyArray {

	public static void main(String[] args) {
		// �迭 ����
		int[] arr1 = new int[]{1,3,5,7,9,11,13};
		// �迭�� �������� - �ڿ������� �̷����� ��찡 ��κ�.
//		int[] arr2 = arr1; //�̸��� arr2������ ��ü�� arr1�� �������ִ°��� ����Ŵ.
		
		//�迭�� �������� - �ٸ���ü�� ����Ű�� ������ �� ũ��� ������ ���� �迭�� ����°�.
//		int[] arr2 = new int[arr1.length]; //arr1�� ���� ũ���� ��ü����.
		//arr1�� i��°�� ������ arr2�� i��°�� �ִ´�. > ������ ����.
//		for(int i=0; i < arr2.length; i++){
//			arr2[i]=arr1[i];
//		}
		//{5,7,9,11,13}
		int[] arr2= new int[10];
		// arraycopy(�����迭�̸�, ����������ġ, copy�迭�̸�,copy�� ������ġ,������ġ�κ��� �.
//		java.lang.System.arraycopy(arr1/*����*/, 0/*��������*/, arr2, 0, 4); //��ü�� ����
		java.lang.System.arraycopy(arr1,2,arr2,5,5);
		//arraycopy ��� ���.
		arr1[1] = 100;
		
		System.out.println(java.util.Arrays.toString(arr2));
		//�ڹ� ��ƿ�� ArraysŬ������ toString()�� �̿��Ѵٸ� for���� ���� �ʰ� ������ ���� �� �ִ�.
		
		arr1[1] =30; //���� arr1�� �����ߴµ�
		
//		for(int i=0; i<arr2.length; i++){ //arr2�� ������ ����.
//			System.out.println(arr2[i]);
//		}

	}

}
