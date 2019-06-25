/*
변수 - 선언, 초기화 (자료형)


*/
class Ex07{
   public static void main(String[] args){
	int a = 100;
	//a = a+1; //101
	//a += 1;  //101
	//a++;     //101 결과는 같지만 과정은 다르다. 따라서 1씩증가가 아니라 그 외에는 사용할 수 없다.
	//a += 2; // = (a = a+2)
	//a -=50; // a = a - 50
	//a *= 2; // a = a * 2;
	//a /= 2; // a = a / 2;
	//a %= 3; // a = a % 3;
	//a >>= 1; // a = a >> 1; 한칸 오른쪽으로 
	//a <<= 1; // a = a << 1; 한칸 왼쪽으로

	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false); // &&연산자는 결과값이 true && true일 경우에만 true로 출력
	System.out.println("-----------------------");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false); // ||연산자는 결과값이 false || false일 경우에만 false로 출력
	System.out.println("-----------------------");
	System.out.println(!true); //true의 반대값을 출력
	System.out.println(!false); //false의 반대값을 출력
   }

}
