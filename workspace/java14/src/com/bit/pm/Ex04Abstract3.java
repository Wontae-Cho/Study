package com.bit.pm;

public class Ex04Abstract3 {


	public static void main(String[] args) {
		int a=3;
		int b=2;
		double c = 3.14;
		
		Integer su1=a; //��üȭ
		Double su2=c;
		Number num1 = su1; //������ �θ�Ÿ������ ó��
		Number num2 = su2;
		
		Number num3 = 1234; //�ڵ����� ��üȭ, ó���� �ؼ� �ϳ��� Ÿ������ ���� �� �ֵ�����.
		Number num4 = 3.14;
		
		
		System.out.println(num1.intValue()+num2.doubleValue());
		

	}

}
