package com.bit.day08;

public class Ex03{
	int su;
/*
	생략이 가능한 생성자는 디폴트 생성자일때만
	생성자가 존재하지 않을 시에만 생성자를 만들어줌.
	생성자의 이름은 클래스명과 동일함.
	생성자는 값을 전달 할 수 없다.
	return은 존재하지만 return value는 불가능.
	즉 생성자는 태생자체가 void라고 할 수 있다.
	생성자는 필드값의 초기화를 할 수 있다.
*/

   public Ex03(){ //디폴트 생성자
	su = 1234;  //필드값의 초기화
	System.out.println("su="+su);
	return;
   }

   public Ex03(int a){
	su = a;
	System.out.println("인자 있는 객체 생성");
   }

   public static void main(String[] args){
	String msg1="";
	String msg2=new String();
	System.out.println(msg2);
	
	Ex03 me = new Ex03(); //생성자의 호출 (인자X)
	Ex03 you = new Ex03(5678); //생성자의 호출 (인자O)
	me.func01();
	return; //void이기 때문에 생략된 return

   }

   public void func01(){
	System.out.println("기능수행");
	return; //void이기 때문에 생략된 return
   }

}