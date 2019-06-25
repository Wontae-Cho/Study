package com.bit.event;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex01MouseMotion extends Frame implements MouseMotionListener{
	// �̺�Ʈ�� �ҽ�source, ������listener, �ڵ鷯handler�� ������.
	// �ҽ��� �̺�Ʈ�� �߻��ϴ� ������Ʈ(������� ; �ؽ�Ʈ�ʵ�, ��ư, �г� ��) ���� �ҽ�, �����ʴ� �̺�Ʈ�� �߻��ϴ����� üũ�ϴ� �͵��� ������,
	// �̺�Ʈ�� �߻������� ����� �����ϴ°� �ڵ鷯�̴�. �ڵ鷯�� �����ʵ鿡 �޼ҵ�� ���ԵǾ� �ִ�.
	public Ex01MouseMotion() {
		
		addMouseMotionListener(this);
		
		
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex01MouseMotion me = new Ex01MouseMotion();
	}

	public void mouseDragged(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		int wx=e.getXOnScreen();
		int wy=e.getYOnScreen();
		System.out.println(wx+","+wy);
	}

	public void mouseMoved(MouseEvent e) {
//		System.out.println("mouseMoved...");
	}

}
















