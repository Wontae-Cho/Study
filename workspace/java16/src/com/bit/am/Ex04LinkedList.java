package com.bit.am;


class MyLinked{
	private Node start;
	private int cnt = 0;
	
	public MyLinked(){
		
	}
	
	private class Node{
		Object val;
		Node node;
	}
	
	public int size(){
		return cnt;
	}
	
	public Object get(int index){
		Object su =0;
		
		Node temp = start;
		for(int i=0; i<index; i++){
			temp=temp.node;
		}
//		// index=0;
//		su= start.val;
//		// index=1;
//		su= start.node.val;
//		// index=2;
//		su= start.node.node.val;
		
		return su=temp.val;
	}
	
	public void add(Object value){
		cnt++;
		if(cnt==1){
			Node obj = new Node();
			obj.val = value;
			start = obj;
		}else{
			Node obj = new Node();
			obj.val = value;
			Node temp = start;
			while(true){
				if(temp.node == null){break;}
				temp=temp.node;
			}
			temp.node = obj;
		}
		
//		/// 1 /////////////////////
//		Node obj = new Node();
//		obj.val = value;
//		start = obj; // ������
//		/// 2 /////////////////////
//		obj = new Node();
//		obj.val = value;
//		start.node = obj; // ���������� ����ϰ� �ִ� ��ġ node
//		/// 3 /////////////////////
//		obj = new Node();
//		obj.val = value;
//		start.node.node = obj; //���� - node ���� ����ϰ� �ִ� node
//		/// 4 /////////////////////
//		obj = new Node();
//		obj.val = value;
//		start.node.node.node = obj; // ���� - node - node ���� ����ϰ� �ִ� node
	}
}

public class Ex04LinkedList {

	public static void main(String[] args) {
//		MyLinked arr = new MyLinked();
		java.util.LinkedList arr = new java.util.LinkedList();
		arr.add(1111);
		arr.add(2222);
		arr.add(3333);
		arr.add("�ϳ�");
		arr.add("������������");
		arr.add('A');
		arr.add(3.14);
		arr.add(false);
		arr.add(3333);
		for(int i=0; i<arr.size(); i++){
			System.out.println(arr.get(i));
		}

	}

}
