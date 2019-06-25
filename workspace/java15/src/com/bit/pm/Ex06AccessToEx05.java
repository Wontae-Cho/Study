package com.bit.pm;

public class Ex06AccessToEx05 {

	public static void main(String[] args) {
		Ex05NonstaticInsideClass you = new Ex05NonstaticInsideClass(); //non-static으로의 접근이기 때문
		
		Ex05NonstaticInsideClass.Inner02 you2 = you.new Inner02(); //non-static 한번 non-static 두번
		System.out.println(you2.su1);
		System.out.println(Ex05NonstaticInsideClass.Inner02.su3);
		you2.func01();
		

	}

}
