package com.bit.am;

public class Ex08Exception3 {


	public static void main(String[] args) {
		System.out.println("���� ����");
		try{
			func01(1); //�����۵�
			func01(0); //�����߻�
			func01(-1); 
		}catch(ArithmeticException e){
			System.out.println("�ذ�");
		}
		System.out.println("���� ����");

	}
	
	public static void func01(int a) throws ArithmeticException{
		// ������ �߻��ϸ� ȣ���� ������ �� ������ ������.
		// ��� ��� ������ throws�� �ϰ� �ֱ⶧���� �����ص� ������ ����.
		// ���� ������ ����������ϰ� ���α׷� ������� ���̴� ����� ����.
		System.out.println("�޼��� ����");
		ArithmeticException excep = new ArithmeticException(); //������ ��ü�� ����
		throw excep; //���� ��ü�� �������ν� ���������� ������ ��������.
//		int su=5/a;
//		
//		System.out.println("�޼��� ����");
		
	}

}
