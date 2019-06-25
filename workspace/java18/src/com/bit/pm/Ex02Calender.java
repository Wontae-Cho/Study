package com.bit.pm;

import java.util.Calendar;

public class Ex02Calender {


	public static void main(String[] args) {
		Calendar obj = Calendar.getInstance();
		//객체를 생성하는 것이 아니라 생성된 객체를 받아오는것.
		
		System.out.print(obj.get(Calendar.YEAR)+","); 	//년
		System.out.print(1+obj.get(Calendar.MONTH)+",");//월 0~11월
		System.out.println(obj.get(Calendar.DATE));		//일
		if(obj.get(Calendar.AM_PM)==0){
			System.out.print("AM ");
		}else{
			System.out.print("PM ");
		}
//		System.out.print(obj.get(Calendar.AM_PM)+":");	//주야 0이면 AM, 1이면 PM
//		System.out.print(obj.get(Calendar.HOUR_OF_DAY)+":");	//24시간 기준
		System.out.print(obj.get(Calendar.HOUR)+":");	//시간
		System.out.print(obj.get(Calendar.MINUTE)+":");	//분
		System.out.println(obj.get(Calendar.SECOND));	//초
		
		
		
		
		
		

	}

}
