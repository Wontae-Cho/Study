package com.bit.day13;

public class Ex06StringToken {


	public static void main(String[] args) {
		String msg = "java web        db spring";
		
		java.util.StringTokenizer token = null;
		token = new java.util.StringTokenizer(msg);
		//���ڸ� �ָ� ���ڸ� ����, ���ָ� ������ �������� �ڸ�.
		//split�� �ٸ��� ������ �������͵� �߶��� �� �ִ�.
		
		//��ū�� ������ �˷����.
		System.out.println("token cnt "+token.countTokens());
		String[] arr= new String[4];
		int cnt=0;
		//������ū�� ������ ������
		while(token.hasMoreTokens()){
			//������ū�� �������.
			arr[cnt++] = token.nextToken();
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}

}
