package com.bit.pm;

import java.util.Date;

public class Ex05Date2 {

	public static void main(String[] args) {
		java.util.Date now = new Date(System.currentTimeMillis()); // ����ð�
		now.setMonth(11);
		now.setDate(25);
//		java.util.Date now = new Date(2002-1900,4,1); // ����ð�
		System.out.println(now);
		int yy = now.getYear()+1900; 	//������ 1900����
		int mm = now.getMonth()+1;		// 0~11�� ����.
		int dd = now.getDate();
		int hh = now.getHours();
		int mi = now.getMinutes();
		int ss = now.getSeconds();
		System.out.println(yy+"."+mm+"."+dd+" "+hh+":"+mi+":"+ss);
		Date after = new Date(2019-1900,11,25);
		System.out.println(now.compareTo(after));
		
		

	}

}
