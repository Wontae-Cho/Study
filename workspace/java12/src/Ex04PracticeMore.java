

public class Ex04PracticeMore {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int menu = 0;
		int stuNum = 0; //조작하고 싶은 학생의 번호.
		Student[] stu = new Student[5];
		stu[0] = new Student(1);
		stu[1] = new Student(2);
		stu[2] = new Student(3);
		stu[3] = new Student(4);
		stu[4] = new Student(5);
		System.out.println("-----------------------------------------------");
		System.out.println("학생성적관리프로그램(ver 0.1.0)");
		System.out.println("-----------------------------------------------");
		// 기능선택.
		while (true) {
			String msg = "";
			System.out.print("1.전체보기 2.입력 (3.수정 4.삭제) 0.종료 > ");
			msg = sc.nextLine();
			menu = Integer.parseInt(msg);
			System.out.println("-----------------------------------------------");
			System.out.println("1.전체보기 2.입력 (3.수정 4.삭제) 0.종료> " + msg);
			if (menu == 1) {
				System.out.println("학번	국어	영어	수학	합계	평균");
				System.out.println("-----------------------------------------------");
				for (int j = 0; j < stu.length; j++) {
					System.out.println(stu[j].num + "\t" + stu[j].kor + "\t"
							+ stu[j].eng + "\t" + stu[j].math + "\t"
							+ stu[j].sum + "\t" + stu[j].avg);
				}
				//입력
			} else if (menu == 2) {
				if (stuNum > 4) {
					System.out.println("더 이상 입력할 수 없습니다.");
					continue;
				}
				System.out.print(stu[stuNum].num + "번 학생의 점수를 입력해주세요 ");
				System.out.println();
				stu[stuNum].setScore();
				stu[stuNum].calcSum();
				stu[stuNum].calcAvg();
				stuNum++;
				//종료
			} else if (menu == 0) {
				System.out.println("이용해주셔서 감사합니다.");
				return;
				//수정
			} else if (menu == 3) {
				System.out.print("수정하고 싶은 학생의 번호를 입력해주세요> ");
				stuNum = sc.nextInt()-1;
				stu[stuNum].showScore();
				System.out.println("점수를 다시 입력해주세요");
				stu[stuNum].setScore();
				stu[stuNum].calcSum();
				stu[stuNum].calcAvg();
				//삭제
			} else if (menu == 4) {
				System.out.print("삭제하고 싶은 학생의 번호를 입력해주세요> ");
				stuNum = sc.nextInt()-1;
				stu[stuNum].delData();
				stu[stuNum].showScore();
				//예외
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}
		}

		// System.out.println(Student.num + Student.kor + Student.eng +
		// Student.math);

	}

}

class Student { // 생성할 때, 입력한 값이 들어가도록.
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int num = 0; //학번
	int kor = 0, eng =0, math =0; //각 과목의 점수.
	int sum; //과목들의 합계점수.
	double avg; //합의 평균.

	Student(int a) {
		this.num = a;
	}

	void setScore(){
		System.out.print(num + "번 국어 : ");
		this.kor = sc.nextInt();
		System.out.print(num + "번 영어 : ");
		this.eng = sc.nextInt();
		System.out.print(num + "번 수학 : ");
		this.math = sc.nextInt();
	}
	void calcSum(){
		this.sum = this.kor+this.eng+this.math;
	}
	void calcAvg(){
		this.avg = (int)(this.sum /3.0 * 100) /100.;
		
	}
	
	void showScore(){
		System.out.println(this.num+"번 현재 점수> 국어 : "+this.kor+" 영어 : "+this.eng+" 수학 : "+this.math);
	}
	
	void delData(){
		this.kor = 0;
		this.eng = 0;
		this.math = 0;
		this.sum = 0;
		this.avg = 0;
		
	}
}
