package com.bit.day09;

public class Ex01{

  public static void main(String[] args){
	java.lang.String msg1="java"; //기존String객체 사용.
	String msg2="java"; 		//기존String객체 사용.
	String msg3 = new String("java"); //자바에서 기본 객체가 아닌 다른 객체를 생성함.
	String msg4 = args[0];
	//입력받을 문자열이 뭐가될지 모르기 때문에 새로운 객체를 만들고 대기함. 따라서 flase값.
	String msg5 = "java";		//기존String객체 사용.
	//객체의 재사용의 결과를 보여주는 좋은 예가 될 수 있음.

	System.out.println("msg1 : "+msg1);
	System.out.println("msg2 : "+msg2);
	System.out.println("msg3 : "+msg3);
	System.out.println("msg4 : "+msg4);
	System.out.println("msg5 : "+msg5);
	System.out.println(msg1==msg2); // 결과값 : true //msg1과 msg2는 객체.
	System.out.println(msg1==msg3); // 객체에서의 (==) 는 참조변수를 비교하는 결과임.
	System.out.println(msg1==msg4); 
	System.out.println(msg3==msg4);
	System.out.println(msg1==msg5);
	// 결과값 : false //다른 참조변수를 가지고 있는 객체와의 비교이기 때문에 false.
	//지금까지 한것은 결과값의 비교가 아닌 참조변수의 비교였다. 따라서 결과값이 같아도 false가 출력되는 것.
	System.out.println("---------------------------------------------------------------");
	System.out.println(msg1.equals(msg2)); // (msg1.equals(msg2));
	System.out.println(msg1.equals(msg3)); // 결과값의 비교.
	System.out.println(msg1.equals(msg4)); // if문에서는 문자열의 경우 참조변수를 비교. 따라서 원하는 결과가 아닐 수 있음.
	System.out.println(msg3.equals(msg5)); // switch문에서는 같은경우에 밸류값을 비교함.
	System.out.println(msg1.equals(msg5)); // 문자열비교는 필수적으로 .equals()를 사용.
	System.out.println("---------------------------------------------------------------");
	System.out.println(msg1=="java");
	System.out.println(msg1=="ja"+"va"); // true
	String ja = "ja"; // 객체의 주소를 저장
	String va = "va"; // 객체의 주소를 저장
	System.out.println(msg1==ja+va); // false // 주소 + 주소를 합쳐서 하나의 주소가 될 수 없다. 따라서 false.
	//실질적인 업무에서 가장많이 사용하게 되는 것이 문자열의 제어. 따라서 잘 알아둬야한다.




  }


}