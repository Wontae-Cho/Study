package com.bit.am;

public class Ex10TryCatchFinally {
	//�߰��� Catch�� �������� �ִ�. �� ���� finally�� ������ �ȴ�.

	public static void main(String[] args) {
		System.out.println("���� ����");
		func01();
		System.out.println("���� ����");
	}

	public static void func01() {
		System.out.println("start func01");
		try {
			int su = 5 / 0;
			
//		} catch (ArithmeticException e) {
//			System.out.println("����ȸ��");
//			
		} finally { // ������ �ֵ� ���� �ݵ�� �����ϴ� �ڵ�
					// �������� �ֵ� �����ع���.
			System.out.println("�ݵ�� �����ϰ� ������");
		}
		System.out.println("end func01");
	}

}
