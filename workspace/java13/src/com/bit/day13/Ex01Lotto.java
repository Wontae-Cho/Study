package com.bit.day13;

public class Ex01Lotto {
	static int[] lotto = new int[7];

	public static void main(String[] args) {
		// 로또번호 생성기
		// 1. 랜덤(1~45)
		// 2. 6개 선출, 중복불가
		// 3. 오름차순 정렬
		String title = "--------------------------------------------";
		title +="\n로또번호 생성기(ver 0.0.1)\n";
		title +="--------------------------------------------";
		System.out.println(title);
		lottoBall();
		sort();
		for(int i=0; i<6; i++){
			System.out.print(lotto[i] + " ");
		}
		System.out.println(", 뽀너스번호 : "+lotto[6]);


	}
	public static void lottoBall(){
		
		
		for(int i=0; i<lotto.length; i++){
			lotto[i] = ranSu2();
			for(int j=0; j<i ; j++){
				if(lotto[j] == lotto[i]){
					i--;
					break;
				}else{}
			}
		}
		
		return ;
	}
	
	public static int ranSu2(){ //짧고 간단하지만 부정확 할 수 있다.
		//0.0과 0.1, 0.1과 0.2 .... 0.9와 1사이의 값들이 일정하고 무수히 많다는 전제조건하에서 시작해야한다.
		//각각의 구간의 사이값이 일정하지 않다..
		int su=0;
		// 1~45
		//0 <=, <1		//0<=, <44
		su = (int)(Math.random()*45)+1;
		
		return su;
	}
	public static void sort(){
		int temp = 0;
		for(int i=0; i<6-1; i++){
			for(int j=i+1; j<6; j++){
				if(lotto[i]>lotto[j]){
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		return ;
	}

	public static int ranSu() {
		int su = 0;
		// 불규칙(input(X) => output(O)) 입력이 없는데 출력이 있어야 한다.
		while (true) {
			su = (int) (java.lang.Math.random() * 100); // 아무런 인풋 없이 0<=
																// <1 사이의 값을
																// 뽑아주는 메소드.
			// *10 = 0 ~ 9, *100 = 0 ~ 99
			if (su > 0 && su < 46) {
				break;
			}
		}

		return su;
	}

}
