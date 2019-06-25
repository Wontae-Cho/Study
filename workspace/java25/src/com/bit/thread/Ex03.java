package com.bit.thread;

/*
 * ������ ���� ����� ������ ������.
 * 
 *  ���絵 ����� �� ������ �����ϴ� ����� �ƴ�. ������ �������� ���ٴ� ������ ����.
 *  
 *  �ռ� �ô� yield�� runnable ���·� ������ �Ϳ� ���ؼ�
 *  suspend�� blocked ���·� ������. 
 *  resume ���� �� runnable�� ������
 *  stop �� �� ���������� dead�� ����������.
 *  ���� �ռ� �ô� �ڵ��� ���ĺ��� �������� ���� ��� ��Ȳ�� ����ȴ�.
 * 
 */
class Ex203 extends Thread{
	
	public void run() {
		int a = 0;
		while(true){
			System.out.println(++a + "working");
		}
	};
}


public class Ex03 {
	
	public static void main(String[] args) {
		Ex203 you = new Ex203();
		
		you.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		you.suspend(); // �Ͻ�����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		you.resume(); // �����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		you.stop(); // ����
	}

}
