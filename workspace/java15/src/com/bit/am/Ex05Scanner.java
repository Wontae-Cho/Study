package com.bit.am;
import java.util.Scanner;

public class Ex05Scanner {

	public static void main(String[] args) {
//		Scanner sc1 = new Scanner(System.in); // ���ڿ�
//		Scanner sc2 = new Scanner(System.in); // ���ڿ�
//		input1=sc1.nextInt(); //���ڰ� �ƴҽ� ����.
//		input2=sc2.nextLine(); //���ڸ� �Է��ص� ���ڿ��� �ޱ� ������ �����߻�X
		//���ε����Ұ�� �ʿ���� �ڵ尡 ���� ����� ������ �Ȱ��� �߻��� �� ����.
		
		Scanner sc = new Scanner(System.in); //��ĳ�ʴ� �ϳ���.
		int input1=0;
		String input2=null;
		System.out.print("���ڸ� �Է��ϼ���>");
		input2=sc.nextLine(); //�����߻��� ���� �� �ֵ��� ���ڿ��� ����.
		try{
			input1=Integer.parseInt(input2); //���� ���ڿ��� ���ڷ� �ٲٰ� 
		}catch(NumberFormatException e){	// �� ��Ȳ������ ����ó��.
			
		}
		
		System.out.print("���ڸ� �Է��ϼ���>");
		input2=sc.nextLine();
		
		System.out.print("���ڸ� �Է��ϼ���>");
		input2=sc.nextLine();
		try{
			input1=Integer.parseInt(input2);
		}catch(NumberFormatException e){
			
		}
		
		System.out.print("���ڸ� �Է��ϼ���>");
		input2=sc.nextLine();
		

	}

}
