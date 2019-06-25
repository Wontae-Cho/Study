package com.bit.am;

public class Ex10TryCatchFinally {
	//중간에 Catch는 빠질수도 있다. 이 때는 finally가 목적이 된다.

	public static void main(String[] args) {
		System.out.println("메인 시작");
		func01();
		System.out.println("메인 종료");
	}

	public static void func01() {
		System.out.println("start func01");
		try {
			int su = 5 / 0;
			
//		} catch (ArithmeticException e) {
//			System.out.println("에러회피");
//			
		} finally { // 에러가 있든 없든 반드시 실해하는 코드
					// 무슨일이 있든 실행해버림.
			System.out.println("반드시 실행하고 말꺼야");
		}
		System.out.println("end func01");
	}

}
