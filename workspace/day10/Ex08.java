package com.bit.day10;

class Ex09{

  public static void main(String[] args){
	Ex09 me = new Ex09();
	me.func01();
	//me.func02();

  }

  public void func01(){
	System.out.println("부모클래스의 기능");

  }

  public void func03(){
	System.out.println("static 부모클래스 기능");

  }

}

public class Ex08 extends com.bit.day10.Ex09{ //(extends java.lang.Object)명세하지 않으면 자동으로 상속 받는다.
  int su1 = 1234;
	//상속의 주 목적은 코드의 재사용.
	//Ex09이면서 Ex08이다. Ex08의 기능은 당연히 사용가능.
	//상속은 단 하나의 class만 상속받는다.
	//하지만 상위의 클래스가 상속받는것이 있다면 그 위의 것도 상속받는 것과 같다.
	//따라서 모든 클래스는 최종적으로 Object클래스를 상속받는다.
	//부모클래스 입장에서는 자식클래스의 기능을 사용하지 못한다.
	//상속의 대상은 항상 non-static이 되어야한다.(에러가 없긴하나 사용하지 말아야 한다.)
	//같은 기능이 있을 경우, 자식에게 있는 기능이 수행된다. 일종의 상속포기라고 할 수있다.
		//=오버라이드


  public static void main(String[] args){

	Ex08 me = new Ex08();
	//Ex08 you = new Ex08();
	me.func01();
	me.func02();
	//Ex08.func03(); //(X)
	//Ex09.func03(); //(O)
	me.func03();

	//System.out.println(me);	

	String msg = me.toString();
	System.out.println(msg);
	//System.out.println(me.equals(you));
	//System.out.println(me.hashCode());


  }

  public void func02(){
	System.out.println("자식클래스의 기능");
  }

  public void func03(){
	System.out.println("메서드 오버라이드..");
  }


}