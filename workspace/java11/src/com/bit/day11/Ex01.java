package com.bit.day11;

public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Q1. 1~100���� �հ�� �����ΰ���?
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				if (i != 3) {
					System.out.print("+");
				}
				System.out.print(i);
				sum += i;
				// if(i%2==0){sum+=i} //¦���� ��
				// if(i%2==1){sum+=i} //Ȧ���� ��
				// if(i%3==0){sum+=i} //3�� ������� ��
				// if(i%5==0){sum+=i} //5�� ������� ��
			}
		}
		System.out.println("=" + sum);

	}
}
