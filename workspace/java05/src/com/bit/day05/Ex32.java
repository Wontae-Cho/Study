class Ex32ReturnBreakExit{

   public static void main(String[] args){

	func();
	System.out.println("이용해주셔서 감사합니다");
   }

   public static void func(){
	java.util.Scanner sc = new java.util.Scanner(System.in);

	while(true){
		System.out.print("1.return 2.break 3.exit");
		int su = sc.nextInt();
		if(su==1){
			return; //호출한쪽으로 다시 돌아가므로 func end는 출력하지 않는다.
		}else if(su==2){
			break; // 반복문의 탈출이므로 func end까지 출력해준다.
		}else if(su==3){
			System.exit(0); //강제종료. 쓰지마라~이말이야
		}

	}
	System.out.println("func end");

   }
}