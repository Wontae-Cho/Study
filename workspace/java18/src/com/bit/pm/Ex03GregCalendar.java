package com.bit.pm;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex03GregCalendar {


	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		cal = new GregorianCalendar(2019,2,27);
		int before = cal.get(Calendar.DAY_OF_YEAR);
		
		
//		GregorianCalendar cal1 = new GregorianCalendar();
//		cal1 = new GregorianCalendar(2019,11,25);	// ũ��������
//		GregorianCalendar cal2 = new GregorianCalendar();
//		cal2 = new GregorianCalendar(2019,3,19);	// ����
		
//		int after = cal1.get(Calendar.DAY_OF_YEAR);
//		int now = cal2.get(Calendar.DAY_OF_YEAR);
		
//		System.out.println("������ "+now+"��°");
//		System.out.println("ũ���������� "+after+"��°");
//		System.out.println(after-now+"�� ����");
//		
		
//		System.out.print(cal.get(Calendar.YEAR)+".");
//		System.out.print(1+cal.get(Calendar.MONTH)+".");
//		System.out.print(cal.get(Calendar.DATE));
//		char ch=0;
//		switch(cal.get(Calendar.DAY_OF_WEEK)){
//			case 1: ch= '��'; break;
//			case 2: ch= '��'; break;
//			case 3: ch= 'ȭ'; break;
//			case 4: ch= '��'; break;
//			case 5: ch= '��'; break;
//			case 6: ch= '��'; break;
//			case 7: ch= '��'; break;
//		}
//		System.out.println("("+ch+")");
//		
//		System.out.println();

	}

}
