package com.bit.day10;

public class Ex02{

  public static void main(String[] args){
	int su1 = 16; //int 자체가 10진수 정수.

	//Integer.toBinaryString() - 10진수를 2진수로. 리턴타입은 String
	//Integer.toOctalString() -  10진수를 8진수로. 리턴타입은 String
	//Integer.toHexString() -  10진수를 16진수로. 리턴타입은 String

	System.out.println("2진수 : "+Integer.toBinaryString(su1));
	System.out.println("8진수 : "+Integer.toOctalString(su1));
	System.out.println("10진수 : "+su1);
	System.out.println("16진수 : "+Integer.toHexString(su1));


  }



}