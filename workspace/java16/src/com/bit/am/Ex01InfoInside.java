package com.bit.am;

public class Ex01InfoInside { // 내부클래스의 종류 : static 내부, non-static 멤버, local클래스,
								// anonymous클래스
								// 내부클래스의 사용목적은 대부분 상속의 개념, 활용과 곂치는 부분이 많다.
								// 따라서 국내에서는 선호되지 않는 코딩의 방법이다. 하지만 외국에서는 쓰임.
	public static void main(String[] args) {
		// static 내부클래스의 호출, 활용//
		System.out.println(Ex101.su10); // static 내부 클래스 안에 static으로 선언된 변수
		Ex101.func21(); // static 내부 클래스 안에 static으로 선언된 메서드
		Ex101 ex1 = new Ex101(); // static 내부 클래스 안에 non-static으로의 접근을 위한 객체 생성.
		System.out.println(ex1.su11); // static 내부 클래스 안에 non-static으로 선언된 변수
		ex1.func22(); // static 내부 클래스 안에 non-static으로 선언된 메서드
		// ////////////////////////////////

		// 멤버클래스의 호출, 활용///////////////////////
		Ex01InfoInside me = new Ex01InfoInside(); // 멤버클래스에 접근을 위한 객체생성
		Ex102 ex2 = me.new Ex102(); // 멤버클래스의 객체생성
		// Ex102 ex2 = new Ex01InfoInside().new Ex102(); // 객체를 체이닝.(위의 과정을 하나로
		// 합침.)
		System.out.println(ex2.su12); // 멤버클래스의 변수 호출 방법
		ex2.func23(); // 멤버클래스의 메서드 호출 방법.
		// //////////////////////////////////////////////

		me.func02().func24();

		Ex99 me2 = new Ex99() {
			public void func24() {

			}
		};
		me2.func24();

	}

	// static 내부클래스.
	public static int su1 = 1111;

	static class Ex101 { // 접근제한자 가질 수 있음. 클래스가 private도 가능함.
		static int su10 = 10;
		int su11 = 11;

		static void func21() {
		}

		void func22() {
		}
	}

	// 멤버 클래스 = 멤버변수와 같은 역할.
	private int su2 = 2222;

	class Ex102 {
		int su12 = 12; // static을 가질 수 없음.

		void func23() {
		}
	}

	public static void func01() {
		// 로컬 클래스 = 로컬변수와 같은 역할.
		class Ex103 { // 접근제한자 가질 수 없음.
			int su13 = 13; // static을 가질 수 없음.

			void func24() {
			}
		}
		// 로컬클래스에 접근, 활용방법////
		Ex103 local = new Ex103(); // 로컬 내부클래스의 객체생성.
		System.out.println(local.su13); // 로컬 내부클래스의 변수 접근.
		local.func24(); // 로컬 내부클래스의 메서드 접근.
		// ////////////////////////////////
	}

	// anonymous 내부 클래스.
	public Ex99 func02() {// 다형성에 따라서Ex103이 아니라 Ex99가 들어갈 수 있다
		int su3 = 3333;

		return new Ex99() { // Ex99를 상속받음.
			// 오버라이드 = 기능을 덮어씀
			int su13 = 13;

			public void func24() {
				System.out.println("새로운 기능");
			}
		};
	}

	interface Ex99 { // interface는 추상메서드만을 가질 수 있음.
		/* public abstract */void func24(); // 어차피 퍼블릭이고 앱스트랙트임. 따라서 생략가능.

	}

	Ex99 inter1 = new Ex99() {
		public void func24() {

		}
	};
}
