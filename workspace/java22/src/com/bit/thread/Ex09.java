package com.bit.thread;

public class Ex09 extends Thread{

	
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("메인 순위 :"+main.getPriority());
		Ex09 me = new Ex09();
		Ex09 you = new Ex09();
		Ex09 you2 = new Ex09();
		me.setName("me");
		you.setName("you");
		you2.setName("you2");
		
		me.setPriority(Thread.MAX_PRIORITY); //우선순위 부여 1~10사이. 디폴트는 5 높여주면 우선순위가 올라감.
							// 우선순위를 높인다고 해서 높인것을 먼저끝내려고는 하겠지만 어차피 확률임.
		you.setPriority(Thread.NORM_PRIORITY); //우선순위 부여 1~10사이.
		you2.setPriority(Thread.MIN_PRIORITY); // 최소값.
		// Max_(최우선순위) 10 , NORM_(차우선순위) 5 , MIN_(후순위) 1 (1 ~ 10까지)
												
		
		
		me.start();
		you.start();
		you2.start();

	}
	public void run() {
		System.out.println(getName()+" 스레드 시작");
		for(int i=0; i<50; i++){
			System.out.println(getName()+" working...");
		}
		System.out.println(getName()+" 스레드 종료");
	
	}

}
