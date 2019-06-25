package com.bit.pm;

public interface Ex06Interface {
	//java에서의 단일상속의 단점을 보완
	//뒤로가면갈수록 매우 중요해짐.
	//필드도 없고 생성자도 없다.
	//메서드만 존재한다.
	//상속을 통해서만 사용되도록 하고있다.
	//또한 접근,실행을 위해선 모두 다 퍼블릭이여야한다.
		// 따라서 public 또한 생략가능.
	
	public abstract void func01();
	//메서드는 오직 추상메서드만 가질 수 있다.
//	public abstract void func02(int a);
//	//메서드는 오버로드도 가능하다.
//	public abstract void func03(int a, int b);
//	public abstract void func04();
	
}


