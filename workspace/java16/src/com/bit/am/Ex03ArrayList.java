package com.bit.am;

//class MyArray {
//	private Object[] arr;
//
//	public MyArray() {
//		arr = new Object[0];
//	}
//
//	public int size() {
//		return arr.length;
//	}
//
//	public void add(Object value) {
//
//		Object[] old = arr;
//		arr = new Object[old.length + 1];
//		System.arraycopy(old, 0, arr, 0, old.length);
//		arr[arr.length - 1] = value;
//	}
//
//	public Object get(int idx) {
//		return arr[idx];
//	}
//}

public class Ex03ArrayList {
	// list타입의 자료구조
	// 동적처리(동적, 순서,값의 중복가능)
	// 배열은 데이터 열람에 뛰어난 성능을 보임
	// 객체로 만들면 데이터 조작(수정,삭제,입력 등)이 더 뛰어남(이론상)
	// 하지만 자바가 배열을 너무 잘 만들어놔서 그런거 없이 배열 쓰자 ㅎ;
	

	public static void main(String[] args) {
//		MyArray arr = new MyArray();
		java.util.ArrayList arr = new java.util.ArrayList();
		arr.add(1111);
		arr.add(2222);
		arr.add("잘나옴");
		arr.add("또나옴");
		arr.add("아");
		arr.add("에");
		arr.add("이");
		arr.add("오");
		arr.add("우");
		arr.add("A");
		arr.add("B");
		arr.add(3.14);
		arr.add(true);
		
		for (int i = 0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}
}
