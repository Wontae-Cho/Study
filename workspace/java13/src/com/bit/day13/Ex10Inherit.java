package com.bit.day13;

class Father extends Object{
	int su = 4321;
	
	public String toString(){
		return "�Ĵ�";
	}
	
}

public class Ex10Inherit extends Father{
	int su = 1234;

	public static void main(String[] args) {
		// ��� - ������
		Ex10Inherit me = new Ex10Inherit();
		System.out.println(me);
		
		//�ڵ�����ȯ - �ڽĿ��� �θ�� �ö�
		Father me2 = new Ex10Inherit(); //�θ��� Ÿ�����ε� ��������. 
		System.out.println(me2);	//�������̵尡 �̷����� �����̿��ϴ°� ����.
		System.out.println(me2.su);	//���������� �������̵尡 �̷����� �ʾ� 4321 ���
		
		//��������ȯ �θ𿡼� �ڽ����� ����.
		Ex10Inherit me3 = (Ex10Inherit)me2;
		System.out.println(me3.toString());
		System.out.println(me3.su);
		
		Object obj=1;
		int su = (Integer)obj;
		func(1);
		func("stst");
		func(3.14);
		func(new Ex01Lotto());
		func(new int[]{12,3});
		
	}
	
	public static void func(Object obj){
		//������Ʈ�� ���ڷ� ���� �� ���� ���� �� �ִ�.
		//������ ��¸� �����һ� ������ �� �ִ°��� ���ٰ���� ���������� �����ʴ�.
		
		
	}
	
	public String toString(){
		return "�ʾ� ��";
	}


}
