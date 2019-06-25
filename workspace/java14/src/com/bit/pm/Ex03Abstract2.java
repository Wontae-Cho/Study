package com.bit.pm;

abstract class Machine{
	public abstract void on(); //on�� ���� ��� ������ ���� �������� �ο�.
	public void off(){ //off�� ���� ��� ������ ���� �������� �ο�
		System.out.println("����");
	}
}

class Tv extends Machine{
	public void on(){
		System.out.println("ȭ���� ����Ѵ�");
	}
}

class Radio extends Machine{
	public void on(){
		System.out.println("���ļ��� ��� �Ҹ��� ����");
	}
}

class Audio extends Machine{
	public void on(){
		
	}
}

public class Ex03Abstract2 {


	public static void main(String[] args) {
		Machine remote=new Audio();
		remote.on();
		remote.off();

	}

}
