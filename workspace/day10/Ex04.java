package com.bit.day10;

public class Ex04{


  public static void main(String[] args){
	System.out.println("------------------"+"Double"+"---------------------");
	//������
	double a1 = 3.14;
	Double a2 = new Double(3.14);
	Double a3 = new Double("3.14");
	Double a4 = 3.14; //���䷦��.
	//float�� ������ ���ڷ� ���� �� �ִ�.
	//�ʵ� - java api���� java.lang.Double
	System.out.println("min : "+Double.MIN_VALUE); //double�� ���� �� �ִ� �ּҰ�(e���Ĵ� 10�� ����)
	System.out.println("max : "+Double.MAX_VALUE); //double�� ���� �� �ִ� �ִ밪(e���Ĵ� 10�� ����)
	System.out.println("size : "+Double.SIZE); // double�� ������. 64��Ʈ = 8����Ʈ

	Double a5 = 5.0/0;
	Double a6 = 0.0/0;
	System.out.println(a5+" 5/0 Infinite : "+a5.isInfinite()); //�����̳�? ���� 
	System.out.println(a5+" 5/0 NaN : "+a5.isNaN()); //Not a Number ���ڰ� �ƴϳ� ? ����
	System.out.println("0/0 Infinite : "+a6.isInfinite()); //�����̳�? ����
	System.out.println("0/0 NaN : "+a6.isNaN()); //���ڰ� �ƴϳ�? ����
  }



}