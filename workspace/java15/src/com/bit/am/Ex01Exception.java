package com.bit.am;

public class Ex01Exception {
	// ������ ��Ȳ�� ȸ���ϴ°�
	public static void main(String[] args) {
		// ����.
		System.out.println("before try...");	//��� ����Ǵ��� . ������ �帧�� �ľ�
												// 1
		try {
			System.out.println("start try...");	// 2
			int a = 5 / 0;	// �����߻� - ������ �Ұ���. 
							// try{} �ȿ��� ���� ���� �κ��� �������� ����.
							// ������ �߻����� �ʾҴٸ� ���������� ����ȴ�.
			System.out.println(a);
			System.out.println("end try...");	// ������� �ʾ���.
		} catch (java.lang.ArithmeticException er) {
			System.out.println("catch...");		// 3 ������ ���ٸ� ������� ����.
		}
		System.out.println("end try catch...");	// 4

	}

}
