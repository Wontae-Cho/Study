package com.bit.day08;

public class Ex07{

  public static void main(String[] args){
	int a= 100;
	func01();
	//a=1234;
	System.out.println("a="+a);
	//System.out.println("a="+func02()); //���� func02�� ���ϰ��� ����.
  }

  public static int func01(){
	return 4321;
  }

  public static void func02(){
	int a=1234;
	return;

  }

}