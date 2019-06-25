package com.bit.thread;

public class Ex08Join extends Thread{
	//������ ��������� ���μ����� ��������� �ƴϴ�.
	
	public static void main(String[] args) {
		System.out.println("main ����");
		Ex08Join thr1 = new Ex08Join();
		Ex08Join thr2 = new Ex08Join();
		thr1.start();
		thr2.start();
		try {
			thr1.join();	//������ ������ ������ �������� �� �ִ�.
			thr2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ����");

	}
	public void run() {
		System.out.println(getName()+"����");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(getName()+"����");
		
	
	}

}
