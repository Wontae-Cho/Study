package com.bit.day13;

public class Ex04StringBuffer02 {


	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(5);
						//���ڷ� ���ڸ� ���� �� ��� default ����� ������ �� �ִ�.
		
		System.out.println(sb.length()); 
		System.out.println(sb.capacity()) ; 
									//���� ���� ��� = ���� ���ڿ��� �ش��ϴ� ���� + default
									//���� ���� ��� = �̸� �Ҵ��س��� ����. default = 16 / 34 / 70
		
		for(int i=0; i<6; i++){
			sb.append('a');
			System.out.print(sb);
			System.out.println(",capacity :"+sb.capacity());
		}
		sb.trimToSize(); //�Ⱦ��� ���۰����� �߶�. (=����ȭ)
		System.out.println(",capacity :"+sb.capacity());
		

	}

}
