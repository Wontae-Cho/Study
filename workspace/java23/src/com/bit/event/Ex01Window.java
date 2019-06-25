package com.bit.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01Window extends Frame implements WindowListener{
	// 윈도우리스너 (인터페이스)
	// ui도 쓰레드.
	public Ex01Window() {

		// 이벤트 등록
		// 창에다가 부여하는 이벤트
		addWindowListener(this);
		
		
	
		setSize(300,200);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex01Window me = new Ex01Window();
		
	}

	// 이벤트 들.
	public void windowActivated(WindowEvent arg0) {
		// 활성화
		System.out.println("활성화");		
	}
	public void windowClosed(WindowEvent arg0) {
		System.out.println("프로그램 종료시 수행하고 싶은 일...");		
	}
	public void windowClosing(WindowEvent arg0) {
		System.out.println("창닫기...");
		//System.exit(0); // 안좋은방법.
		dispose();	//안전하게 프로그램을 종료하는 방법.
	}
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("비활성화");		
	}
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("비최소화...");		
	}
	public void windowIconified(WindowEvent arg0) {
		System.out.println("최소화...");		
	}
	public void windowOpened(WindowEvent arg0) {
		System.out.println("창이 열림...");
	}

}
