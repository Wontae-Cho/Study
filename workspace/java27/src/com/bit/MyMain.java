package com.bit;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyMain {

	public static void main(String[] args){
		//Car car=new Car();
		String info="com.bit.Car";
		Class clz;
		Object obj;
		try {
			clz = Class.forName(info);
			obj = clz.newInstance();
			Field[] fields = clz.getDeclaredFields();
			Method[] methods = clz.getMethods();
			System.out.println(fields.length);
			for(int i=0; i<fields.length; i++){
				System.out.println(fields[i].getName());
			}
			System.out.println(clz.getTypeName());
			Car car = (Car)obj;
			car.startCar();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}