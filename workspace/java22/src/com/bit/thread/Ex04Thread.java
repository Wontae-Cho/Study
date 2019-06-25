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

		Thread thr1 = new Thread(new Runnable() {	//�͸���Ŭ���� AnonymousŬ������ ���.
			public void run() {
				System.out.println("Ex04 thread start");
				for (int i = 0; i < 50; i++) {
					System.out.println("Ex04 thread working..");
				}
				System.out.println("Ex04 thread end");

			}
		});
		Thread thr2 = new Thread(you);		// Ŭ������ ����� ������.
		thr1.start();
		thr2.start();

	}

}
