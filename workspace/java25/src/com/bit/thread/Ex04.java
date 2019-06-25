package com.bit.thread;

/*
 * try - catch를 넓게 쌈으로써 에러를 발생시키고 그 상황에서 while문을 빠져나올 수 있게 하는 방법.
 */


class Ex204 extends Thread {

	public void run() {
		
		try {
			while (true) {
				System.out.println("일하는 중....");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
//			e.printStackTrace(); //예외상황 에러문구 출력
		}
		System.out.println("일과 종료");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Ex204 you = new Ex204();
		you.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
//			e.printStackTrace();
		}
		you.interrupt(); //예외상황 발생. = 종료.
		
	}

}
