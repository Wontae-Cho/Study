package com.bit.day08;
/*
배열 - 동일타입변수
자료형[] 배열명 = new 자료형[배열사이즈];
호출 배열명[인덱스]
인덱스 시작은 0부터 반드시 연속됨, 번호의 끝은 배열사이즈-1

선언과 초기화 동시 자료형[] 변수명 = new 자료형[]{값,값,값,값...};
		ex) int[] array2=new int[]{1,3,5,7,9};
당연히 자료형과 값들의 자료형은 동일해야한다.
//	int[] array3={1,3,5,7,9}; // 이렇게 축약해서 배열을 표현할 수 있지만 
//				//나중을 위해서 가능한 정상적인 패턴으로 하자.
//	int[] array2=new int[]{1,3,5,7,9};
*/



public class Ex08{

  public static void main(String[] args){ //args라는 String배열.
	//System.out.println("args[0]="+args[0]);

	//args는 실행할 때 줄 수 있고 그것은 띄어쓰기, tab을 이용해서 구분할 수 있다.

	int a1=10;
	int a2=11;
	int a3=12;
	int a4=13;
	int a5=14;

	int[] array = new int[5]; //배열의 선언 - 공간확보
	//인트형 변수 5개를 넣을 수 있는 저장공간을 확보해달라
	//array[0]=10;		//초기화 - 값의 대입
	//array[1]=11;
	//array[2]=12;
	//array[3]=13;
	//array[4]=14;
	//array[5]=15;
	for(int i = 0; i<5; i++){
		array[i]=10+i;
	}

	for(int i=0; i<5; i++){
		System.out.println("array["+i+"]="+array[i]);
	}

	int[] array2=new int[]{1,3,5,7,9};
	String[] strs = new String[]{"java","web","db","framework"};
	for(int i=0; i<4; i++){
		System.out.println(strs[i]);
	}

	int[] array3={1,3,5,7,9}; // 이렇게 축약해서 배열을 표현할 수 있지만 
				//나중을 위해서 가능한 정상적인 패턴으로 하자.


  }


}