package com.bit.day13;

class Student {
	private static int cnt = 0; // �л��� ����� ��.
	final int num; // �й�
	int kor; // �����
	int eng; // �����
	int math; // ���м���

	public Student() {
		Student.cnt++; // �����ڰ� �����ɶ����� ���� ��ȣ.
		this.num = 1900 + cnt; // �й����� ��.
	}
}

public class Ex08DynAllocation {
	static int[] array = null;
	static int[] temp = null;
	static int cnt = 0;

	//�����Ҵ��� ����� �޼���.
	public static void func(int su) {
		temp = array;
		array = new int[++cnt];
		if (temp != null) {
			for (int i = 0; i < temp.length; i++) {
				array[i] = temp[i];
			}
		}
		array[array.length - 1] = su;
	}

	public static void main(String[] args) {
		// �����Ҵ�
		func(1);
		func(22);
		func(33);
		func(44);
		func(55);
		

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

	}

}
