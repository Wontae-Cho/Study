package com.bit.day11;

public class Ex06 {

	public static void main(String[] args) {
		// ♂ ♂ ♂ ♂ 1 2 3 4 i=0, j<4;
		// ♂ ♂ ♂ 5 6 7 i=1, j<3;
		// ♂ ♂ 8 9 i=2, j<2;
		// ♂ 10 i=3, j<1;
		// 规过1
		for (int i = 0; i < 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("♂ ");
			}
			System.out.println();
		}
		// 规过2
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print("♂ ");
			}
			System.out.println();
		}
		// 规过3
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i >= 3 - j) {
					System.out.print("∴ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		// 规过4
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print("♂ ");
				if (i == 3 - j) {
					break;
				}
			}
			System.out.println();
		}

	}

}
