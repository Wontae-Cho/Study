package com.bit.day11;

public class Ex15String {

	public static void main(String[] args) {
		// ���ڿ� �߰�, ����, ����
		// ���ڿ��� ������ �߰�,����,���� ���� �� ������ü�� �����ϴ°��� �ƴ϶�
		// ���οü�� ����������.
		String target = "abcdefg";
		//target = target.concat("�߰�"); //��Ʈ���� �� ���� ���ڿ� �߰�.
		System.out.println(target);
		String result = target.substring(2); //(start,end) / (start)�������ͳ����� �ڸ���
		System.out.println(result);
		int idx = target.indexOf('c'); //���ڰ� �ִ� idx��. 2�� ������� ���ʸ� �������� ��.
									//('c',3)���ڸ� 2���ָ� �ڿ� ���� �˻��� ���������� ����.
									// ���°�쿣 -1�� �����
									//(�����ε�)���ڿ��� ���� ���� �ִ�.("cd");
		int idx2 = target.lastIndexOf("cd"); //�ڿ��� ���� ã�°��
		System.out.println(idx2);
		boolean result2 = target.startsWith("ab"); //ab�� �����ϳ�
		System.out.println(result2); //true or false
		result2 = target.endsWith("fg"); // fg�� ������
		System.out.println(result2);
		result2 = target.contains("bcd"); //bcd�� �����ϳ�
		System.out.println(result2); //true or false
		int su = target.compareTo("abcdefg"); // target�� ���ڰ��ϰ� ��ġ��? 
												// ��ġ�ϸ� 0
												// ���� : 2�� �� ������ -2, 2�� �������� 2
												// ���̰� ���� ��쿡 �󸶳� �ٸ��� ����
												// ���ڰ� �޶����� ���������� ����.
		System.out.println(su);
		//String result3=target.replace('b', 'B'); //���� ����, ���ڸ� ��ü��. - ����
		String result3=target.replace("def", "deeeeeef"); //���ڿ��� ����, ���ڿ��� ��ü��. -�߰�
		//String result3=target.replace("b", ""); //����
		System.out.println(result3);
		String target2="	abc		defg	";
		result3=target2.trim(); //���ڿ��� �� ���� ������ �߶���. ���ڿ� �߰��� �ڸ��� ����.
		System.out.println(result3);
		result3=target2.toUpperCase(); // �Է¹��� ���ڿ��� �빮�ڷ�
		System.out.println(result3);
		result3=target2.toLowerCase();
		System.out.println(result3);

	}

}
