package com.bit.ui;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Ex04Lec extends Frame{
	
	public Ex04Lec() {
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		Panel p1 = new Panel();
		p1.setLayout(gbl);
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		p1.add(new Label("성  명"),gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		p1.add(new TextField(),gbc);
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		p1.add(new Label("성  별"),gbc);
		Panel p2 = new Panel();
		
		gbc.gridx=3;
		gbc.gridy=0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		p1.add(p2,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		p1.add(new Label("주  소"),gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		p1.add(new Label("부  서  명"),gbc);
		
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		p1.add(new Label("취     미"),gbc);
		
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		p1.add(new Label("자  기  소  개"),gbc);
		
		add(p1);
		setSize(300,500);
		setLocation(100,100);
		setVisible(true);
	}


	public static void main(String[] args) {
		Ex04Lec me = new Ex04Lec();

	}

}
