package com.bit.thread;

public class Ex06NameInter implements Runnable{
	/*
	 * 스레드는 같은 일임에도 불구하고 일정한양이나 패턴이 없다
	 * 그 이유는 2가지가 있을 수 있다.
	 * 1.환경적요인
	 * 
	 * 2.특성
	 * 	// runnable > 대기할 때, 대기할 때 > runnable 할 때 하나씩 하는데 집었던 걸 다시 집을수도 있고 아닐 수도 있다.
	 * 	// 그것말고도 각각의 스레드별로 일을 처리하기 위한 할당시간이 있는데 그 안에 다 못하거나 그것보다 빨리했을경우 다음으로 넘어간다.
	 */

	public static void main(String[] args) {
		System.out.println("main thread start");
		Ex06NameInter me = new Ex06NameInter();
		
		//생성자의 2번째 인자의 값을 스레드의 이름으로 할 수있다.
		Thread thr1 = new Thread(me,"첫번째");
		Thread thr2 = new Thread(me,"두번째");
		System.out.println(thr1.getName());
		System.out.println(thr2.getName());
		thr1.start();
		thr2.start();
		
		System.out.println("main thread end");

	}
	public void run() {
		//상속이 아니기 때문에 바로 getName을 하지 못하고 현재 실행되는 쓰레드를 이용해야한다.
		Thread me = Thread.currentThread();
//		String name = null;
		String name = me.getName();
		System.out.println(name+"Thread start");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"Thread end");
	
	}
}
