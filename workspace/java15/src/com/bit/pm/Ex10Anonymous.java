package com.bit.pm;


public class Ex10Anonymous {

	interface Inter{
		void func10();
	}
	
	static Inter func01(){
		
//		Inter inn = new Inner(); //�������� ����
//		return inn; // �������� ����.
		return new Inter(){
			public void func10(){
				System.out.println("Inner func10");
			}
		};
	}
		//Ŭ���� ��ü�� �ּҸ� �޾Ƽ� ����ϴ°�.
	
	public static void main(String[] args) {
		Inter me = func01();
		me.func10();

	}

}
