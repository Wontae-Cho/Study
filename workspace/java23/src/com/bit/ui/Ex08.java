package com.bit.ui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class Ex88 extends Canvas{
	
	// �������̵�. ����� ����.
	// awt�� �׷����� ���ڷ� ����.
	public void paint(Graphics g){
		System.out.println("�׸��� �׸��ϴ�.");
		g.setColor(Color.BLUE);
		g.draw3DRect(100, 100, 100, 100,false);
		g.drawString("JAVA", 300,300);
		
//		g.setColor(Color.BLACK);
//		g.fillOval(300, 300, 100, 100);	//�ٱ����� �׸��� ������ ä��.
//		g.fillArc(300,100,200,200,0,270);
//		g.drawRect(100, 100, 200, 200);
//		//(���������� ��ǥ , ������ ��ǥ) (x,y) (x+?, y+?)
//		g.setColor(Color.RED);
//		g.drawLine(100,100, 300,300);
//		//(���������� ��ǥ, �������� ��ǥ)
//		g.setColor(Color.BLACK);
//		//�켱 �ڽ��� ����� �ڽ��� ���� ä��� ����.
//		g.drawOval(300, 300, 100, 100); // ���������� ��ǥ (�ڽ��� ������) ����, ����
//		g.drawArc(300,100,200,200,0,270);
	}
}

public class Ex08 extends Frame{

	public Ex08() {
		setTitle("Canvas");
		
		// �� �̹� �������� ��ӹ޾� �� ����� �������� 
		// ��ӹ��� Ŭ������ �����ͼ� ��������.
		Ex88 can = new Ex88();
		
//		Canvas can = new Canvas();
		
		add(can);
		setSize(600,600);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex08 me = new Ex08();

	}
	
	

}
