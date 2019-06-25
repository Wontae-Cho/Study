package com.bit.day13;

public class Ex06StringToken {


	public static void main(String[] args) {
		String msg = "java web        db spring";
		
		java.util.StringTokenizer token = null;
		token = new java.util.StringTokenizer(msg);
		//인자를 주면 인자를 기준, 안주면 공백을 기준으로 자름.
		//split과 다르게 공백이 여러개와도 잘라줄 수 있다.
		
		//토큰의 개수를 알려줘라.
		System.out.println("token cnt "+token.countTokens());
		String[] arr= new String[4];
		int cnt=0;
		//다음토큰을 가지고 있으면
		while(token.hasMoreTokens()){
			//다음토큰을 보여줘라.
			arr[cnt++] = token.nextToken();
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}

}
