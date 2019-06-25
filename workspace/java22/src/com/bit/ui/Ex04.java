package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex04 extends Frame{
		// Panel은 쉽게생각해서 Layout을 겹쳐서 각각의 버튼을 관리하는 것이라고 보면 된다.
		// Panel의 기본 관리형태는 FlowLayout이며 필요에 따라 바꿀 수 있다.
	
	public Ex04() {
		
		
		GridLayout layout = new GridLayout(2,1);
		setLayout(layout);
		
		Panel p1 = new Panel();
		Button btn1 = new Button("버튼1");
		p1.add(btn1);
		Button btn2 = new Button("버튼2");
		p1.add(btn2);
		
		add(p1);
		add(p1);
		
		setSize(300,400);
		setLocation(100,100);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Ex04 me = new Ex04();

	}

}
