package com.bit.am;

import java.util.LinkedList;
import java.util.Queue;

public class Ex11Queue {


	public static void main(String[] args) {
	
		// ť(FIFO = First In First Out) - ���������� ���������°� 
		// Interface�ν� ����� ������ �� �� �ִ�.

		Queue q1= new LinkedList();
		q1.offer(1111);		// �����͸� �Է�.
		q1.offer(2222);
		q1.offer(3333);
		q1.offer(4444);
		
//		q1.poll();		//�����͸� ������� �̴� ��.
//		q1.peek(); //���� ���� ���� ������ �� �� �ִ�.
		
		while(q1.peek()!=null){
			System.out.println(q1.poll());
		}
		
		
	}

}
