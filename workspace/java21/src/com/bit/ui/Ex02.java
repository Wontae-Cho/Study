package com.bit.ui;

import java.awt.Frame;

public class Ex02 extends Frame{
	//프레임을 상속받음
	public Ex02() { //생성자에 넣을 수 있고 자신을 부르는 거기 때문에 참조변수가 필요없음.
//		setSize(500,400);
//		setLocation(400, 400);
//		setVisible(true);
	}
	public static void main(String[] args) {
		Ex02 me = new Ex02(); //프레임을 상속받았으니 자신이 곧 프레임임.
		
		me.setSize(500,400);
		me.setLocation(400, 400);
		me.setVisible(true);

	}

}
