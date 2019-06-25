package com.bit.day10;

public class Ex07{

  public static void main(String[] args){
	System.out.println("--------------------------------------------");
	String str1 = "Java Web Spring";
	int cnt1 = 0;
	char[] ch1 = str1.toCharArray();
	for(int i=0 ; i<ch1.length; i++){
		if(Character.isUpperCase(ch1[i])){
			cnt1++;
		}
	}
	System.out.println("대문자의 갯수는 : " +cnt1+"개 입니다");

	System.out.println("--------------------------------------------");
	/*
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("숫자3개를 입력해주세요");
	String[] input = {sc.nextLine(),sc.nextLine(),sc.nextLine()};
	char[] ch2 = input.toCharArray();
	for(int i=0; i<3; i++){
		if(Character.isAlphabetic(ch2[i])){
			continue;
		}else if(Character.isWhitespace(ch2[i])){
			continue;
		}else{
			//Character.parseString(ch2[i]);
		}
	}
	*/

  }


}