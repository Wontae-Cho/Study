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
	// 메모장
	public Ex06Practice() {
		setTitle("메모장");
		
//		this.setLayout(new GridLayout(1,1));
		
		//메뉴바의 생성.
		MenuBar bar = new MenuBar();
		
		//메뉴바에 들어갈 첫번째 메뉴
		Menu menu1 = new Menu("파일");
		//메뉴바에 메뉴1을 추가.
		bar.add(menu1);
		//메뉴1이 가지고 있어야할 아이템
		MenuItem mitem1 = new MenuItem("새파일"); 
		menu1.add(mitem1);
		menu1.addSeparator();
		MenuItem mitem2 = new MenuItem("열기");
		menu1.add(mitem2);
		MenuItem mitem3 = new MenuItem("저장");
		menu1.add(mitem3);
		menu1.addSeparator();
		MenuItem mitem4 = new MenuItem("종료");
		menu1.add(mitem4);
		
		
		Menu menu2 = new Menu("서식");
		bar.add(menu2);
		MenuItem mitem5 = new MenuItem("글꼴"); 
		menu2.add(mitem5);
		Menu menu3 = new Menu("도움말");
		bar.add(menu3);
		MenuItem mitem6 = new MenuItem("글꼴"); 
		menu3.add(mitem6);
		
		//위에 만든 메뉴들을 내 객체에 넣음.
		this.setMenuBar(bar);
		
		
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(1,1));
		TextArea ta = new TextArea("",p.getSize().height,p.getWidth(),TextArea.SCROLLBARS_BOTH);
		p.add(ta);
		
		
		add(p);
		//사이즈 설정
		Dimension dim = new Dimension(400,300);
		setSize(dim);
		//로케이션 설정
		Dimension win = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(win.width/2-dim.width/2,win.height/2 - dim.width/2);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex06Practice();

	}

}
