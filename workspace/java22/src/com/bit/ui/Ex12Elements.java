package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;



public class Ex12Elements extends Frame {
	static TextField tf=null;
	static TextArea ta = null;
	
	public Ex12Elements() {
		setTitle("프로그램 제목");
		Panel p1 =new Panel();
		
		//공백의 표현도 가능. 줄을 바꾸는데에 유용.
		Label la = new Label("버튼을 눌러주세요");
		la.setText("ID : ");
		p1.add(la);
		
		tf = new TextField("디폴트",10/*Size*/); // 글자수 그런데 폰트마다 달라서 완벽하지 않다.
															// 디폴트를 안주면 비어있는채로 만들 수 있다.
		tf.setEchoChar('#');	// 비밀번호같은것을 칠때 자주이용되는 것.
								// 입력하는 값은 그대로 온다.
		p1.add(tf);
		
		TextArea ta = new TextArea("",5,30,TextArea.SCROLLBARS_NONE); //"디폴트값쓰기 가능",사이즈(int, int),스크롤여부 
		
		p1.add(ta);
		
		
		Button btn = new Button();
		btn.setLabel("로그인");
		
		//라벨값을 얻어옴.
//		System.out.println(btn.getLabel());
		p1.add(btn);
		
		
		add(p1);
		
		
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ex12Elements me = new Ex12Elements();
		try {
			Thread.sleep(5000); 
			//5초 뒤에 텍스트쓰여진 것을 가져옴.
			System.out.println(ta.getText());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
