package com.bit.day11;

class Student2{
	private int num; //정보의 은닉 private.
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public void add(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor(){ //kor에 접근할 수 있는방법.
		return this.kor;
	}
	
	public int sum(){
		return kor+eng+math;
	}
}

public class Ex13CapsuleHide {

	public static void main(String[] args) {
		// 정보의 은닉
		// 캡슐화

	}

}
