package com.bit.day08;

public class Ex04{
  final int su;
  //final static int su = 1234; //���������� ����
  //final static int su; //����Ʈ ���� ������ �ֱ⶧���� �����߻�.
  
  public Ex04(){su=1111;} //��ü���������� su�� 1111�� �ʱ�ȭ�ؼ� ����.
  public Ex04(int a){su=a;} //��ü�� ���� �� ���� �ٸ� ����� ������ ����.

  public static void main(String[] args){
	
	final char CH='A'; 
	// ����� ����
	// �̸��� �빮�ڷθ� ������
	//final�� ������ ������ų �� �ִ�.
	//ch�� ���� 'A'�� ���

	//ch='B';

	System.out.println("ch="+CH);
	//su=4321; su�� final�� ����Ǿ��⿡ �����߻�.
	//System.out.println("class su="+su);

  }

}