package com.bit.day10;

public class Ex12Regi {
	/*
	 * �ֹι�ȣ �Է� > 123456-3456789 (����) ����� 8�� �����Դϴ�.
	 * 
	 * �ֹι�ȣ �Է�> 993456-2456789 ����� 21�� �����Դϴ�.
	 * 
	 * �ֺ��ȣ �Է�>993456 2456789 �Է¾���� Ȯ�����ּ���(ex. 000000-0000000)
	 * 
	 * �ֹι�ȣ �Է�>999999-123456 �Է¾���� Ȯ�����ּ���(ex. 000000-0000000)
	 * 
	 * �ֹι�ȣ �Է�>999999-22123456 �Է¾���� Ȯ�����ּ���(ex. 000000-0000000)
	 * 
	 * �ֹι�ȣ �Է�>abcdfg-abcdfeg �Է��� �߸��Ǿ����ϴ�.
	 * 
	 * �ΰ�����(�ѱ��ν�) �ֹι�ȣ �Է�> ���̻����� = ���̻�����ĥ ����� 00�� (����)�Դϴ�.
	 */
	public static void main(String[] args) {
		int currentYear = java.util.Calendar.getInstance().get(
				java.util.Calendar.YEAR);
		int age = 0;
		String gender = "";
		String regiNum = "";
		String frontNum = "";
		String backNum = "";
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ�� �Է����ּ���(-����) > ");
		regiNum = sc.nextLine();
		frontNum = regiNum.substring(0, 6);
		backNum = regiNum.substring(7, 14);

		char[] ch1 = regiNum.toCharArray(); // �� 14����.
		char[] ch2 = frontNum.toCharArray();
		char[] ch3 = backNum.toCharArray();
		// ���Ἲ�˻�κ�.
		for (int i = 0; i < ch1.length; i++) { // '-' = 45, '0'=48 , '9'=57
			if (ch1.length != 14) {
				System.out.println("�Է¾���� Ȯ�����ּ���(ex. 000000-0000000)");
				return;
			} else if (ch1[6] != '-') {
				System.out.println("�Է¾���� Ȯ�����ּ���(ex. 000000-0000000)");
				return;
			} else {
			}
		}
		for(int i = 0; i < ch2.length; i++){ //�պκ��� ���ǰ˻�.
			if (ch2[i] >= '0' && ch2[i] <= '9') {
				//
			} else {
				System.out.println("�Է¾���� Ȯ�����ּ���(ex. 000000-0000000)");
				return;
			}

		}
		for(int i = 0; i < ch3.length; i++){ //�޺κ��� ���ǰ˻�.
			if (ch3[i] >= '0' && ch3[i] <= '9') {
				//
			} else {
				System.out.println("�Է¾���� Ȯ�����ּ���(ex. 000000-0000000)");
				return;
			}

		}
		// �������� �ֹι�ȣ Ư¡�� ���� ���ǰ˻�κ�.
		if (ch1[0] == '0' || ch1[0] == '1') {
			age = currentYear - 1999 - ((ch1[0] - '0') * 10) - (ch1[1] - '0');
		} else {
			age = currentYear - 1899 - ((ch1[0] - '0') * 10) - (ch1[1] - '0');
		}
		if (ch1[7] == '1' || ch1[7] == '3') {
			gender = "����";
		} else if (ch1[7] == '2' || ch1[7] == '4') {
			gender = "����";
		} else {
			System.out.println("�Է¾���� Ȯ�����ּ���(ex. 000000-0000000)");
			return;
		}
		System.out.println("����� " + age + "�� " + gender + "�Դϴ�.");
		return;
	}

}
