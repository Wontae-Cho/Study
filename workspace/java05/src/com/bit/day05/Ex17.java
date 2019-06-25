class Ex17{

  public static void main(String[] args){
	int a=100;
	//int a=1234; //a를 2번 선언했기때문에 오류 -> 메모리가 어떤 a를 가져와야 할지 모르게 되기때문에

	a++;


	String msg=args[0]; //입력.
	//String msg="java";
	if(msg=="java"){
		System.out.println("참입니다");
	}else{
		System.out.println("거짓");
	}

	if(true){
		System.out.println("조건이 참");
	}

	if(false){
		System.out.println("조건이 참");
	}else if(true){
		System.out.println("또 다른 조건이 참"); 	//몇개든이 추가 가능
	}else{  
		System.out.println("조건이 거짓");	//반드시 실행된다는 보장.
	}
	/* else if
	if(조건){
	}else{
		if(조건){}
	}
	*/

	System.out.println("=========="+msg+"============");

	switch(3){ //if보다 대응성이 더 좋고, 성능적으로도 좋다.
			// 괄호안에는 논리값이 아닌 실질적 값이 와야한다.
		case 1:
		System.out.println("1입니다");
		break; //탈출을 시켜주는 문구
		case 2:
		System.out.println("2입니다");
		break;
		case 3:
		System.out.println("3입니다");
		break;
		case 4:
		System.out.println("4입니다");
		break;
		default:
		System.out.println("거짓입니다");
	}


  }

}