class Ex08{

   public static void main(String[] args){
	//su가 1004일때 짝수 인지 홀수 인지 출력하시오.
	int su = 1005;
	
	if(su%2 == 0){ //0과 1이 false true라고 보지않기 때문에 true false만 와야한다.
		System.out.println(su+"는 "+"짝수입니다.");
	}else{  	//if(su%2 != 0)
		System.out.println(su+"는 "+"홀수입니다.");
	}
	System.out.println("---------------------------------");
	//su2가 양수인지 음수인지 출력하시오
	int su2 = 0;

	if(su2 >= 0){
		System.out.println("양수 입니다");
		if(su2 == 0){
			System.out.println("0 입니다.");
		}
	}else{
		System.out.println("음수 입니다");
	}
	
	/*
	if(su2 < 0){          else문 대신에 이 문장을 넣었을 경우에는 0일경우 출력되지 않는다.
		System.out.println("음수 입니다");
	}
	*/
	
	System.out.println("---------------------------------");
	// ch = 'A'일때 , 영대인지 영소인지 숫자인지 특수문자인지 출력하시오 A = 65
	char ch = 'b';
	//int num =(int)ch; 다른 방법

	if(65 <= ch && ch <= 90) { // if(num >=(int)'A'&& num <=(int)'Z') 다른방법
		System.out.println("영어 대문자 입니다.");
	}else if(97 <= ch && ch <= 122) { // if(num >=(int)'a'&& num <=(int)'z') 다른방법
		System.out.println("영어 소문자 입니다.");
	}else if(48 <= ch && ch <= 57) { // if(num >=(int)'1'&& num <=(int)'9') 다른방법
		System.out.println("숫자 입니다.");
	}else if(32 <= ch && ch <= 47) {
		System.out.println("특수문자 입니다.");
	}



   }

}
