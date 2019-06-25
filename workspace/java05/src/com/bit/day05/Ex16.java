/*

*/

class Ex16{

   public static void main(String[] args){
	int a;  //변수의 선언
	//a = a; //초기화 16진수인지 아닌지 분간 못함.
	a = 0xa; //16진수 표현 0x + @
	System.out.println("10 ="  +" "+0xa); //16진수를 넣는다고해서 좋은게 아니라 상황에 맞게써야한다.
	System.out.println("11 ="  +" "+0xb); // 굳이 따지자면 int는 10진수 정수가 기본 default이므로 일을 2번 처리하게 된다.
	System.out.println("12 ="  +" "+0xc);
	System.out.println("13 ="  +" "+0xd);
	System.out.println("14 ="  +" "+0xe);
	System.out.println("15 ="  +" "+0xf);
	System.out.println("16 ="  +" "+0x10);
	System.out.println("8진수"); //숫자 앞에 0을 붙임. 활용보다는 주의의 내용.
	System.out.println("6=6," +06);
	System.out.println("7=7," +07);
	System.out.println("8=010," +010);
	System.out.println("9=011," +011);
	System.out.println("10=012," +012);
	System.out.println("...");
	System.out.println("15=017," +017);
	System.out.println("16=020," +020);
	System.out.println("================");
	//boolaen boo=true;	//1bit (true or false), 상당히 많이 쓰임.
	byte su1; 
	su1=127; 	// 256(8bit) -128 ~ 127(0을 포함)
	su1++;		// -128이 됨.
	System.out.println("su1=" +su1);
	short su2;
	su2 =32767;	// -32768 ~ 32767
	su2++;		// byte랑 마찬가지로 맥시멈값을 넘으면 -로 됨.
	System.out.println("su2="+su2);
	int su3;
	su3=2147483647; // 2147483648을 입력시 오류발생.
	su3++;		// byte랑 마찬가지로 맥시멈값을 넘으면 -로 됨.
	System.out.println("su3="+su3);
	long su4;
	//su4=2147483648; //int의 최대범위이상일시 메모리값을 넘어버림으로 따로 표현을 해주어야함.
			//cpu의 연산 범위는 int이기 때문에 long으로 표현시 int형식으로 나눈후 다시 더하는 값이 나옴.
	su4=2147483648L; 
	System.out.println("su4="+su4);
	double su5,su6; //실질적으로 실수를 표현할 수 없기에 정확성을 포기하고 근사값을 대입한다.
			//따라서 정확한 것을 원한다면 정수계산을 한 후에 실수로 바꿔줘야한다.
	su5=3.1400000001; //근사값은 로스만 있는 것이 아니라 더해질때도 있다. 사실 더 붙은 경우가 더 많다.
	su6=1.0000000001; //곱셈,나눗셈에서는 그 오차가 더 커질 수 있다.
	System.out.println("su5="+su5);
	System.out.println(su5+su6);
	float su7;
	//su7=3.14;	//default를 double로 쓰기때문에 오류발생
	su7=3.14f;
	char ch1,ch2; //유니코드로도 표현 가능 //u+@ @=16진수
	ch1='a'; //문자는 마이너스 표현이 없기에 -를 붙일시 오류발생. 숫자를 적어넣을시 그것에 해당하는 문자 표현.
	ch2=44032;
	System.out.println(ch1); //문자를 처리못하기에 약속으로 문자를 숫자를 통해 표현함. ex)'1' != 1
	System.out.println("1:"+(int)'1'); //문자 1은 숫자49로 약속
	System.out.println("2:"+(int)'2'); //문자 2은 숫자50로 약속
	System.out.println('a'); // = System.out.println(ch1);
	System.out.println((int)'가'); //'가'가 가지고 있는 값.
	System.out.println(ch2); 





   }



}