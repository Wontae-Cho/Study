package com.bit.am;

public class Ex08Exception3 {


	public static void main(String[] args) {
		System.out.println("메인 시작");
		try{
			func01(1); //정상작동
			func01(0); //오류발생
			func01(-1); 
		}catch(ArithmeticException e){
			System.out.println("해결");
		}
		System.out.println("메인 종료");

	}
	
	public static void func01(int a) throws ArithmeticException{
		// 에러가 발생하면 호출한 쪽으로 그 내용을 돌려줌.
		// 사실 모든 에러를 throws를 하고 있기때문에 생략해도 문제는 없음.
		// 따라서 가능한 명시적으로하고 프로그램 제어력을 높이는 방법도 있음.
		System.out.println("메서드 시작");
		ArithmeticException excep = new ArithmeticException(); //에러인 객체를 생성
		throw excep; //에러 객체를 던짐으로써 고의적으로 에러를 생성가능.
//		int su=5/a;
//		
//		System.out.println("메서드 종료");
		
	}

}
