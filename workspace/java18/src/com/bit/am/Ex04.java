package com.bit.am;

class Target4 implements java.lang.Comparable{
	int su = 1000;
	
	public Target4() {

	}
	public Target4(int su) {
		this.su = su;
	}
	
	public boolean equals(Object obj){
		Target4 me = this;
		Target4 you = (Target4)obj;
		return me.su == you.su;
	}
	
	public String toString(){
		return ""+su;
	}
	@Override
	public int compareTo(Object obj) {
		Target4 me = this;
		Target4 you = (Target4) obj;
		
//		return me.su - you.su;
		return you.su - me.su;
	}
}

public class Ex04 {


	public static void main(String[] args) {
		Target4 target4 = new Target4();
		Target4 target5 = new Target4(100);
		System.out.println(target4);
		System.out.println(target4.equals(target5));
		//이미 생성된 기능들을 오버라이드해서 ==이 참조변수 주소가 아닌 밸류값을 비교하도록 

	}

}
