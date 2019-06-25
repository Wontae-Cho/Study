/*
	제어문
반복문
while반복문 -상당히 중요. 몇번돌릴지 생각안해도됨. 그냥 조건이 맞을때까지 계속 돌아감.
	while(조건){
		실행문;
	}
*/
class Ex18{

    public static void main(String[] args){
	// 1~5까지 출력
	int su=1;
	while(su<6){ //true or false 값.
		System.out.println("su="+su++);
	}
	
	//홀수출력
	su=1;
	while(su<=10){
		System.out.println("su="+su);
		su+=2;
	}
	/*
	int a;
	a = 1234;
	
	if(false){
		a=4321;
		//System.out.println(a); if문 안에서 a가 4321이므로 4321 출력
	}
	System.out.println(a); //if문이 false이기 때문에 그대로 지나와서 1234 출력
				//if문이 true일 경우 초기화값이 4321로 바뀌어서 4321 출력
	=================================================================================
	int a;
	int b=3;
	
	if(b>2){ //조건에서 초기화가 이뤄지지 않아서 오류발생.
		a=1234;
		a=4321;
	}
	System.out.println(a);

	int i=1234;
	for(i=0; i<5; i++){
		int su=1111;	//선언되는 부분은 다시 반복이 되지만 for문끝에서 그 선언은 지워진다.
		su++;		//다시 선언된 값인 1111에 +1더한값이 출력된다.
		System.out.println(i+","+su);
	}
	//System.out.println(su); //for문 안에서 su의 라이프사이클이 종료되었기 때문에 밖에서 사용불가.
	System.out.println(i); //for문 안에서 i의 라이프사이클이 종료되었기 때문에 밖에서 사용불가.
				//단 for문 밖에서 선언과 초기화를 했을 경우에는 i의 라이프사이클이 살아있기에 출력가능.
	//반복문이나 조건문 내부에서 변수를 선언하는 경우는 일반적으로 좋지 않다. 하지만 의도하고 필요한 경우에는 써도 좋다.
	*/


    }

}