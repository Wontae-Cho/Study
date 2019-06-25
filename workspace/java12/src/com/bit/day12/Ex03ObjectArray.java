package com.bit.day12;

class Target1{
	int su1 = 1000;
	int su2 = 2000;
	int su3 = 3000;
	String msg = "초기값";
	void func01(){
		System.out.println("Target1의 기능");
	}	
}

public class Ex03ObjectArray {

	public static void main(String[] args) {
		Target1[] arr = new Target1[3]; //객체의 주소를 가진 배열이 됨.
										//따라서 다중배열과 유사한 성격을 가짐
		arr[0] = new Target1();
		arr[1] = new Target1();
		arr[2] = new Target1();
		
		arr[1].msg ="바꿈";
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i].su1); //하나의 객체에 값을 3개를 가짐.
			System.out.println(arr[i].msg);	//따라서 다중배열과 동일한 효과를 가짐.
			System.out.println(arr[i].su3);	//int배열은 int값만 가질 수 있는것에 비해서
											//객체의 배열은 다채로운 자료형을 가질 수 있다.
											//또한 객체가 기능을 가지게 되면, 그 기능도 표현할 수 있다.
			System.out.println("---------------------");
//			Target1 temp = arr[i];
//			temp.func01(); 		//==arr[i].func01();

//			System.out.println(arr[i].su1);
//			System.out.println(arr[i].msg);
		}

	}

}
