//다중배열 : 배열을 갖는 배열.
package com.bit.day09;

public class Ex07{


  public static void main(String[] args){
	String[] arr2=new String[3];
	arr2[0] = new  String("test1");
	arr2[0] = new  String("test2");

	int[][] arr1; //변수선언 //인트배열을 갖는 인트여야하기 때문에.
	arr1 = new int[3][]; //객체생성 및 초기화
			//앞에 []는 i에 해당 뒤에 []는 j에 해당한다고 할 수 있다.
			//즉 3개의 i값과 3개의 j값을 가진다는 말이다.
			//만약 뒤에 []를 비웠을 때는 뒤에 들어갈 내용을 임의로 정해서 넣을 수 있다.
			//배열 객체에서는 디폴트 값으로 0을 가지고 있다.
	//뒤에 []를 비워놓고 특정값을 대입하지 않는다면 몇개를 가지고 있는지 배열인지
	// 모르기 때문에 디폴트값을 설정해주지 못해 오류가 발생한다.
	/*
	arr1[0]=new int[]{1,2};
	arr1[1]=new int[]{4,5,6};
	arr1[2]=new int[]{7,8};
	/*
	arr1[0][0]=11;
	arr1[0][1]=12;
	arr1[1][0]=14;
	arr1[1][1]=15;
	arr1[2][0]=17;
	arr1[2][1]=18;
	*/





	for(int i=0; i<arr1.length; i++){ //몇개의 배열이 담겼는지 : 3
		int[] temp = arr1[i]; //여기서 하나 꺼냈을 때.
		for(int j=0; j<arr1[i].length;j++){ // 또 다시 3개.
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	
	}

  }



}