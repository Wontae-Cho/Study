package com.bit.am;

public class Ex01InfoInside { // ����Ŭ������ ���� : static ����, non-static ���, localŬ����,
								// anonymousŬ����
								// ����Ŭ������ �������� ��κ� ����� ����, Ȱ��� ��ġ�� �κ��� ����.
								// ���� ���������� ��ȣ���� �ʴ� �ڵ��� ����̴�. ������ �ܱ������� ����.
	public static void main(String[] args) {
		// static ����Ŭ������ ȣ��, Ȱ��//
		System.out.println(Ex101.su10); // static ���� Ŭ���� �ȿ� static���� ����� ����
		Ex101.func21(); // static ���� Ŭ���� �ȿ� static���� ����� �޼���
		Ex101 ex1 = new Ex101(); // static ���� Ŭ���� �ȿ� non-static������ ������ ���� ��ü ����.
		System.out.println(ex1.su11); // static ���� Ŭ���� �ȿ� non-static���� ����� ����
		ex1.func22(); // static ���� Ŭ���� �ȿ� non-static���� ����� �޼���
		// ////////////////////////////////

		// ���Ŭ������ ȣ��, Ȱ��///////////////////////
		Ex01InfoInside me = new Ex01InfoInside(); // ���Ŭ������ ������ ���� ��ü����
		Ex102 ex2 = me.new Ex102(); // ���Ŭ������ ��ü����
		// Ex102 ex2 = new Ex01InfoInside().new Ex102(); // ��ü�� ü�̴�.(���� ������ �ϳ���
		// ��ħ.)
		System.out.println(ex2.su12); // ���Ŭ������ ���� ȣ�� ���
		ex2.func23(); // ���Ŭ������ �޼��� ȣ�� ���.
		// //////////////////////////////////////////////

		me.func02().func24();

		Ex99 me2 = new Ex99() {
			public void func24() {

			}
		};
		me2.func24();

	}

	// static ����Ŭ����.
	public static int su1 = 1111;

	static class Ex101 { // ���������� ���� �� ����. Ŭ������ private�� ������.
		static int su10 = 10;
		int su11 = 11;

		static void func21() {
		}

		void func22() {
		}
	}

	// ��� Ŭ���� = ��������� ���� ����.
	private int su2 = 2222;

	class Ex102 {
		int su12 = 12; // static�� ���� �� ����.

		void func23() {
		}
	}

	public static void func01() {
		// ���� Ŭ���� = ���ú����� ���� ����.
		class Ex103 { // ���������� ���� �� ����.
			int su13 = 13; // static�� ���� �� ����.

			void func24() {
			}
		}
		// ����Ŭ������ ����, Ȱ����////
		Ex103 local = new Ex103(); // ���� ����Ŭ������ ��ü����.
		System.out.println(local.su13); // ���� ����Ŭ������ ���� ����.
		local.func24(); // ���� ����Ŭ������ �޼��� ����.
		// ////////////////////////////////
	}

	// anonymous ���� Ŭ����.
	public Ex99 func02() {// �������� ����Ex103�� �ƴ϶� Ex99�� �� �� �ִ�
		int su3 = 3333;

		return new Ex99() { // Ex99�� ��ӹ���.
			// �������̵� = ����� ���
			int su13 = 13;

			public void func24() {
				System.out.println("���ο� ���");
			}
		};
	}

	interface Ex99 { // interface�� �߻�޼��常�� ���� �� ����.
		/* public abstract */void func24(); // ������ �ۺ��̰� �۽�Ʈ��Ʈ��. ���� ��������.

	}

	Ex99 inter1 = new Ex99() {
		public void func24() {

		}
	};
}
