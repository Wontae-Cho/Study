/*
Q1. 1 ~ 100 까지 합계를 구하라.

Q2. 다음을 출력하시오 
    1 3 5 7 9

Q3. 1 ~ 100 중 짝수들의 합계를 구하시오

Q4. 구구단 7단을 출력하세요.

Q5. 다음을 출력하세요.
	3+6+9+12+15+18+21+24+27

*/

class Ex13{

   public static void main(String[] args){

	String bar = "---------------------------------------------";
	System.out.println("Q1"+bar);

	//Q1.
	int sum = 0; //0+1+2+3+......+99+100
	for(int i=0; i<=100; i++) {
		sum += i; // sum = sum + i;
	}
	System.out.println("1~100까지의 합계 : " +sum);
	System.out.println("Q2"+bar);

	//Q2.
	for(int i = 1; i<10; i++) { //for(int i=1; i<10; i+=2); //for(int i=0; i<5; i++) -> 2i+1 
		if(i%2 != 0) {
		System.out.print(i+" ");
		}
	}
	System.out.println();
	System.out.println("Q3"+bar);

	//Q3.
	int sum2 = 0;
	for(int i=1; i<=100; i++) { //for(int i=2; i<=100; i+=2) -> if 조건 안써도 됨.
		if(i%2 == 0) {
		sum2 += i; // sum2 = sum2 + i
		}
	}
	System.out.println("1~100까지의 짝수들의 합계 : " +sum2);
	System.out.println("Q4"+bar);

	//Q4.
	for(int i = 7; i < 8; i++) {
		System.out.println(i+"단");
		for(int j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + i*j);
		}
	}
	System.out.println("Q5"+bar);

	//Q5.
	int sum3 = 0;
	for(int i = 3; i < 30; i+=3) {
		sum3 += i;
	System.out.print(i+"+");
	}
	System.out.println("\b" + " = " + sum3);
   }

}