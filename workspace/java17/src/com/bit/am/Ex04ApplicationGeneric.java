package com.bit.am;

class Factory<T>{
	private T obj;
	
	public Factory(){
		
	}
	
	public void set(T obj){
		this.obj = obj;
	}
	
	public T get(){
		return this.obj;
	}
}
// 디자인패턴 - 코딩을 하는 도중 잘된 패턴들의 공통점을 부르는 것.
// 팩토리패턴 - 디자인패턴 중 하나.
class Template{ //공장
	public static <T>Factory<T> getInstence(T obj){ //객체생성을 담당
		Factory<T> box = new Factory<T>();
		box.set(obj);
		return box;	
	}
}

public class Ex04ApplicationGeneric {


	public static void main(String[] args) {
		Ballpan pan1 = new Ballpan();
		Pancil pan2 = new Pancil();
		Factory<Pancil> box = Template.<Pancil>getInstence(pan2);
		box.get().draw();
//		Template.<Ballpan>getInstence(pan1).get().draw();
	}

}
