package com.bit.pm;

import com.bit.pm.Ex03StaticInsideClass.Inner1;

public class Ex04AccessFromOutside {


	public static void main(String[] args) {
		//�ܺο��� Ex03�� ����ƽ Ŭ����,������ �����ϴ¹��.
		int su = Ex03StaticInsideClass.Inner1.su1;
		System.out.println(su);
		Ex03StaticInsideClass.Inner1.func01();
		////////////////////////////////////////////////////
		
		//�ܺο��� Ex03�� ��-����ƽ Ŭ����,������ �����ϴ¹��.
		Inner1 inn = new Ex03StaticInsideClass.Inner1();
		System.out.println(inn.su2);
		inn.func02();
		/////////////////////////////////////////////////////

	}

}
