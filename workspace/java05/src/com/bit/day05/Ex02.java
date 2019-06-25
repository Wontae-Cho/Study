class Ex02{

public static void main(String[] args){
	//사칙연산 (+(덧셈) -(뺄셈) *(곱셈) /,%(나눗셈,나머지))
	/* System.out.println(5+2); //덧셈 정수+정수 = 정수
	System.out.println(5-2.0); //뺄셈 정수-실수 = 실수
	System.out.println(5*2);  // 곱셈 정수*정수 = 정수
	System.out.println(5.0*2.0); //곱셈 실수*실수 = 실수
	System.out.println(5/2); //나눗셈 정수/정수 = 정수
	System.out.println(5%2); //나머지 정수%정수 = 정수
	System.out.println(5.0/2); //나눗셈 실수/정수 = 실수
	System.out.println(5/2.0 - 5/2); //소수만 구하기 */

	//문자
	
	//System.out.println(A); //컴파일 오류
	System.out.println('A'); //문자 출력 (문자를 꼭 넣어줘야함 공백시 컴파일 오류)
	//System.out.println(ABC); //컴파일 오류
	//System.out.println('ABC'); //컴파일 오류
	System.out.println("ABC"); //문자열 출력
	System.out.println(""); //공백,개행
	System.out.println("abc" + "defg"); //문자열 + 문자열 객체와 객체를 더해서 새로운 객체를 만들어 낸 것
	System.out.println("abc" + 3.14); //문자열 + 실수
	System.out.println("abc" + 5); //문자열 + 정수
	System.out.println("abc" + 'A'); //문자열 + 문자 (??)
	System.out.println('A' + 'T'); //문자 + 문자 => 연산이 불가능 하므로 숫자로 표현된다.A와 T가 가지고 있는 숫자가 더해짐
	System.out.println(2019+"년");
	System.out.println(2000+19+"년");
	System.out.println("year"+2000+19); //출력시 year200019로 출력되나 우선순위 ()설정시 원하는 결과로 바꿀 수 있음
	System.out.println("year"+(2000+19)); //원하는 결과로 바꾼 모습

}

}