/*
가위, 바위, 보 게임
ex)
--------------------------------------------
가위,바위,보 게임
--------------------------------------------
가위(1),바위(2),보(3), 종료(0)>1
COM : 바위
YOU : 가위
결과 : 졌습니다.

가위(1),바위(2),보(3), 종료(0)>2
COM : 가위
YOU : 바위
결과 : 이겼습니다.
가위(1),바위(2),보(3), 종료(0)>2
COM : 바위
YOU : 바위
결과 : 비겼습니다.
가위(1),바위(2),보(3), 종료(0)>0
이용해주셔서 감사합니다.

*/
class Ex25{

   public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("--------------------------------------------");
	System.out.println("가위, 바위, 보 게임");
	System.out.println("--------------------------------------------");
	boolean result = true;

//1. 이긴경우 2. 진경우 3.비긴경우 0. 끝

	while(result) {
		System.out.print("가위(1),바위(2),보(3),종료(0)"); //선택 1
		double ran = Math.random(); // 랜덤값.
		int com = (int)(ran*3)+1;
		int choiceNum = sc.nextInt();
		if(choiceNum == 0) {
				System.out.println("이용해주셔서 감사합니다");
				result = false;
		}
		String win = "결과 : 이겼습니다";
		String loose = "결과 : 졌습니다";
		String draw = "결과 : 비겼습니다";
		String youScissors = "YOU:가위";
		String youRock = "YOU:바위";
		String youPaper = "YOU:보";
		String comScissors = "COM:가위";
		String comRock = "COM:바위";
		String comPaper = "COM:보";
		
		switch(choiceNum){ //승패판단 
			case 1 : //유저가 가위일 경우
				System.out.println(youScissors);
				if(com == 1) {
					System.out.println(comScissors);
					System.out.println(draw);
				}else if(com == 2) {
					System.out.println(comRock);
					System.out.println(loose);
				}else if(com == 3) {
					System.out.println(comPaper);
					System.out.println(win);
				}
				break;
			case 2 : //유저가 바위일 경우
				System.out.println(youRock);
				if(com == 1) {
					System.out.println(comScissors);
					System.out.println(win);
				}else if(com == 2) {
					System.out.println(comRock);
					System.out.println(draw);
				}else if(com == 3) {
					System.out.println(comPaper);
					System.out.println(loose);
				}
				break;
			case 3 : //유저가 보일 경우
				System.out.println(youPaper);
				if(com == 1) {
					System.out.println(comScissors);
					System.out.println(loose);
				}else if(com == 2) {
					System.out.println(comRock);
					System.out.println(win);
				}else if(com == 3) {
					System.out.println(comPaper);
					System.out.println(draw);
				}
				break;
			//default : //1,2,3,0 외의 숫자가 입력되었을 경우
				//System.out.println("잘못입력하셧습니다. 다시 입력해주세요");

		}
	System.out.println("------------------------------------------------------");
			
	}
	/*
	System.out.println("COM : 바위");
	System.out.println("YOU : 가위");
	System.out.println("결과 : 졌습니다.");
	System.out.print("가위(1),바위(2),보(3),종료(0)") //선택 2
	int rock = sc.nextInt();
	System.out.println("COM : 가위");
	System.out.println("YOU : 바위");
	System.out.println("결과 : 이겼습니다.");
	System.out.println("COM : 바위");
	System.out.println("YOU : 바위");
	System.out.println("결과 : 비겼습니다.");
	System.out.print("가위(1),바위(2),보(3),종료(0)") //선택 0
	System.out.println("이용해주셔서 감사합니다.");
	*/
	
	
	



   }

}