package com.bit.pm;


public class Ex10Anonymous {

	interface Inter{
		void func10();
	}
	
	static Inter func01(){
		
//		Inter inn = new Inner(); //참조변수 생성
//		return inn; // 참조변수 리턴.
		return new Inter(){
			public void func10(){
				System.out.println("Inner func10");
			}
		};
	}
		//클로저 객체의 주소를 받아서 사용하는것.
	
	public static void main(String[] args) {
		Inter me = func01();
		me.func10();

	}

}
