package com.bit.day07;

class Car{
	int speed=0;
	String model = "Ƽ��";
	String color = "������";
	
	public void speedUp(int a){
		int su = 200;
		System.out.println(color+" "+model+"�� "+a+"km �����մϴ�");
		if(!(a+speed>200)){
			su=speed+a;
		}
		speed=su;
		//return su;  //void�� �ٲܽ� return �ʿ� ����.
	}
	
	public int speedDown(int b){
		System.out.println(color+" "+model+"�� "+b+"km �����մϴ�");
		int su=0;
		if(!(speed-b<0)){ //=if(speed-b>=0)
			su=speed-b;
		}
		return su;
	}

}	//class end

public class Ex05{

  public static void main(String[] args){
	// �޸��� ���߰�
	// �ִ�ӵ� : 200km
	Car myCar = new Car();
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int input=0;
	int input2=0;
	while(true){
		System.out.print("1.���� 2.���� 0.���� ");
		input=sc.nextInt();
		if(input==0){break;}
		if(input==1||input==2){
			System.out.print("?km : ");
			input2=sc.nextInt();
		}
		if(input==1){
			myCar.speedUp(input2); //void�� �ٲ��� ��.
		}else if(input==2){
			myCar.speed=myCar.speedDown(input2);
		}
		System.out.println(myCar.color+" "+myCar.model+"��"+" ����ӵ� : "+myCar.speed+"km");
	}
  }

}