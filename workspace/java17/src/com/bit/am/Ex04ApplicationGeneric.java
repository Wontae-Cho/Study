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
// ���������� - �ڵ��� �ϴ� ���� �ߵ� ���ϵ��� �������� �θ��� ��.
// ���丮���� - ���������� �� �ϳ�.
class Template{ //����
	public static <T>Factory<T> getInstence(T obj){ //��ü������ ���
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
