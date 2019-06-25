package com.bit.day06;

class Ex02{

   public static void main(String[] args){

	System.out.println("Ex02 class start...");

	//Ex01.func01(); //Ex01에 있는 func01을 실행
		       //Ex01이 컴파일이 안되어있고 Ex02만 실행하더라도 
		       //Ex01의 기능을 사용하기 때문에 자동으로 컴파일이 이뤄진다.
	com.bit.day07.MyFunc.function(); // 동일 패키지내에 있는 것이 아니기 때문에 
					// 어떤 패키지에 들어있는 것인지 명시를 해줘야한다.

	System.out.println("Ex02 class end...");

   } //main end

} //class end