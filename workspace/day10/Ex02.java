package com.bit.day10;

public class Ex02{

  public static void main(String[] args){
	int su1 = 16; //int ��ü�� 10���� ����.

	//Integer.toBinaryString() - 10������ 2������. ����Ÿ���� String
	//Integer.toOctalString() -  10������ 8������. ����Ÿ���� String
	//Integer.toHexString() -  10������ 16������. ����Ÿ���� String

	System.out.println("2���� : "+Integer.toBinaryString(su1));
	System.out.println("8���� : "+Integer.toOctalString(su1));
	System.out.println("10���� : "+su1);
	System.out.println("16���� : "+Integer.toHexString(su1));


  }



}