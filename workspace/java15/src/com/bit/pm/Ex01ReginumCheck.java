package com.bit.pm;

import java.util.Scanner;

public class Ex01ReginumCheck {
	// �ֹε�Ϲ�ȣ Ȯ��
	// 123456-3456789

	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		System.out.println("�ֹι�ȣ üũ");
		System.out.println("-----------------------------------");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String input = null;
		int age = 2020;
		boolean result = true, check = false;
		// �����Ǵ�.
		while(result) {
			check = false;
			System.out.print("�ֹι�ȣ �Է�>");
			input = sc.nextLine();
			// �Է¹��� ���ڰ� 14�ڰ� �ƴ϶��.
			if (input.length() != 14) {
				System.out.println("1�Է¾���� Ȯ�����ּ���.(ex. 000000-0000000)");
				continue;
			} else if (input.charAt(6) != '-') {
				System.out.println("2�Է¾���� Ȯ�����ּ���.(ex. 000000-0000000)");
				continue;
			}

			for (int i = 0; i < input.length(); i++) {
				// '-'�� �����°��� �����ϰ� �˻�.
				if (i == 6) {continue;}
				if (!Character.isDigit(input.charAt(i))) {
					check = true;
					break;
				}
			}
			if (check) {
				System.out.println("3�Է¾���� Ȯ�����ּ���.(ex. 000000-0000000)");
				continue;
			}

			if ((input.charAt(0) == '0' || input.charAt(0) == '1')
					&& (input.charAt(7) == '3' || input.charAt(7) == '4')) {
				age -= 2000;
			} else if ((input.charAt(0) >= '2')
					&& (input.charAt(7) == '1' || input.charAt(7) == '2')) {
				age -= 1900;
			} else {
				continue;
			}

			result = false;

		}

		age -= (input.charAt(0) - '0') * 10 + input.charAt(1) - '0'; // '1' - '0' = 1*10 = 10 '2' - '0' = 2
		// if(age<0){
		// age+=100;
		// }
		System.out.print("����� " + age);
		char gender = input.charAt(7);
		if (gender == '1' || gender == '3') {
			gender = '��';
		} else if (gender == '2' || gender == '4') {
			gender = '��';
		}
		System.out.println("�� " + gender + "�� �Դϴ�");

	}

}
