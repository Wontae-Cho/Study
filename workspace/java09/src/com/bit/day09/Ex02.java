package com.bit.day09;

public class Ex02{

  public static void main(String[] args){
	String msg1 = "ja";
	String msg2 = "va";

	System.out.println(msg1 + msg2);
	System.out.println("---------------------------------------");

	//문자열.concat(문자열) //문자열 + 문자열의 결과.
	String msg3=msg1.concat(msg2);

	System.out.println(msg3);

	System.out.println("---------------------------------------");
	//문자열.length() = 문자열의 길이.
	System.out.println("msg3 length :" +msg3.length());
	
	System.out.println("---------------------------------------");
	//문자열.isEmpty() = 문자열이 비어있는지 값이 들어있는지 확인. true or false값
	// 비어있으면 true 들어있으면 false
	String msg4= " ";
	System.out.println(msg4.length()==0);
	System.out.println(msg4.isEmpty());
	
	System.out.println("---------------------------------------");
	String msg5 = "abcdefg"; //0 ~ length-1
	//문자열.charAt(int length-1); // n-1번째의 데이터값을 알 수 있다.
	/*
	System.out.println(msg5.charAt(1));
	for(int i = 0; i<=msg5.length(); i++){
		System.out.println(msg5.charAt(i));
	}
	*/
	
	//문자열.codePoint(); api참고.
	System.out.println("---------------------------------------");
	//문자열.toCharArray(); 문자열의 각각을 char로 받음
	char[] chs = msg5.toCharArray();
	for(int i = 0; i<chs.length; i++){
		System.out.println(chs[i]);
	}
	System.out.println("---------------------------------------");
	//String.valueOf(); 괄호안의 값을 스트링으로 바꿔줌.
	String msg6=String.valueOf(chs);
	System.out.println(msg6);

	System.out.println("---------------------------------------");
	
	//문자열.getBytes(); // 각각의 문자를 숫자로 표현할 때.
	System.out.println("---------------------------------------");
	msg5 = "abc";
	System.out.println("msg5 = "+msg5);
	System.out.println("---------------------------------------");
	byte[] bys=msg5.getBytes();
	for(int i=0; i<bys.length; i++){
		System.out.println(bys[i]); //char는 2바이트 이를 따로따로 떼어내기 때문에.
					//단 바이트의 표현범위를 벗어나면 음수로표현되며 한개의 문자가 2개의 숫자로 표현될 수 있다.
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