package com.bit.day13;

class Student {
	private static int cnt = 0; // 학생의 명수가 됨.
	final int num; // 학번
	int kor; // 국어성적
	int eng; // 영어성적
	int math; // 수학성적

	public Student() {
		Student.cnt++; // 생성자가 생성될때마다 찍어내는 번호.
		this.num = 1900 + cnt; // 학번으로 들어감.
	}
}

public class Ex08DynAllocation {
	static int[] array = null;
	static int[] temp = null;
	static int cnt = 0;

	//동적할당을 만드는 메서드.
	public static void func(int su) {
		temp = array;
		array = new int[++cnt];
		if (temp != null) {
			for (int i = 0; i < temp.length; i++) {
				array[i] = temp[i];
			}
		}
		array[array.length - 1] = su;
	}

	public static void main(String[] args) {
		// 동적할당
		func(1);
		func(22);
		func(33);
		func(44);
		func(55);
		

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

	}

}
