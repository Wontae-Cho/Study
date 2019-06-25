/*
Q3. 1 ~ 100 중 짝수들의 합계를 구하시오

Q4. 구구단 7단을 출력하세요.

Q5. 다음을 출력하세요.
	3+6+9+12+15+18+21+24+27
*/

class Ex20{

   public static void main(String[] args){
	/*
	int sum = 0;
	for(int=1; i<=100; i++) {
		if(i%2==0){
			sum+=i;
		}
	}
	for(int i=1; i<=50; i++) {
		sum+=i*2; // sum=sum+i*2
	System.out.println(sum);
	*/

	System.out.println("---------------------------------------------");
	int sum=0;
	int a=1;
	while(a<=100){
		if(a%2==0){
			sum+=a;
		}
	a++;
	}
	System.out.println("1~100중 짝수 합은 ? " + sum);

	sum=0;
	int b=1;
	while(b<=50){
		sum+=b*2;
		b++;
	}
	System.out.println("1~100중 짝수 합은 ? " + sum);

	System.out.println("---------------------------------------------");
	int dan=7;
	int c=0;
	while(++c<10){ //증감을 먼저 시켜서 1부터 들어가도록. ++@/@++ 이냐에 따라서 결과가 달라지므로 주의.
		System.out.println(dan+"x"+c+"="+(dan*c));
	}
	System.out.println("---------------------------------------------");
	int temp=0;
	int d = 1;

	while(d<10){
		if(d!=1){
			System.out.print("+");
		}
		temp+=3*d;
		System.out.print(3*d++);
		
	}
	System.out.println("="+temp);
	System.out.println("---------------------------------------------");
	
	//int target=0;
	int e= 3;
	while(e<30){
		if(d!=1){
			System.out.print("+");
		}
		System.out.print(e);
		e+=3;
	}
	System.out.println();
	int f=2;
	boolean result = true;
	while(f<=10){
		if(result){
			System.out.println(f);
		}
		result=!result; //실행을 했다 안했다 했다 안했다 반복
		f++;
	}
	
	


   }


}