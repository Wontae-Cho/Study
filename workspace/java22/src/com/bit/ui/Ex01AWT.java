package com.bit.ui;

import java.awt.Frame;

public class Ex01AWT {


	public static void main(String[] args) {
		int x=100, y=100;
		Frame frame = new Frame();
		//크기 결정
		frame.setSize(300,300);
		//위치 결정
//		frame.setLocation(100,100);
		frame.setLocation(x,y);
		// 보여줄지 결정해야함
		frame.setVisible(true);
		
		for(int i = 0; i<1000; i++){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			x+=1;
			y+=1;
//			frame.setVisible(true);
			frame.setLocation(x,y);
//			frame.setVisible(i%2==1);
		}
	}

}
