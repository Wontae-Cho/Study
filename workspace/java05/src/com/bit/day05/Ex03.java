class Ex03{

   public static void main(String[] args){
	//변수 = Variable
	int x; // 변수의 선언(자료형 변수명) - 메모리(저장공간)의 확보 
	x=3;   // 변수의 초기화(변수명 = value) - 확보된 공간에 최초로 대입한 값
	int b = 1234; //변수의 선언과 초기화를 동시에

	System.out.println(x);
	x=2;
	System.out.println(2+3.14); //오차발생 
	System.out.println((200+314)/100.0); //실수형 계산을 할 때의 예
	System.out.println(b);

	boolean result;
	result = true;   //참  / 문자열이 아닌 키워드. 
	result = false; //거짓 / 문자열이 아닌 키워드.
	System.out.println(true); //boolean타입의 상수
	System.out.println("ab"); //a와 b 사이에 엔터를 입력하고 싶으면 유니코드를 찾아보면 된다.
	System.out.println("a\nb"); //또는 개행문자 \n (Window에서는 (\r\n)을 개행문자로 받아들인다.)
	System.out.println("\uac00"); //유니코드 '가' 출력
	System.out.println("\uac10"); //유니코드 '감' 출력
	System.out.println('\''); // 작은따옴표(') 출력
	System.out.println("'A'");
	System.out.println("A\r\nB");
	//ㅣ|ㅣIil 0 o O

   }

}