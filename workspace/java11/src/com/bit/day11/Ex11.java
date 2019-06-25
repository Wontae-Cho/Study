package com.bit.day11;

public class Ex11 {
	static int num2=2222;
	int num1=1111; //멤버필드
	int num3;
	
//	public Ex11(){ //생성자가 없을 경우에는 이러한 형태로 디폴트 생성자가 생략되어있다.
//		
//	}
	public Ex11(){
		this(2222); //다른 생성자를 호출할 수 있음.
					//this();가 왔을때는 super는 사용할 수 없다. 개체가 2개찍히는 결과를 가져오기때문에.
		System.out.println("객체 생성");
	}
	public Ex11(int s){ //객체 생성시점에 단 한번만 이뤄짐.
		super(); //생략되어있는 내용.
					//다시 호출하는 순간 다른 객체가 생성됨.
		num3=s; //자료형은 멤버필드에 선언해줘야한다.
		System.out.println("객체 생성");
	}

	public static void main(String[] args) {
		Ex11 me = new Ex11();
		me/*해당객체*/.func01();
		System.out.println(me.num2);
		me.num2++; //스태틱변수를 me객체에서 조작했더니 you객체에도 영향을 줌.
					// 이렇게 사용해서는 안됨.
		Ex11 you = new Ex11();
		System.out.println(you.num2);
		System.out.println(me.num2);

	}
	static void func03(){
		//System.out.println(this); //this는 static에서 사용할 수 없다.
	}
	
	
	void func01(){ //public, default, private
		System.out.println(this);
		System.out.println("non-static func01()...");
		this.func02(); //this.이 생략되어있음.
					//근래에는 this를 써야할 때는 써주는것이 좋다.
					//this는 non-static에서만 허용. 객체를 가르키는것이기 때문에.
	}
	
	void func02(){
		System.out.println("non-staic func02()...");
	}

}
