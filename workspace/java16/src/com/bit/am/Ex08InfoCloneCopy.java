package com.bit.am;

import java.util.ArrayList;

public class Ex08InfoCloneCopy {


	public static void main(String[] args) {
		Target ele1=new Target();
		Target ele2=new Target();
		Target ele3=new Target();
		ArrayList list1 = new ArrayList();
		list1.add(ele1);
		list1.add(ele2);
		list1.add(ele3);
//		ArrayList list2 = (ArrayList)list1.clone();
//		list2.add(4444);
//		ArrayList list3=list1;
		ArrayList list2 = new ArrayList(5); //몇개 입력받을지 설정할 수 있음.
											//그렇다고 3개만 받을 수 있는 것이 아니다. 그대로 동적할당 됨.
		list2.add(ele1);
		list2.add(ele2);
		list2.add(ele3);
		list2.trimToSize(); //내용이 채워진 곳까지남기고 비어있는 부분을 줄임.
		
		
		System.out.println(list1);
		System.out.println(list2);
//		System.out.println(list3);
		
		

	}

}
