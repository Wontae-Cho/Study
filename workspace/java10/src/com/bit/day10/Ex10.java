package com.bit.day10;

class Ex11{
	
	public Ex11(int a){
		System.out.println(a+"�θ�ü ����...");
	}
	
	public void func01(){
		System.out.println("�θ�Ŭ������ ���");
	}
}

public class Ex10 extends Ex11{
	
	public Ex10(){
		super(1111); //�����Ǿ��� ����.
		System.out.println("�ڽİ�ü ����...");
	}
	
	public Ex10(int a){
		super(a); //this();
		System.out.println("param a="+a+"�� �޴� ������ ȣ��");
	}

	public static void main(String[] args) {
		Ex10 me= new Ex10();
		me.func01();

	}
	public void func01(){ //���������� �θ�� ���ؼ� ��ġ�ϰų� �� �������� ��츸 ���.
		super.func01();
		System.out.println("�ڽ�Ŭ������ ���"); //������ ����, ���� ���� ��ġ�ؾ� �������̵�.
	}

}
