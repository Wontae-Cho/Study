package com.bit.am;
import java.util.Scanner;

public class Ex05Scanner {

	public static void main(String[] args) {
//		Scanner sc1 = new Scanner(System.in); // 숫자용
//		Scanner sc2 = new Scanner(System.in); // 문자용
//		input1=sc1.nextInt(); //숫자가 아닐시 에러.
//		input2=sc2.nextLine(); //숫자를 입력해도 문자열로 받기 때문에 에러발생X
		//따로따로할경우 필요없는 코드가 많이 생기고 에러도 똑같이 발생할 수 있음.
		
		Scanner sc = new Scanner(System.in); //스캐너는 하나만.
		int input1=0;
		String input2=null;
		System.out.print("숫자를 입력하세요>");
		input2=sc.nextLine(); //에러발생을 피할 수 있도록 문자열로 받음.
		try{
			input1=Integer.parseInt(input2); //받은 문자열을 숫자로 바꾸고 
		}catch(NumberFormatException e){	// 그 상황에서의 예외처리.
			
		}
		
		System.out.print("문자를 입력하세요>");
		input2=sc.nextLine();
		
		System.out.print("숫자를 입력하세요>");
		input2=sc.nextLine();
		try{
			input1=Integer.parseInt(input2);
		}catch(NumberFormatException e){
			
		}
		
		System.out.print("문자를 입력하세요>");
		input2=sc.nextLine();
		

	}

}
