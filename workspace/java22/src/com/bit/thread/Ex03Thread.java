package com.bit.thread;

class Ex33 extends Thread{
	public void run(){
		System.out.println("2�� ������ ����");
		for(int i=0; i<10; i++){
			System.out.println("2�� working");
		}
		System.out.println("2�� ������ ����");
		
	}
}

public class Ex03Thread extends Thread{

	public static void main(String[] args) {
		//������ �����尡 �ٸ����� �ϰ� �ϰ������.
		Ex03Thread me = new Ex03Thread();
		Ex33 you = new Ex33();
		me.start();
		you.start();

	}
	public void run(){
		System.out.println("1�� ������ ����");
		for(int i=0; i<10; i++){
			System.out.println("1�� working");
		}
		System.out.println("1�� ������ ����");
		
	}

}
