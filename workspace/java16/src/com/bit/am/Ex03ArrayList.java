package com.bit.am;

//class MyArray {
//	private Object[] arr;
//
//	public MyArray() {
//		arr = new Object[0];
//	}
//
//	public int size() {
//		return arr.length;
//	}
//
//	public void add(Object value) {
//
//		Object[] old = arr;
//		arr = new Object[old.length + 1];
//		System.arraycopy(old, 0, arr, 0, old.length);
//		arr[arr.length - 1] = value;
//	}
//
//	public Object get(int idx) {
//		return arr[idx];
//	}
//}

public class Ex03ArrayList {
	// listŸ���� �ڷᱸ��
	// ����ó��(����, ����,���� �ߺ�����)
	// �迭�� ������ ������ �پ ������ ����
	// ��ü�� ����� ������ ����(����,����,�Է� ��)�� �� �پ(�̷л�)
	// ������ �ڹٰ� �迭�� �ʹ� �� �������� �׷��� ���� �迭 ���� ��;
	

	public static void main(String[] args) {
//		MyArray arr = new MyArray();
		java.util.ArrayList arr = new java.util.ArrayList();
		arr.add(1111);
		arr.add(2222);
		arr.add("�߳���");
		arr.add("�ǳ���");
		arr.add("��");
		arr.add("��");
		arr.add("��");
		arr.add("��");
		arr.add("��");
		arr.add("A");
		arr.add("B");
		arr.add(3.14);
		arr.add(true);
		
		for (int i = 0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}
}
