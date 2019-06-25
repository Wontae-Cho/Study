package com.bit.thread;

/*
 * try - catch�� �а� �����ν� ������ �߻���Ű�� �� ��Ȳ���� while���� �������� �� �ְ� �ϴ� ���.
 */


class Ex204 extends Thread {

	public void run() {
		
		try {
			while (true) {
				System.out.println("���ϴ� ��....");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
//			e.printStackTrace(); //���ܻ�Ȳ �������� ���
		}
		System.out.println("�ϰ� ����");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Ex204 you = new Ex204();
		you.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
//			e.printStackTrace();
		}
		you.interrupt(); //���ܻ�Ȳ �߻�. = ����.
		
	}

}
