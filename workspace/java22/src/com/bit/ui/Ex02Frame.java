package com.bit.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ex02Frame extends Frame{
	// ȭ�鱸���� ���
	// ��ҵ��� ��� �� ������. = ��� ��ġ�� ������.
		//��ġ�����ڰ� ����� �ִ���.
	
	public Ex02Frame() {
		//��ġ������. ui�� â �ȿ� ��� ����.
		java.awt.FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		
		add(btn1);
		add(btn2);
		
		setSize(300,200);
		setLocation(100,100);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		Ex02Frame me = new Ex02Frame();

	}

}
