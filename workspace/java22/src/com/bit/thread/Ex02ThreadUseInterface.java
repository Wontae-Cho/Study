package com.bit.thread;

public class Ex02ThreadUseInterface implements Runnable{
	//�����带 �����ϰ� ������ ���2. �������̽��� ���.

	public static void main(String[] args) {
		Ex02ThreadUseInterface me = new Ex02ThreadUseInterface();
		
		Thread thr1 = new Thread(me);//������ ��ü�� ����. �̶��� ������� ���� ����� ������ ���� �ʱ⿡ �����忡 �� ��ü�� ����.
		Thread thr2 = new Thread(me);//���⿡���� me �� Runnable Interface Ÿ��.
		thr1.start();
		thr2.start();

	}
	//�� �޼ҵ�� ���� ������ �ִ� ��.
	public void run() {
		System.out.println("���ο� ������ ����");
		for(int i =0; i<10; i++){
			System.out.println("���ο� �۾� ����...");
		}
		System.out.println("���ο� ������ ����");
		
	}

}
