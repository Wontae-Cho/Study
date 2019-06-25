package com.bit.pm;

import java.util.Arrays;
import java.util.Random;

public class Ex01Math {

	public static void main(String[] args) {
//		java.lang.Math.PI;
		System.out.println(Math.PI); //pi값 출력 , 상수로 되어있기 때문에 대문자.
		double su1 = 3.14;
		System.out.println(Math.floor(su1)+","+Math.ceil(su1)); 	// Math.floor() 소수점 뒷자리 버림.
																	// Math.ceil() 올림처리.
		System.out.println(Math.round(su1)); 						// Math.round() 소수점 뒷자리 반올림.
		su1=3.5;
		System.out.println(Math.floor(su1)); 
		System.out.println(Math.round(su1));
		
		int a = 100;
		int b = 10;
		System.out.println(Math.max(a,b)+","+Math.min(a, b)); //max(a,b) a,b 중에 최대값, min(a,b) a,b 중에 최소값.
		double ran = Math.random(); // 0<= ran < 1.0;
		System.out.println(ran);
		
		java.util.Random random = new Random();	//Random 클래스. Long타입의 인자를 주고 생성자를 만들 수 있음. 조금 더 정확한.
		System.out.println(random.nextInt()); //랜덤값을 int의 범위 내에서 뽑아줌.
												// 인자를 전달하는 경우에는 0에서부터 인자값전까지에서의 랜덤수를 뽑아줄 수 있다.
//		Integer.MIN_VALUE ~ Integer.MAX_VALUE
		byte[] by = {1,3,5};
		random.nextBytes(by);
		System.out.println(Arrays.toString(by));
		

	}

}
