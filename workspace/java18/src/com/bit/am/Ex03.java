package com.bit.am;

public class Ex03 {


	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();
		Object obj3 = obj;
		
//		System.out.println(obj.equals(obj));  //true
//		System.out.println(obj.equals(obj2)); //false
//		System.out.println(obj.equals(obj3)); //true
		
//		System.out.println(obj.toString());
//		System.out.println(obj.getClass()); // 클래스에 대한 정보
//		int su = obj.hashCode(); 	//10진수
//		String code = Integer.toHexString(su); //10진수 정수를 16진수로 바꿈
//		System.out.println(code);
		Ex03 me = new Ex03();
		Ex03 you  = new Ex03();
		Ex03 me2=null;
		me2 = (Ex03)me.clone();
	
		System.out.println(me.equals(me2));	// 얕은복사일 경우 true 깊은 복사일 경우에는 false
		System.out.println(me.equals(you));	// 원래 false이나 equals 메소드를 오버라이드 함.
		System.out.println(me);
		System.out.println(you);
		
//		System.out.println(me);
//		System.out.println(me.toString()); //내 클래스에 대한 정보 @ 해시코드값. =>오브젝트에 있는 기능들을 이용한것.
		
		
	}
	public int hashCode(){
		return 1111;
	}
	public boolean equals(Object obj){
		
//		return this.hashCode() == obj.hashCode();
		return this.toString().equals(obj.toString());
	}
	public Object clone(){
//		return new Ex03(); //깊은복사
		return this;	//얕은 복사
	}
	
//	public String toString(){
//		return "바꿈";
//	}
	
	

}
