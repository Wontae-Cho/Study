package com.bit.day10;

/*
����Ŭ����(���� - ����)
�Ϲ������� ����ϴ� �ڷ����� �ձ��ڸ� �빮�ڷ� �ٲٸ� ����Ŭ������ �ȴ�.
���� �ڷ���(int double ��)�� ��ü�� �ѷ��μ� ����.
int - java.lang.Integer
���䷦�� == ��ü�� �ѷ��Ҷ�.
���� == ��ü �ȿ� �ִ� �ڷ����� �ʿ��ؼ� ������ ����.
����� ��)
1. �־��� ����� �ʿ��� ��
2. �ʵ尪�� ���� �ʿ��� ��
3. ��ü�� �ʿ��� ��



*/

public class Ex01{

  public static void main(String[] args){
	Integer su1 = new Integer(100); //��Ʈ�� ����Ŭ������ ����. �����ڿ� ���ڸ� ���� ��.
	Integer su2 = new Integer("1000"); //�����ڿ� ���ڿ� "1000"�� ���� ������
					//���ڿ��� ���ڸ� �־��൵ ���ڷ� �޾Ƽ� ���갡��.
					//������ ���ڿ��� ��� ���ڷθ� �����Ǿ����.

	//Integer su3 = new Inteher(); //�����ڿ� ���ڸ� �������� ���� �� ������ ���� �߻�.

	System.out.println(su2+1);
	System.out.println(Integer.MAX_VALUE); //����ƽ�̱⿡ Ŭ������.�ʵ� //��Ʈ�� �ִ밪
	System.out.println(Integer.MIN_VALUE); //��Ʈ�� �ּҰ�.
	System.out.println(Integer.SIZE);	//��Ʈ�� �޸𸮸� �󸶳� ����ϴ���.


	int su3 = su2.intValue(); // ��Ʈ������ �����ȯ. non-static �̱⿡ (����������.intValue)
	System.out.println(su3); 
	long su4 = su2.longValue(); //su2�� ���� long���� ��ȯ�޾Ƽ� su4�� �����϶�.
	System.out.println(su4);
	byte su5 = su2.byteValue(); //su2�� ���� byte�� ��ȯ�޾Ƽ� su5�� �����϶�. byte : -128 ~ 127
	System.out.println(su5);
	int su6 = Integer.compare(110,100); //x��y���� ũ�� 1, ������ -1
		//Integer.compare(x,y) x�� y�� ���ؼ� �� ���̸� ��ȯ�ض�.
	System.out.println(su6);
	int su7 = su2.compareTo(su1);
	System.out.println(su7);
	boolean result = su2.equals(su1); //su2�� su1�� ������?
	System.out.println(result); //true or false
	//�ſ� ���־���.
	int su8 = Integer.parseInt("1234"); //���ڿ��� ���ڷι޴´�. ���� �����ڿ� ������ ����.
	System.out.println(su8+1);
	System.out.println(su2.toString()+1); //integer��ü�� ���ڿ��� .
	Integer su9 = Integer.valueOf(1234); //�⺻�ڷ����� ��Ƽ���� �ٲ���.
	System.out.println(su9.toString());
	Integer su10 = su1+su2;
	System.out.println(su1+su2); //��ü(�ּҰ�) + ��ü(�ּҰ�) = ????
	System.out.println(su10); 
	Integer su11 = 9999;
	System.out.println(su11);
	

  }


}