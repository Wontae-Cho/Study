package com.bit.thread;

public class Ex06 implements Runnable{

	public static void main(String[] args) {
		Ex06 me = new Ex06();
		
		ThreadGroup tg = new ThreadGroup("my"); //쓰레드들은 묶은 그룹.
		Thread thr1 = new Thread(tg,me);
		Thread thr2 = new Thread(tg,me);
		
		thr1.start();
		thr2.start();
		tg.stop(); // 그룹으로 묶인 것들이 전부 스탑.
	}

	public void run() {
		
	}

}
