package com.bit.day08;

public class Ex04{
  final int su;
  //final static int su = 1234; //정상적으로 실행
  //final static int su; //디폴트 값만 가질수 있기때문에 오류발생.
  
  public Ex04(){su=1111;} //객체생성시점에 su를 1111로 초기화해서 시작.
  public Ex04(int a){su=a;} //객체를 찍을 때 마다 다른 상수를 가지고 시작.

  public static void main(String[] args){
	
	final char CH='A'; 
	// 상수형 변수
	// 이름을 대문자로만 구성함
	//final은 변수를 고정시킬 수 있다.
	//ch는 변수 'A'가 상수

	//ch='B';

	System.out.println("ch="+CH);
	//su=4321; su는 final로 선언되었기에 오류발생.
	//System.out.println("class su="+su);

  }

}