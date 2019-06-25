package com.bit.day11;

public class Ex14String {

	public static void main(String[] args) {
		// String
		String msg0 = null;
		String msg1 = "abc";
		System.out.println(msg1+"1234");
		String msg2 = new String(); //String msg2 = "";
		//스트링은 참조변수이기때문에 null로 출력될 수 있다.
		System.out.println(msg2+"1234");
		String msg3=new String("abc");
		System.out.println(msg3);
		
		char[] ch1 = new char[]{'A','B','C'};
		char[] ch2 = {'A','B','C'};
		String msg4 = new String(new char[]{'A','B','C'});
		String msg5 = new String(ch2);
//		String msg4 = new String({'A','B','C'});//불가
		System.out.println(msg4);
		System.out.println("msg4 length : "+msg4.length());
		String msg6 = "abcd efg";
		for(int i = 0; i<msg6.length(); i++){
			char temp = msg6.charAt(i);
			//System.out.println(temp);
		}
		char[] ch3=new char[msg6.length()];
		for(int i=0; i<ch3.length; i++){
			ch3[i]=msg6.charAt(i);
		}
		char[] ch4 = msg6.toCharArray();
//		char[] ch5 = myCharArray(msg5);
		String msg7=new String(ch4);
//		String msg8=new String(ch5);
		System.out.println(msg7);
		char ch6=msg6.charAt(2);
		System.out.println(ch6);
		char ch7=myAt(msg6,2);
		System.out.println(ch7);
	}
	public static char myAt(String msg, int idx){
		char[] ch = msg.toCharArray();
		return ch[idx];
	}
	
//	public static char[] myCharArray(String msg){
//		char[] ch3=new char[msg.length()];
//		for(int i=0; i<ch3.length; i++){
//			ch3[i]=msg.charAt(i);
//		}
//		
//	}

}
