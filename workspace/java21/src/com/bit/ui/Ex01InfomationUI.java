package com.bit.ui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex01InfomationUI {
	// AWT�� �ü���� �����ϴ� �� ������ ��.
		// �̹� �ü���� �ִ� ���̱� ������ �ӵ��� ����.
		// ������ �ü���� �������̴�. �׷��� �ü������ �ٸ���.
		// �ü���� ���ӵǴٺ��� ��� ���� �ü���� �����ϴ� �ͱ����� ����� �� �ִ�.
	// ������ �ڹٰ� ������ο� �Ѱ�.
		// �ڹٰ� ���� ��ο��Ѱ��̴ٺ��� �ü������ �������̰� �����Ӵ�.
		// �ü���� ������� �����ϴ�.
		// �ڿ��Ҹ� ���ϰ� �ӵ��� ������.
		// ������ ������ ������� �䱸�� ���� ����� �߰��ϰ� �����ϰ� ������ �� �ִ�.

	public static void main(String[] args) {
//		java.awt.Frame frame = new Frame(); //�����Ӱ�ü�� ����.
//		java.awt.Button btn = new Button();
		javax.swing.JFrame frame = new JFrame();
		javax.swing.JButton btn = new JButton();
		frame.add(btn);
		
		frame.setSize(500,300);	// (����,����)�ȼ��� ������.
		frame.setLocation(200,200); //default = 0,0
		frame.setVisible(true); //�� �� �ִ� â�� ����.
		
		

		
	}

}
