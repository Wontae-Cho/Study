package com.bit.thread;

public class Ex06NameInter implements Runnable{
	/*
	 * ������� ���� ���ӿ��� �ұ��ϰ� �����Ѿ��̳� ������ ����
	 * �� ������ 2������ ���� �� �ִ�.
	 * 1.ȯ��������
	 * 
	 * 2.Ư��
	 * 	// runnable > ����� ��, ����� �� > runnable �� �� �ϳ��� �ϴµ� ������ �� �ٽ� �������� �ְ� �ƴ� ���� �ִ�.
	 * 	// �װ͸��� ������ �����庰�� ���� ó���ϱ� ���� �Ҵ�ð��� �ִµ� �� �ȿ� �� ���ϰų� �װͺ��� ����������� �������� �Ѿ��.
	 */

	public static void main(String[] args) {
		System.out.println("main thread start");
		Ex06NameInter me = new Ex06NameInter();
		
		//�������� 2��° ������ ���� �������� �̸����� �� ���ִ�.
		Thread thr1 = new Thread(me,"ù��°");
		Thread thr2 = new Thread(me,"�ι�°");
		System.out.println(thr1.getName());
		System.out.println(thr2.getName());
		thr1.start();
		thr2.start();
		
		System.out.println("main thread end");

	}
	public void run() {
		//����� �ƴϱ� ������ �ٷ� getName�� ���� ���ϰ� ���� ����Ǵ� �����带 �̿��ؾ��Ѵ�.
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
