package com.bit.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class Ex05 extends Frame{
	

	public Ex05() {
		// ������ǥ�� ����ϴ� ���̾ƿ�.
		// ���̾ƿ��� ���� �ʰڴٰ� ���ؾ���.
		// �� ��ü�� ��� ����� ������ �־������.
		// ���� �����ÿ� ȭ�鿡 �ƿ� ǥ�ø� ������.
		// â�� �������� ó���ϱ� ������ �������� �κ��� ����.
		// �̸� ó���ϱ⿡ ���� ����� panel�� ����ϴ¹���̴�.
		// ������ǥ�̱⶧���� â�� ���̴� �ø��� �׿� ���� ������ ����.
		int x=8;
		int y=30;
		setLayout(null);
//		Panel p = new Panel();
//		p.setLayout(null);
	
		Label la1 = new Label("��  ��");
		la1.setBackground(Color.green);
		//�� ���� ���� �ʰ� ����� ��.
		la1.setSize(100,50);
		// �� �ڸ��� ��.
		la1.setLocation(x,y);
		add(la1);
//		p.add(la1);
		
		Label la2 = new Label("�ֹε�Ϲ�ȣ");
		la2.setBackground(Color.red);
		la2.setSize(120,50);
		la2.setLocation(x,y+50);
		add(la2);
//		p.add(la2);
		
		Label la3 = new Label("�� ��");
		la3.setBackground(Color.blue);
		la3.setSize(150,50);
		la3.setLocation(x+0,y+100);
		add(la3);
//		p.add(la3);
		
//		add(p);
		// �ü���� �����ϴ� ��ü.
		// ��Ŷ�� �߻�Ŭ����. ������ ��ü���� �Ұ���.
//		Toolkit tool = getToolkit();
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		// ��ǻ�Ϳ��� �� �Ҹ�������
		tool.beep();
		
		
		
		
		//������� ����
		Dimension screen = tool.getScreenSize();
		setSize(300,500);
		Dimension mysize = this.getSize();
//		Dimension dim = new Dimension();
//		dim.setSize(300,500);
		
		
		setLocation(screen.width/2-mysize.width/2
					,screen.height/2-mysize.height/2);
		setVisible(true);
		setResizable(false); //������ǥ�� �������� ��� ������ ������ ���ϵ����������.
		
		System.out.println(screen.width + ":" + screen.height);
		
//		System.out.println(this.getWidth()+":"+this.getHeight());
		
		
	}

	public static void main(String[] args) {
		new Ex05();

	}

}
