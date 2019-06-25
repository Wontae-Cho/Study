package com.bit.thread;

// �����忡�� ���ÿ� ���� �� �� �ִ� ���
// �����嵵 ��ü������ �� ������ �ΰ� �ִ� ���̾ƴ϶� stac������ �÷��� ���� ó���ϴ� ���̴�.
// �� �� �츮�� �˰� �ִ� ���� ������ ������� �״� ���� �ƴ϶� 
// ������ �ξ �����ư��鼭 ���� �����ϰ� �ȴ�.

class Ex100 extends Thread{
	static int result;
	int start;
	int end;
	
	public Ex100(int start, int end) {
		this.start = start;
		this.end = end;
		
	}
	// "�Ӱ迵��"�� �����ٶ�� ǥ����
	// ����ȭ
	// ����ȭ ��� 1. synchronized 
//	public synchronized void plus(int su){
		// �ش�ż��带 ������ �ʰ� ������� �Ѿ�� ��Ȳ�� �߻���
		// ���� ���� ������� �Ѿ�� �ʰ�, ���ο� ����� ��������� ����� ������.
		// �߰��� ���缭 �̷��� ���̹Ƿ� �׸� �������� ������� "����ȭ" ����Ѵ�.
		// synchronized ������ �ϰ� �Ǹ� ������ �ڵ��� ������ ������ �� �ֵ��� ���ش�.
		// ��, ������ ��ü�� ���ϴ� ���� �ٸ� ������ ��ü�� ���� ���� ���ϴ� ��.
		// �� �ż��尡 ����Ǵ� ���� �ٸ� ������� �ۿ��� ����Ѵٰ� ���°� �´�.
		// �����忡 �����ϳ� �Ҿ����ϳĸ� ������ ���� �� ���η����� ��ũ�γ�������� �����̴�.
	
	// ����ȭ ��� 2.
	// ������ȭ
	public void plus(int su){
//		result += su;
		int hap = 0;
		
		synchronized(this){
			// �Ʒ� ���ڵ尡 ���ÿ� �̷��� �� �ֵ��� �ϴ¹��.
			// Ư�� �Ӱ迵���� �����ϴ� ���. ������ ���� �� �ִ� �κи� ����.
			// ��ũ�γ���� �̷����� �κ��� �ּ�ȭ�Ͽ��� ���� �� �� ���������� ó���� �� �ִ�.
			// �� �ۿ��� �޼��尡 ����ϴ� ��Ȳ�� �������ν� ������ ������ �ּ�ȭ �ϴ� ��.
			// �޼��� ��ü�� ��ũ�γ����� �ϴ� �� ���� �̿� ���� ����� �� ���� ����̶�� �� �� �ִ�.
			// ������ȭ�� ������ ���� �� 
			hap = result + su;
			result = hap;
		}
	}
	static Object key = new Object();
	public void minus(int su){
//		result += su;
		int hap = 0;
		
		synchronized(key){
			//key�� ������ ������ �Ͱ� ���� ������. ���� ���� ������ �������� ������ �̷��� �� �ִ�.
			hap = result - su;
			result = hap;
		}
	}
	
	public void run() {
		for(int i=start; i<end+1; i++){
			plus(i);
			System.out.println(this.getName()+"������..");
		}
		System.out.println(result);
	}
}

public class Ex01 {
	// 500500
	// ���Ƿ� �߸��� ����� �� �� �ֵ��� �� ��.
	// Thread�� �߸��� ����� ���� ���ؼ�.
	// Thread�� 
	
	public static void main(String[] args) {
		// 1 ~ 50������ �����ϴ� ��ü.
		Ex100 ex100 = new Ex100(1,50);
		// 51~ 100������ �����ϴ� ��ü.
		Ex100 ex200 = new Ex100(51,100);
		ex100.start();
		ex200.start();
		try {
			// ������ ���� ������ �����尡 ��� ������ �� ���� �� �ֵ��� ����.
			ex100.join();
			ex200.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("1~100������ ���� "+result);
	}

}
