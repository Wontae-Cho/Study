package com.bit.thread;

public class Ex07Sleep extends Thread {

	public static void main(String[] args) {
		Ex07Sleep me = new Ex07Sleep();
		Ex07Sleep you = new Ex07Sleep();
		me.start();
		you.start();
	}
	public void run() {
		for(int i=1; i<100; i++){
			System.out.println(getName()+":"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
