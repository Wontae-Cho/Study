package com.bit.day10;

public class Ex06WrapCharacter{

  public static void main(String[] args){
	System.out.println("------------------"+"Character"+"---------------------");
	char ch1 = 'A';
	//생성자 . 단 하나.
	Character ch2 = new Character('B');
	char ch3 = 'C'; //오토랩핑

	//필드
	System.out.println("min : "+(int)Character.MIN_VALUE); //폰트를 가지고 있지 않아. 표현X
				//범위를 표하시기 위해 인트 캐스팅
	System.out.println("max : "+(int)Character.MAX_VALUE); //폰트를 가지고 있지 않아. 표현X 
				//범위를 표하시기 위해 인트 캐스팅
	System.out.println("size : "+Character.SIZE); //16비트 = 2바이트

	// 유니코드인지 
	System.out.println(Character.isDefined('@')); //자바는 유니코드이기 때문에 true 출력됨
	// 문자인지 아닌지
	System.out.println("문자인지 아닌지");
	System.out.println(Character.isLetter(ch1)); 
	System.out.println(Character.isAlphabetic(ch1)); //권장
	// 숫자인지 아닌지
	System.out.println("숫자인지 아닌지");
	System.out.println(Character.isDigit(ch1));
	// 대문자인지 소문자인지
	System.out.println("대문자인지 소문자인지");
	System.out.println("대문자 : "+Character.isUpperCase(ch1));
	System.out.println("소문자 : "+Character.isLowerCase(ch1));
	// 띄어쓰기
	System.out.println("띄어쓰기인지");
	System.out.println(Character.isSpace(ch1));
	System.out.println(Character.isWhitespace(ch1)); //권장

  }



}