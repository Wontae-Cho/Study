package com.bit.pm;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01My {
	

	public static void main(String[] args) {
		ArrayList<int[]> stuData = new ArrayList<int[]>();
		String input = null;
		int studNum = 2019000;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("�л������������α׷�(ver 1.2.0)");
		System.out.println("--------------------------------------");

		while (true) {
			// stuData = new ArrayList<int[]>();
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>");
			input = sc.nextLine();
			if (input.equals("0")) {
				break;
			}
			if (input.equals("1")) {
				System.out.println("--------------------------------------");
				System.out.println("�й�\t|����\t|����\t|����\t");
				System.out.println("--------------------------------------");
				for (int i = 0; i < stuData.size(); i++) {
					int[] stu = stuData.get(i);
					for (int j = 0; j < stu.length; j++) {
						if (j != 0) {
							System.out.print("\t|");
						}
						System.out.print(stu[j]);
					}
					System.out.println();
				}

			} else if (input.equals("2")) {
				int[] stuScore = new int[4];
				String[] subject = new String[] { "����>", "����>", "����>" };
				try {
					for (int i = 0; i < 3; i++) {
						System.out.print(subject[i]);
						input = sc.nextLine();
						int number = Integer.parseInt(input);
						if (number > 0 && number <= 100) {
						} else {
							System.out.println("������ 100���� ���� �� �����ϴ�.");
							i--;
							continue;
						}
						stuScore[i + 1] = number;
					}
				} catch (NumberFormatException e) {
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
				stuScore[0] = ++studNum;

				stuData.add(stuScore);

			} else if (input.equals("3")) {
				System.out.print("�й�>");
				input = sc.nextLine();
				int target = 0;
				try {
					target = Integer.parseInt(input);
				} catch (NumberFormatException e) {
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
				int i = 0;
				for (i = 0; i < stuData.size(); i++) {
					if (target == stuData.get(i)[0]) { // i��°�� 0�� Ÿ��.
						break;
					}
				}
				if (target == stuData.size()) {
					continue;
				}
				int[] stu = { target, 0, 0, 0 };
				String[] subject = new String[] { "����>", "����>", "����>" };
				for (int j = 0; j < subject.length; j++) {
					System.out.print(subject[j]);
					input = sc.nextLine();
					int number = Integer.parseInt(input);
					if (number > 0 && number <= 100) {
					} else {
						System.out.println("������ 100���� ���� �� �����ϴ�.");
						j--;
						continue;
					}
					stu[j + 1] = number;

				stuData.set(i, stu);
				}

			} else if (input.equals("4")) {
				System.out.print("�й�>");
				input = sc.nextLine();
				int target = Integer.parseInt(input);
				int i = 0;
				for (i = 0; i < stuData.size(); i++) {
					if (target == stuData.get(i)[0]) { // i��°�� 0�� Ÿ��.
						break;
					}
				}
				if (target == stuData.size()) {
					continue;
				}
				stuData.remove(i);
			} else {
				System.out.println("0~4������ ���ڸ� �Է����ּ���.");
				continue;
			}
		}
	}

}
