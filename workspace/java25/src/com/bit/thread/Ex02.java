package com.bit.thread;

// 스레드를 상속받은 클래스 201 생성.
class Ex201 extends Thread {
	boolean boo = true;
	boolean pass;

	public void run() {
		while (boo) {
			if (!pass) {
				System.out.println(getName() + "스레드 일하는 중...");
			} else {

				Thread.yield(); // runnable 상태로 빠짐.
								// 스케줄러에 의해서 다시 선택받을 수 있음.
			}
		}
		System.out.println(getName() + "종료");
	}
}

// 스레드를 상속받은 클래스 202 생성.
class Ex202 extends Thread {
	boolean boo = true;
	boolean pass;

	public void run() {
		while (boo) {
			if (!pass) {
				System.out.println(getName() + "스레드 일하는 중...");
			} else {

				Thread.yield(); // runnable 상태로 빠짐.
								// 스케줄러에 의해서 다시 선택받을 수 있음.
			}
		}
		System.out.println(getName() + "종료");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Ex201 ex1 = new Ex201();
		Ex202 ex2 = new Ex202();
		// 스레드에 이름부여.
		ex1.setName("1번");
		// 스레드에 이름부여.
		ex2.setName("2번");
		ex1.start();
		ex2.start();
		
		try {
			Thread.sleep(3000); // 3초 뒤에
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex1.pass = true; // ex1는 true가 되었으니 ex2만 일함.
		try {
			Thread.sleep(3000); // 다시 3초후에 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex2.pass = true; // ex2가 true가 되었고
		ex1.pass = false; // ex1이 다시 false가 되었으니 ex1이 수행됨.
		try {
			Thread.sleep(3000); // 다시 3초후에 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex1.boo = false;
		ex1.pass = false;
		try {
			Thread.sleep(3000); // 다시 3초후에 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex2.boo = false;
	}

}
