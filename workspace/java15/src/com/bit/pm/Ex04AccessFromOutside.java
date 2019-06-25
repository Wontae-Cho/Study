package com.bit.pm;

import com.bit.pm.Ex03StaticInsideClass.Inner1;

public class Ex04AccessFromOutside {


	public static void main(String[] args) {
		//외부에서 Ex03의 스태틱 클래스,변수에 접근하는방법.
		int su = Ex03StaticInsideClass.Inner1.su1;
		System.out.println(su);
		Ex03StaticInsideClass.Inner1.func01();
		////////////////////////////////////////////////////
		
		//외부에서 Ex03의 논-스태틱 클래스,변수에 접근하는방법.
		Inner1 inn = new Ex03StaticInsideClass.Inner1();
		System.out.println(inn.su2);
		inn.func02();
		/////////////////////////////////////////////////////

	}

}
