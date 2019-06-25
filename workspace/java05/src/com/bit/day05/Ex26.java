/*
메소드(method) (일단은 함수로 해석해도 무방)
- 순서에 구애받지 않는다. 메인보다 앞서 있어도 상관 없음
- 단, 메인이 없는 경우는 불가하다.
- 메인하나에 메소드는 얼마든지 만들어 낼 수 있다.
- 메소드 내부에서 다른 메소드의 호출도 가능
- 코드의 재사용성
- 메소드의 이름을 중복불가
- 메소드의 명은 영문자로시작,숫자만 가능 
  첫글자는 영어소문자로 시작
- 메소드의 호출 : 메소드명(파라미터) 없을경우에도 ()로 표현을 해줘야함. 
                  여러개를 받을 수도 있다.
- 호출 받으면 해당 메소드로 가서 실행하고 끝나면 호출한 쪽으로 다시 돌아감.
- return을 통해 결과값을 반환할 수 있는데 그 경우에는 void가 아닌 해당 결과 값의 자료형을 적어줘야한다.
	ex) public static (int) 메소드명(매개변수)
	    자료형 일치 매우 중요.
- return 아래 코드를 적을 시에는 그 코드는 실행되지 않는다.
  하지만 return을 if 등의 함수를 통해 조건을 주었을 경우에는 실행될 수 있다.
- 매개변수 == 인자, 파라미터 : 호출측과 받는 측이 동일한 자료형이여야함. 전달할 것이 없을 때
		순서를 지킴.(자료형 일치 필수)
  ex)
	public static void 메소드명(매개변수){
		실행문;
	}
*/

class Ex26{
	// 클래스의 구성요소
	// 1.메소드 (메인도 하나의 메소드)

   public static void main(String[] args){
	System.out.println("메인 시작");
	int a;
	a=100;
	System.out.println("a="+a);
	func3(100, 50.0, "잘 나옵니다");
	int su = func4();
	func2();

	System.out.println(su+"메인 끝");

   }	//main end
   public static int func4(){
	System.out.println("2+3을 전달하겠습니다");
	int x=2;
	int y=3;
	int z = x+y;
	return z;

   }


   public static void func3(int num1, double num2, String msg){ //받도록 되어 있는데 전달하지 않으면 오류.
				      // 전달받는 매개변수가 자료형이 달라도 오류
	System.out.println("num1="+num1+",num2="+num2+msg);
   }

   public static void func1(){
	System.out.println("새로운 기능1");
	func2();
	System.out.println("새로운 기능1 끝");
   }	//func1 end
   public static void func2(){
	System.out.println("새로운 기능2");
	return;
   }	//func2 end


}	//class end