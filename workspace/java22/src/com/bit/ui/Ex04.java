package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex04 extends Frame{
		// Panel�� ���Ի����ؼ� Layout�� ���ļ� ������ ��ư�� �����ϴ� ���̶�� ���� �ȴ�.
		// Panel�� �⺻ �������´� FlowLayout�̸� �ʿ信 ���� �ٲ� �� �ִ�.
	
	public Ex04() {
		
		
		GridLayout layout = new GridLayout(2,1);
		setLayout(layout);
		
		Panel p1 = new Panel();
		Button btn1 = new Button("��ư1");
		p1.add(btn1);
		Button btn2 = new Button("��ư2");
		p1.add(btn2);
		
		add(p1);
		add(p1);
		
		setSize(300,400);
		setLocation(100,100);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Ex04 me = new Ex04();

	}

}
