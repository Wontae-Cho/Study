package com.bit.day10;

public class Ex03{


   public static void main(String[] args){
	System.out.println("-------------------"+"Byte"+"--------------------");
	byte a0 = 10;
	Byte a1 = new Byte(a0); //������ ���ڷ� ����. ��, ���ڴ� ����Ʈ��.
	//Byte a1 = new Byte(10);//���� �׳� ���ڷ� �־��� ���� ��������ȯ�� ���� �ʿ䰡 ����.
	Byte a2 = new Byte("-20"); //������ ���ڷ� ���ڿ�.
	//�ʵ�
	System.out.println(Byte.MIN_VALUE); //byte�� ���� �� �ִ� �ּҰ�
	System.out.println(Byte.MAX_VALUE); //byte�� ���� �� �ִ� �ִ밪
	System.out.println(Byte.SIZE);	//8��Ʈ = 1����Ʈ
	//�޼ҵ�
	byte a3 = Byte.parseByte("127"); //byte�� ������ ����� �������.
	System.out.println(a3);

	System.out.println("------------------"+"Short"+"---------------------");

	short b0 = 100;
	Short b1 = new Short(b0);
	Short b2 = new Short("200");
	//�ʵ�
	System.out.println(Short.MIN_VALUE); //Short�� ���� �� �ִ� �ּҰ�
	System.out.println(Short.MAX_VALUE); //Short�� ���� �� �ִ� �ִ밪
	System.out.println(Short.SIZE); //16��Ʈ = 2����Ʈ
	//�޼ҵ�
	short b3 = Short.parseShort("1234"); //���������� short�� ������ ����� �������
	System.out.println(b3);

	System.out.println("------------------"+"Long"+"---------------------");

	Long c0 = new Long(1000); //���� �ٸ��� �ڵ�����ȯ�� �Ͼ.
	Long c1 = new Long(1000L);
	Long c2 = new Long("2000"); //���ڿ��� L�� �־ ��Ÿ���̶����� �˸��� �����Ͽ����߻�.
	long c3 = Long.parseLong("3000");
	System.out.println(c3);

   }


}