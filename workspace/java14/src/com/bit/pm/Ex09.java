package com.bit.pm;

interface Crud{
	//������ ������ ��ɿ� ���� ������, ���ϼ��� �ο��� �� �ִ�.
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
