package com.bit.day07;

class Car2{
	// �Ӽ� =����
	String company = "����";
	String carModel = "�ҳ�Ÿ";
	String carColor = "������";
	int carNum =1234;
	int speed = 0;
	int max = 250;

	// ��� =method
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
		System.out.println("������ȣ "+carNum+" "+company+" "+carColor+" "+carModel+" "+speed+"km�Դϴ�");
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