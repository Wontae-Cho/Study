/*
메소드의 재귀적 호출

*/

class Ex28{

   public static void main(String[] args){
	//5번 출력
	func1(5);
	//for(int i = 0; i<5; i++){	}
	func2(0,5);
	func3(5);

   }	//main end
   public static int func3(int cnt){
	System.out.print(cnt);
	if(--cnt!=0){
		System.out.print('+');
		func3(cnt);
	}
	return 0;
   }

   public static void func2(int cnt1, int cnt2){
	System.out.println("재귀적 호출");
	cnt1++;
	if(cnt1!=cnt2){
		func2(cnt1,cnt2);
	}
	return ;
   }

   public static int func1(int cnt){
	System.out.println("기능 실행");
	cnt--;
	if(cnt!=0){
		func1(cnt);
	}
	return 0;
   }

}	//class end