package com.bit.day07;

class Car2{
	// 속성 =변수
	String company = "현대";
	String carModel = "소나타";
	String carColor = "검정색";
	int carNum =1234;
	int speed = 0;
	int max = 250;

	// 기능 =method
	public void speedUp(){
		speed +=50;
		if(speed>250){
			speed=max;
		}
	}
	public void speedDown(){
		speed -=55;
		if(speed<0){
			speed=0;
		}
	}
	public void myPrint(){
		System.out.println("차량번호 "+carNum+" "+company+" "+carColor+" "+carModel+" "+speed+"km입니다");
	}

}

public class Ex06{

  public static void main(String[] args){
	Car2 myCar = new Car2();
	myCar.myPrint();
	myCar.speedUp();
	myCar.myPrint();
	myCar.speedUp();
	myCar.myPrint();
	myCar.speedUp();
	myCar.myPrint();
	myCar.speedUp();
	myCar.myPrint();
	myCar.speedUp();
	myCar.myPrint();
	myCar.speedUp();
	myCar.myPrint();
	myCar.speedUp();
	myCar.myPrint();

	myCar.speedDown();
	myCar.myPrint();
	myCar.speedDown();
	myCar.myPrint();



  }

}  