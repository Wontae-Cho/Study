package com.bit.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex03Practice extends Frame{
	
	public Ex03Practice() {
		//Ÿ��Ʋ.
		setTitle("������");
		setLayout(new GridLayout(8,1)); 
	
		// ù��° ��.
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout());
		
		Label la1 = new Label();
		la1.setText("����");
		p1.add(la1);
		
		TextField tf10 = new TextField(10);
		p1.add(tf10);
		
		Label la2 = new Label();
		la2.setText("����");
		p1.add(la2);
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox check1 = new Checkbox("��",cbg,true);
		Checkbox check2 = new Checkbox("��",cbg,false);
		p1.add(check1);
		p1.add(check2);
		//////////////////////////////
		
		// �ι�° ��. //����. �гο�.
		Panel p2 = new Panel();
		Label la3 = new Label();
		la3.setText("�ֹε�Ϲ�ȣ");
		p2.add(la3);
		
		TextField tf9 = new TextField(7);
		p2.add(tf9);
		Label la4 = new Label();
		la4.setText("-");
		p2.add(la4);
		
		TextField tf8 = new TextField(7);
		p2.add(tf8);
		//////////////////////////////
		
		// ����° ��.
		Panel p3 = new Panel();
		Label la5 = new Label();
		la5.setText("�ּ�");
		p3.add(la5);
		TextField tf2 = new TextField(30);
		p3.add(tf2);
		///////////////////////////////
		
		// �׹�° ��.
		Panel p4 = new Panel();
		Label la6 = new Label();
		la6.setText("�μ���");
		p4.add(la6);
		
		Choice cho1 = new Choice();
		cho1.addItem("��ȹ��");
		cho1.addItem("������");
		cho1.addItem("ȸ���");
		p4.add(cho1);
		//////////////////////////////
		
		// �ټ���° ��.
		Panel p5 = new Panel();
		Label la7 = new Label();
		la7.setText("�� ��");
		p5.add(la7);
		Checkbox check3 = new Checkbox("�");
		Checkbox check4 = new Checkbox("���ǰ���");
		Checkbox check5 = new Checkbox("��ȭ");
		Checkbox check6 = new Checkbox("��ǻ��");
		p5.add(check3);
		p5.add(check4);
		p5.add(check5);
		p5.add(check6);
		/////////////////////////////
		
		// ������°�� 
		Panel p6 = new Panel();
		Label la8 = new Label();
		la7.setText("�� �� �� ��");
		p6.add(la7);
		
		// �ϰ���°��
		Panel p7 = new Panel();
		TextArea ta = new TextArea("",5,60,TextArea.SCROLLBARS_BOTH);
		p7.add(ta);
		// ������°��
		Panel p8 = new Panel();
		Button btn1 = new Button("����");
		Button btn2 = new Button("����");
		p8.add(btn1);
		p8.add(btn2);
			
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		setSize(400,500);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex03Practice me = new Ex03Practice();

	}

}
