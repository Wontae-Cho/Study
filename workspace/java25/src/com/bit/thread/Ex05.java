package com.bit.thread;

class Ex205 extends Thread {
	public void run() {
		synchronized (this) {
			System.out.println("일시작함");

			try {
				wait(); // 싱크로나이즈드가 아닐경우 에러발생.
						// blocked 상태로 빠짐.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("일종료");
		}
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Ex205 you = new Ex205();
		you.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (you) {
			you.notify(); // blocked에 있는 것을 runnable로 보냄.
							// 마찬가지로 싱크로나이즈 되어 있어야 한다.
							// blocked에 있는 요소들중 하나만 .
//			you.notifyAll(); //blocked에 있는 요소들 모두를 깨움.
		}
	}

}
