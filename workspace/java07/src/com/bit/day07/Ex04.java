package com.bit.day07;

public class Ex04{
	static int a=100;	//��������(�ǹ̻�)
	static int b=200;
	static int sum=0;
	static int minus=0;

  public static void main(String[] args){
	System.out.println("main start");

	//int a=100;	//��������(�ǹ̻�)
	//int b=200;	//��������
	func01(); //int sum=func01();
	//func02(); //int minus=func02();
	System.out.println(a+"�� "+b+"�� ���� "+sum+"�̰� ");
	System.out.println(a+"�� "+b+"�� ���� "+minus+"�̴�");

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