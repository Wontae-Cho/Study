package com.bit.pm;

public class Ex06AccessToEx05 {

	public static void main(String[] args) {
		Ex05NonstaticInsideClass you = new Ex05NonstaticInsideClass(); //non-static������ �����̱� ����
		
		Ex05NonstaticInsideClass.Inner02 you2 = you.new Inner02(); //non-static �ѹ� non-static �ι�
		System.out.println(you2.su1);
		System.out.println(Ex05NonstaticInsideClass.Inner02.su3);
		you2.func01();
		

	}

}
