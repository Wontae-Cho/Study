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
	System.out.println("�޼ҵ� �����ε�");
   }
   /*
   public static int func1(){
	return 100; 		��� �Ұ�.
   }
   */  

   public static void func1(int a){
	//int a; == (int a)
	a = 1234;
	System.out.println("func1 a="+a);
   }


}
// a��� ������ ��ġ�� ������ �ұ��ϰ� �� ��µǴ� ������ ���ΰ� ����ִ� �޼ҵ尡 �ٸ��� �����̴�.
// ���ʿ� a��� ������ ������ �ٸ� �޸� �������� �̷�����.