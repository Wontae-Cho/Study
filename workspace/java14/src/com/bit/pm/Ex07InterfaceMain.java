package com.bit.pm;

interface Ex666{
	void func04();
}

interface Ex661 extends Ex06Interface,Ex666{
	/*public final(생략가능)*/ int su = 1234;
	//인터페이스들 끼리 상속가능 이때는 extends를 사용.
	public abstract void func02();
	public void func03(); //어차피 추상메서드 밖에 가지지못하기 때문에 생략가능.
}

public class Ex07InterfaceMain extends Object implements Ex661{
	//추상클래스를 상속받았기때문에 추상클래스가 되던가??
	//오버라이딩을 하던가. 둘 중 하나는 꼭 해야함.
	public void func02(){}
	public void func03(){}
	public void func04(){}
	
	public void func01(){
		System.out.println("func01().....");	}

	public static void main(String[] args) {
		
		Ex07InterfaceMain me = new Ex07InterfaceMain();
		me.func01();
		me.func02();
		me.func03();
		Ex06Interface you = new Ex07InterfaceMain();
		you.func01();
//		you.func02(); //부모타입으로 있기때문에 불가능
//		you.func03(); //부모타입으로 있기때문에 불가능
		Ex661 you2 = new Ex07InterfaceMain();
//		you2.func01();//Ex66은 func01을 가지고 있지 않아 오류
		you2.func02();
		you2.func03();
		System.out.println(you2.su);

	}

}
