package com.bit.day11;

public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Q1. 1~100까지 합계는 무엇인가요?
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				if (i != 3) {
					System.out.print("+");
				}
				System.out.print(i);
				sum += i;
				// if(i%2==0){sum+=i} //짝수의 합
				// if(i%2==1){sum+=i} //홀수의 합
				// if(i%3==0){sum+=i} //3의 배수들의 합
				// if(i%5==0){sum+=i} //5의 배수들의 합
			}
		}
		System.out.println("=" + sum);

	}
}
