package com.bit.pm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		long now2 = now.getTime();
		now2+=(24L*60*60*1000*100);
		Date now100= new Date(now2);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String msg= sdf.format(now100);
		System.out.println(msg);
		Calendar cal =sdf.getCalendar();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
	}

}
