class Ex14 {

   public static void main (String[] args) {
	
	for(int i = 1; i<=10; i+=2){
		System.out.print(i+" ");

	}
	System.out.println("\n---------------------------");
	for(int i=1; i<10; i++){
		if(i%2==1){
		System.out.print(i);
		}else{
		System.out.print(' ');
		}	

	}
	System.out.println("\n---------------------------");
	int sum=0;
	for(int i=1; i<=100; i++){
		if(i%2==0){
		//System.out.println(sum + "+" +i);
		sum+=i; //sum = sum +i;
		}
	}
	System.out.println(sum);



   }


}