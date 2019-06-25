package com.bit.day11;

public class Ex10 {
	static int num1=1111; //스태틱변수, 클래스변수...
	//접근제한자는 public default private가 올 수 있다.

	public static void main(String[] args) {
		int num1=2222;
		
		System.out.println(com.bit.day11.Ex10.num1);
		System.out.println(Ex10.num1);//동일 패키지라 생략.
		System.out.println(num1);//동일 패키지,클래스라 생략.
		//지역변수랑 같은 이름의 변수가 있다면 지역변수가 우선시 된다.
		//상속의 경우에도 이는 동일하다 . 우선순위 : 상속 < 클래스변수 < 지역변수
		//page162 예제 4-14 ~ 4-18까지 해볼것.

		com.bit.day11.Ex10.func01();
		//동일패키지이기때문에 패키지명 생략가능
		Ex10.func01();
		//동일클래스이기때문에 클래스명 생략가능
		func01();
		func02(1234); //인자가 있다는 것은 받는 메서드에도 명시되어있어야한다
					//자료형 또한 일치해야한다.
		//double su = func03();
		//System.out.println(su);
		System.out.println(func03());
	}
	
	public static void func01(){
		System.out.println("static method func01...");
		return;
	}
	
	public static void func02(int a){
		System.out.println(a);
		com.bit.day11.Ex10.func01();
	}
	
	public static double func03(){//리턴이 있다면 리턴의 자료형을 명시해줘야한다.
		return 3.14; 
	}

}
