package com.bit.pm;

public class Ex02InsideClass {
	// 내부클래스 : 클래스 안에오는 클래스.
	// static 내부클래스
	// non-static 내부클래스
	// local 내부클래스
	
	static class Inner{	// static 내부클래스 = 클래스변수에 해당. 쓰임새도 유사함.
		
	}
	
	class Inner3{	// non-static 내부클래스 = 멤버 필드에 해당. 쓰임새도 유사함.
		//member클래스
		
	}
	
	public void func(){

		class Inner2{} //메서드 내부에도 내부클래스가 설정가능하다.
		// 내부클래스(local클래스) 지역변수와 비슷한 개념. 쓰임새도 유사함.
	}

	public static void main(String[] args) {


	}

}
