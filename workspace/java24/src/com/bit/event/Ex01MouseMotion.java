package com.bit.event;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex01MouseMotion extends Frame implements MouseMotionListener{
	// 이벤트는 소스source, 리스너listener, 핸들러handler로 나뉜다.
	// 소스는 이벤트가 발생하는 컴포넌트(구성요소 ; 텍스트필드, 버튼, 패널 등) 들이 소스, 리스너는 이벤트가 발생하는지를 체크하는 것들이 리스너,
	// 이벤트가 발생했을때 기능을 구현하는게 핸들러이다. 핸들러는 리스너들에 메소드로 포함되어 있다.
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
















