package com.bit.day13;

class Student02{ //�л��� �Ӽ�.
	final int stdNum; 	// �л��� ��ȣ
	int kor;			// �л��� ��������
	int eng;			// �л��� ��������
	int math;			// �л��� ��������
	int sum;			// �л��� ����
	double avg;			// �л��� ���.
	
	Student02(int num, int kor, int eng, int math){
		stdNum = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	void calcSum(){ //������ ���ϴ� �޼���
		this.sum = this.kor+this.eng+this.math;
	}
	void calcAvg(){ //����� ���ϴ� �޼���
		this.avg = (int)(this.sum /3.0 * 100) /100.;
		
	}
	void showScore(){
		System.out.println(this.stdNum+"�� ���� ����> ���� : "+this.kor+" ���� : "+this.eng
				+" ���� : "+this.math+" ���� : "+this.sum + " ��� : " + this.avg);
	}
	

}

public class Ex07Student {
	static String data = "stdNum|kor|ent|math|sum|avg";
	static int tempStuNum, tempKor, tempEng, tempMath;

	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.util.StringTokenizer token = null;
		token = new java.util.StringTokenizer(data,"\\|"); //6���� ��ū�� ����.
//		System.out.println("token cnt "+token.countTokens());
		String studentData[] = new String[6];
		int cnt=0;
		//��ū�� �� ������. true �� ������ false.
		while(token.hasMoreTokens()){
			studentData[cnt++] = token.nextToken();//studentData[0] = stdNum;
		}
		//1���� �Է¹��� �� 
		setStuNum();
		setScore(tempStuNum);
		Student02 student = new Student02(tempStuNum,tempKor,tempEng,tempMath);
		student.calcSum();
		student.calcAvg();
		student.showScore();
		
		
	}
	static void setStuNum(){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("�л���ȣ�� �Է����ּ��� > ");
		tempStuNum = sc.nextInt();
	}
	
	static void setScore(int stuNum){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print( stuNum+ "�� ���� > ");
		tempKor = sc.nextInt();
		System.out.print( stuNum+ "�� ���� > ");
		tempEng = sc.nextInt();
		System.out.print( stuNum+ "�� ���� > ");
		tempMath = sc.nextInt();
	}
	
}