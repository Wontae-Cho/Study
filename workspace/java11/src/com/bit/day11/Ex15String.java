package com.bit.day11;

public class Ex15String {

	public static void main(String[] args) {
		// 문자열 추가, 수정, 삭제
		// 문자열에 무엇을 추가,수정,삭제 했을 때 기존객체를 수정하는것이 아니라
		// 새로운객체를 만들어버린다.
		String target = "abcdefg";
		//target = target.concat("추가"); //스트링의 맨 끝에 문자열 추가.
		System.out.println(target);
		String result = target.substring(2); //(start,end) / (start)에서부터끝까지 자르기
		System.out.println(result);
		int idx = target.indexOf('c'); //문자가 있는 idx값. 2번 있을경우 최초를 기준으로 함.
									//('c',3)인자를 2개주면 뒤에 것은 검색의 시작지점을 뜻함.
									// 없는경우엔 -1을 출력함
									//(오버로드)문자열을 넣을 수도 있다.("cd");
		int idx2 = target.lastIndexOf("cd"); //뒤에서 부터 찾는경우
		System.out.println(idx2);
		boolean result2 = target.startsWith("ab"); //ab로 시작하냐
		System.out.println(result2); //true or false
		result2 = target.endsWith("fg"); // fg로 끝나냐
		System.out.println(result2);
		result2 = target.contains("bcd"); //bcd를 포함하냐
		System.out.println(result2); //true or false
		int su = target.compareTo("abcdefg"); // target이 인자값하고 일치해? 
												// 일치하면 0
												// 길이 : 2개 더 있으면 -2, 2개 덜있으면 2
												// 길이가 같을 경우에 얼마나 다른지 비교함
												// 문자가 달라지는 점에서부터 기준.
		System.out.println(su);
		//String result3=target.replace('b', 'B'); //문자 가능, 문자를 대체함. - 수정
		String result3=target.replace("def", "deeeeeef"); //문자열도 가능, 문자열을 대체함. -추가
		//String result3=target.replace("b", ""); //삭제
		System.out.println(result3);
		String target2="	abc		defg	";
		result3=target2.trim(); //문자열의 앞 뒤의 공백을 잘라줌. 문자열 중간은 자르지 않음.
		System.out.println(result3);
		result3=target2.toUpperCase(); // 입력받은 문자열을 대문자로
		System.out.println(result3);
		result3=target2.toLowerCase();
		System.out.println(result3);

	}

}
