package com.bit.am;
import java.util.Scanner;

public class Ex04TraCatch2 {

	public static void main(String[] args) {
		
		int input = 0;
		System.out.println("creat new Scanner");
		Scanner sc = new Scanner(System.in);
		
		//�������� ��Ȳ������ ������ ��ü�� ����Ұ�.
		for(int i=0; i<5; i++){
			System.out.print("�ݵ�� ���ڸ� �Է����ּ���>");
			try{
			input = sc.nextInt();
			}catch(java.util.InputMismatchException er){
				System.out.println("creat new Scanner");
				sc=new Scanner(System.in); //������ ��Ȳ�� �߻��� ���οü�� �������.
										//���峭 ��ü�� ������ �Ͱ� ����.
			}
			System.out.println("input=" +input);
		}
		
	}

}
