package com.bit.day12;

public class Ex08Lecture {

	public static void main(String[] args) {
		// 로또 번호 생성기
		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		// 1 ~ 44까지 0~0.99999999<1*45
		for (int i = 0; i < 10000; i++) {
			int ran = (int) (Math.random() * 44 + 1);
			int temp = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;
		}

		for (int i = 0; i < 6; i++) {
			System.out.println(ball[i]);
		}

	}

}
