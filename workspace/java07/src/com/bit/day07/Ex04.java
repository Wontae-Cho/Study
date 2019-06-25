package com.bit.day07;

public class Ex04{
	static int a=100;	//전역변수(의미상)
	static int b=200;
	static int sum=0;
	static int minus=0;

  public static void main(String[] args){
	System.out.println("main start");

	//int a=100;	//지역변수(의미상)
	//int b=200;	//지역변수
	func01(); //int sum=func01();
	//func02(); //int minus=func02();
	System.out.println(a+"와 "+b+"의 합은 "+sum+"이고 ");
	System.out.println(a+"와 "+b+"의 차은 "+minus+"이다");

	System.out.println("main end");

  }

  public static void func01(){
	System.out.println(a+"+"+b+"="+(a+b));
	sum=a+b;
	minus=a-b;
	//return a+b;
  }
  public static void func02(){
	System.out.println(a+"-"+b+"="+(a-b));
	minus=a-b;
	//return a-b;
  }
}