package com.bit.am;

//Object 최상위.
//Throwable 차상위.
//Exception //실질적 예외처리의 기능,메소드 등이 담긴 곳.
//RuntimeException
//ArithmeticException
//ArithmeticException < RuntimeException < Exception 상속의 개념.

//}catch(Exception e){	// 한번에 잡아낼 수 있음.
// 하지만 에러에 대한 구분을 할 수 없다.
// 프로그래머가 의도치 않은 오류를 발생시킬 수 있다.
// 가능한 어떤 에러가 발생하고 그것에 맞는 퍼포먼스를 주기 위해서 사용을 자제하는 것이 좋다.
// 단, Exception이 에러코드들의 맨 마지막에와서 
//			if문의 else, switch문의 default와 같은 기능을 수행할 수 있다. 

public class Ex07CatchBlock {

	public static void main(String[] args) {
		for (int i = -4; i < 5; i++) {
			try {
				int a = 5 / i;
				System.out.println("문제없음" + i);
			} catch (Exception er) {
//				 System.out.println(er.getMessage()); //에러의 타이틀만, 규칙O = 에러부분
						
//				System.out.println(er.toString()); // 에러의 내용을 짧게, 규칙O = 에러부분
			// 규칙이 있는 경우 그 상황에는 무조건 해야하기 때문에 무리가 있을 수 있음.
			// 하지만 어떤부분에서 어떤오류가 확인하기 위할 때는 위의 메서드들이 더 효율적
				 er.printStackTrace(); 
			 //에러의 내용을 상세하게, 출력을 스스로함.
			 //출력의 시점을 스스로결정함 따라서 규칙이 없음.
			 //프로그램에 영향이 없이 여유가 있을 때 스스로 출력하기 때문에 퍼포먼스가 좋음.
  			 //따라서 에러출력은 위의 것을 이용하는 것이 좋다.
			}
		}

	}

}
