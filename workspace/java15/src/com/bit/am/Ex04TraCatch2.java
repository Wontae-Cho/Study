package com.bit.am;
import java.util.Scanner;

public class Ex04TraCatch2 {

	public static void main(String[] args) {
		
		int input = 0;
		System.out.println("creat new Scanner");
		Scanner sc = new Scanner(System.in);
		
		//정상적인 상황에서는 기존의 객체를 사용할것.
		for(int i=0; i<5; i++){
			System.out.print("반드시 숫자를 입력해주세요>");
			try{
			input = sc.nextInt();
			}catch(java.util.InputMismatchException er){
				System.out.println("creat new Scanner");
				sc=new Scanner(System.in); //에러의 상황이 발생시 새로운객체를 만들어줌.
										//고장난 객체를 버리는 것과 같음.
			}
			System.out.println("input=" +input);
		}
		
	}

}
