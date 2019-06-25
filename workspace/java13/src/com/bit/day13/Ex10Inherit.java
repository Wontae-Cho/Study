package com.bit.day13;

class Father extends Object{
	int su = 4321;
	
	public String toString(){
		return "파더";
	}
	
}

public class Ex10Inherit extends Father{
	int su = 1234;

	public static void main(String[] args) {
		// 상속 - 다형성
		Ex10Inherit me = new Ex10Inherit();
		System.out.println(me);
		
		//자동형변환 - 자식에서 부모로 올때
		Father me2 = new Ex10Inherit(); //부모의 타입으로도 생성가능. 
		System.out.println(me2);	//오버라이드가 이뤄져서 내껄이용하는게 가능.
		System.out.println(me2.su);	//변수에서는 오버라이드가 이뤄지지 않아 4321 출력
		
		//강제형변환 부모에서 자식으로 갈때.
		Ex10Inherit me3 = (Ex10Inherit)me2;
		System.out.println(me3.toString());
		System.out.println(me3.su);
		
		Object obj=1;
		int su = (Integer)obj;
		func(1);
		func("stst");
		func(3.14);
		func(new Ex01Lotto());
		func(new int[]{12,3});
		
	}
	
	public static void func(Object obj){
		//오브젝트를 인자로 받을 시 모든걸 받을 수 있다.
		//하지만 출력만 가능할뿐 제어할 수 있는것이 없다고봐도 무방함으로 옳지않다.
		
		
	}
	
	public String toString(){
		return "너야 너";
	}


}
