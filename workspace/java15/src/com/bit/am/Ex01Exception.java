package com.bit.am;

public class Ex01Exception {
	// 에러의 상황을 회피하는것
	public static void main(String[] args) {
		// 예외.
		System.out.println("before try...");	//어떻게 진행되는지 . 진행의 흐름을 파악
												// 1
		try {
			System.out.println("start try...");	// 2
			int a = 5 / 0;	// 에러발생 - 연산이 불가능. 
							// try{} 안에서 에러 이후 부분을 진행하지 않음.
							// 에러가 발생하지 않았다면 정상적으로 실행된다.
			System.out.println(a);
			System.out.println("end try...");	// 실행되지 않았음.
		} catch (java.lang.ArithmeticException er) {
			System.out.println("catch...");		// 3 에러가 없다면 실행되지 않음.
		}
		System.out.println("end try catch...");	// 4

	}

}
