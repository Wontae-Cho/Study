package com.bit.day11;

public class Ex05 {

	public static void main(String[] args) {
		// ■		i=0, j=1
		// ■ ■		i=1, j=2
		// ■ ■ ■ 	i=2, j=3
		// ■ ■ ■ ■ 	i=3, j=4
		// 1			+2 
		// 2 3			+3 
		// 4 5 6		+4 
		// 7 8 9 10		+5
		int temp1 = 1;
		int temp2 = 1;
		int temp = 1;
		
		for(int i=1; i<=21; i++){
			System.out.print(i*2+" ");
			if(i==temp1){
				System.out.println();
				temp1=i+(++temp2);
			}
		}
		/* 다중반복으로 푸는 방법 1
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print("■ ");
				if(i==j){break;}
				//if(j>i){conintue;}
				////if(j<i){
					////System.out.print("□ ");
				////}else{
					////System.out.print("■ ");
				////}
			}
			System.out.println();
		}
		*/
		//다중반복으로 푸는 방법 2
//		int su =1;
//		for(int i=0; i<4; i++){
//			for(int j=0; j<=i; j++){
//				System.out.print(su++ +" ");
//			}
//			System.out.println();
//		}
		
		
	}

}
