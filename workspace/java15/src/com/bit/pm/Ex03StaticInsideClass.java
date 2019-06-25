package com.bit.pm;

public class Ex03StaticInsideClass {
	static int su1=1000;
	/////////////////////////////////////////////////////////
	static class Inner1{	//static ����Ŭ������ public, default, private�� �����ϴ�. 
		static int su1=1111;
		int su2=2222;
		
		public Inner1(){
			System.out.println("����Ŭ���� ��ü ����");
		}
		
		public static void func01(){
			System.out.println("Inner-static func01");
		}
		
		public void func02(){
			System.out.println("Inner-non-static func02");
		}
	}
	/////////////////////////////////////////////////////////


	public static void main(String[] args) {
		System.out.println("inner-su1="+Inner1.su1); //����Ŭ������ �ִ� static���� su1
		/*Ex03StaticInsideClass.*/Inner1.func01();	//����Ŭ������ �ִ� static �޼���
		
		/*Ex03StaticInsideClass.*/Inner1 inn=new Inner1(); //non-static �� ȣ���ϱ� ���� ��ü����.
		System.out.println("inner-su2="+inn.su2); //non-static ���� ȣ��
		inn.func02();	//non-static �޼��� ȣ��.
	}

}
