package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex08GridBag extends Frame{
	//����ϱ� ��ٷӴ�.
	public Ex08GridBag() {
		// 9���� ��ư
		GridBagLayout layout = new GridBagLayout();
		// gbc��ü���ٰ� ���� ��Ƽ� ��ü�� �����ϴ� ��.
		// ������ ��ư�� �ڵ鸵�� �� ����.
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
		
		//�׸����� ����
		gbc.gridwidth = 1;
		//�׸����� ����		
		gbc.gridheight =1;
		//�׸����� ��ġ
		gbc.gridx = 0;		//�׸����� ù��° �ڸ� 0,0���� ���� 0��°������ 0��° ������.
		gbc.gridy = 0;
		//�׸����� ����ġ
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
