package com.bit.day07;

/*
Ŭ������ �������
1. �޼ҵ�(static, non-static)
2. ����(static, non-static)
3.
*/

public class Ex01{
  static int num;

  public static void main(String[] args){
	System.out.println("Ex01 class");
  }

}	//classEx01 end

//�ѹ����� �ϳ��� Ŭ������ ���� �ʿ�� ����.
//������ �̸��� Ŭ���� ������ ���ƾ� �ϴ� �͵� �ƴ�(������ ������ �ؾ��Ѵ�.)
//publicŬ������ �� ������ �ִ� �ϳ��� ������ �� �ִ�.
//�� ���������� ��Ŭ�������� ����ϱ� ���� Ŭ������ �� ���� �� �ֳ� ������ ���(��������X)
// ���� public�� �ٽ� �������� �س���.

class Ex02{	//public�� Ŭ���� �տ� ���� �� ����.

  static int num;
  
  public static void main(String[] args){
	System.out.println("Ex02 class");
  }
}	//classEx02 end