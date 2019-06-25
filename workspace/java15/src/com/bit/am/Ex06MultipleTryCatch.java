package com.bit.am;

public class Ex06MultipleTryCatch { // 다중캐치

	public static void main(String[] args) {

		int su = 3;

		if (su > 0) {
			if (su / 2 != 0) {
				// 양수이고 홀수
			}
		}

		// 다중캐치의 모습은
		// if(){}else if(){}else{} 구조와 비슷
		// try하나에 꼭 하나의 catch만 있는 것이 아니다.

		int[] arr = { 0, 3, 5 };
		int result = 0;
		for (int i = 0; i < 4; i++) {
//			try{
//				result=100/arr[i];
//			}catch(Exception e){	// 한번에 잡아낼 수 있음.
									// 하지만 에러에 대한 구분을 할 수 없다.
									// 프로그래머가 의도치 않은 오류를 발생시킬 수 있다.
//				System.out.println("예외처리");
//			}
//			System.out.println("result=" + result);
			try {
				result = 5 / arr[i];
			} catch (ArithmeticException er) {	//catch의 순서는 상관없다.
									//error의 상황을 else if와 비슷한 순서로 진행하기때문에.
				System.out.println("0으로 나눠서 오류발생");
			} catch (ArrayIndexOutOfBoundsException er) {
				System.out.println("배열의 인덱스 번호가 없음");
					//에러의 상황에 따라 다른 퍼포먼스를 보여줄 수 있다.
			}
			System.out.println("result=" + result);
		}

	}

}
