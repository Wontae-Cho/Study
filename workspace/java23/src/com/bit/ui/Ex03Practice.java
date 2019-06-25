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
		//타이틀.
		setTitle("사원등록");
		setLayout(new GridLayout(8,1)); 
	
		// 첫번째 줄.
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout());
		
		Label la1 = new Label();
		la1.setText("성명");
		p1.add(la1);
		
		TextField tf10 = new TextField(10);
		p1.add(tf10);
		
		Label la2 = new Label();
		la2.setText("성별");
		p1.add(la2);
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox check1 = new Checkbox("남",cbg,true);
		Checkbox check2 = new Checkbox("여",cbg,false);
		p1.add(check1);
		p1.add(check2);
		//////////////////////////////
		
		// 두번째 줄. //주입. 패널에.
		Panel p2 = new Panel();
		Label la3 = new Label();
		la3.setText("주민등록번호");
		p2.add(la3);
		
		TextField tf9 = new TextField(7);
		p2.add(tf9);
		Label la4 = new Label();
		la4.setText("-");
		p2.add(la4);
		
		TextField tf8 = new TextField(7);
		p2.add(tf8);
		//////////////////////////////
		
		// 세번째 줄.
		Panel p3 = new Panel();
		Label la5 = new Label();
		la5.setText("주소");
		p3.add(la5);
		TextField tf2 = new TextField(30);
		p3.add(tf2);
		///////////////////////////////
		
		// 네번째 줄.
		Panel p4 = new Panel();
		Label la6 = new Label();
		la6.setText("부서명");
		p4.add(la6);
		
		Choice cho1 = new Choice();
		cho1.addItem("기획부");
		cho1.addItem("행정부");
		cho1.addItem("회계부");
		p4.add(cho1);
		//////////////////////////////
		
		// 다섯번째 줄.
		Panel p5 = new Panel();
		Label la7 = new Label();
		la7.setText("취 미");
		p5.add(la7);
		Checkbox check3 = new Checkbox("운동");
		Checkbox check4 = new Checkbox("음악감상");
		Checkbox check5 = new Checkbox("영화");
		Checkbox check6 = new Checkbox("컴퓨터");
		p5.add(check3);
		p5.add(check4);
		p5.add(check5);
		p5.add(check6);
		/////////////////////////////
		
		// 여섯번째줄 
		Panel p6 = new Panel();
		Label la8 = new Label();
		la7.setText("자 기 소 개");
		p6.add(la7);
		
		// 일곱번째줄
		Panel p7 = new Panel();
		TextArea ta = new TextArea("",5,60,TextArea.SCROLLBARS_BOTH);
		p7.add(ta);
		// 여덟번째줄
		Panel p8 = new Panel();
		Button btn1 = new Button("저장");
		Button btn2 = new Button("종료");
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
