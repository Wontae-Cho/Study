package com.bit.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ex02Frame extends Frame{
	// 화면구성의 요소
	// 요소들이 어떻게 들어갈 것인지. = 어떻게 배치할 것인지.
		//배치관리자가 어떤것이 있는지.
	
	public Ex02Frame() {
		//배치관리자. ui가 창 안에 어떻게 들어갈지.
		java.awt.FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		
		add(btn1);
		add(btn2);
		
		setSize(300,200);
		setLocation(100,100);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		Ex02Frame me = new Ex02Frame();

	}

}
