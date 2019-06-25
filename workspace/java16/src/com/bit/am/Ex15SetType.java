package com.bit.am;

import java.util.HashSet;
import java.util.Iterator;

public class Ex15SetType {
			//집합
	
	public static void main(String[] args) {
		//set(집합)
		java.util.Set set1 = new HashSet();//인터페이스
		
		//입력
		set1.add("첫번째");
		set1.add("두번째");
		set1.add("세번째");
		set1.add(new String("첫번째"));
		set1.add("두번째");
		set1.add("세번째");
		
		System.out.println(set1.size()); // 6개를 입력했지만 중복의 경우는 제외되서 사이즈는 바뀔 수 있음
		
		Iterator ite = set1.iterator(); // set은 index넘버가 없어서 순서가 없다.
										// 따라서 토크니저, 벡터와 비슷하게 그 내용을 뽑아낼 수 있다.
										// iterator 객체는 일회용이다.
										// 출력용 객체 
		
//		System.out.println(ite.hasNext()); //다음에 올것이 있냐없냐. true or false 값을 가짐.
//		System.out.println(ite.next()); // 출력
//		System.out.println(ite.next());
//		System.out.println(ite.next());
		while(ite.hasNext()){
			String msg = (String)ite.next();
			msg="바꿈";
			System.out.println(msg);
		}
		System.out.println("-------------------------------------------");
		//iterator 객체는 찍고 사라졋기 때문에 아래내용은 출력하지 못한다.
		
		ite = set1.iterator(); //다시 선언해준다면 사용가능
		
		while(ite.hasNext()){
			String msg = (String)ite.next();
			System.out.println(msg);
		}
	}

}
