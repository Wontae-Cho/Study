package com.bit.thread;

public class Ex09 extends Thread{

	
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("���� ���� :"+main.getPriority());
		Ex09 me = new Ex09();
		Ex09 you = new Ex09();
		Ex09 you2 = new Ex09();
		me.setName("me");
		you.setName("you");
		you2.setName("you2");
		
		me.setPriority(Thread.MAX_PRIORITY); //�켱���� �ο� 1~10����. ����Ʈ�� 5 �����ָ� �켱������ �ö�.
							// �켱������ ���δٰ� �ؼ� ���ΰ��� ������������� �ϰ����� ������ Ȯ����.
		you.setPriority(Thread.NORM_PRIORITY); //�켱���� �ο� 1~10����.
		you2.setPriority(Thread.MIN_PRIORITY); // �ּҰ�.
		// Max_(�ֿ켱����) 10 , NORM_(���켱����) 5 , MIN_(�ļ���) 1 (1 ~ 10����)
												
		
		
		me.start();
		you.start();
		you2.start();

	}
	public void run() {
		System.out.println(getName()+" ������ ����");
		for(int i=0; i<50; i++){
			System.out.println(getName()+" working...");
		}
		System.out.println(getName()+" ������ ����");
	
	}

}
