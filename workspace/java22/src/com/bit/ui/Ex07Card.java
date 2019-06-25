package com.bit.ui;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ex07Card extends Frame {
		// layout�� �ѱ�ٰ��ؼ� CardLayout
		// layout.next(); �ʿ�.
		static CardLayout layout;

	
	public Ex07Card() {
		
		layout = new CardLayout();
		setLayout(layout);
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		
		Button btn1 = new Button("1 page");
		p1.add(btn1);
		
		Button btn2 = new Button("2 page");
		p2.add(btn2);
		
		Button btn3 = new Button("3 page");
		p3.add(btn3);
		
		add(p1);
		add(p2);
		add(p3);
	
		setSize(300,500);
		setLocation(100,100);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		Ex07Card me = new Ex07Card();
		for(int i=0; i<10; i++){
			try {
				Thread.sleep(2000);
				// ���ڷ� layout�� ���� ��ü�� �־����.
				layout.next(me);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
	}

}
