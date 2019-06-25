package com.bit.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex02Mouse extends Frame implements MouseListener{
	// ��ư, �г� � ����� �� �ִ�.
	
	public Ex02Mouse() {
		
		Panel p = new Panel();
		
		Button btn = new Button("��ư");
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
		System.out.println("Ŭ��");
		
	}

	public void mouseEntered(MouseEvent arg0) {
		System.out.println("���콺�� �÷�����");

	}

	public void mouseExited(MouseEvent arg0) {
		System.out.println("���콺�� ����������");

	}

	public void mousePressed(MouseEvent arg0) {

		System.out.println("���콺�� �����ִ�");

	}

	public void mouseReleased(MouseEvent arg0) {
		// Ŭ���� �� ����� ��ü�� �߿��ϴ�.
		System.out.println("���콺�� Ǯ�ȴ�");

	}

}
