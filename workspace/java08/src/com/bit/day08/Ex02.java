package com.bit.day08;


 
class Car{ //��ü ����Ʋ
	//��ü�� �������� ��� = static // ������ �ͱ��� ������ ��ħ.
	//��ü�� �����Ӽ� = non-static
   int speed; 
   String model; //default = null;
   int max;

   public Car(String msg, int a){ //������
	model = msg;
	max=a;
   }

   public void runCar(){
	speed += 30;
	if(speed>max){speed=max;}
	System.out.println(speed+"km�� "+model+" �޸���");
   }
   public void stopCar(){
	speed -= 40;
	if(speed<0){speed=0;}
	System.out.println(speed+"km�� "+model+" �����Ѵ�");
   }

}


public class Ex02{

  public static void main(String[] args){
	Car myCar1 = new Car("�ҳ�Ÿ",200); //new Ŭ������(); �̿� ���� ���� ������������ �����ڶ�����.
	Car myCar2 = new Car("����",150); //����Ʈ ������
	//Car myCar2 = new Car(); //����Ʈ ������ ������ �����ڰ� ���ڸ� 2�� �޴����·� �߱⶧����
				//String���ڿ� int���ڸ� ���������� ������ ������ �߻��ϰ� ��ü�� �������� �ʴ´�.
	myCar1.speed=0;
	myCar1.model = "�ҳ�Ÿ";
	myCar1.max=200;
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.stopCar();
	//myCar2.model="����";
	//myCar2.model="����"; //default���� null
	myCar2.max = 150;
	//myCar2.max = 150; //default���� 0���� �����Ǿ������Ƿ� 0�� ��µȴ�.
	for(int i=0; i<10; i++){
		myCar2.runCar();
	}



  }



}