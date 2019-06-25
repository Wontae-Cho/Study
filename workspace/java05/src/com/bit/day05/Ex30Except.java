class Ex30Except{

   public static void main(String[] args){
	
	double b=3;
	func1(3); // 이 경우 문법상 되지 않아야 정상이지만 이 경우에도 자동형변환이 일어난다.
		  // 가능은 하나 좋지 않다.
		  // auto casting


   }
   public static void func1(double w){
	System.out.println("double param-func1 run...param:"+w);
   }
   public static void func1(int a){
	System.out.println("int param-func1 run... param"+a);

}