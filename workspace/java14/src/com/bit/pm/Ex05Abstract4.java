package com.bit.pm;

abstract class Ex55{
	
	public Ex55(){
		super();
		System.out.println("create Ex55 class...");
	}
	abstract void func01();
}

public class Ex05Abstract4 extends Ex55 {
	
	public Ex05Abstract4(){
		super(); //부모객체로 가서 찍고 자식클래스를 찍음.
		System.out.println("create Ex05 class....."); 
	}
	
	void func01(){
		System.out.println("func01()....");
	}


	public static void main(String[] args) {
//		Ex55 you = new Ex55(); //추상 클래스는 객체를 생성하지 못함.
		Ex55 you = new Ex05Abstract4(); //오버라이드를 통해 가능.
		Ex05Abstract4 me = new Ex05Abstract4();
		me.func01();

	}

}
