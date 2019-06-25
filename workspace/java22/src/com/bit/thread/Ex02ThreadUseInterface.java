package com.bit.thread;

public class Ex02ThreadUseInterface implements Runnable{
	//쓰레드를 생성하고 돌리는 방법2. 인터페이스를 상속.

	public static void main(String[] args) {
		Ex02ThreadUseInterface me = new Ex02ThreadUseInterface();
		
		Thread thr1 = new Thread(me);//쓰레드 객체를 생성. 이때의 쓰레드는 런의 기능을 가지고 있지 않기에 쓰레드에 내 객체를 주입.
		Thread thr2 = new Thread(me);//여기에서의 me 는 Runnable Interface 타입.
		thr1.start();
		thr2.start();

	}
	//런 메소드는 내가 가지고 있는 것.
	public void run() {
		System.out.println("새로운 스레드 시작");
		for(int i =0; i<10; i++){
			System.out.println("새로운 작업 수행...");
		}
		System.out.println("새로운 스레드 종료");
		
	}

}
