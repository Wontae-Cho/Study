class Ex09{

   public static void main(String[] args){
	int su = 1000;

	if(su>0 && su%2==0){
		System.out.println("양수이고 짝수입니다.");
	}else if(su>0 && su%2!=0){
		System.out.println("양수이고 홀수입니다.");
	}else if(su%2==0){                  //양수의 조건은 위에서 검사하고 내려왔기 때문에 제외해도 문제 없다.
		System.out.println("음수이고 짝수입니다.");
	}else if(su%2!=0){
		System.out.println("음수이고 홀수입니다.");
	}else{
		System.out.println("0입니다.");
	}
	

   }

}