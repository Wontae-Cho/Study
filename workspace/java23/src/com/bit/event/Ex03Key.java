package com.bit.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex03Key extends Frame implements KeyListener{
	TextField tf;
	Button btn;
	int x=0;
	int y=0;
	
	public Ex03Key() {
		Panel p = new Panel();
		p.setLayout(null);
		
		tf = new TextField(10);
//		p.add(tf);
		btn = new Button("^");
		btn.setSize(30,30);
		btn.setLocation(x,y);
		btn.addKeyListener(this);
		
		p.add(btn);
		
		
		add(p);
		setSize(300,200);
		setLocation(100,100);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		Ex03Key me = new Ex03Key();

	}
	//keyPressed -> (keyTyped) -> keyReleased
	public void keyPressed(KeyEvent e) {
//		System.out.println("Ű������ Ű�� �����ִ�"+tf.getText());
		// Ű������ ��� ���ڵ��� �� ����, ��� �Ҵ�� ���ڷ�.
//		System.out.println(e.getKeyCode());
		// ���ڷ� ǥ���� �͵��� �� �������� �׷��� ���� �͵��� ǥ���ϱ� ��ƴ�.
//		System.out.println(e.getKeyChar());\
		if(e.getKeyCode()==39){
			x+=10;
		}else if(e.getKeyCode()==37){
			x-=10;
		}
		btn.setLocation(x,y);
	}
	public void keyReleased(KeyEvent e) {
		// ������ ���� �� ���� ����.
//		System.out.println("Ű���� Ű�� �ö�Դ�"+tf.getText());
//		System.out.println(e.getKeyCode());
		
	}
	public void keyTyped(KeyEvent e) {
//		System.out.println("���� �����"+tf.getText());
//		System.out.println(e.getKeyCode());

		
	}

}
