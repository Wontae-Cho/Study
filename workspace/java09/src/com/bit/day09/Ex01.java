package com.bit.day09;

public class Ex01{

  public static void main(String[] args){
	java.lang.String msg1="java"; //����String��ü ���.
	String msg2="java"; 		//����String��ü ���.
	String msg3 = new String("java"); //�ڹٿ��� �⺻ ��ü�� �ƴ� �ٸ� ��ü�� ������.
	String msg4 = args[0];
	//�Է¹��� ���ڿ��� �������� �𸣱� ������ ���ο� ��ü�� ����� �����. ���� flase��.
	String msg5 = "java";		//����String��ü ���.
	//��ü�� ������ ����� �����ִ� ���� ���� �� �� ����.

	System.out.println("msg1 : "+msg1);
	System.out.println("msg2 : "+msg2);
	System.out.println("msg3 : "+msg3);
	System.out.println("msg4 : "+msg4);
	System.out.println("msg5 : "+msg5);
	System.out.println(msg1==msg2); // ����� : true //msg1�� msg2�� ��ü.
	System.out.println(msg1==msg3); // ��ü������ (==) �� ���������� ���ϴ� �����.
	System.out.println(msg1==msg4); 
	System.out.println(msg3==msg4);
	System.out.println(msg1==msg5);
	// ����� : false //�ٸ� ���������� ������ �ִ� ��ü���� ���̱� ������ false.
	//���ݱ��� �Ѱ��� ������� �񱳰� �ƴ� ���������� �񱳿���. ���� ������� ���Ƶ� false�� ��µǴ� ��.
	System.out.println("---------------------------------------------------------------");
	System.out.println(msg1.equals(msg2)); // (msg1.equals(msg2));
	System.out.println(msg1.equals(msg3)); // ������� ��.
	System.out.println(msg1.equals(msg4)); // if�������� ���ڿ��� ��� ���������� ��. ���� ���ϴ� ����� �ƴ� �� ����.
	System.out.println(msg3.equals(msg5)); // switch�������� ������쿡 ������� ����.
	System.out.println(msg1.equals(msg5)); // ���ڿ��񱳴� �ʼ������� .equals()�� ���.
	System.out.println("---------------------------------------------------------------");
	System.out.println(msg1=="java");
	System.out.println(msg1=="ja"+"va"); // true
	String ja = "ja"; // ��ü�� �ּҸ� ����
	String va = "va"; // ��ü�� �ּҸ� ����
	System.out.println(msg1==ja+va); // false // �ּ� + �ּҸ� ���ļ� �ϳ��� �ּҰ� �� �� ����. ���� false.
	//�������� �������� ���帹�� ����ϰ� �Ǵ� ���� ���ڿ��� ����. ���� �� �˾Ƶ־��Ѵ�.




  }


}