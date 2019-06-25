package com.bit.day06;

public class Ex08{

  public static void main(String[] args) {
	Ex08 me = new Ex08();
	me.solveQ1();
	System.out.println("--------------------------------------");
	me.solveQ2();
	System.out.println("--------------------------------------");
	me.solveQ3();
	System.out.println();
	System.out.println("--------------------------------------");
	me.solveQ4();
	System.out.println("--------------------------------------");
	me.solveQ5();
	System.out.println("--------------------------------------");
	me.solveQ6();
	System.out.println("--------------------------------------");
	me.solveQ7();
	System.out.println("--------------------------------------");
	me.solveQ8();
	System.out.println("--------------------------------------");
	me.solveQ9();
	

  }
  public void solveQ1(){ 
	// char 'A' = 65, char 'Z' = 90;
	char ch = 'A';
	while(true){
		System.out.print(ch + " ");
		if(ch==90){
		break;
		}
	ch++;
	}	//while end
	System.out.println();

  }	//Q1 end
  public void solveQ2(){
	int sum = 0;
	int i = 1;
	while(true){
		sum+=3*i;
		if(i!=1){
			System.out.print("+");
		}	//if end
		System.out.print(3*i);
		if(3*i==27){
			break;
		}
		i++;
	}//while end
	System.out.print("="+sum);
	System.out.println();

  }	//Q2 end
  public void solveQ3() {
 	for(int i = 1; i <=10; i++) {
		System.out.print(showPow(2, i)+" ");
	}

  }

  public static int showPow(int n1, int n2){
	if(n2==0) {
		return 1;
	}else{
		return n1*(showPow(n1,n2-1));
	}
  }	//Q3 end

  public void solveQ4() {
	for(int i = 1; i<5; i++){
		for(int j=1; j<5; j++){
			System.out.print("бс  ");
		}
	System.out.println();
	}
  }	//Q4 end

  public void solveQ5() {
        for(int i = 1; i<5; i++){
		for(int j=1; j<=i; j++){
			System.out.print("бс  ");
		}
	System.out.println();
	}
  }	//Q5 end

  public void solveQ6() {
        for(int i = 1; i<4; i++){
		char ch = 'A';
		for(int j=1; j<=i; j++){
			System.out.print(ch++ +" ");
		}
	System.out.println();
	}
  }	//Q6 end

  public void solveQ7() {
	char ch = 'A';
        for(int i = 1; i<4; i++){
		for(int j=1; j<=i; j++){
			System.out.print(ch++ +" ");
		}
	System.out.println();
	}
  }	//Q7 end

  public void solveQ8() {
        for(int i = 1; i<5; i++){
		for(int k=4; k>i; k--){
			System.out.print("   ");
		}
		for(int j=1; j<=(2*i-1); j++){
			System.out.print("бс ");
		}
	System.out.println();
	}
  }	//Q8 end

  public void solveQ9() {
        for(int i = 1; i<5; i++){
		for(int k=4; k>i; k--){
			System.out.print("   ");
		}
		for(int j=1; j<=i; j++){
			System.out.print("бс ");
		}
	System.out.println();
	}
  }	//Q9 end


}	//class end