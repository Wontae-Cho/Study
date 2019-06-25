package com.bit.ui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex01InfomationUI {
	// AWT는 운영체제에 존재하는 걸 가져온 것.
		// 이미 운영체제에 있는 것이기 때문에 속도가 빠름.
		// 하지만 운영체제에 종속적이다. 그래서 운영체제마다 다르다.
		// 운영체제에 종속되다보니 기능 또한 운영체제가 제공하는 것까지만 사용할 수 있다.
	// 스윙은 자바가 직접드로우 한것.
		// 자바가 직접 드로우한것이다보니 운영체제에서 독립적이고 자유롭다.
		// 운영체제와 상관없이 일정하다.
		// 자원소모도 심하고 속도가 느리다.
		// 하지만 스윙은 사용자의 요구에 따라 기능을 추가하고 삭제하고 수정할 수 있다.

	public static void main(String[] args) {
//		java.awt.Frame frame = new Frame(); //프레임객체를 만듦.
//		java.awt.Button btn = new Button();
		javax.swing.JFrame frame = new JFrame();
		javax.swing.JButton btn = new JButton();
		frame.add(btn);
		
		frame.setSize(500,300);	// (가로,세로)픽셀의 사이즈.
		frame.setLocation(200,200); //default = 0,0
		frame.setVisible(true); //볼 수 있는 창을 만듦.
		
		

		
	}

}
