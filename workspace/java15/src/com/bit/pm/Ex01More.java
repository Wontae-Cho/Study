package com.bit.pm;

public class Ex01More {

	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		System.out.println("�ֹι�ȣ üũ");
		System.out.println("-----------------------------------");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String msg = null;
		int age=0;
		while (true) {
			System.out.print("�ֹι�ȣ �Է�>");
			msg = sc.nextLine();
			if (msg.length() != 14) {
				System.out.println("�Է¾���� Ȯ�����ּ���.(ex. 000000-0000000)");
				continue;
			} else if (msg.charAt(6) != '-') {
				System.out.println("�Է¾���� Ȯ�����ּ���.(ex. 000000-0000000)");
				continue;
			}
			String msgFront = msg.substring(0, 6);
			String msgBack = msg.substring(7, 13);
			try {
				int FrontNum = Integer.parseInt(msgFront);
				int BackNum = Integer.parseInt(msgBack);
			} catch (NumberFormatException e) {
				System.out.println("�Է¾���� Ȯ�����ּ���.(ex. 000000-0000000)");
			}
			if ((msg.charAt(0) == '0' || msg.charAt(0) == '1')
					&& (msg.charAt(7) == '3' || msg.charAt(7) == '4')) {
				age = 2019 - 1999 - (msg.charAt(0)-'0')*10 - (msg.charAt(1)-'0');
//				System.out.println(age);
			} else if ((msg.charAt(0) >= '2')
					&& (msg.charAt(7) == '1' || msg.charAt(7) == '2')) {
				age = 2019 - 1899 - (msg.charAt(0)-'0')*10 - (msg.charAt(1)-'0');
//				System.out.println(age);
			} else {
				if(msg.charAt(0) == '0' || msg.charAt(0) == '1'){
					System.out.println("���ڸ��� 3 �Ǵ� 4�� �����ؾ��մϴ�.");
				}else{
					System.out.println("���ڸ��� 1 �Ǵ� 2�� �����ؾ��մϴ�.");
				}
				continue;
			}
			System.out.print("����� " + age);
			char gender = msg.charAt(7);
			if (gender == '1' || gender == '3') {
				gender = '��';
			} else if (gender == '2' || gender == '4') {
				gender = '��';
			}
			System.out.println("�� " + gender + "�� �Դϴ�");
			break;
		}

	}

}
