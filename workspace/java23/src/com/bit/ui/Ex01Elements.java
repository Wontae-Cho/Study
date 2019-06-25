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
		
		// 폰트객체생성.
		// 상수로 주어진것만 가능.
		Font font = new Font(Font.MONOSPACED,Font.ITALIC,20); // (String name, int style, int size)
										//(폰트 이름, 스타일, 글자사이즈)
		//Style
//		font.BOLD //두껍게
//		font.PLAIN //보통
	
		
		
		// Label.
		Label laId= new Label();
		laId.setText("ID : ");
		//사이즈와 폰트 조절하기.
		laId.setFont(font); //폰트객체를 줘야함.
//		laId.setBackground(Color.RED);
		p1.add(laId);
		
		// 텍스트박스를 만드는 것과 같음. 내가 지정한 크기만큼.
		TextField tfId= new TextField(15);
		tfId.setFont(font);
//		tfId.setBackground(Color Green);
		p1.add(tfId);
		
		// 채팅창과 비슷함.
		TextArea ta = new TextArea("",5,60,TextArea.SCROLLBARS_BOTH);
		ta.setFont(font);
		p1.add(ta);
		
		CheckboxGroup cbg = new CheckboxGroup();		// 라디오박스를 만드는 방법. (하나만선택.)
														// 체크박스를 그룹지어서 만듦.
														// 오직 하나만 true가 올 수 있음.
		Checkbox chck1 = new Checkbox("item1",cbg,false); //(name, default값)
		Checkbox chck2 = new Checkbox("item1",cbg,true);
		Checkbox chck3 = new Checkbox("item1",cbg,false);
		chck1.setFont(font);
		chck2.setFont(font);
		chck3.setFont(font);
		p1.add(chck1);
		p1.add(chck2);
		p1.add(chck3);
		
		
		Button btn = new Button("확인");
		p1.add(btn);
		
		frame.add(p1);
		frame.setSize(500,400);
		frame.setLocation(100,100);
		frame.setVisible(true);
	}

}
