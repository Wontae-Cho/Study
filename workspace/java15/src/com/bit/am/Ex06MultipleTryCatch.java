package com.bit.am;

public class Ex06MultipleTryCatch { // ����ĳġ

	public static void main(String[] args) {

		int su = 3;

		if (su > 0) {
			if (su / 2 != 0) {
				// ����̰� Ȧ��
			}
		}

		// ����ĳġ�� �����
		// if(){}else if(){}else{} ������ ���
		// try�ϳ��� �� �ϳ��� catch�� �ִ� ���� �ƴϴ�.

		int[] arr = { 0, 3, 5 };
		int result = 0;
		for (int i = 0; i < 4; i++) {
//			try{
//				result=100/arr[i];
//			}catch(Exception e){	// �ѹ��� ��Ƴ� �� ����.
									// ������ ������ ���� ������ �� �� ����.
									// ���α׷��Ӱ� �ǵ�ġ ���� ������ �߻���ų �� �ִ�.
//				System.out.println("����ó��");
//			}
//			System.out.println("result=" + result);
			try {
				result = 5 / arr[i];
			} catch (ArithmeticException er) {	//catch�� ������ �������.
									//error�� ��Ȳ�� else if�� ����� ������ �����ϱ⶧����.
				System.out.println("0���� ������ �����߻�");
			} catch (ArrayIndexOutOfBoundsException er) {
				System.out.println("�迭�� �ε��� ��ȣ�� ����");
					//������ ��Ȳ�� ���� �ٸ� �����ս��� ������ �� �ִ�.
			}
			System.out.println("result=" + result);
		}

	}

}
