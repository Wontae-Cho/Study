package com.bit.am;

import java.util.Deque;
import java.util.LinkedList;

public class Ex13Deque {
	// Deque는 stack + Queue 의 기능. 맨 앞, 맨 뒤의 있는 것들을 볼 수 있고 뽑아쓸수있다. 하지만 중간에 있는 것은 불가능.


	public static void main(String[] args) {
		Deque deq1=new LinkedList();
//		deq1.offerFirst(1111);	//앞으로 집어넣고
//		deq1.offerFirst(2222);
//		deq1.offerFirst(3333);
//		deq1.offerFirst(4444);
		
//		System.out.println(deq1.size()); // 몇개가 들어가 있는지 알 수 있다.
		
//		System.out.println(deq1.pollLast()); //뒤에서 뽑는다. 먼저 집어넣는거 먼저 나옴
//		
//		System.out.println(deq1.pollFirst()); //앞에서 뽑는다. 먼저 집어넣은거 마지막에 나옴
		
		deq1.offerLast(1111);	// 뒤로 집어넣고
		deq1.offerLast(2222);
		deq1.offerLast(3333);
		deq1.offerLast(4444);
		
		System.out.println(deq1.size()); // 몇개가 들어가 있는지 알 수 있다.
		System.out.println(deq1.pollLast()); // 뒤에서 뽑는다. 먼저 집어넣는거 마지막에 나옴
		System.out.println(deq1.pollFirst()); //앞에서 뽑는다. 먼저 집어넣은거 먼저나옴.

	}

}
