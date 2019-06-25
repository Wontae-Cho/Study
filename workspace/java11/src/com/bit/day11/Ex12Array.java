package com.bit.day11;

class Student{
	int num=0;
	static int num2=0;
	int kor;
	int eng;
	public Student(){
		num2++;
		num=num2;
	}
}

public class Ex12Array {

	public static void main(String[] args) {
		Student[] stu = new Student[5];
		stu[0] = new Student();
		stu[1] = new Student();
		stu[2] = new Student();
		stu[3] = new Student();
		stu[4] = new Student();
		stu[0].kor = 90;
		stu[0].eng = 90;
		stu[1].kor = 80;
		stu[1].eng = 80;
		for(int i=0; i<stu.length;i++){
			System.out.println(stu[i].num+",kor : "+stu[i].kor);	
		}
		


	}

}
