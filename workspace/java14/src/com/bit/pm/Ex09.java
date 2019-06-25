package com.bit.pm;

interface Crud{
	//협업시 각각의 기능에 대한 강제성, 통일성을 부여할 수 있다.
	void add();
	void list();
	void edit();
	void delete();
}

class Bbs implements Crud{
	public void add(){
		
	}
	public void list(){
		
	}
	public void edit(){
		Crud me = new Bbs();
		me.delete();
		//~~~
		me.add();
		//~~~
	}
	public void delete(){
		
	}
}

public class Ex09 {


	public static void main(String[] args) {


	}

}
