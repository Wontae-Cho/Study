package com.bit.day10;

class Ex11{
	
	public Ex11(int a){
		System.out.println(a+"부모객체 생성...");
	}
	
	public void func01(){
		System.out.println("부모클래스의 기능");
	}
}

public class Ex10 extends Ex11{
	
	public Ex10(){
		super(1111); //생략되었던 내용.
		System.out.println("자식객체 생성...");
	}
	
	public Ex10(int a){
		super(a); //this();
		System.out.println("param a="+a+"를 받는 생성자 호출");
	}

	public static void main(String[] args) {
		Ex10 me= new Ex10();
		me.func01();

	}
	public void func01(){ //접근제한자 부모와 비교해서 일치하거나 더 열려있을 경우만 허용.
		super.func01();
		System.out.println("자식클래스의 기능"); //인자의 유무, 형태 또한 일치해야 오버라이드.
	}

}
