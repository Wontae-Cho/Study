package com.bit.day09;

public class Ex02{

  public static void main(String[] args){
	String msg1 = "ja";
	String msg2 = "va";

	System.out.println(msg1 + msg2);
	System.out.println("---------------------------------------");

	//���ڿ�.concat(���ڿ�) //���ڿ� + ���ڿ��� ���.
	String msg3=msg1.concat(msg2);

	System.out.println(msg3);

	System.out.println("---------------------------------------");
	//���ڿ�.length() = ���ڿ��� ����.
	System.out.println("msg3 length :" +msg3.length());
	
	System.out.println("---------------------------------------");
	//���ڿ�.isEmpty() = ���ڿ��� ����ִ��� ���� ����ִ��� Ȯ��. true or false��
	// ��������� true ��������� false
	String msg4= " ";
	System.out.println(msg4.length()==0);
	System.out.println(msg4.isEmpty());
	
	System.out.println("---------------------------------------");
	String msg5 = "abcdefg"; //0 ~ length-1
	//���ڿ�.charAt(int length-1); // n-1��°�� �����Ͱ��� �� �� �ִ�.
	/*
	System.out.println(msg5.charAt(1));
	for(int i = 0; i<=msg5.length(); i++){
		System.out.println(msg5.charAt(i));
	}
	*/
	
	//���ڿ�.codePoint(); api����.
	System.out.println("---------------------------------------");
	//���ڿ�.toCharArray(); ���ڿ��� ������ char�� ����
	char[] chs = msg5.toCharArray();
	for(int i = 0; i<chs.length; i++){
		System.out.println(chs[i]);
	}
	System.out.println("---------------------------------------");
	//String.valueOf(); ��ȣ���� ���� ��Ʈ������ �ٲ���.
	String msg6=String.valueOf(chs);
	System.out.println(msg6);

	System.out.println("---------------------------------------");
	
	//���ڿ�.getBytes(); // ������ ���ڸ� ���ڷ� ǥ���� ��.
	System.out.println("---------------------------------------");
	msg5 = "abc";
	System.out.println("msg5 = "+msg5);
	System.out.println("---------------------------------------");
	byte[] bys=msg5.getBytes();
	for(int i=0; i<bys.length; i++){
		System.out.println(bys[i]); //char�� 2����Ʈ �̸� ���ε��� ����� ������.
					//�� ����Ʈ�� ǥ�������� ����� ������ǥ���Ǹ� �Ѱ��� ���ڰ� 2���� ���ڷ� ǥ���� �� �ִ�.
	}
	System.out.println("---------------------------------------");
	String msg7=new String(bys);

	char[] chs2=new char[bys.length];
	for(int i=0;i<chs2.length;i++){
		chs2[i]=(char)bys[i];
	}
	String msg8=String.valueOf(chs2);

	String msg9="";

	for(int i = 0; i<bys.length; i++){
		msg9+=String.valueOf((char)bys[i]);
	}	

	System.out.println(msg7);
	System.out.println(msg8);
	System.out.println(msg9);



  }



}