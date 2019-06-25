package com.bit.pm2;

public /*final*/ class Ex11 { //default로 바꾸면 다른 패키지에서 상속불가.
		   			//class는 private,protected 불가능.
					//class에 final이 붙으면 class자체가 final로 만들 수 있다.
					//final class는 더 이상 상속하지 않는 클래스가 된다.
	final int su1;
//	protected int su1 = 1234;
//	protected static int su2 = 4321;
	
	protected Ex11(){	// 클래스와 마찬가지로 디폴트 생성자를 만들면 상속받을 수 없다.
					// private또한 마찬가지.
					// 단, protected로 선언할 경우에는 가능하다.
		su1 = 1234; //상수이기때문에 한번 초기화하면 바꾸지 못함.
//		su1++;
	}

	public /*final*/ void func01(){ //접근제한자가 public
		//메서드에 final선언시 오버라이드 불가능
		
		final int su2=1111; //상수형변수
		
		System.out.println("pm2패키지의 Ex11 func01..."+su2);
	}
	
//	protected static void func02(){//접근제한자가 protected
//		System.out.println("pm2패키지의 Ex11 func02...");
//	}
//	protected static void func03(){
//		System.out.println("pm2패키지의 Ex11 func03...");
//	}

}
