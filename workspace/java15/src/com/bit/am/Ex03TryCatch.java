package com.bit.am;

public class Ex03TryCatch {
	/*
	 * int a=5; 5/-3=? 5/-2=? 5/-1=? 5/0=0 5/1=5
	 */

	public static void main(String[] args) {
		// try{}안에서의 변수 선언은 그 안에서만 의미가 있다.
		// try{}밖에서 선언을 하고 안에서 초기화를 하는 것도 허용하지 않는다.
		// 언제 에러가 발생해서 try를 탈출할지 모르기 때문에.
		// 변수선언,초기화는 try{}밖에서.

		int a = 5;
		for (int i = -3; i < 4; i++) {
			try {
				System.out.print(a +"/" + i + "="); // 무조건 출력되는 부분.
				System.out.println(a/i);			// 연산의 부분(에러발생가능성이 있는부분)
			} catch (ArithmeticException er) {
				System.out.println(0);	//에러가발생했을 때 출력되는부분.
			}

		}
	}
}
