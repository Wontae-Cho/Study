package com.bit.am;

import java.util.LinkedList;
import java.util.Queue;

public class Ex11Queue {


	public static void main(String[] args) {
	
		// 큐(FIFO = First In First Out) - 먼저들어간놈이 먼저나오는거 
		// Interface로써 기능의 제약을 할 수 있다.

		Queue q1= new LinkedList();
		q1.offer(1111);		// 데이터를 입력.
		q1.offer(2222);
		q1.offer(3333);
		q1.offer(4444);
		
//		q1.poll();		//데이터를 순서대로 뽑는 것.
//		q1.peek(); //가장 먼저 뭐가 나올지 알 수 있다.
		
		while(q1.peek()!=null){
			System.out.println(q1.poll());
		}
		
		
	}

}
