package com.bit.am;

public class Ex03TryCatch {
	/*
	 * int a=5; 5/-3=? 5/-2=? 5/-1=? 5/0=0 5/1=5
	 */

	public static void main(String[] args) {
		// try{}�ȿ����� ���� ������ �� �ȿ����� �ǹ̰� �ִ�.
		// try{}�ۿ��� ������ �ϰ� �ȿ��� �ʱ�ȭ�� �ϴ� �͵� ������� �ʴ´�.
		// ���� ������ �߻��ؼ� try�� Ż������ �𸣱� ������.
		// ��������,�ʱ�ȭ�� try{}�ۿ���.

		int a = 5;
		for (int i = -3; i < 4; i++) {
			try {
				System.out.print(a +"/" + i + "="); // ������ ��µǴ� �κ�.
				System.out.println(a/i);			// ������ �κ�(�����߻����ɼ��� �ִºκ�)
			} catch (ArithmeticException er) {
				System.out.println(0);	//�������߻����� �� ��µǴºκ�.
			}

		}
	}
}
