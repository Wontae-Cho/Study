package com.bit.day12;

public class Ex06ChangeEx04 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int[][] data = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 },
				{ 0, 0, 0 } };
		System.out.println("--------------------------------------");
		System.out.println("학생성적관리프로그램(ver 0.1.0)");
		System.out.println("--------------------------------------");

		int input = 0;
		int index = 0;
		String msg = null;
		while (true) {
			System.out.print("1.보기 2.입력 0.종료>");
			msg = sc.nextLine();
			// /////validate///////
			boolean check = false;
			for (int i = 0; i < msg.length(); i++) {
				char ch = msg.charAt(i);
				if (!Character.isDigit(ch)) {
					check = true;
				}
			}
			if (check) {
				System.out.println("입력을 잘못하셨습니다. 다시 입력해주세요.");
				continue;
			}
			input = Integer.parseInt(msg);

			if (input == 0) {
				break;
			}
			if (input == 1) {
				System.out.println("학번	국어	영어	수학	합계	평균");
				for (int i = 0; i < data.length; i++) {
					int[] stu = data[i];
					System.out.println(i + 1 + "\t" + stu[0] + "\t" + stu[1]
							+ "\t" + stu[2]);
				}

			} else if (input == 2) {
				if (index < 5) {
					int kor = 0;
					while (true) {
						System.out.print(index+1+"번 국어>");
						msg = sc.nextLine();
						// 숫자가 아닌 값을 입력했을 경우
						boolean boo1=false;
						for (int i = 0; i < msg.length(); i++) {
							msg.charAt(i);
							if (!Character.isDigit(msg.charAt(i))) {
								boo1 = true;
							}
						}
						if(boo1){continue;}
						kor = Integer.parseInt(msg);
						// 성적의 입력범위가 아닌경우 !(0<= <=100)
						if(0<=kor && kor <=100){break;}
					}

				
//					System.out.println(index+1+"번 영어>");
//					msg = sc.nextLine();//					
//					int eng = Integer.parseInt(msg);
					int eng = inputFunc(sc, index+1+"번 영어>");
					int math = inputFunc(sc, index+1+"번 수학>");
//					System.out.print(index+1+"번 수학>");
//					msg = sc.nextLine();
//					int math = Integer.parseInt(msg);

					int[] stu = data[index];
					stu[0] = kor;
					stu[1] = eng;
					stu[2] = math;
					index++;
				} else {
					System.out.println("더이상 입력할 학생이 없습니다.");
				}
			} else {
				System.out.println("입력을 잘못하셨습니다. 다시 입력해주세요.");
			}
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	public static int inputFunc(java.util.Scanner sc,String msg){
		int su=0;
		while (true) {			
			System.out.print(msg);
			String msg1 = sc.nextLine();
			// 숫자가 아닌 값을 입력했을 경우
			boolean boo1=false;
			for (int i = 0; i < msg1.length(); i++) {
				msg1.charAt(i);
				if (!Character.isDigit(msg1.charAt(i))) {
					boo1 = true;
				}
			}
			if(boo1){continue;}
			su = Integer.parseInt(msg1);
			// 성적의 입력범위가 아닌경우 !(0<= <=100)
			if(0<=su && su <=100){break;}
		}
		return su;
	}

}
