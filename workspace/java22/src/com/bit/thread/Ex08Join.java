package com.bit.thread;

public class Ex08Join extends Thread{
	//메인의 종료시점이 프로세스의 종료시점이 아니다.
	
	public static void main(String[] args) {
		System.out.println("main 시작");
		Ex08Join thr1 = new Ex08Join();
		Ex08Join thr2 = new Ex08Join();
		thr1.start();
		thr2.start();
		try {
			thr1.join();	//메인이 끝나는 시점을 설정해줄 수 있다.
			thr2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main 종료");

	}
	public void run() {
		System.out.println(getName()+"시작");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName()+"종료");
		
	
	}

}
