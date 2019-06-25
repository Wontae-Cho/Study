package com.bit.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class Ex05 extends Frame{
	

	public Ex05() {
		// 절대좌표를 사용하는 레이아웃.
		// 레이아웃을 쓰지 않겠다고 명세해야함.
		// 각 객체에 어디에 들어가라고 정보를 넣어줘야함.
		// 넣지 않을시에 화면에 아예 표시를 안해줌.
		// 창을 기준으로 처리하기 때문에 가려지는 부분이 있음.
		// 이를 처리하기에 좋은 방법은 panel을 사용하는방법이다.
		// 절대좌표이기때문에 창을 줄이던 늘리던 그에 따른 반응은 없다.
		int x=8;
		int y=30;
		setLayout(null);
//		Panel p = new Panel();
//		p.setLayout(null);
	
		Label la1 = new Label("성  명");
		la1.setBackground(Color.green);
		//꽉 차서 들어가지 않게 사이즈를 줌.
		la1.setSize(100,50);
		// 들어갈 자리를 줌.
		la1.setLocation(x,y);
		add(la1);
//		p.add(la1);
		
		Label la2 = new Label("주민등록번호");
		la2.setBackground(Color.red);
		la2.setSize(120,50);
		la2.setLocation(x,y+50);
		add(la2);
//		p.add(la2);
		
		Label la3 = new Label("주 소");
		la3.setBackground(Color.blue);
		la3.setSize(150,50);
		la3.setLocation(x+0,y+100);
		add(la3);
//		p.add(la3);
		
//		add(p);
		// 운영체제와 소통하는 객체.
		// 툴킷은 추상클래스. 때문에 객체생성 불가능.
//		Toolkit tool = getToolkit();
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		// 컴퓨터에서 삡 소리나게함
		tool.beep();
		
		
		
		
		//모니터의 넓이
		Dimension screen = tool.getScreenSize();
		setSize(300,500);
		Dimension mysize = this.getSize();
//		Dimension dim = new Dimension();
//		dim.setSize(300,500);
		
		
		setLocation(screen.width/2-mysize.width/2
					,screen.height/2-mysize.height/2);
		setVisible(true);
		setResizable(false); //절대좌표로 설정했을 경우 사이즈 조정을 못하도록해줘야함.
		
		System.out.println(screen.width + ":" + screen.height);
		
//		System.out.println(this.getWidth()+":"+this.getHeight());
		
		
	}

	public static void main(String[] args) {
		new Ex05();

	}

}
