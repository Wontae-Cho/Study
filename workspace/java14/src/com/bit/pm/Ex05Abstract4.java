package com.bit.pm;

abstract class Ex55{
	
	public Ex55(){
		super();
		System.out.println("create Ex55 class...");
	}
	abstract void func01();
}

public class Ex05Abstract4 extends Ex55 {
	
	public Ex05Abstract4(){
		super(); //�θ�ü�� ���� ��� �ڽ�Ŭ������ ����.
		System.out.println("create Ex05 class....."); 
	}
	
	void func01(){
		System.out.println("func01()....");
	}


	public static void main(String[] args) {
//		Ex55 you = new Ex55(); //�߻� Ŭ������ ��ü�� �������� ����.
		Ex55 you = new Ex05Abstract4(); //�������̵带 ���� ����.
		Ex05Abstract4 me = new Ex05Abstract4();
		me.func01();

	}

}
