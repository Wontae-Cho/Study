package com.bit.day10;

public class Ex03{


   public static void main(String[] args){
	System.out.println("-------------------"+"Byte"+"--------------------");
	byte a0 = 10;
	Byte a1 = new Byte(a0); //생성자 인자로 숫자. 단, 숫자는 바이트임.
	//Byte a1 = new Byte(10);//만일 그냥 숫자로 넣었을 때는 강제형변환을 해줄 필요가 있음.
	Byte a2 = new Byte("-20"); //생성자 인자로 문자열.
	//필드
	System.out.println(Byte.MIN_VALUE); //byte가 가질 수 있는 최소값
	System.out.println(Byte.MAX_VALUE); //byte가 가질 수 있는 최대값
	System.out.println(Byte.SIZE);	//8비트 = 1바이트
	//메소드
	byte a3 = Byte.parseByte("127"); //byte의 범위를 벗어나면 실행오류.
	System.out.println(a3);

	System.out.println("------------------"+"Short"+"---------------------");

	short b0 = 100;
	Short b1 = new Short(b0);
	Short b2 = new Short("200");
	//필드
	System.out.println(Short.MIN_VALUE); //Short가 가질 수 있는 최소값
	System.out.println(Short.MAX_VALUE); //Short가 가질 수 있는 최대값
	System.out.println(Short.SIZE); //16비트 = 2바이트
	//메소드
	short b3 = Short.parseShort("1234"); //마찬가지로 short의 범위를 벗어나면 실행오류
	System.out.println(b3);

	System.out.println("------------------"+"Long"+"---------------------");

	Long c0 = new Long(1000); //위와 다르게 자동형변환이 일어남.
	Long c1 = new Long(1000L);
	Long c2 = new Long("2000"); //문자열에 L을 넣어서 롱타입이란것을 알리면 컴파일오류발생.
	long c3 = Long.parseLong("3000");
	System.out.println(c3);

   }


}