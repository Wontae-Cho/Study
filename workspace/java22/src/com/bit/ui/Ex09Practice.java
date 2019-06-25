package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex09Practice extends Frame {
	
	public Ex09Practice() {
		//일반적으로 가중치는 잘 건드리지 않고, 넓이, 높이를 조작한다.
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
		Button btn7 = new Button("7");
		Button btn8 = new Button("8");
		Button btn9 = new Button("9");
		
		//첫번째.
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(btn1,gbc);
		//두번째
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(btn2,gbc);
		//세번째
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(btn3,gbc);
		//네번째
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(btn4,gbc);
		//다섯번째.
		gbc.gridx=2;
		gbc.gridy=1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(btn5,gbc);
		//여섯번째
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridheight = 2;
		gbc.gridwidth = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(btn6,gbc);
		//일곱번째
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(btn7,gbc);
		//여덟번째
		gbc.gridx=1;
		gbc.gridy=3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(btn8,gbc);
		//아홉번째
		gbc.gridx=2;
		gbc.gridy=3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(btn9,gbc);
		
		
		
	
		setSize(300,400);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex09Practice me = new Ex09Practice();

	}

}
