package com.bit.day08;

public class Ex06{
	
  public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int input =0;
	int money =0;
	System.out.println("-------------------------------");
	System.out.println("비트은행DC기기");
	System.out.println("-------------------------------");
	while(true){
		System.out.print("1.입금 2.출금 3.잔액보기 0.종료>");
		input = sc.nextInt();
		if(input==1){//입금기능
			money += push(sc);

		}else if(input==2){//출금기능
			money -= pull(sc);

		}else if(input==3){//잔액보기
			show(money);

		}else if(input==0){//종료
			System.out.println("이용해주셔서 감사합니다");
			break;
		}else{//그외의 숫자
			System.out.println("다시 확인하고 입력해주세요");
			continue;
		}
		
		
	}
	
  }
  public static int push(java.util.Scanner sc){ // 입금.
	//java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("입금액>");
	return sc.nextInt();
  }
  public static int pull(java.util.Scanner sc){
	//java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("출금액>");
	return sc.nextInt();

  }
  public static void show(int su){
	System.out.println("현재 잔고 : "+su+"원");
	return ;
  }

}