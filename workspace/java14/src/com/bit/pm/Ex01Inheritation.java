package com.bit.pm;
//final이 붙을 수 있는 것은 변수,클래스 매서드 뿐이다

class Ex11 extends Object{}

public class Ex01Inheritation extends com.bit.pm2.Ex11{
	//하나의 클래스를 상속받는 순간 다른 클래스는 상속받지 못하므로
	//상속받을 클래스를 잘 정해야한다.
//	private(클래스 외 접근불가) < default(동일패키지) 
//							<= protected(상속에서만) < public(누구나)
// 	일반적으로 protected는 default와 같지만 상속에 있어서는 default보다 그 범위가 넓다.
	
//	public void func01(){} //메서드에 final선언시 오버라이드 불가능
	public void func02(final int a){
//		a++; //불가능.
		System.out.println("param a:"+a);
	}

	public static void main(String[] args) {
		Ex01Inheritation me = new Ex01Inheritation();
		me.func01();
		me.func02(10000);
		me.func02(10000+1);
		me.func02(10000+2);
//		com.bit.pm2.Ex11 you = new com.bit.pm2.Ex11(); //오직 상속을 통해서만 접근허용.
												//부모클래스가 public 일경우에는 접근가능.
//		you.func01();
//		System.out.println(you.su1);
		
//		com.bit.pm2.Ex11.func03(); //문법적으로 잘못된 것은 아니지만 상속의 의미가 없음.
//		System.out.println(com.bit.pm2.Ex11.su2); //비효율적인 코드.
		
//		System.out.println(su2);
		

	}

}
