package com.bit.pm;

import java.util.Arrays;
import java.util.Random;

public class Ex01Math {

	public static void main(String[] args) {
//		java.lang.Math.PI;
		System.out.println(Math.PI); //pi�� ��� , ����� �Ǿ��ֱ� ������ �빮��.
		double su1 = 3.14;
		System.out.println(Math.floor(su1)+","+Math.ceil(su1)); 	// Math.floor() �Ҽ��� ���ڸ� ����.
																	// Math.ceil() �ø�ó��.
		System.out.println(Math.round(su1)); 						// Math.round() �Ҽ��� ���ڸ� �ݿø�.
		su1=3.5;
		System.out.println(Math.floor(su1)); 
		System.out.println(Math.round(su1));
		
		int a = 100;
		int b = 10;
		System.out.println(Math.max(a,b)+","+Math.min(a, b)); //max(a,b) a,b �߿� �ִ밪, min(a,b) a,b �߿� �ּҰ�.
		double ran = Math.random(); // 0<= ran < 1.0;
		System.out.println(ran);
		
		java.util.Random random = new Random();	//Random Ŭ����. LongŸ���� ���ڸ� �ְ� �����ڸ� ���� �� ����. ���� �� ��Ȯ��.
		System.out.println(random.nextInt()); //�������� int�� ���� ������ �̾���.
												// ���ڸ� �����ϴ� ��쿡�� 0�������� ���ڰ������������� �������� �̾��� �� �ִ�.
//		Integer.MIN_VALUE ~ Integer.MAX_VALUE
		byte[] by = {1,3,5};
		random.nextBytes(by);
		System.out.println(Arrays.toString(by));
		

	}

}
