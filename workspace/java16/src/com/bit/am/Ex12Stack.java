package com.bit.am;

import java.util.Stack;

public class Ex12Stack {


	public static void main(String[] args) {
		// 스택(LIFO = Last In First Out) - 먼저들어간놈은 제일 마지막에
		// 
		Stack stack = new Stack();
		stack.push(1111); //데이터의 입력
		stack.push(2222);
		stack.push(3333);
		stack.push(4444);
		
		System.out.println(stack.search(1111)); //원하는 value의 값이 몇번 째로 나오는지 알 수 있다.
		
//		while(!stack.isEmpty()){
//			System.out.println(stack.pop());
//		}
		
//		System.out.println(stack.pop()); // 데이터를 뽑는 것. 더 꺼낼 것이 없으면 오류발생.
		
//		System.out.println(stack.isEmpty()); //비어있는지 확인
//		stack.pop();
//		System.out.println(stack.isEmpty()); //비어있는지 확인
//		stack.pop();
//		System.out.println(stack.isEmpty()); //비어있는지 확인
//		stack.pop();
//		System.out.println(stack.isEmpty()); //비어있는지 확인
//		stack.pop();
		
//		System.out.println(stack.peek()); // 나올 데이터가 뭔지 알 수 있는 방법.

	}

}
