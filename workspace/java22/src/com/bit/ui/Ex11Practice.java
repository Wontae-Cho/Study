package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex11Practice extends Frame {
	
	public Ex11Practice() {
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		Button btn1 = new Button("7");
		Button btn2 = new Button("8");
		Button btn3 = new Button("9");
		Button btn4 = new Button("+");
		Button btn5 = new Button("4");
		Button btn6 = new Button("5");
		Button btn7 = new Button("6");
		Button btn8 = new Button("1");
		Button btn9 = new Button("2");
		Button btn0 = new Button("3");
		Button btn10 = new Button("=");
		Button btn11 = new Button("0");
		Button btn12 = new Button(".");
		
		//첫번째.
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		add(btn1,gbc); //7
		//두번째.
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		add(btn2,gbc); //8
		//세번째.
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		add(btn3,gbc); //9
		//네번째
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		gbc.gridwidth = 1;
		add(btn4,gbc); //+
		//다섯
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		add(btn5,gbc); //4
		//여섯
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		add(btn6,gbc); //5
		//일곱
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		add(btn7,gbc); //6
		//여덟
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		add(btn8,gbc); //1
		//아홉
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		add(btn9,gbc); //2
		//열
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		add(btn0,gbc); //3
		//열하나
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridheight = 2;
		gbc.gridwidth = 1;
		add(btn10,gbc); //=
		//열둘
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		add(btn11,gbc); //0
		//열셋
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		add(btn12,gbc); //.
		
		
		setSize(400,400);
		setLocation(100,100);
		setVisible(true);
	}


	public static void main(String[] args) {
		Ex11Practice me = new Ex11Practice();

	}

}
