package com.bit.ui;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;

public class Ex06Practice extends Frame {
	// �޸���
	public Ex06Practice() {
		setTitle("�޸���");
		
//		this.setLayout(new GridLayout(1,1));
		
		//�޴����� ����.
		MenuBar bar = new MenuBar();
		
		//�޴��ٿ� �� ù��° �޴�
		Menu menu1 = new Menu("����");
		//�޴��ٿ� �޴�1�� �߰�.
		bar.add(menu1);
		//�޴�1�� ������ �־���� ������
		MenuItem mitem1 = new MenuItem("������"); 
		menu1.add(mitem1);
		menu1.addSeparator();
		MenuItem mitem2 = new MenuItem("����");
		menu1.add(mitem2);
		MenuItem mitem3 = new MenuItem("����");
		menu1.add(mitem3);
		menu1.addSeparator();
		MenuItem mitem4 = new MenuItem("����");
		menu1.add(mitem4);
		
		
		Menu menu2 = new Menu("����");
		bar.add(menu2);
		MenuItem mitem5 = new MenuItem("�۲�"); 
		menu2.add(mitem5);
		Menu menu3 = new Menu("����");
		bar.add(menu3);
		MenuItem mitem6 = new MenuItem("�۲�"); 
		menu3.add(mitem6);
		
		//���� ���� �޴����� �� ��ü�� ����.
		this.setMenuBar(bar);
		
		
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(1,1));
		TextArea ta = new TextArea("",p.getSize().height,p.getWidth(),TextArea.SCROLLBARS_BOTH);
		p.add(ta);
		
		
		add(p);
		//������ ����
		Dimension dim = new Dimension(400,300);
		setSize(dim);
		//�����̼� ����
		Dimension win = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(win.width/2-dim.width/2,win.height/2 - dim.width/2);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex06Practice();

	}

}
