package com.bit.pm;

public class Ex09LocalClass {

	public static void main(String[] args) {
		System.out.println("main start");
		func01(55);
		System.out.println("main end");

	}
	//���ȭ�� ������ �������� ����. jdk 1.7 ������ final , 1.8���ķδ� final�� �ƴϿ��� ����.
	public static void func01(final int a){
//		int a = 1111; //�Ϲ����� ���ú���
		class Inner{ //static���δ� ������ �� ����. -> �޼ҵ尡 ������� �ȵ����� �𸣴µ� static������ �÷����°��� ��ȿ�����̱� ������.
			//class�� �̸� loading�Ǳ� ������ �� �ȿ� �ִ� �������� ���ȭ�Ǿ� �־�� �����ϴ�.
			int su1=1111;
			final static int su2 = 2222; //��, final�� ���� static�� �׳� ����� ���� �÷����´�.

			//������
			public Inner(){}
			
			//�޼���
			void func10(){
				System.out.println("local - func10()...."+a);
			}
			void func11(int b){
				System.out.println("local - func11()..."+b);
			}
		}
		Inner inn = new Inner();
		System.out.println(inn.su1);
		System.out.println(Inner.su2);
		inn.func10();
		inn.func11(a);
		return;
	}
	
//	public void func02(){
//		int a = 2222;
//		class Inner{
//			
//		}
//	}

}
