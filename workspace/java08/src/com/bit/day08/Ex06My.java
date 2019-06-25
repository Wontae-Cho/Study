package com.bit.day08;

public class Ex06My{
	static int balance = 0; //예금잔액

  public static int deposit(java.util.Scanner sc){ //입금. 기능
	//java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("입금액>");
	return sc.nextInt();

  }

  public static int withdraw(java.util.Scanner sc){ //출금. 기능
	//java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("인출액>");
	return sc.nextInt();
  }


  public static void main(String[] args){
	int plus = 0;
	int minus = 0;
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("-------------------------------");
	System.out.println("비트은행 DC기기");
	System.out.println("-------------------------------");
	int choice = 0;
	Ex06My me = new Ex06My();
	while(true){
		System.out.print("1.입금 2.출금 3.잔액보기 0.종료>");
		choice = sc.nextInt();
		if(choice==1){//입금기능

			me.balance += me.deposit(sc);

		}else if(choice==2){//출금기능

			me.balance -= me.withdraw(sc);

		}else if(choice==3){//잔액보기
			System.out.println("잔액 : " + me.balance);

		}else if(choice==0){//종료
			System.out.println("이용해주셔서 감사합니다");
			break;
		}else{//그외의 숫자
			System.out.println("다시 확인하고 입력해주세요");
			continue;
		}
		
		
	}
	
  }

}