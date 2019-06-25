package com.bit.pm;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex03GregCalendar {


	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		cal = new GregorianCalendar(2019,2,27);
		int before = cal.get(Calendar.DAY_OF_YEAR);
		
		
//		GregorianCalendar cal1 = new GregorianCalendar();
//		cal1 = new GregorianCalendar(2019,11,25);	// 크리스마스
//		GregorianCalendar cal2 = new GregorianCalendar();
//		cal2 = new GregorianCalendar(2019,3,19);	// 오늘
		
//		int after = cal1.get(Calendar.DAY_OF_YEAR);
//		int now = cal2.get(Calendar.DAY_OF_YEAR);
		
//		System.out.println("오늘은 "+now+"일째");
//		System.out.println("크리스마스는 "+after+"일째");
//		System.out.println(after-now+"일 남음");
//		
		
//		System.out.print(cal.get(Calendar.YEAR)+".");
//		System.out.print(1+cal.get(Calendar.MONTH)+".");
//		System.out.print(cal.get(Calendar.DATE));
//		char ch=0;
//		switch(cal.get(Calendar.DAY_OF_WEEK)){
//			case 1: ch= '일'; break;
//			case 2: ch= '월'; break;
//			case 3: ch= '화'; break;
//			case 4: ch= '수'; break;
//			case 5: ch= '목'; break;
//			case 6: ch= '금'; break;
//			case 7: ch= '토'; break;
//		}
//		System.out.println("("+ch+")");
//		
//		System.out.println();

	}

}
