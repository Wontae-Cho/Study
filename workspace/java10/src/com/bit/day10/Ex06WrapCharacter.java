package com.bit.day10;

public class Ex06WrapCharacter{

  public static void main(String[] args){
	System.out.println("------------------"+"Character"+"---------------------");
	char ch1 = 'A';
	//������ . �� �ϳ�.
	Character ch2 = new Character('B');
	char ch3 = 'C'; //���䷦��

	//�ʵ�
	System.out.println("min : "+(int)Character.MIN_VALUE); //��Ʈ�� ������ ���� �ʾ�. ǥ��X
				//������ ǥ�Ͻñ� ���� ��Ʈ ĳ����
	System.out.println("max : "+(int)Character.MAX_VALUE); //��Ʈ�� ������ ���� �ʾ�. ǥ��X 
				//������ ǥ�Ͻñ� ���� ��Ʈ ĳ����
	System.out.println("size : "+Character.SIZE); //16��Ʈ = 2����Ʈ

	// �����ڵ����� 
	System.out.println(Character.isDefined('@')); //�ڹٴ� �����ڵ��̱� ������ true ��µ�
	// �������� �ƴ���
	System.out.println("�������� �ƴ���");
	System.out.println(Character.isLetter(ch1)); 
	System.out.println(Character.isAlphabetic(ch1)); //����
	// �������� �ƴ���
	System.out.println("�������� �ƴ���");
	System.out.println(Character.isDigit(ch1));
	// �빮������ �ҹ�������
	System.out.println("�빮������ �ҹ�������");
	System.out.println("�빮�� : "+Character.isUpperCase(ch1));
	System.out.println("�ҹ��� : "+Character.isLowerCase(ch1));
	// ����
	System.out.println("��������");
	System.out.println(Character.isSpace(ch1));
	System.out.println(Character.isWhitespace(ch1)); //����

  }



}