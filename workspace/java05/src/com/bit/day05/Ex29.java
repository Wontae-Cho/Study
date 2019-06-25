/*
--------------------------
계산기 (ver 0.0.1)
--------------------------
첫번째 숫자> 5(임시)
두번째 숫자> 3(임시)
+(1),-(2),x(3),/(4)>
5+3 = 8
계속(1), 종료(0)>0
이용해주셔서 감사합니다.

*/
class Ex29{

   public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
	char ch = '+';
	boolean isTakeNum = true;
	int result = 0;

	while(isTakeNum) { // 입력받는 부분
		boolean isContinue= true; //result3
		boolean isGetOutcome = true; //result2

		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int su1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int su2 = sc.nextInt();
		while(isGetOutcome) { //연산결과를 얻는 부분
			isGetOutcome = false;
			System.out.print("+(1), -(2), x(3), /(4)");
			System.out.print("연산의 종류를 선택해주세요 : ");
			int choice = sc.nextInt();
			if(choice == 1){ //덧셈
				result = plus(su1, su2); //연산기능
				myPrint(su1, su2, '+', result);
				ch='+';
			}else if(choice == 2){ //뺄셈
				result = minus(su1, su2);
				myPrint(su1, su2, '-', result);
				ch='-';
			}else if(choice == 3){ //곱셈
				result = multi(su1, su2);
				myPrint(su1, su2, '*', result);
				ch='x';
			}else if(choice == 4){ //나눗셈
				result = div(su1, su2);
				myPrint(su1, su2, '/', result);
				ch='/';
			}else{
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				isGetOutcome = true;
			}
			//myPrint(su1, su2, ch, result);
		}
		while(isContinue){
			System.out.print("계속하려면 (1) 종료하려면 (0)를 입력해주세요 : ");
			int replayExit = sc.nextInt();
			if(replayExit == 1) {
				isGetOutcome = true;
				isContinue = false;
			}else if(replayExit == 0){
				System.out.println("이용해주셔서 감사합니다");
				isTakeNum = false;
				isContinue = false;
			}else{
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				isContinue = true;
			}
		}
		
	}
	
   } 	//main end

   public static void myPrint(int su1, int su2, char ch, int result){ 	//출력기능
	System.out.println("결과 : "+su1+ch+su2+"="+result);
   }
   /*
   public static int calcul(int su1, int su2, int choice){ //연산기능
	int num=0;
	if(choice==1){
		num=su1+su2;
	}else if(choice==2){
		num=su1-su2;
	}else if(choice==3){
		num=su1*su2;
	}else if(choice==4){
		num=su1/su2;
	}else
	return num;
   }
   */

   public static int plus(int su1, int su2){
	//System.out.println("결과 : "+su1+"+"+su2+"="+(su1+su2));
	return su1+su2;
   }
   public static int minus(int su1, int su2){
	//System.out.println("결과 : "+su1+"-"+su2+"="+(su1-su2));
	return su1-su2;
   }
   public static int multi(int su1, int su2){
	//System.out.println("결과 : "+su1+"x"+su2+"="+(su1*su2));
	return su1*su2;
   }
   public static int div(int su1, int su2){
	//System.out.println("결과 : "+su1+"/"+su2+"="+(su1/su2));
	if(su2==0){
		return 0;
	}
	return su1/su2;
   }
   /*
   public static int input(){
	//0,1
	java.util.Scanner sc = new.java.util.Scanner(System.in);
	int su=0;
	boolean boo = true;
	while(boo){
		System.out.println("<계속(1), 종료(0)>");
		su = sc.nextInt();
		if(su==0||su==1){
		boo=false;
		}
	return su;
   }
   public static int input2(){
	//1,2,3,4 1<= <=4
	java.util.Scanner sc = new.java.util.Scanner(System.in);
	int su=0;
	boolean boo = true;
	while(boo){
		System.out.println("+(1), -(2), x(3), /(4)");
		su = sc.nextInt();
		if(su==1||su==2||su==3||su==4){
		boo=false;
		}
	return su;
   }
   */





} //class end