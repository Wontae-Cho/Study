package com.bit.am;

import java.util.Stack;

public class Ex12Stack {


	public static void main(String[] args) {
		// ����(LIFO = Last In First Out) - ���������� ���� ��������
		// 
		Stack stack = new Stack();
		stack.push(1111); //�������� �Է�
		stack.push(2222);
		stack.push(3333);
		stack.push(4444);
		
		System.out.println(stack.search(1111)); //���ϴ� value�� ���� ��� °�� �������� �� �� �ִ�.
		
//		while(!stack.isEmpty()){
//			System.out.println(stack.pop());
//		}
		
//		System.out.println(stack.pop()); // �����͸� �̴� ��. �� ���� ���� ������ �����߻�.
		
//		System.out.println(stack.isEmpty()); //����ִ��� Ȯ��
//		stack.pop();
//		System.out.println(stack.isEmpty()); //����ִ��� Ȯ��
//		stack.pop();
//		System.out.println(stack.isEmpty()); //����ִ��� Ȯ��
//		stack.pop();
//		System.out.println(stack.isEmpty()); //����ִ��� Ȯ��
//		stack.pop();
		
//		System.out.println(stack.peek()); // ���� �����Ͱ� ���� �� �� �ִ� ���.

	}

}
