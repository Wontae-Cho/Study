package com.bit.pm;

public class Ex12Exception {
	// ����ó�� = ����ȸ��.
	// ���� ������ �߿��� �ڹٰ� �����ϴ� ȸ�ǹ��.
	// + �ڵ忡��.
	// ���� + �����Ͽ���
	// + ��Ÿ�ӿ���

	public static void main(String[] args) {
		String msg = "1,000";
		try {//�߰�ȣ�� �õ�
			int su = Integer.parseInt(msg);
			System.out.println("su=" + su);
		} catch (/* java.lang. */NumberFormatException e) {
			// ĳġ�� ���������� ��Ƴ�. �׸��� ������.
			// �������־ ����
			// ������ ������ �׳� ��
			System.out.println("�����߻�");
		}
		System.out.println("main end");

	}

}
