package com.bit.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ex03Layout extends Frame{
	
	public Ex03Layout(){
		// FlowLayout
		// ù ��ܺ��� ��ġ�� �ϸ鼭 ��ҵ��� ������� ��ġ�Ѵ�. 
		// �� �ٿ� ǥ���� ���Ѵٸ� �����ٷ� ������ �������.
		FlowLayout layout = new FlowLayout();
		this.setLayout(layout);
		
		// GridLayout
		// ȭ���� �׸����ؼ� ��ġ�� �ϴ°�.
		// GridLayout layout = new GridLayout(2,2); (������,������)
		// �ֱ���� ���ڰ��� �ִٸ� �װ��� ���� �д´�. ������� 4ĭ�� ����� 5���� �־��� ���� 5��°�� ���� ���� �� �������� �þ�� �ȴ�.
//		GridLayout layout = new GridLayout(2,3); 
//		this.setLayout(layout);
		
		// BorderLayout
		// ���������� ���ؼ� ��ġ��.
		// Layout�� �߿��� ���� ���� ����ϴ� ��
//		BorderLayout layout = new BorderLayout();
//		this.setLayout(layout);
		
		// ��ư��ü�� 4�������
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		Button btn3 = new Button("��ư3");
		Button btn4 = new Button("��ư4");
		Button btn5 = new Button("��ư5");
//		Button btn6 = new Button("��ư6");
//		Button btn7 = new Button("��ư7");
		
		// ��ư��ü�� �ִ´�.
		// �ִ¼����� ���� ��µ� �ٸ��� �ȴ�.
		
		// BorderLayout ����.
//		add(btn1,BorderLayout.CENTER);	// ����� ǥ��.
//		add(btn2,BorderLayout.NORTH);
//		add(btn3,BorderLayout.SOUTH);
//		add(btn4,BorderLayout.EAST);
//		add(btn5,BorderLayout.WEST);
//		add("Center",btn1);	//����� ���ڿ��� �����صа�.
//		add("North",btn2);
//		add("South",btn3);
//		add("East",btn4);
//		add("West",btn5);
//		add("",btn6);
//		add("",btn7);
		
		// FlowLayout, GridLayout ����.
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
