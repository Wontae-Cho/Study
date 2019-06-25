package com.bit.ui;

import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.Toolkit;



public class Ex06Menu extends Frame{
	// 메뉴바만들기.
	// 메뉴같은경우에는 운영체제의 종속되는 편이 사용하기 편하고 보기도 편하기 때문에 awt가 선호된다.
	
	public Ex06Menu() {
		setTitle("Menu");
		
		MenuBar menu = new MenuBar();	// 메뉴바의 생성을 해줌
		Menu menu1 = new Menu("파일");	// 생성해준 메뉴바에 메뉴를 추가.
		MenuItem mitem1 = new MenuItem("열기");	// 생성한 메뉴에 요소를 추가.
		menu1.add(mitem1);
		// 구분경계생성.
		menu1.addSeparator();
		MenuItem mitem2 = new MenuItem("종료");
		menu1.add(mitem2);
		
		
		
		Menu menu2 = new Menu("편집");
		MenuItem mitem3 = new MenuItem("실행취소");
		menu2.add(mitem3);
		menu2.addSeparator();
		CheckboxMenuItem mitem4 = new CheckboxMenuItem("item1");
		CheckboxMenuItem mitem5 = new CheckboxMenuItem("item2");
		CheckboxMenuItem mitem6 = new CheckboxMenuItem("item3");
		menu2.add(mitem4);
		menu2.add(mitem5);
		menu2.add(mitem6);
		menu2.addSeparator();
		
		PopupMenu popup = new PopupMenu("그룹");	//메뉴에서 연결된 메뉴
		MenuItem mitem7= new MenuItem("구성원1");
		popup.add(mitem7);
		MenuItem mitem8= new MenuItem("구성원2");
		popup.add(mitem8);
		menu2.add(popup);
		
		
		Menu menu3 = new Menu("도움말");
		menu.add(menu1);
		menu.add(menu2);
		menu.add(menu3);
		
		
//		this.setJMenuBar(menu); // swing
		this.setMenuBar(menu); // awt
		Panel p = new Panel();
		p.setLayout(null);
		p.setBackground(Color.CYAN);
		Button btn = new Button("0,0지점");
		btn.setSize(100,50);
		btn.setLocation(484-100,242-50); //484,242 왼쪽위가 끝지점.
		p.add(btn);
		add(p);
		
		Dimension dim = new Dimension(500,300);
		setSize(dim);
		Dimension win = Toolkit.getDefaultToolkit().getScreenSize();
		//로케이션 가운데 설정하기.
		setLocation(win.width/2-dim.width/2,win.height/2 - dim.width/2);
		setVisible(true);
		System.out.println(p.getSize().height); //242
		System.out.println(p.getSize().width);	//484
	}

	
	public static void main(String[] args) {
		new Ex06Menu();

	}

}
