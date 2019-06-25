package com.bit.day08;

//class = 객체를 찍어내는 하나의 틀로 볼 수 있다. ex)붕어빵틀.
class Target{
	// 생성자
	// 객체의 생성에 관여
	// 생성자이름=클래스명
	// 디폴트 생성자는 생략가능 // 없으면 컴파일 과정에서 생성되는거지 없어도 되는 것이 아님.
	// 호출은 객체 생성시점 단한번 이루어짐

	// 생성장의 형태.
	public Target(){}


	// 변수 - 객체의 속성(주로 명사)
	// 객체의 속성 = data를 담고 있다
	int num = 1234; //객체의 변수는 선언과 초기화가 동시에 해줘야한다.
			//객체의 생성시점에 저장공간이 확보가 되어있어야하기 때문이다.
			//이를 분리해서 하게 된다면 num은 1234라는 정보를 담은것에서
			//num에 1234를 "담아라(초기화)" 라는 기능을 수행하게 됨.
	int num2; //이 경우에는 java가 가지고 있는 dafault값으로 객체 생성시에 초기화됨.
		  //대부분의 default값은 자료형의 특징에 맞게 0으로 해당되어 있다.(double 0.0)
		//참조변수 또한 기본 default값을 가지고 있는데 그것은 null이다.
	//선언과 초기화의 분리
	//int num;	
	//num = 1234; // 정보를 담으라는 기능을 수행함으로 속성이 아니게 됨.
			// 따라서 컴파일 오류 발생
	static int num3; //static 공간 안에서 패키지명.클래스명.변수명 으로 저장됨
			//동일 클래스에서는 클래스명은 생략가능. 패키지도 마찬가지.(권고X)
	//Car car;

	// 메소드 - 객체의 기능(동사)
	// 일반적인 형태
	public void func01(){ 
		int su;
		su = 4321; //초기화하지 않을 시 오류발생.
		System.out.println("su="+su);
	}
}

public class Ex01{

  public static void main(String[] args){
	Target t1 = new Target();
	t1.func01();
	System.out.println("t1.num="+t1.num);
	System.out.println("t1.num2="+t1.num2);
	System.out.println("t1.num3="+t1.num3); 
	System.out.println("t1.num3="+com.bit.day08.Target.num3); 
	//num3은 static 이므로 앞에 생략된 내용이 있다. (패키지명.클래스명.)


  }

}