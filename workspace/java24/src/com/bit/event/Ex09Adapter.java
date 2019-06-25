package com.bit.event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex09Adapter extends WindowAdapter{
	static Frame frame;
	
	public void windowClosing(WindowEvent e) {
		frame.dispose();
	}

	public static void main(String[] args) {
		frame=new Frame();
		frame.addWindowListener(new Ex09Adapter());
		
		frame.setBounds(100,100,500,400);
		frame.setVisible(true);

	}

}










