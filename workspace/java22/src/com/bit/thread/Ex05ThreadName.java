package com.bit.thread;

public class Ex05ThreadName extends Thread {


	public static void main(String[] args) {
		Thread current = Thread.currentThread(); // ���ξ�����.
//		String name = null; //main�� �������̱⿡ ������ ���� �� �ִ�. ������ ����ƽ�̱⶧���� ��ġ�� �ʿ�.
		String name = current.getName(); //main�� �������°��� ����.
		System.out.println(name+" ������ ����");
		Ex05ThreadName me = new Ex05ThreadName();
		Ex05ThreadName you = new Ex05ThreadName();
		// �� �ٸ� ������ ���۵ǰ� ����ɰ��̱� ������ ��ٸ��� �ʰ� �Ѿ.
		me.setName("me");	//������ ���ӿ� me�� ����.
		you.setName("you");	//������ ���ӿ� you�� ����.
		me.start(); 
		you.start();
		System.out.println(name+" ������ ����");

	}
	public void run() {
		String name = this.getName();
		System.out.println(name+" ������ ����");
		for (int i = 0; i < 10; i++) {
			System.out.println(name+" working...");
		}
		System.out.println(name+" ������ ����");
	}

}
