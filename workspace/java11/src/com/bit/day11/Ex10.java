package com.bit.day11;

public class Ex10 {
	static int num1=1111; //����ƽ����, Ŭ��������...
	//���������ڴ� public default private�� �� �� �ִ�.

	public static void main(String[] args) {
		int num1=2222;
		
		System.out.println(com.bit.day11.Ex10.num1);
		System.out.println(Ex10.num1);//���� ��Ű���� ����.
		System.out.println(num1);//���� ��Ű��,Ŭ������ ����.
		//���������� ���� �̸��� ������ �ִٸ� ���������� �켱�� �ȴ�.
		//����� ��쿡�� �̴� �����ϴ� . �켱���� : ��� < Ŭ�������� < ��������
		//page162 ���� 4-14 ~ 4-18���� �غ���.

		com.bit.day11.Ex10.func01();
		//������Ű���̱⶧���� ��Ű���� ��������
		Ex10.func01();
		//����Ŭ�����̱⶧���� Ŭ������ ��������
		func01();
		func02(1234); //���ڰ� �ִٴ� ���� �޴� �޼��忡�� ��õǾ��־���Ѵ�
					//�ڷ��� ���� ��ġ�ؾ��Ѵ�.
		//double su = func03();
		//System.out.println(su);
		System.out.println(func03());
	}
	
	public static void func01(){
		System.out.println("static method func01...");
		return;
	}
	
	public static void func02(int a){
		System.out.println(a);
		com.bit.day11.Ex10.func01();
	}
	
	public static double func03(){//������ �ִٸ� ������ �ڷ����� ���������Ѵ�.
		return 3.14; 
	}

}
