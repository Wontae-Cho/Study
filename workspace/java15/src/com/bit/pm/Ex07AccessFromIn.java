package com.bit.pm;

public class Ex07AccessFromIn {
	static int su1=1111;
	int su2=2222;
//내부클래스에서 외부클래스로의 접근. = 상속과 비슷한 효과를 가져옴.
	static class Inner03{
		static int su1 = 1000;
		
		static void func01(){
			System.out.println(su1); //지역변수 su1
			System.out.println(Ex07AccessFromIn.su1);
			Ex07AccessFromIn out = new Ex07AccessFromIn();
			System.out.println(out.su2);
			func03();
			out.func04();
		}
		void func02(){
			System.out.println(su1);
			func03();
			Ex07AccessFromIn out = new Ex07AccessFromIn();
			System.out.println(out.su2);
			out.func04();
			
		}
	}
	
	static void func03(){
		System.out.println("Outter-static-func03");
	}
	void func04(){
		System.out.println("Outter-not-func04");
	}
	
	public static void main(String[] args) {


	}

}
