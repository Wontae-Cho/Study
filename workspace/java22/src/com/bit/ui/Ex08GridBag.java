package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex08GridBag extends Frame{
	//사용하기 까다롭다.
	public Ex08GridBag() {
		// 9개의 버튼
		GridBagLayout layout = new GridBagLayout();
		// gbc객체에다가 값을 담아서 객체를 전달하는 것.
		// 각각의 버튼을 핸들링할 수 있음.
		GridBagConstraints gbc = new GridBagConstraints();
		//
//		gbc.fill=GridBagConstraints.BOTH;
		gbc.fill=1;
		setLayout(layout);
		
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
		Button btn7 = new Button("7");
		Button btn8 = new Button("8");
		Button btn9 = new Button("9");
		
		//그리드의 넓이
		gbc.gridwidth = 1;
		//그리드의 높이		
		gbc.gridheight =1;
		//그리드의 위치
		gbc.gridx = 0;		//그리드의 첫번째 자리 0,0에서 시작 0번째가로줄 0번째 새로줄.
		gbc.gridy = 0;
		//그리드의 가중치
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		add(btn1,gbc);
		
		gbc.gridwidth = 1;
		gbc.gridheight =1;
		gbc.gridx = 1; 
		gbc.gridy = 0;
		add(btn2,gbc);
		
		gbc.gridwidth = 1;
		gbc.gridheight =1;
		gbc.gridx = 2;
		gbc.gridy = 0;
		add(btn3,gbc);
		
		gbc.gridwidth = 1;
		gbc.gridheight =1;
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(btn4,gbc);
		
		gbc.gridwidth = 1;
		gbc.gridheight =1;
		gbc.gridx = 1;
		gbc.gridy = 1;
		add(btn5,gbc);
		
		gbc.gridwidth = 1;
		gbc.gridheight =1;
		gbc.gridx = 2;
		gbc.gridy = 1;
		add(btn6,gbc);
		
		gbc.gridwidth = 1;
		gbc.gridheight =1;
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(btn7,gbc);
		
		gbc.gridwidth = 1;
		gbc.gridheight =1;
		gbc.gridx = 1;
		gbc.gridy = 2;
		add(btn8,gbc);
		
		gbc.gridwidth = 1;
		gbc.gridheight =1;
		gbc.gridx = 2;
		gbc.gridy = 2;
		add(btn9,gbc);
		
		
		
		
		setSize(400,400);
		setLocation(100,100);
		setVisible(true);
	}


	public static void main(String[] args) {
		Ex08GridBag me = new Ex08GridBag();

	}

}
