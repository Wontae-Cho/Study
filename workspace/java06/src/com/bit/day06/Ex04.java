package com.bit.day06;

public class Ex04{

   public static void main(String[] args){
	java.util.Scanner sc = null;		//객체생성
	int su=0;
	while(true){				//반복문 하나당 객체를 만드는 것.
		sc = new java.util.Scanner(System.in);	//객체를 초기화.
							//고장난 객체를 버려버림.
		try{
			su = sc.nextInt();	//숫자가 아닌 문자나 다른걸 받았을 때 고장.
		}catch(Exception e){}
		System.out.println("su="+su);
	}
	/*
	Ex04 me;	// Ex04가 자료형.
	//me=null;	// default값. undefine. 컴파일은 가능, 실행은 불가능.
			// 다른곳에서 대입이 이뤄지기 위해서 임시적으로 할 수 있음.
	me = new Ex04(); //me = new Ex04();

	//me = null;	//위의 기능을 지울 때.

	//me.func01(); //null 대입시 가르키는게 없어 실행단계에서 오류가남.
	Ex04 me2 = new Ex04();
	me.func03(new Ex04());

	//int su = me.func02();
	//System.out.println("su="+su);
	*/


   } //main end

  public void func01(){
	System.out.println("non-static method...");
   }

   public int func02(){
	System.out.println("non-static method return int");
	return 100;
   }

   public void func03(Ex04 you){
	System.out.println("non func03 run...");
	you.func01();
   }

} //class end