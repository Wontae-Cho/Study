package com.bit.am;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex08 {


	public static void main(String[] args) {
		// �л� �������� ���α׷� (ver. 0.2.2)
				Scanner sc = new Scanner(System.in);
				System.out
						.println("----------------------------------------------------------------------------");
				System.out.println("�л� �������� ���α׷� (ver. 0.2.2)");
				System.out
						.println("----------------------------------------------------------------------------");
				String input = null;
				int num = 201901;
				Map<Integer,Map<String, Integer>> data = null;
				data = new TreeMap<Integer,Map<String, Integer>>();
				
				while (true) {
					System.out.print("1. ���� 2. �Է� 3. ���� 4. ���� 0. ����>");
					input = sc.nextLine();
					if (input.equals("0")) {
						break;
					}
				}

	}

}
