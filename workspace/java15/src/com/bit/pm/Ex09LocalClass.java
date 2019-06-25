package com.bit.pm;

public class Ex09LocalClass {

	public static void main(String[] args) {
		System.out.println("main start");
		func01(55);
		System.out.println("main end");

	}
	//상수화된 변수가 들어가야지만 가능. jdk 1.7 까지는 final , 1.8이후로는 final이 아니여도 가능.
	public static void func01(final int a){
//		int a = 1111; //일반적인 로컬변수
		class Inner{ //static으로는 존재할 수 없다. -> 메소드가 실행될지 안될지도 모르는데 static영역에 올려놓는것은 비효율적이기 때문에.
			//class는 미리 loading되기 때문에 그 안에 있는 변수들은 상수화되어 있어야 가능하다.
			int su1=1111;
			final static int su2 = 2222; //단, final이 붙은 static은 그냥 상수로 보고 올려놓는다.

			//생성자
			public Inner(){}
			
			//메서드
			void func10(){
				System.out.println("local - func10()...."+a);
			}
			void func11(int b){
				System.out.println("local - func11()..."+b);
			}
		}
		Inner inn = new Inner();
		System.out.println(inn.su1);
		System.out.println(Inner.su2);
		inn.func10();
		inn.func11(a);
		return;
	}
	
//	public void func02(){
//		int a = 2222;
//		class Inner{
//			
//		}
//	}

}
