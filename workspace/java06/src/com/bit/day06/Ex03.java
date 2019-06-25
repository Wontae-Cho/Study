/*
non-static method (인스턴스 메소드, 멤버 메소드)
1. static method에서 non-static method를 호출하기 위해서는 객체생성 후 
	참조변수를 이용해서 접근 > 참조변수.메소드명();
2. non-static method에서 non-static method 호출은
	메소드명();
3. static method에서 static method 호출은
	메소드명();
4. non-static method에서 static method 호출은
	메소드명();
*/

package com.bit.day06;

public class Ex03{

   public static void main(String[] args){
	Ex03 me;	//변수의 선언
	me = new Ex03();//초기화(객체 생성) //static이 없을경우.
			

	me.func01();  //static이 없을경우.
		// 생성된 객체의 func01메소드 수행
	//me.func02(); //생성된 객체의 func02메소드 수행
	//func03();

	//func01(); // static이 있을경우.
	//com.bit.day06.Ex03.func01();  //다른 클래스의 있을경우

   }

   public void func01(){ //static
	System.out.println("func01의 기능입니다");
	//func02();
	func03();
	return;
   } 

   public void func02(){
	System.out.println("func02의 기능입니다");
   }

   public static void func03(){
	Ex03 you = new Ex03();
	//you.func02();
   }

}