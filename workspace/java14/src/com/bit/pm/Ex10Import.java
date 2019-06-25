package com.bit.pm;

//import com.bit.pm.Scanner; //클래스명을 명시해놓은 것이 최우선으로 함.
//import java.util.*; // 여기 패키지 안에 있는 모든 클래스.
//					// 잘 모를때 와일드로 할 수 있지만 좋은 패턴은 아니다.
//					// 최근에는 잘 안쓰려고 노력하는 편이다.
//					// 같은 클래스명은 import불가능하다. 패키지명이 달라도.
//import java.lang.Math;
import static com.bit.pm2.Ex01.su;
import static com.bit.pm2.Ex01.func01;
	//static import = static으로 선언된것들만 바로 가져와서 사용할 수 있도록 해줌.
	// non - static은 불가함.

public class Ex10Import {
//	static int su = 4321; 같은 이름일시 자기한테 있는 것이 우선.

	public static void main(String[] args) {
		System.out.println(/*com.bit.pm2.Ex01.*/su);
		/*com.bit.pm2.Ex01(import했기때문에생략가능)*/func01();
//		func02(); //non-static이라 불가능함.
		
		
		
		//대표적인 외부클래스 이용,접근 방법.
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		//import 이후의 스캐너 이용방법
//		Scanner sc= null;
//		Scanner sc = new Scanner(System.in);

//		com.bit.pm.Scanner sc2 = new com.bit.pm.Scanner();
//		sc2.func01(); //명시적으로 패키지경로를 적고 이용했을때는 사용 가능.

	}

}
