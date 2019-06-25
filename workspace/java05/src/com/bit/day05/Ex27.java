class Ex27{

   public static void main(String[] args){

	int a;
	a=100;
	func1();
	System.out.println("a="+a);
   }
   public static void func1(String msg){
	System.out.println(msg);
   }


   public static void func1(int a, int b){
	System.out.println(a+"+"+b+"="+(a+b));
   }

   public static void func1(){
	System.out.println("메소드 오버로드");
   }
   /*
   public static int func1(){
	return 100; 		얘는 불가.
   }
   */  

   public static void func1(int a){
	//int a; == (int a)
	a = 1234;
	System.out.println("func1 a="+a);
   }


}
// a라는 변수가 겹치는 데에도 불구하고 잘 출력되는 이유는 서로가 담겨있는 메소드가 다르기 때문이다.
// 애초에 a라는 변수의 선언이 다른 메모리 영역에서 이뤄진다.