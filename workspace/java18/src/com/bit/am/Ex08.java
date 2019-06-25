package com.bit.am;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex08 {


	public static void main(String[] args) {
		// 학생 성적관리 프로그램 (ver. 0.2.2)
				Scanner sc = new Scanner(System.in);
				System.out
						.println("----------------------------------------------------------------------------");
				System.out.println("학생 성적관리 프로그램 (ver. 0.2.2)");
				System.out
						.println("----------------------------------------------------------------------------");
				String input = null;
				int num = 201901;
				Map<Integer,Map<String, Integer>> data = null;
				data = new TreeMap<Integer,Map<String, Integer>>();
				
				while (true) {
					System.out.print("1. 보기 2. 입력 3. 수정 4. 삭제 0. 종료>");
					input = sc.nextLine();
					if (input.equals("0")) {
						break;
					}
				}

	}

}
