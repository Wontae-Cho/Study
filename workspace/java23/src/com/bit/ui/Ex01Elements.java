package com.bit.ui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;







public class Ex01Elements /*extends Frame*/ {
	
	
	public static void main(String[] args) {
//		Ex01Elements me = new Ex01Elements();
		Frame frame = new Frame();
		
		Panel p1 = new Panel();
		p1.setLayout(new FlowLayout());
		
		// ��Ʈ��ü����.
		// ����� �־����͸� ����.
		Font font = new Font(Font.MONOSPACED,Font.ITALIC,20); // (String name, int style, int size)
										//(��Ʈ �̸�, ��Ÿ��, ���ڻ�����)
		//Style
//		font.BOLD //�β���
//		font.PLAIN //����
	
		
		
		// Label.
		Label laId= new Label();
		laId.setText("ID : ");
		//������� ��Ʈ �����ϱ�.
		laId.setFont(font); //��Ʈ��ü�� �����.
//		laId.setBackground(Color.RED);
		p1.add(laId);
		
		// �ؽ�Ʈ�ڽ��� ����� �Ͱ� ����. ���� ������ ũ�⸸ŭ.
		TextField tfId= new TextField(15);
		tfId.setFont(font);
//		tfId.setBackground(Color Green);
		p1.add(tfId);
		
		// ä��â�� �����.
		TextArea ta = new TextArea("",5,60,TextArea.SCROLLBARS_BOTH);
		ta.setFont(font);
		p1.add(ta);
		
		CheckboxGroup cbg = new CheckboxGroup();		// �����ڽ��� ����� ���. (�ϳ�������.)
														// üũ�ڽ��� �׷���� ����.
														// ���� �ϳ��� true�� �� �� ����.
		Checkbox chck1 = new Checkbox("item1",cbg,false); //(name, default��)
		Checkbox chck2 = new Checkbox("item1",cbg,true);
		Checkbox chck3 = new Checkbox("item1",cbg,false);
		chck1.setFont(font);
		chck2.setFont(font);
		chck3.setFont(font);
		p1.add(chck1);
		p1.add(chck2);
		p1.add(chck3);
		
		
		Button btn = new Button("Ȯ��");
		p1.add(btn);
		
		frame.add(p1);
		frame.setSize(500,400);
		frame.setLocation(100,100);
		frame.setVisible(true);
	}

}
