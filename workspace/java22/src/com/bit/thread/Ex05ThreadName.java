package com.bit.thread;

public class Ex05ThreadName extends Thread {


	public static void main(String[] args) {
		Thread current = Thread.currentThread(); // 메인쓰레드.
//		String name = null; //main도 스레드이기에 네임을 얻을 수 있다. 하지만 스태틱이기때문에 조치가 필요.
		String name = current.getName(); //main도 스레드라는것을 증명.
		System.out.println(name+" 스레드 시작");
		Ex05ThreadName me = new Ex05ThreadName();
		Ex05ThreadName you = new Ex05ThreadName();
		// 또 다른 메인이 시작되고 종료될것이기 때문에 기다리지 않고 넘어감.
		me.setName("me");	//쓰레드 네임에 me를 붙임.
		you.setName("you");	//쓰레드 네임에 you를 붙임.
		me.start(); 
		you.start();
		System.out.println(name+" 스레드 종료");

	}
	public void run() {
		String name = this.getName();
		System.out.println(name+" 스레드 시작");
		for (int i = 0; i < 10; i++) {
			System.out.println(name+" working...");
		}
		System.out.println(name+" 스레드 종료");
	}

}
