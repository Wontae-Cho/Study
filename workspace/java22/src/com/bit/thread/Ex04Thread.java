package com.bit.thread;

class Ex44 implements Runnable {

	public void run() {
		System.out.println("Ex44 thread start");
		for (int i = 0; i < 50; i++) {
			System.out.println("Ex44 thread working..");
		}
		System.out.println("Ex44 thread end");
	}
}

public class Ex04Thread /* implements Runnable */{
	
	public static void main(String[] args) {
		// Ex04Thread me = new Ex04Thread();
		 Ex44 you = new Ex44();

		Thread thr1 = new Thread(new Runnable() {	//익명내부클래스 Anonymous클래스의 사용.
			public void run() {
				System.out.println("Ex04 thread start");
				for (int i = 0; i < 50; i++) {
					System.out.println("Ex04 thread working..");
				}
				System.out.println("Ex04 thread end");

			}
		});
		Thread thr2 = new Thread(you);		// 클래스를 사용한 쓰레드.
		thr1.start();
		thr2.start();

	}

}
