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
//		}catch(java.lang.NumberFormatException e/*����������*/){ //�´� �������� �ƴϱ� ������ �����߻�
		}catch(java.lang.ArrayIndexOutOfBoundsException e/*����������*/){
			//������ ������ ���� ������ ���Ѿ� �Ѵ�.
			System.out.println("�����ذ���");
		}
		//������ ���������� �ؿܿ����� ����� �ٸ���.
		// ���� : ������ ������������ ���Ϸ��� �Ѵ�.
		// �ؿ� : �Ϻη� ������ ���⵵ ��.
				//�����ó�������� �׳� ������ �ִ� ���� �˰��������� ����.

	}

}
