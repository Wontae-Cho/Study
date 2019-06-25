/*
version의 의미 : ex) JDK 1.8.0_201
major version : 1
 -> 호환성 1로 시작하는 모든 버전에 있어서 하위 호환성을 포기하면 2로 올라가고 뒤에 모든 것을 초기화한다.
minor version : 8
 -> 문제가 있어서 바꾸는 것이 아니라 기능,언어, 구현 등에 있어서 변화가 있을 때
patch(문제 - bug) : 0_201
국어,영어.수학 성적을 관리하는 프로그램
국어 90 영어 85 수학 78
이들의 결과를 출력
학점 기준 ~ 평균 90 이상 : A / 80~90 : B / 70 ~ 80 : C / 60 ~ 70 : D / 그 외 F
ex)
-----------------------------------------
성적관리프로그램(ver 0.0.1)
-----------------------------------------
국어 : 90	영어 : 85	수학 : 78
합계 : 0000
평균 : 00.00
학점 : (A~F)학점




*/

class Ex11{

    public static void main(String[] args){
	int kor = 90;
	int eng = 85;
	int math = 78;
	int sum = kor + eng + math;
	double avg = sum*100/3/100.0; //소수 둘째자리까지 자르는 것, 정수연산으로 정확도 둘 다 잡을 수 있음
	String bar = "-----------------------------------------";

	// 출력 부분
	System.out.println(bar);
	System.out.println("성적관리프로그램(ver 0.0.1)");
	System.out.println(bar);
	System.out.println("국어 : " + kor + '\t' + "영어 : " + eng + '\t' +  "수학 : " + math);
	System.out.println("합계 : " + sum);
	System.out.println("평균 : "+ avg);
	System.out.print("학점 : ");
	// 학점 계산
	/*
	if(avg >= 90) {
			System.out.println(" A ");
	}else if(avg >= 80) {
			System.out.println(" B ");
	}else if(avg >= 70) {
			System.out.println(" C ");
	}else if(avg >= 60) {
			System.out.println(" D ");
	}else{
			System.out.println(" F ");
	}
	*/
	switch((int)avg/10) {
		case 10 :
		case 9 : 
			System.out.println(" A ");
			break;
		case 8 : 
			System.out.println(" B ");
			break;
		case 7 : 
			System.out.println(" C ");
			break;
		case 6 : 
			System.out.println(" D ");
			break;
		default : 
			System.out.println(" F ");
			break;
	}




    }

}