package com.bit.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex05Practice extends Frame {

	public Ex05Practice() {
		BorderLayout layout = new BorderLayout();
		GridLayout layout2 = new GridLayout(4,3);
		
		Panel p1 = new Panel(layout);
		Button btn1 = new Button(" ");
		p1.add(btn1,BorderLayout.NORTH);
		Panel p2 = new Panel(layout2);
		Button btn2 = new Button("1");
		p2.add(btn2);
		Button btn3 = new Button("2");
		p2.add(btn3);
		Button btn4 = new Button("3");
		p2.add(btn4);
		Button btn5 = new Button("4");
		p2.add(btn5);
		Button btn6 = new Button("5");
		p2.add(btn6);
		Button btn7 = new Button("6");
		p2.add(btn7);
		Button btn8 = new Button("7");
		p2.add(btn8);
		Button btn9 = new Button("8");
		p2.add(btn9);
		Button btn10 = new Button("9");
		p2.add(btn10);
		Button btn11 = new Button("#");
		p2.add(btn11);
		Button btn12 = new Button("0");
		p2.add(btn12);
		Button btn13 = new Button("*");
		p2.add(btn13);
		
		
		add(p2);
		
		
		
		
		
		
		setSize(300,400);
		setLocation(100,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex05Practice me = new Ex05Practice();

	}

}
