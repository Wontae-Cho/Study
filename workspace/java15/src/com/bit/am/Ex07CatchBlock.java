package com.bit.am;

//Object �ֻ���.
//Throwable ������.
//Exception //������ ����ó���� ���,�޼ҵ� ���� ��� ��.
//RuntimeException
//ArithmeticException
//ArithmeticException < RuntimeException < Exception ����� ����.

//}catch(Exception e){	// �ѹ��� ��Ƴ� �� ����.
// ������ ������ ���� ������ �� �� ����.
// ���α׷��Ӱ� �ǵ�ġ ���� ������ �߻���ų �� �ִ�.
// ������ � ������ �߻��ϰ� �װͿ� �´� �����ս��� �ֱ� ���ؼ� ����� �����ϴ� ���� ����.
// ��, Exception�� �����ڵ���� �� ���������ͼ� 
//			if���� else, switch���� default�� ���� ����� ������ �� �ִ�. 

public class Ex07CatchBlock {

	public static void main(String[] args) {
		for (int i = -4; i < 5; i++) {
			try {
				int a = 5 / i;
				System.out.println("��������" + i);
			} catch (Exception er) {
//				 System.out.println(er.getMessage()); //������ Ÿ��Ʋ��, ��ĢO = �����κ�
						
//				System.out.println(er.toString()); // ������ ������ ª��, ��ĢO = �����κ�
			// ��Ģ�� �ִ� ��� �� ��Ȳ���� ������ �ؾ��ϱ� ������ ������ ���� �� ����.
			// ������ ��κп��� ������� Ȯ���ϱ� ���� ���� ���� �޼������ �� ȿ����
				 er.printStackTrace(); 
			 //������ ������ ���ϰ�, ����� ��������.
			 //����� ������ �����ΰ����� ���� ��Ģ�� ����.
			 //���α׷��� ������ ���� ������ ���� �� ������ ����ϱ� ������ �����ս��� ����.
  			 //���� ��������� ���� ���� �̿��ϴ� ���� ����.
			}
		}

	}

}
