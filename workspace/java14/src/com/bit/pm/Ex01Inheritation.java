package com.bit.pm;
//final�� ���� �� �ִ� ���� ����,Ŭ���� �ż��� ���̴�

class Ex11 extends Object{}

public class Ex01Inheritation extends com.bit.pm2.Ex11{
	//�ϳ��� Ŭ������ ��ӹ޴� ���� �ٸ� Ŭ������ ��ӹ��� ���ϹǷ�
	//��ӹ��� Ŭ������ �� ���ؾ��Ѵ�.
//	private(Ŭ���� �� ���ٺҰ�) < default(������Ű��) 
//							<= protected(��ӿ�����) < public(������)
// 	�Ϲ������� protected�� default�� ������ ��ӿ� �־�� default���� �� ������ �д�.
	
//	public void func01(){} //�޼��忡 final����� �������̵� �Ұ���
	public void func02(final int a){
//		a++; //�Ұ���.
		System.out.println("param a:"+a);
	}

	public static void main(String[] args) {
		Ex01Inheritation me = new Ex01Inheritation();
		me.func01();
		me.func02(10000);
		me.func02(10000+1);
		me.func02(10000+2);
//		com.bit.pm2.Ex11 you = new com.bit.pm2.Ex11(); //���� ����� ���ؼ��� �������.
												//�θ�Ŭ������ public �ϰ�쿡�� ���ٰ���.
//		you.func01();
//		System.out.println(you.su1);
		
//		com.bit.pm2.Ex11.func03(); //���������� �߸��� ���� �ƴ����� ����� �ǹ̰� ����.
//		System.out.println(com.bit.pm2.Ex11.su2); //��ȿ������ �ڵ�.
		
//		System.out.println(su2);
		

	}

}
