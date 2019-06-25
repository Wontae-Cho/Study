package com.bit.pm;

public class Ex08nonstatic {
	static int su1=1111;
	int su2=2222;
	
	class Inner04{
		// 내부클래스가 non-static 일 때, 바깥클래스로 접근할 경우 상속과 동일한 효과를 보인다.
		// 왜냐하면 바깥클래스가 내부클래스를 감싸고 있기 때문이다.
		void func03(){
			System.out.println(su1);
			System.out.println(su2);
			func01(); 
			func02(); //부모가 가진 func02인데도 불구하고 마치 상속받은것 처럼 사용가능.
			
		}
	}
	
	static void func01(){
		
	}
	void func02(){
		
	}

	public static void main(String[] args) {


	}

}
