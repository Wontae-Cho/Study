package com.bit;

import java.util.Scanner;

interface Inter{
	void on();
}
class Tv implements Inter{
	public void on() {
		System.out.println("tv�� �Ѵ�");
	}
}
class Radio implements Inter{
	public void on() {
		System.out.println("Radio�� �Ѵ�");
	}
}
class Audio implements Inter{
	public void on() {
		System.out.println("Audio�� �Ѵ�");
	}
}

public class Remote {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Class clz = Class.forName(input);
		Inter remote = (Inter) clz.newInstance();
		remote.on();
	}

}