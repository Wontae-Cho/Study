class Ex22{

   public static void main(String[] args){

	for(int i=0; i<5; i++){
		//System.out.println();
		for(int j=0; j<5; j++){
			System.out.println("i:"+i+",j:"+j);
		}
	}
	for(int i=2; i<10; i++){
		for(int j=1; j<10; j++){
			System.out.println(i+"x"+j+"="+(i*j));
		}
	}
	System.out.println("--------------------------------------------------------------");

	long start = System.currentTimeMillis();
	System.out.println("---------- Java Run ----------");
	for(int i=1; i<10; i++){
		for(int j=2; j<10; j++){
			System.out.print(j+"x"+i+"="+(j*i)+"\t");
		}
		System.out.println();
	}
	System.out.println("Normal Termination");
	long end = System.currentTimeMillis();
	System.out.println("출력 완료 ("+(end - start)/1000.0+"초 경과)");
	


   }

}