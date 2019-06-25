package com.bit.day13;

public class Ex01Lotto {
	static int[] lotto = new int[7];

	public static void main(String[] args) {
		// �ζǹ�ȣ ������
		// 1. ����(1~45)
		// 2. 6�� ����, �ߺ��Ұ�
		// 3. �������� ����
		String title = "--------------------------------------------";
		title +="\n�ζǹ�ȣ ������(ver 0.0.1)\n";
		title +="--------------------------------------------";
		System.out.println(title);
		lottoBall();
		sort();
		for(int i=0; i<6; i++){
			System.out.print(lotto[i] + " ");
		}
		System.out.println(", �ǳʽ���ȣ : "+lotto[6]);


	}
	public static void lottoBall(){
		
		
		for(int i=0; i<lotto.length; i++){
			lotto[i] = ranSu2();
			for(int j=0; j<i ; j++){
				if(lotto[j] == lotto[i]){
					i--;
					break;
				}else{}
			}
		}
		
		return ;
	}
	
	public static int ranSu2(){ //ª�� ���������� ����Ȯ �� �� �ִ�.
		//0.0�� 0.1, 0.1�� 0.2 .... 0.9�� 1������ ������ �����ϰ� ������ ���ٴ� ���������Ͽ��� �����ؾ��Ѵ�.
		//������ ������ ���̰��� �������� �ʴ�..
		int su=0;
		// 1~45
		//0 <=, <1		//0<=, <44
		su = (int)(Math.random()*45)+1;
		
		return su;
	}
	public static void sort(){
		int temp = 0;
		for(int i=0; i<6-1; i++){
			for(int j=i+1; j<6; j++){
				if(lotto[i]>lotto[j]){
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		return ;
	}

	public static int ranSu() {
		int su = 0;
		// �ұ�Ģ(input(X) => output(O)) �Է��� ���µ� ����� �־�� �Ѵ�.
		while (true) {
			su = (int) (java.lang.Math.random() * 100); // �ƹ��� ��ǲ ���� 0<=
																// <1 ������ ����
																// �̾��ִ� �޼ҵ�.
			// *10 = 0 ~ 9, *100 = 0 ~ 99
			if (su > 0 && su < 46) {
				break;
			}
		}

		return su;
	}

}
