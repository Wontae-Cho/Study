package com.bit.day07;

/*
클래스의 구성요소
1. 메소드(static, non-static)
2. 변수(static, non-static)
3.
*/

public class Ex01{
  static int num;

  public static void main(String[] args){
	System.out.println("Ex01 class");
  }

}	//classEx01 end

//한문서에 하나의 클래스만 있을 필요는 없다.
//문서의 이름과 클래스 네임이 같아야 하는 것도 아님(하지만 같도록 해야한다.)
//public클래스는 한 문서에 최대 하나만 존재할 수 있다.
//한 문서내에서 주클래스에서 사용하기 위해 클래스를 더 만들 수 있끼 때문에 허용(좋은패턴X)
// 따라서 public은 다시 못쓰도록 해놓음.

class Ex02{	//public이 클래스 앞에 들어갔을 시 오류.

  static int num;
  
  public static void main(String[] args){
	System.out.println("Ex02 class");
  }
}	//classEx02 end