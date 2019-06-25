

public class Ex04PracticeMore {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int menu = 0;
		int stuNum = 0; //�����ϰ� ���� �л��� ��ȣ.
		Student[] stu = new Student[5];
		stu[0] = new Student(1);
		stu[1] = new Student(2);
		stu[2] = new Student(3);
		stu[3] = new Student(4);
		stu[4] = new Student(5);
		System.out.println("-----------------------------------------------");
		System.out.println("�л������������α׷�(ver 0.1.0)");
		System.out.println("-----------------------------------------------");
		// ��ɼ���.
		while (true) {
			String msg = "";
			System.out.print("1.��ü���� 2.�Է� (3.���� 4.����) 0.���� > ");
			msg = sc.nextLine();
			menu = Integer.parseInt(msg);
			System.out.println("-----------------------------------------------");
			System.out.println("1.��ü���� 2.�Է� (3.���� 4.����) 0.����> " + msg);
			if (menu == 1) {
				System.out.println("�й�	����	����	����	�հ�	���");
				System.out.println("-----------------------------------------------");
				for (int j = 0; j < stu.length; j++) {
					System.out.println(stu[j].num + "\t" + stu[j].kor + "\t"
							+ stu[j].eng + "\t" + stu[j].math + "\t"
							+ stu[j].sum + "\t" + stu[j].avg);
				}
				//�Է�
			} else if (menu == 2) {
				if (stuNum > 4) {
					System.out.println("�� �̻� �Է��� �� �����ϴ�.");
					continue;
				}
				System.out.print(stu[stuNum].num + "�� �л��� ������ �Է����ּ��� ");
				System.out.println();
				stu[stuNum].setScore();
				stu[stuNum].calcSum();
				stu[stuNum].calcAvg();
				stuNum++;
				//����
			} else if (menu == 0) {
				System.out.println("�̿����ּż� �����մϴ�.");
				return;
				//����
			} else if (menu == 3) {
				System.out.print("�����ϰ� ���� �л��� ��ȣ�� �Է����ּ���> ");
				stuNum = sc.nextInt()-1;
				stu[stuNum].showScore();
				System.out.println("������ �ٽ� �Է����ּ���");
				stu[stuNum].setScore();
				stu[stuNum].calcSum();
				stu[stuNum].calcAvg();
				//����
			} else if (menu == 4) {
				System.out.print("�����ϰ� ���� �л��� ��ȣ�� �Է����ּ���> ");
				stuNum = sc.nextInt()-1;
				stu[stuNum].delData();
				stu[stuNum].showScore();
				//����
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				continue;
			}
		}

		// System.out.println(Student.num + Student.kor + Student.eng +
		// Student.math);

	}

}

class Student { // ������ ��, �Է��� ���� ������.
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int num = 0; //�й�
	int kor = 0, eng =0, math =0; //�� ������ ����.
	int sum; //������� �հ�����.
	double avg; //���� ���.

	Student(int a) {
		this.num = a;
	}

	void setScore(){
		System.out.print(num + "�� ���� : ");
		this.kor = sc.nextInt();
		System.out.print(num + "�� ���� : ");
		this.eng = sc.nextInt();
		System.out.print(num + "�� ���� : ");
		this.math = sc.nextInt();
	}
	void calcSum(){
		this.sum = this.kor+this.eng+this.math;
	}
	void calcAvg(){
		this.avg = (int)(this.sum /3.0 * 100) /100.;
		
	}
	
	void showScore(){
		System.out.println(this.num+"�� ���� ����> ���� : "+this.kor+" ���� : "+this.eng+" ���� : "+this.math);
	}
	
	void delData(){
		this.kor = 0;
		this.eng = 0;
		this.math = 0;
		this.sum = 0;
		this.avg = 0;
		
	}
}
