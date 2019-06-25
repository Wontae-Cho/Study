package com.bit.pm;

abstract class Machine{
	public abstract void on(); //on에 대한 기능 구현에 대한 강제성을 부여.
	public void off(){ //off에 대한 기능 구현에 대한 강제성을 부여
		System.out.println("끄다");
	}
}

class Tv extends Machine{
	public void on(){
		System.out.println("화면을 출력한다");
	}
}

class Radio extends Machine{
	public void on(){
		System.out.println("주파수를 잡아 소리를 낸다");
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
