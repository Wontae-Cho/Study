package com.bit.pm;

import java.util.Calendar;

public class Ex02Calender {


	public static void main(String[] args) {
		Calendar obj = Calendar.getInstance();
		//��ü�� �����ϴ� ���� �ƴ϶� ������ ��ü�� �޾ƿ��°�.
		
		System.out.print(obj.get(Calendar.YEAR)+","); 	//��
		System.out.print(1+obj.get(Calendar.MONTH)+",");//�� 0~11��
		System.out.println(obj.get(Calendar.DATE));		//��
		if(obj.get(Calendar.AM_PM)==0){
			System.out.print("AM ");
		}else{
			System.out.print("PM ");
		}
//		System.out.print(obj.get(Calendar.AM_PM)+":");	//�־� 0�̸� AM, 1�̸� PM
//		System.out.print(obj.get(Calendar.HOUR_OF_DAY)+":");	//24�ð� ����
		System.out.print(obj.get(Calendar.HOUR)+":");	//�ð�
		System.out.print(obj.get(Calendar.MINUTE)+":");	//��
		System.out.println(obj.get(Calendar.SECOND));	//��
		
		
		
		
		
		

	}

}
