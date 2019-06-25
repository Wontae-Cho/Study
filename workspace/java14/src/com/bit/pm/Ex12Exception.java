package com.bit.pm;

public class Ex12Exception {
	// 예외처리 = 에러회피.
	// 어마어마한 에러들 중에서 자바가 제공하는 회피방법.
	// + 코드에러.
	// 에러 + 컴파일에러
	// + 런타임에러

	public static void main(String[] args) {
		String msg = "1,000";
		try {//중괄호를 시도
			int su = Integer.parseInt(msg);
			System.out.println("su=" + su);
		} catch (/* java.lang. */NumberFormatException e) {
			// 캐치가 에러내용을 잡아냄. 그리고 실행함.
			// 문제가있어도 무시
			// 문제가 없으면 그냥 함
			System.out.println("에러발생");
		}
		System.out.println("main end");

	}

}
