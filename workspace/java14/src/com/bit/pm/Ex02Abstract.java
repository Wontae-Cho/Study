package com.bit.pm;
//�߻�Ŭ����
abstract class Ex22{ //abstract class Ŭ������.
	//�߻�Ŭ������ �߻� �޼��带 0���̻� ���� Ŭ����
	// ��, ��� �߻�Ŭ���� �������� �־ �߻�Ŭ����.
	int a=1;
	
	public Ex22(){
		
	}
	public void func01(){
		System.out.println("func01()...");
	}
	
	public abstract void func02(); // ������ �ȵ� �̷��� �޼��带 �߻�޼����� �Ѵ�.
						//�޼����� ���� �ִ�.
	//�߻�޼��尡 ���� �� ��ӹ޴� �ʿ� �ݵ�� �װͿ� ���� �ʱ�ȭ���ֵ��� ������ �� �ִ�.
	
//	public abstract void func03();
}



public /*abstract*/ class Ex02Abstract extends Ex22{
	//�߻� Ŭ������ ��ӹ����� �ڽŵ� �߻�Ŭ������ �ǰų�
	//�װ� �ƴ϶�� ������ ������ �޼��带 �������̵� ������Ѵ�.
	
	public void func02(){
		System.out.println("�ٲ� ���....");
	}

	
	public static void main(String[] args) {
//		Ex02Abstract you = new Ex02Abstract();
//		you.func01();
		Ex02Abstract me = new Ex02Abstract(); //�߻�Ŭ������ ��ü�� ������ �Ұ���
		me.func02();

	}

}
