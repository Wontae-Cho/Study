package com.bit.am;

public class Ex02Exception2 {

	public static void main(String[] args) {
		// try - catch�� ��� ���δ��Ŀ� ���� ����� �޶�����.
		// try�� for�� ��ü�� ���Ұ�� = ���� ���ķδ� ������ ���� ����.
			//�Ʒ� ��Ȳ���� 5/0 �� �Ǵ� ���� ����, �������� ����� ������� ����.
		// for�� �ȿ� try�� �� ���� ��� = ���� ��Ȳ�� �ǳʶٰ� ������ �����.
			//5/0�� �� ��쿡�� catch�� ����ǰ� �� ���İ� �ٽ� ����.
		// ��� ���� �ڵ��̳Ĵ� �ɹ���

		int a = 0;
		System.out.println("before for...");
		try {
			for (int i = -3; i < 4; i++) {
				System.out.println("for top...");
				a = 5 / i;
				System.out.println("5/" + i + "=" + a);
				System.out.println("for down...");
			}
		} catch (/* java.lang. */ArithmeticException er) {
			System.out.println("err...");
		}
		System.out.println("a=" + a);
	}
}
