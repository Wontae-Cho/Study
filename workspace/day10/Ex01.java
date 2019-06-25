package com.bit.day10;

/*
래퍼클래스(래핑 - 포장)
일반적으로 사용하는 자료형의 앞글자를 대문자로 바꾸면 래퍼클래스가 된다.
원시 자료형(int double 등)을 객체로 둘러싸서 진행.
int - java.lang.Integer
오토랩핑 == 객체로 둘러쌀때.
언랩핑 == 객체 안에 있는 자료형이 필요해서 꺼내서 쓸때.
사용의 예)
1. 주어진 기능이 필요할 때
2. 필드값의 값이 필요할 때
3. 객체가 필요할 때



*/

public class Ex01{

  public static void main(String[] args){
	Integer su1 = new Integer(100); //인트의 래퍼클래스의 사용법. 생성자에 숫자를 줬을 때.
	Integer su2 = new Integer("1000"); //생성자에 문자열 "1000"을 전달 했을때
					//문자열의 숫자를 넣어줘도 숫자로 받아서 연산가능.
					//하지만 문자열은 모두 숫자로만 구성되어야함.

	//Integer su3 = new Inteher(); //생성자에 인자를 전달하지 않을 시 컴파일 오류 발생.

	System.out.println(su2+1);
	System.out.println(Integer.MAX_VALUE); //스태틱이기에 클래스명.필드 //인트의 최대값
	System.out.println(Integer.MIN_VALUE); //인트의 최소값.
	System.out.println(Integer.SIZE);	//인트의 메모리를 얼마나 사용하는지.


	int su3 = su2.intValue(); // 인트값으로 밸류반환. non-static 이기에 (참조변수명.intValue)
	System.out.println(su3); 
	long su4 = su2.longValue(); //su2의 값을 long으로 반환받아서 su4에 저장하라.
	System.out.println(su4);
	byte su5 = su2.byteValue(); //su2의 값을 byte로 반환받아서 su5에 저장하라. byte : -128 ~ 127
	System.out.println(su5);
	int su6 = Integer.compare(110,100); //x가y보다 크면 1, 작으면 -1
		//Integer.compare(x,y) x와 y을 비교해서 그 차이를 반환해라.
	System.out.println(su6);
	int su7 = su2.compareTo(su1);
	System.out.println(su7);
	boolean result = su2.equals(su1); //su2와 su1이 같은가?
	System.out.println(result); //true or false
	//매우 자주쓰임.
	int su8 = Integer.parseInt("1234"); //문자열을 숫자로받는다. 앞의 생성자와 조건은 같음.
	System.out.println(su8+1);
	System.out.println(su2.toString()+1); //integer객체를 문자열로 .
	Integer su9 = Integer.valueOf(1234); //기본자료형을 인티져로 바꿔줌.
	System.out.println(su9.toString());
	Integer su10 = su1+su2;
	System.out.println(su1+su2); //객체(주소값) + 객체(주소값) = ????
	System.out.println(su10); 
	Integer su11 = 9999;
	System.out.println(su11);
	

  }


}