package com.bit.day12;

class Student01 {
	// �Ӽ�
	int num;
	int kor, eng, math;
}

public class Ex07Object {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Student01[] data = new Student01[5];
		for (int i = 0; i < data.length; i++) {
			data[i] = new Student01();
			data[i].num = i + 1;
		}

		System.out.println("-----------------------------------------------");
		System.out.println("�л������������α׷�(ver 0.1.0)");
		System.out.println("-----------------------------------------------");
		int input=0;
		int cnt=0;

		while (true) {
			System.out.print("1.���� 2.�Է� 0.����>");
			input = sc.nextInt();
			if(input==0){break;}
			if(input==1){
				System.out.println("�й�	����	����	����	�հ�	���");
				System.out.println("-----------------------------------------------");
				for(int i=0; i<data.length; i++){
					Student01 student = data[i];
					System.out.println(student.num+"\t"+student.kor+"\t"+student.eng+"\t"+student.math);
				}
			}else if(input==2){
				if(cnt<data.length){
				Student01 student = data[cnt];
				System.out.print(cnt+1+"�� ����>");
				student.kor=sc.nextInt();
				System.out.print(cnt+1+"�� ����>");
				student.eng=sc.nextInt();
				System.out.print(cnt+1+"�� ����>");
				student.math=sc.nextInt();
				cnt++;
				}
			}
		}
		
		System.out.println("�̿����ּż� �����մϴ�.");
	}

}
