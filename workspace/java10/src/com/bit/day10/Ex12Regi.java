package com.bit.day10;

public class Ex12Regi {
	/*
	 * 주민번호 입력 > 123456-3456789 (정상) 당신은 8세 남자입니다.
	 * 
	 * 주민번호 입력> 993456-2456789 당신은 21세 여자입니다.
	 * 
	 * 주빈번호 입력>993456 2456789 입력양식을 확인해주세요(ex. 000000-0000000)
	 * 
	 * 주민번호 입력>999999-123456 입력양식을 확인해주세요(ex. 000000-0000000)
	 * 
	 * 주민번호 입력>999999-22123456 입력양식을 확인해주세요(ex. 000000-0000000)
	 * 
	 * 주민번호 입력>abcdfg-abcdfeg 입력이 잘못되었습니다.
	 * 
	 * 인공지능(한글인식) 주민번호 입력> 일이삼사오육 = 일이삼사오육칠 당신은 00세 (성별)입니다.
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
		System.out.print("주민등록번호를 입력해주세요(-포함) > ");
		regiNum = sc.nextLine();
		frontNum = regiNum.substring(0, 6);
		backNum = regiNum.substring(7, 14);

		char[] ch1 = regiNum.toCharArray(); // 총 14글자.
		char[] ch2 = frontNum.toCharArray();
		char[] ch3 = backNum.toCharArray();
		// 무결성검사부분.
		for (int i = 0; i < ch1.length; i++) { // '-' = 45, '0'=48 , '9'=57
			if (ch1.length != 14) {
				System.out.println("입력양식을 확인해주세요(ex. 000000-0000000)");
				return;
			} else if (ch1[6] != '-') {
				System.out.println("입력양식을 확인해주세요(ex. 000000-0000000)");
				return;
			} else {
			}
		}
		for(int i = 0; i < ch2.length; i++){ //앞부분의 조건검사.
			if (ch2[i] >= '0' && ch2[i] <= '9') {
				//
			} else {
				System.out.println("입력양식을 확인해주세요(ex. 000000-0000000)");
				return;
			}

		}
		for(int i = 0; i < ch3.length; i++){ //뒷부분의 조건검사.
			if (ch3[i] >= '0' && ch3[i] <= '9') {
				//
			} else {
				System.out.println("입력양식을 확인해주세요(ex. 000000-0000000)");
				return;
			}

		}
		// 실질적인 주민번호 특징에 대한 조건검사부분.
		if (ch1[0] == '0' || ch1[0] == '1') {
			age = currentYear - 1999 - ((ch1[0] - '0') * 10) - (ch1[1] - '0');
		} else {
			age = currentYear - 1899 - ((ch1[0] - '0') * 10) - (ch1[1] - '0');
		}
		if (ch1[7] == '1' || ch1[7] == '3') {
			gender = "남성";
		} else if (ch1[7] == '2' || ch1[7] == '4') {
			gender = "여성";
		} else {
			System.out.println("입력양식을 확인해주세요(ex. 000000-0000000)");
			return;
		}
		System.out.println("당신은 " + age + "세 " + gender + "입니다.");
		return;
	}

}
