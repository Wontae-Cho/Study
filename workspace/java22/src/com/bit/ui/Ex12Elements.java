package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;



public class Ex12Elements extends Frame {
	static TextField tf=null;
	static TextArea ta = null;
	
	public Ex12Elements() {
		setTitle("���α׷� ����");
		Panel p1 =new Panel();
		
		//������ ǥ���� ����. ���� �ٲٴµ��� ����.
		Label la = new Label("��ư�� �����ּ���");
		la.setText("ID : ");
		p1.add(la);
		
		tf = new TextField("����Ʈ",10/*Size*/); // ���ڼ� �׷��� ��Ʈ���� �޶� �Ϻ����� �ʴ�.
															// ����Ʈ�� ���ָ� ����ִ�ä�� ���� �� �ִ�.
		tf.setEchoChar('#');	// ��й�ȣ�������� ĥ�� �����̿�Ǵ� ��.
								// �Է��ϴ� ���� �״�� �´�.
		p1.add(tf);
		
		TextArea ta = new TextArea("",5,30,TextArea.SCROLLBARS_NONE); //"����Ʈ������ ����",������(int, int),��ũ�ѿ��� 
		
		p1.add(ta);
		
		
		Button btn = new Button();
		btn.setLabel("�α���");
		
		//�󺧰��� ����.
//		System.out.println(btn.getLabel());
		p1.add(btn);
		
		
		add(p1);
		
		
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ex12Elements me = new Ex12Elements();
		try {
			Thread.sleep(5000); 
			//5�� �ڿ� �ؽ�Ʈ������ ���� ������.
			System.out.println(ta.getText());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
