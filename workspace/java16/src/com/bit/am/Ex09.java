package com.bit.am;

import java.util.ArrayList;

public class Ex09 {


	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		System.out.println(list1.isEmpty()); //비었냐 ? ㅇㅇ
		System.out.println(list1.size());	// 확인
		list1.add("1111");
		list1.add("2222");
		list1.add("3333");
		list1.add("4444");
		list1.add("5555");
		System.out.println(list1.isEmpty()); //비었냐 ? ㄴㄴ
		System.out.println(list1.size());	// 확인
		for(int i=0; i<list1.size(); i++){  //romove로 채워진 공간을 지움.
			list1.remove(i);
		}
		System.out.println(list1.isEmpty()); //비었냐 ? ㄴㄴ
		System.out.println(list1.size());    // ?? 왜? 이미 만들어둔 공간에 할당하는 주소값이 있기때문에 .

	}

}
