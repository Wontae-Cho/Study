package com.bit.day10;

public class Ex04{


  public static void main(String[] args){
	System.out.println("------------------"+"Double"+"---------------------");
	//생성자
	double a1 = 3.14;
	Double a2 = new Double(3.14);
	Double a3 = new Double("3.14");
	Double a4 = 3.14; //오토랩핑.
	//float는 더블을 인자로 받을 수 있다.
	//필드 - java api참고 java.lang.Double
	System.out.println("min : "+Double.MIN_VALUE); //double이 가질 수 있는 최소값(e이후는 10의 제곱)
	System.out.println("max : "+Double.MAX_VALUE); //double이 가질 수 있는 최대값(e이후는 10의 제곱)
	System.out.println("size : "+Double.SIZE); // double의 사이즈. 64비트 = 8바이트

	Double a5 = 5.0/0;
	Double a6 = 0.0/0;
	System.out.println(a5+" 5/0 Infinite : "+a5.isInfinite()); //무한이냐? ㅇㅇ 
	System.out.println(a5+" 5/0 NaN : "+a5.isNaN()); //Not a Number 숫자가 아니냐 ? ㄴㄴ
	System.out.println("0/0 Infinite : "+a6.isInfinite()); //무한이냐? ㄴㄴ
	System.out.println("0/0 NaN : "+a6.isNaN()); //숫자가 아니냐? ㅇㅇ
  }



}