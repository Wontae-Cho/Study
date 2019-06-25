package com.bit.am;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

public class Ex14Vector {


	public static void main(String[] args) {
		Vector vec1 = new Vector();
		//입력
		vec1.addElement("첫번째");
		vec1.addElement("두번째");
		vec1.addElement("세번째");
		vec1.addElement("네번째");
		
		//추가
//		vec1.insertElementAt("추가", 2); //insertElementAt(value, index)
		
		//수정
//		vec1.setElementAt(3333, 2); //setElementAt(value,index)
		
		//삭제
//		vec1.removeElementAt(1); //removeElementAt(index)
//		vec1.removeAllElements(); //removeAllElement(); == clear
//		boolean result = vec1.removeElement("세번째"); // value값 삭제도 가능, 삭제에 성공헀는지 실패했는지 알 수 있다.
		
//		for(int i=0; i<vec1.size(); i++){
//			System.out.println(vec1.elementAt(i));
//		}
		
//		String msg = "java web db";
//		String[] arr1 = msg.split(" ");
//		
//		StringTokenizer token = new StringTokenizer(msg);
//		
//		while(token.hasMoreTokens()){
//			System.out.println(token.nextToken());
//		}
		// 열거형
		Enumeration enu = vec1.elements();
		while(enu.hasMoreElements()){	//자바 초창기의 반복의 형태.
			System.out.println(enu.nextElement());
		}
		System.out.println("-----------------------------------------------");
		
		Iterator ite = vec1.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}
