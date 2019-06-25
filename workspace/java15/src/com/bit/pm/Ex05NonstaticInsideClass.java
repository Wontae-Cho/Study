package com.bit.pm;

public class Ex05NonstaticInsideClass {
	int su1 = 111;

	class Inner02 {
		int su1 = 1111;
		// static int su2=2222; //클래스자체가 non-static 멤버필드와 같다.
		// 따라서 그 클래스가 스태틱변수를 갖는것 자체가 불가능하다.
		final static int su3 = 3333; // 단, final이 붙은 스태틱 변수를 갖는 것은 허용한다.
										// 어차피 상수화되기 때문에 가능한 부분이다.

		public Inner02() {
			System.out.println("생성자 호출");
		}

		public void func01() {
			System.out.println("non-static func01()....");
		}
		// public static void func02(){ //마찬가지로 스태틱공간안에 할당할 수 없어서 메서드도 스태틱으로 선언
		// 불가

	}

	public static void main(String[] args) {
		Ex05NonstaticInsideClass me = new Ex05NonstaticInsideClass();
		
		Inner02 inn = null; // Inner02가 있으니까 타입은 존재 가능.
		inn = me.new Inner02(); //우선 먼저 자신의 객체를 찍고 참조변수를 통해 접근해야 가능
						//1차로 non-static 2차로 non-static으로의 접근이기 때문에.
		System.out.println(inn.su1);
		System.out.println(Inner02.su3); //static 영역에 올라간 su3이기 때문에 가능.
		inn.func01();
	}

}
