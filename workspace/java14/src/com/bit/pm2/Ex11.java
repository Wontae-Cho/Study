package com.bit.pm2;

public /*final*/ class Ex11 { //default�� �ٲٸ� �ٸ� ��Ű������ ��ӺҰ�.
		   			//class�� private,protected �Ұ���.
					//class�� final�� ������ class��ü�� final�� ���� �� �ִ�.
					//final class�� �� �̻� ������� �ʴ� Ŭ������ �ȴ�.
	final int su1;
//	protected int su1 = 1234;
//	protected static int su2 = 4321;
	
	protected Ex11(){	// Ŭ������ ���������� ����Ʈ �����ڸ� ����� ��ӹ��� �� ����.
					// private���� ��������.
					// ��, protected�� ������ ��쿡�� �����ϴ�.
		su1 = 1234; //����̱⶧���� �ѹ� �ʱ�ȭ�ϸ� �ٲ��� ����.
//		su1++;
	}

	public /*final*/ void func01(){ //���������ڰ� public
		//�޼��忡 final����� �������̵� �Ұ���
		
		final int su2=1111; //���������
		
		System.out.println("pm2��Ű���� Ex11 func01..."+su2);
	}
	
//	protected static void func02(){//���������ڰ� protected
//		System.out.println("pm2��Ű���� Ex11 func02...");
//	}
//	protected static void func03(){
//		System.out.println("pm2��Ű���� Ex11 func03...");
//	}

}
