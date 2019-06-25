package com.bit.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex01Window extends Frame implements WindowListener{
	// �����츮���� (�������̽�)
	// ui�� ������.
	public Ex01Window() {

		// �̺�Ʈ ���
		// â���ٰ� �ο��ϴ� �̺�Ʈ
		addWindowListener(this);
		
		
	
		setSize(300,200);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex01Window me = new Ex01Window();
		
	}

	// �̺�Ʈ ��.
	public void windowActivated(WindowEvent arg0) {
		// Ȱ��ȭ
		System.out.println("Ȱ��ȭ");		
	}
	public void windowClosed(WindowEvent arg0) {
		System.out.println("���α׷� ����� �����ϰ� ���� ��...");		
	}
	public void windowClosing(WindowEvent arg0) {
		System.out.println("â�ݱ�...");
		//System.exit(0); // ���������.
		dispose();	//�����ϰ� ���α׷��� �����ϴ� ���.
	}
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("��Ȱ��ȭ");		
	}
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("���ּ�ȭ...");		
	}
	public void windowIconified(WindowEvent arg0) {
		System.out.println("�ּ�ȭ...");		
	}
	public void windowOpened(WindowEvent arg0) {
		System.out.println("â�� ����...");
	}

}
