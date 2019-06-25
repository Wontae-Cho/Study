package com.bit.day08;


 
class Car{ //객체 생성틀
	//객체의 공통적인 요소 = static // 기존의 것까지 영향을 미침.
	//객체의 고유속성 = non-static
   int speed; 
   String model; //default = null;
   int max;

   public Car(String msg, int a){ //생성자
	model = msg;
	max=a;
   }

   public void runCar(){
	speed += 30;
	if(speed>max){speed=max;}
	System.out.println(speed+"km로 "+model+" 달린다");
   }
   public void stopCar(){
	speed -= 40;
	if(speed<0){speed=0;}
	System.out.println(speed+"km로 "+model+" 제동한다");
   }

}


public class Ex02{

  public static void main(String[] args){
	Car myCar1 = new Car("소나타",200); //new 클래스명(); 이와 같은 것이 가능한이유는 생성자때문임.
	Car myCar2 = new Car("레이",150); //디폴트 생성자
	//Car myCar2 = new Car(); //디폴트 생성자 위에서 생성자가 인자를 2개 받는형태로 했기때문에
				//String인자와 int인자를 주지않으면 컴파일 오류가 발생하고 객체를 생성하지 않는다.
	myCar1.speed=0;
	myCar1.model = "소나타";
	myCar1.max=200;
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.runCar();
	myCar1.stopCar();
	//myCar2.model="레이";
	//myCar2.model="레이"; //default값인 null
	myCar2.max = 150;
	//myCar2.max = 150; //default값이 0으로 설정되어있으므로 0만 출력된다.
	for(int i=0; i<10; i++){
		myCar2.runCar();
	}



  }



}