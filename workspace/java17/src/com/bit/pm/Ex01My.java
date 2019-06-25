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
		System.out.println("학생성적관리프로그램(ver 1.2.0)");
		System.out.println("--------------------------------------");

		while (true) {
			// stuData = new ArrayList<int[]>();
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
			input = sc.nextLine();
			if (input.equals("0")) {
				break;
			}
			if (input.equals("1")) {
				System.out.println("--------------------------------------");
				System.out.println("학번\t|국어\t|영어\t|수학\t");
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
				String[] subject = new String[] { "국어>", "영어>", "수학>" };
				try {
					for (int i = 0; i < 3; i++) {
						System.out.print(subject[i]);
						input = sc.nextLine();
						int number = Integer.parseInt(input);
						if (number > 0 && number <= 100) {
						} else {
							System.out.println("점수는 100점을 넘을 수 없습니다.");
							i--;
							continue;
						}
						stuScore[i + 1] = number;
					}
				} catch (NumberFormatException e) {
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				stuScore[0] = ++studNum;

				stuData.add(stuScore);

			} else if (input.equals("3")) {
				System.out.print("학번>");
				input = sc.nextLine();
				int target = 0;
				try {
					target = Integer.parseInt(input);
				} catch (NumberFormatException e) {
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				int i = 0;
				for (i = 0; i < stuData.size(); i++) {
					if (target == stuData.get(i)[0]) { // i번째에 0은 타겟.
						break;
					}
				}
				if (target == stuData.size()) {
					continue;
				}
				int[] stu = { target, 0, 0, 0 };
				String[] subject = new String[] { "국어>", "영어>", "수학>" };
				for (int j = 0; j < subject.length; j++) {
					System.out.print(subject[j]);
					input = sc.nextLine();
					int number = Integer.parseInt(input);
					if (number > 0 && number <= 100) {
					} else {
						System.out.println("점수는 100점을 넘을 수 없습니다.");
						j--;
						continue;
					}
					stu[j + 1] = number;

				stuData.set(i, stu);
				}

			} else if (input.equals("4")) {
				System.out.print("학번>");
				input = sc.nextLine();
				int target = Integer.parseInt(input);
				int i = 0;
				for (i = 0; i < stuData.size(); i++) {
					if (target == stuData.get(i)[0]) { // i번째에 0은 타겟.
						break;
					}
				}
				if (target == stuData.size()) {
					continue;
				}
				stuData.remove(i);
			} else {
				System.out.println("0~4까지의 숫자를 입력해주세요.");
				continue;
			}
		}
	}

}
