package com.bit.pm;

public class Ex03StaticInsideClass {
	static int su1=1000;
	/////////////////////////////////////////////////////////
	static class Inner1{	//static 내부클래스는 public, default, private가 가능하다. 
		static int su1=1111;
		int su2=2222;
		
		public Inner1(){
			System.out.println("내부클래스 객체 생성");
		}
		
		public static void func01(){
			System.out.println("Inner-static func01");
		}
		
		public void func02(){
			System.out.println("Inner-non-static func02");
		}
	}
	/////////////////////////////////////////////////////////


	public static void main(String[] args) {
		System.out.println("inner-su1="+Inner1.su1); //내부클래스에 있는 static변수 su1
		/*Ex03StaticInsideClass.*/Inner1.func01();	//내부클래스에 있는 static 메서드
		
		/*Ex03StaticInsideClass.*/Inner1 inn=new Inner1(); //non-static 을 호출하기 위한 객체생성.
		System.out.println("inner-su2="+inn.su2); //non-static 변수 호출
		inn.func02();	//non-static 메서드 호출.
	}

}
