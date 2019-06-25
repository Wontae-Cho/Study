package com.bit.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ex03Layout extends Frame{
	
	public Ex03Layout(){
		// FlowLayout
		// 첫 상단부터 배치를 하면서 요소들을 가운데부터 배치한다. 
		// 한 줄에 표현을 못한다면 다음줄로 내려서 가운데부터.
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);
		
		// GridLayout
		// 화면을 그리드해서 배치를 하는것.
		// GridLayout layout = new GridLayout(2,2); (가로줄,세로줄)
		// 주기로한 인자값이 있다면 그것을 먼저 읽는다. 예를들어 4칸을 만들고 5개를 넣었을 때는 5번째의 것을 넣을 때 세로줄이 늘어나게 된다.
//		GridLayout layout = new GridLayout(2,3); 
//		this.setLayout(layout);
		
		// BorderLayout
		// 동서남북을 통해서 배치함.
		// Layout들 중에서 가장 많이 사용하는 편
//		BorderLayout layout = new BorderLayout();
//		this.setLayout(layout);
		
		// 버튼객체를 4개만들고
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
//		Button btn6 = new Button("버튼6");
//		Button btn7 = new Button("버튼7");
		
		// 버튼객체를 넣는다.
		// 넣는순서에 따라 출력도 다르게 된다.
		
		// BorderLayout 사용시.
//		add(btn1,BorderLayout.CENTER);	// 상수로 표현.
//		add(btn2,BorderLayout.NORTH);
//		add(btn3,BorderLayout.SOUTH);
//		add(btn4,BorderLayout.EAST);
//		add(btn5,BorderLayout.WEST);
//		add("Center",btn1);	//상수를 문자열로 저장해둔것.
//		add("North",btn2);
//		add("South",btn3);
//		add("East",btn4);
//		add("West",btn5);
//		add("",btn6);
//		add("",btn7);
		
		// FlowLayout, GridLayout 사용시.
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
//		add(btn5);
//		add(btn6);
//		add(btn7);
		
		
		setSize(300,400);
		setLocation(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex03Layout me = new Ex03Layout();
		

	}

}
