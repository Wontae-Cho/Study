package com.bit.am;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

public class Ex14Vector {


	public static void main(String[] args) {
		Vector vec1 = new Vector();
		//�Է�
		vec1.addElement("ù��°");
		vec1.addElement("�ι�°");
		vec1.addElement("����°");
		vec1.addElement("�׹�°");
		
		//�߰�
//		vec1.insertElementAt("�߰�", 2); //insertElementAt(value, index)
		
		//����
//		vec1.setElementAt(3333, 2); //setElementAt(value,index)
		
		//����
//		vec1.removeElementAt(1); //removeElementAt(index)
//		vec1.removeAllElements(); //removeAllElement(); == clear
//		boolean result = vec1.removeElement("����°"); // value�� ������ ����, ������ ���������� �����ߴ��� �� �� �ִ�.
		
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
		// ������
		Enumeration enu = vec1.elements();
		while(enu.hasMoreElements()){	//�ڹ� ��â���� �ݺ��� ����.
			System.out.println(enu.nextElement());
		}
		System.out.println("-----------------------------------------------");
		
		Iterator ite = vec1.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}
