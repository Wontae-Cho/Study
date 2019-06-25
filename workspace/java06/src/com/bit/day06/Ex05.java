/*
자바의 기본 단위는 class
class의 구성요소
	1. 메소드 method (static, non-static)
	2. 변수 variable
*/
package com.bit.day06;

class Ex05{
	int num1=100;		//멤버필드, 인스턴스 변수
	static int num2 = 200;	// 클래스 변수, static 변수

   public static void main(String[] args){

	num2++;
	System.out.println("num2="+num2);
	num2++;
	System.out.println("num2="+num2);
	num2++;
	System.out.println("num2="+num2);
	System.out.println("------------------------------------");
	Ex05 me, you;
	me=new Ex05();
	you = me;
	me.num1++;
	System.out.println("num1="+me.num1);
	me=new Ex05();
	//me.num1++;
	System.out.println("num1="+me.num1);
	me=new Ex05();
	//me.num1++;
	System.out.println("num1="+me.num1);
	me=new Ex05();
	//me.num1++;
	System.out.println("num1="+me.num1);
	System.out.println("you num1="+you.num1);


   }	//main end

   public void func01(){
	//int su;
	//su = 4321;
	//num1++;
	System.out.println("func01 num1="+num1);
   }

}	//class end