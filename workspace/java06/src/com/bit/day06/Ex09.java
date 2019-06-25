package com.bit.day06;

public class Ex09{

  public static void main(String[] args) {
	System.out.println("----Q1--------------------");
	for(int i=(int)'A'; i<=(int)'Z';i++){
	System.out.print((char)i+" ");
	}
	System.out.println();
	System.out.println("----Q2--------------------");
	for(int i=3 ; i<30; i+=3){
		if(i!=3){
			System.out.print("+");
		}
		System.out.print(i);
	}
	System.out.println();
	System.out.println("----Q3--------------------");
	int cnt=0;
	int sum=1;
	for(int i=2; true; i*=2){
		cnt++;
		System.out.print(i+" ");
		if(cnt==8){break;}
	}
	System.out.println();
	for(int i=1; i<8; i++){
			sum = 1;
		for(int j=0; j<=i; j++){
			sum*=2;
		}
		System.out.println(sum);
	}
	System.out.println("----Q4--------------------");
	for(int i=0; i<20; i++){
		if(i%5==0){
			System.out.println();
		}else{
			System.out.print('бс');
		}
	}


  }
}