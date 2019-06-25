package com.bit.pm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06Text {


	public static void main(String[] args) {
		Date now = new Date();
//		java.text.DateFormat df = null;
//		String format="YY.MM.DD";
//		String msg =  DateFormat.getDateInstance().format(now);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
//		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
//		String msg = df.format(now);
//		System.out.println(msg);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String msg= sdf.format(now);
		System.out.println(msg);
		
	}

}
