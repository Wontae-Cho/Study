package com.bit.day10;

public class Ex05{

  public static void main(String[] args){
	System.out.println("------------------"+"Boolean"+"---------------------");
	//생성자
	boolean a1 = true;
	Boolean a2 = new Boolean(a1);
	Boolean a3 = new Boolean("false"); 
	Boolean a4 = new Boolean("TRUE"); //대문자 처리도 가능.
	Boolean a5 = false; //오토래핑으로 자동으로 객체생성해줌.
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	//필드, 기능은 간단하므로 java api 참고
	//boolean은 래핑에서만 필요한데 그것도 자동으로 되니 쓸일은 거의 없을것.
	


  }


}