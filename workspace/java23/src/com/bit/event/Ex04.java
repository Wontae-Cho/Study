package com.bit.event;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex04 extends Frame implements KeyListener{
	int x = 250;
	int y = 500;
	int maxX ;
	int maxY ;
	Canvas can;
	
	public Ex04() {
		
		Panel p = new Panel();
		
		p.setLayout(null);
		// 이벤트 등록
		addKeyListener(this);
		can = new Canvas(){ //익명클래스 사용.
			public void paint(Graphics g){
				g.setColor(Color.GREEN);
				g.fillRect(0, 0, 50, 50);
			}
		};
		can.setSize(50,50);
		can.setLocation(x,y);
		p.add(can);
		
		add(p);
		setSize(600,600);
		setLocation(100,100);
		setVisible(true);
		maxX = p.getWidth()-50; //캔버스의 사이즈만큼뺌.
		maxY = p.getWidth()-50;
	}

	public static void main(String[] args) {
		Ex04 me = new Ex04();

	}

	public void keyPressed(KeyEvent e) {
		// w
		//asd
		if(e.getKeyChar()=='a' && x-5>=0){
			x-=5;
		}else if(e.getKeyChar()=='d'&& x+5<=maxX){
			x+=5;
		}else if(e.getKeyChar()=='w' && y-5>=0){
			y-=5;
		}else if(e.getKeyChar()=='s'&& y+5<=maxY){
			y+=5;
		}
		can.setLocation(x,y);
	}
	public void keyReleased(KeyEvent e) {
		
	}
	public void keyTyped(KeyEvent e) {
		
	}

}
