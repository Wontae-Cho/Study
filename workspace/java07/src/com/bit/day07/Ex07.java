package com.bit.day07;

public class Ex07{

  public static void main(String[] args){ //1명것을 구한다고 가정했을때.
	int stu1kor=0, stu1math=0;
	int stu2kor=0, stu2math=0;
	int stu3kor=0, stu3math=0;

	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("---------------------------------------");
	System.out.println("학생 성적관리 프로그램 (ver 0.0.2)");
	System.out.println("---------------------------------------");
	int menu = 0;
	int cnt = 0;
	while(true){
	System.out.print("1. 입력 2.결과보기 0.종료>");
	menu = sc.nextInt();
	//System.out.println("input"+menu);
		if(menu==0){
			break;
		}
		if(menu==1){
			cnt++;
			if(cnt>3){
				continue;
			}
			if(cnt==1){
				System.out.print(cnt+"번학생 국어>");
				stu1kor = sc.nextInt();
				System.out.print(cnt+"번학생 수학>");
				stu1math = sc.nextInt();
			}else if(cnt==2){
				System.out.print(cnt+"번학생 국어>");
				stu2kor = sc.nextInt();
				System.out.print(cnt+"번학생 수학>");
				stu2math = sc.nextInt();
			}else if(cnt==3){
				System.out.print(cnt+"번학생 국어>");
				stu3kor = sc.nextInt();
				System.out.print(cnt+"번학생 수학>");
				stu3math = sc.nextInt();
			}
		}else if(menu==2){
			avg("국어",stu1kor,stu2kor,stu3kor);
			avg("수학",stu1math,stu2math,stu3math);	
						
		}
	}
	
	
  }
	//평균구하는 곳.
  public static void avg(String msg, int a, int b, int c){
	System.out.print(msg+" 평균 : "); 
	//System.out.print("국어 평균 : ");	
	System.out.println((a+b+c)*100/3/100.0); 
	//System.out.println((stu1kor+stu2kor+stu3kor)*100/3/100.0);
  }

}

