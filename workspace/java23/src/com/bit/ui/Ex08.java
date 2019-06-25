package com.bit.ui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class Ex88 extends Canvas{
	
	// 오버라이드. 상속의 목적.
	// awt의 그래픽을 인자로 받음.
	public void paint(Graphics g){
		System.out.println("그림을 그립니다.");
		g.setColor(Color.BLUE);
		g.draw3DRect(100, 100, 100, 100,false);
		g.drawString("JAVA", 300,300);
		
//		g.setColor(Color.BLACK);
//		g.fillOval(300, 300, 100, 100);	//바깥선을 그리고 안쪽을 채움.
//		g.fillArc(300,100,200,200,0,270);
//		g.drawRect(100, 100, 200, 200);
//		//(시작지점의 좌표 , 더해질 좌표) (x,y) (x+?, y+?)
//		g.setColor(Color.RED);
//		g.drawLine(100,100, 300,300);
//		//(시작지점의 좌표, 끝지점의 좌표)
//		g.setColor(Color.BLACK);
//		//우선 박스를 만들고 박스에 원을 채우는 개념.
//		g.drawOval(300, 300, 100, 100); // 시작지점의 좌표 (박스의 왼쪽위) 넓이, 높이
//		g.drawArc(300,100,200,200,0,270);
	}
}

public class Ex08 extends Frame{

	public Ex08() {
		setTitle("Canvas");
		
		// 난 이미 프레임을 상속받아 또 상속을 못받으니 
		// 상속받을 클래스를 만들어와서 가져왔음.
		Ex88 can = new Ex88();
		
//		Canvas can = new Canvas();
		
		add(can);
		setSize(600,600);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex08 me = new Ex08();

	}
	
	

}
