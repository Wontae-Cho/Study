package com.bit.day09;

public class Ex05{
  //변수
  int su1=1234; 	//인스턴스필드
  static int su2=4321; 	//클래스변수
	//필드는 가능한 맨 위에 만들어서 구분하기 좋게하는 것이 좋다.

  public Ex05(){
	//객체 생성시점
	su1=1000; //객체 생성시점에 변수의 초기화가 가능. final일 때도 가능.
  }
	//생성자도 마찬가지로 메서드 위에 위치시키는 것이 좋다.

  public static void main(String[] args){
	System.out.println(com.bit.day09.Ex05.su2); 	//본래의 변수 호출 방법
	System.out.println(Ex05.su2);			//같은 패키지 안에 있기에 패키지 생략가능
	System.out.println(su2);			//동일 패키지 동일 클래스안에 있기에 클래스명 생략가능
	func01();			//동일 클래스 안에서 생략된 메서드 호출방법
	Ex05.func01();			//동일 패키지에서 생략된 메서드 호출방법
	com.bit.day09.Ex05.func01();	//본래의 메서드 호출방법

	Ex05 me = new Ex05(); //객체생성
	//com.bit.day09.Ex05 me = new com.bit.day09.Ex05(); //본래 생성자 호출 및 객채 생성.
	System.out.println(me.su1);
	me.func02();
  }

  //메서드
  public static void func01(){
	System.out.println("static 메서드");	//static 안에서 this라는것은 존재할 수 없다.
						//this는 주소를 표현하는 것이기에 static은 주소가 없다.(이미 로딩되어 있는것)
	com.bit.day09.Ex05.func04();
  }
  public void func02(){
	System.out.println("non-static 메서드"+su1);
	this.func03();
  }

  public void func03(){
	System.out.println("non-static 메서드");
  }

  public static void func04(){
	System.out.println("non-static 메서드");
  }


}