package com.bit.day13;

class Student02{ //학생의 속성.
	final int stdNum; 	// 학생의 번호
	int kor;			// 학생의 국어점수
	int eng;			// 학생의 영어점수
	int math;			// 학생의 수학점수
	int sum;			// 학생의 총점
	double avg;			// 학생의 평균.
	
	Student02(int num, int kor, int eng, int math){
		stdNum = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	void calcSum(){ //총점을 구하는 메서드
		this.sum = this.kor+this.eng+this.math;
	}
	void calcAvg(){ //평균을 구하는 메서드
		this.avg = (int)(this.sum /3.0 * 100) /100.;
		
	}
	void showScore(){
		System.out.println(this.stdNum+"번 현재 점수> 국어 : "+this.kor+" 영어 : "+this.eng
				+" 수학 : "+this.math+" 총점 : "+this.sum + " 평균 : " + this.avg);
	}
	

}

public class Ex07Student {
	static String data = "stdNum|kor|ent|math|sum|avg";
	static int tempStuNum, tempKor, tempEng, tempMath;

	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.util.StringTokenizer token = null;
		token = new java.util.StringTokenizer(data,"\\|"); //6개의 토큰이 나와.
//		System.out.println("token cnt "+token.countTokens());
		String studentData[] = new String[6];
		int cnt=0;
		//토큰이 더 있으면. true 더 없으면 false.
		while(token.hasMoreTokens()){
			studentData[cnt++] = token.nextToken();//studentData[0] = stdNum;
		}
		//1명을 입력받을 때 
		setStuNum();
		setScore(tempStuNum);
		Student02 student = new Student02(tempStuNum,tempKor,tempEng,tempMath);
		student.calcSum();
		student.calcAvg();
		student.showScore();
		
		
	}
	static void setStuNum(){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("학생번호를 입력해주세요 > ");
		tempStuNum = sc.nextInt();
	}
	
	static void setScore(int stuNum){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print( stuNum+ "번 국어 > ");
		tempKor = sc.nextInt();
		System.out.print( stuNum+ "번 영어 > ");
		tempEng = sc.nextInt();
		System.out.print( stuNum+ "번 수학 > ");
		tempMath = sc.nextInt();
	}
	
}