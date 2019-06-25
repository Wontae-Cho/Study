class Ex25Advanced{

   public static void main(String[] args){ 
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("-------------------------------------\n가위,바위,보 게임\n-------------------------------------");

	while(true){ 
		System.out.print("가위(1),바위(2),보(3),종료(4)");
		int you=sc.nextInt();
		int com = 0;
		if(you==0){ 
			break;
		}else if(you>3|| you<0){
			continue;
		} //if end
		//int you = 1;
		//0 ~ 2, 1 ~ 3.....etc
		// 0.0 ~ 0.9999.. -> 0 ~ 9
		//com 숫자를 1~3으로 제한.

		while(true){
			com = (int)(Math.random()*10);
			if(com>0 && com<4){
				break;
			}

			func(you,"you");

			func(com,"com");	

			if(you==1&&com==1||you==2&&com==2||you==3&&com==3){
				System.out.println("결과 : 비겼습니다.");
			}else if(you==1&&com==2||you==2&&com==3||you==3&&com==1){
				System.out.println("결과 : 졌습니다.");
			}else if(you==3&&com==2||you==1&&com==3||you==2&&com==1){
				System.out.println("결과 : 이겼습니다.");
			}
		}
	} //while end
	System.out.println("이용해주셔서 감사합니다.");
   }//main

   public static void func(int su, String name){
	
	if(su==1){
		System.out.println(name+":가위");
	}else if(su==2){
		System.out.println(name+":바위");
	}else if(su==3){
		System.out.println(name+":보");
	}
   }

}