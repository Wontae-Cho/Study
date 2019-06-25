class Ex31BreakContinue{

   public static void main(String[] args){
	// return : 메소드의 종료를 의미함.
	// break, continue
	java.util.Scanner sc = new java.util.Scanner(System.in);
	while(true){
	System.out.print("종료하시려면 0 아니면 계속:");
	int su=sc.nextInt();
		if(su==0){
			//return; //메인메소드의 return
			break;
			//System.exit(0); //프로그램을 종료시키는 또 다른 방법.
		}
	}
	System.out.println("이용해주셔서 감사합니다."); //return의 경우에는 아에 출력되지 않는다.(메소드의 종료)
							//System.exit(0)의 경우에도 아에 출력되지 않는다.(메소드의 종료)
							//하지만 break의 경우에는 반복문만 빠져나온경우이기 때문에 아래 문구가 출력가능
	//System.exit(0)의 경우에는 vm자체를 꺼버리는 것이기 때문에 안전하지 않다.


   }

   public static void func1(){
	//return; //반환할 값이 없을 경우(void)에는 생략가능하다.
	for(int i=0; i<5; i++){
		if(i>=3){
			//break; //만나는 순간 밖으로 나가짐.
			//continue; 3개가 동일한 값을 가짐. 
				//반복문에서 coutinue를 만나는 순간 아래에 코드를 가지 않고 처음으로 돌아간다.
				//반복문의 횟수는 반복하지만 조건 아래의 코드들은 출력하지 않는다.
			return; //메소드가 종료되기때문에 그 이후의 코드는 출력하지 않는다.
		}
		System.out.println("i="+i);
	}
   }

}
