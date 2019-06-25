package com.bit.pm;

public class Ex05NonstaticInsideClass {
	int su1 = 111;

	class Inner02 {
		int su1 = 1111;
		// static int su2=2222; //Ŭ������ü�� non-static ����ʵ�� ����.
		// ���� �� Ŭ������ ����ƽ������ ���°� ��ü�� �Ұ����ϴ�.
		final static int su3 = 3333; // ��, final�� ���� ����ƽ ������ ���� ���� ����Ѵ�.
										// ������ ���ȭ�Ǳ� ������ ������ �κ��̴�.

		public Inner02() {
			System.out.println("������ ȣ��");
		}

		public void func01() {
			System.out.println("non-static func01()....");
		}
		// public static void func02(){ //���������� ����ƽ�����ȿ� �Ҵ��� �� ��� �޼��嵵 ����ƽ���� ����
		// �Ұ�

	}

	public static void main(String[] args) {
		Ex05NonstaticInsideClass me = new Ex05NonstaticInsideClass();
		
		Inner02 inn = null; // Inner02�� �����ϱ� Ÿ���� ���� ����.
		inn = me.new Inner02(); //�켱 ���� �ڽ��� ��ü�� ��� ���������� ���� �����ؾ� ����
						//1���� non-static 2���� non-static������ �����̱� ������.
		System.out.println(inn.su1);
		System.out.println(Inner02.su3); //static ������ �ö� su3�̱� ������ ����.
		inn.func01();
	}

}
