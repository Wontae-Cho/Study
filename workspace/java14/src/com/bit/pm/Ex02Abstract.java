package com.bit.pm;
//추상클래스
abstract class Ex22{ //abstract class 클래스명.
	//추상클래스는 추상 메서드를 0개이상 갖는 클래스
	// 즉, 없어도 추상클래스 여러개가 있어도 추상클래스.
	int a=1;
	
	public Ex22(){
		
	}
	public void func01(){
		System.out.println("func01()...");
	}
	
	public abstract void func02(); // 구현이 안된 이러한 메서드를 추상메서드라고 한다.
						//메서드의 선언만 있다.
	//추상메서드가 있을 시 상속받는 쪽에 반드시 그것에 대한 초기화가있도록 강제할 수 있다.
	
//	public abstract void func03();
}



public /*abstract*/ class Ex02Abstract extends Ex22{
	//추상 클래스는 상속받으면 자신도 추상클래스로 되거나
	//그게 아니라면 위에서 선언한 메서드를 오버라이드 해줘야한다.
	
	public void func02(){
		System.out.println("바뀐 기능....");
	}

	
	public static void main(String[] args) {
//		Ex02Abstract you = new Ex02Abstract();
//		you.func01();
		Ex02Abstract me = new Ex02Abstract(); //추상클래스는 객체의 생성이 불가함
		me.func02();

	}

}
