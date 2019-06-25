package com.bit.am;

public class Ex02Exception2 {

	public static void main(String[] args) {
		// try - catch가 어디를 감싸느냐에 따라서 결과가 달라진다.
		// try가 for문 전체를 감쌀경우 = 에러 이후로는 실행이 되지 않음.
			//아래 상황에서 5/0 이 되는 순간 에러, 에러이후 결과는 출력하지 않음.
		// for문 안에 try가 들어가 있을 경우 = 에러 상황을 건너뛰고 다음이 실행됨.
			//5/0이 될 경우에는 catch가 실행되고 그 이후가 다시 실행.
		// 어떤게 좋은 코딩이냐는 케바케

		int a = 0;
		System.out.println("before for...");
		try {
			for (int i = -3; i < 4; i++) {
				System.out.println("for top...");
				a = 5 / i;
				System.out.println("5/" + i + "=" + a);
				System.out.println("for down...");
			}
		} catch (/* java.lang. */ArithmeticException er) {
			System.out.println("err...");
		}
		System.out.println("a=" + a);
	}
}
