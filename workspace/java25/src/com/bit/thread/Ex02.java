package com.bit.thread;

// �����带 ��ӹ��� Ŭ���� 201 ����.
class Ex201 extends Thread {
	boolean boo = true;
	boolean pass;

	public void run() {
		while (boo) {
			if (!pass) {
				System.out.println(getName() + "������ ���ϴ� ��...");
			} else {

				Thread.yield(); // runnable ���·� ����.
								// �����ٷ��� ���ؼ� �ٽ� ���ù��� �� ����.
			}
		}
		System.out.println(getName() + "����");
	}
}

// �����带 ��ӹ��� Ŭ���� 202 ����.
class Ex202 extends Thread {
	boolean boo = true;
	boolean pass;

	public void run() {
		while (boo) {
			if (!pass) {
				System.out.println(getName() + "������ ���ϴ� ��...");
			} else {

				Thread.yield(); // runnable ���·� ����.
								// �����ٷ��� ���ؼ� �ٽ� ���ù��� �� ����.
			}
		}
		System.out.println(getName() + "����");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Ex201 ex1 = new Ex201();
		Ex202 ex2 = new Ex202();
		// �����忡 �̸��ο�.
		ex1.setName("1��");
		// �����忡 �̸��ο�.
		ex2.setName("2��");
		ex1.start();
		ex2.start();
		
		try {
			Thread.sleep(3000); // 3�� �ڿ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex1.pass = true; // ex1�� true�� �Ǿ����� ex2�� ����.
		try {
			Thread.sleep(3000); // �ٽ� 3���Ŀ� 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex2.pass = true; // ex2�� true�� �Ǿ���
		ex1.pass = false; // ex1�� �ٽ� false�� �Ǿ����� ex1�� �����.
		try {
			Thread.sleep(3000); // �ٽ� 3���Ŀ� 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex1.boo = false;
		ex1.pass = false;
		try {
			Thread.sleep(3000); // �ٽ� 3���Ŀ� 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex2.boo = false;
	}

}
