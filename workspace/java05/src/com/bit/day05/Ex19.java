class Ex19{

   public static void main(String[] args){
	String bar = "---------------------------------------------";
	System.out.println("Q1"+bar);
	int i = 1;
	int sum = 0;
	while(i<=100){
		sum+=i; //sum = sum +i
		i++;
	}
	System.out.println("1~100까지의 합계 : " +sum);

	System.out.println("Q2"+bar);

	int j = 1;
	while(j<=10){
		System.out.print(j+" ");
		j+=2;
	}
	System.out.println();

	System.out.println("Q3"+bar);
	
	int k = 1;
	int sum2 = 0;
	while(k<=100){
		if(k %2 ==0){
		sum2+=k;
		}
	k++;
	}
	System.out.println("1~100까지의 짝수들의 합계 : " +sum2);

	System.out.println("Q4"+bar);

	System.out.println("구구단 7단");
	int dan = 7;
	int a = 1;
	while(a<10){
		System.out.println(dan+"x"+a+"="+(dan*a));
		a++;
	}
	
	System.out.println("Q5"+bar);

	int b = 1;
	int sum3 = 0;
	while(b<10){
		if(b!=1) {
			System.out.print("+");
		}
		System.out.print(3*b);
		sum3 += 3*b; // sum3 = sum3 + (3*b)
		b++;
	}
	System.out.println("="+sum3);

	System.out.println(bar);

	int m=1;
	boolean result = true;
	while(result){
		System.out.print(m+" ");
		if(m==9){
			result=false;
		}
		m+=2;
	}
	System.out.println();
	int z=1;
	while(z<10){
		if(z%2==1){
			System.out.print(z+" ");
		}
		z++;
	}
	

   }


}