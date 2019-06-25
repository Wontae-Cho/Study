package com.bit.thread;

class Ex33 extends Thread{
	public void run(){
		System.out.println("2번 스레드 시작");
		for(int i=0; i<10; i++){
			System.out.println("2번 working");
		}
		System.out.println("2번 스레드 종료");
		
	}
}

public class Ex03Thread extends Thread{

	public static void main(String[] args) {
		//각각의 쓰레드가 다른일을 하게 하고싶으면.
		Ex03Thread me = new Ex03Thread();
		Ex33 you = new Ex33();
		me.start();
		you.start();

	}
	public void run(){
		System.out.println("1번 스레드 시작");
		for(int i=0; i<10; i++){
			System.out.println("1번 working");
		}
		System.out.println("1번 스레드 종료");
		
	}

}
