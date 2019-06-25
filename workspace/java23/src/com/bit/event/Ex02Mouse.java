package com.bit.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex02Mouse extends Frame implements MouseListener{
	// 버튼, 패널 등에 적용될 수 있다.
	
	public Ex02Mouse() {
		
		Panel p = new Panel();
		
		Button btn = new Button("버튼");
		btn.addMouseListener(this);
		p.add(btn);
		
//		add(p);
		setSize(600,500);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02Mouse me = new Ex02Mouse();
		

	}

	public void mouseClicked(MouseEvent arg0) {
		System.out.println("클릭");
		
	}

	public void mouseEntered(MouseEvent arg0) {
		System.out.println("마우스가 올려졌다");

	}

	public void mouseExited(MouseEvent arg0) {
		System.out.println("마우스가 빠져나갔다");

	}

	public void mousePressed(MouseEvent arg0) {

		System.out.println("마우스가 눌려있다");

	}

	public void mouseReleased(MouseEvent arg0) {
		// 클릭을 할 당시의 객체가 중요하다.
		System.out.println("마우스가 풀렸다");

	}

}
