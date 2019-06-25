package com.bit.pm;

public class Ex04Abstract3 {


	public static void main(String[] args) {
		int a=3;
		int b=2;
		double c = 3.14;
		
		Integer su1=a; //객체화
		Double su2=c;
		Number num1 = su1; //다형성 부모타입으로 처리
		Number num2 = su2;
		
		Number num3 = 1234; //자동으로 객체화, 처리를 해서 하나의 타입으로 받을 수 있도록함.
		Number num4 = 3.14;
		
		
		System.out.println(num1.intValue()+num2.doubleValue());
		

	}

}
