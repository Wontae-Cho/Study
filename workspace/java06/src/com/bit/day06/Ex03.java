/*
non-static method (�ν��Ͻ� �޼ҵ�, ��� �޼ҵ�)
1. static method���� non-static method�� ȣ���ϱ� ���ؼ��� ��ü���� �� 
	���������� �̿��ؼ� ���� > ��������.�޼ҵ��();
2. non-static method���� non-static method ȣ����
	�޼ҵ��();
3. static method���� static method ȣ����
	�޼ҵ��();
4. non-static method���� static method ȣ����
	�޼ҵ��();
*/

package com.bit.day06;

public class Ex03{

   public static void main(String[] args){
	Ex03 me;	//������ ����
	me = new Ex03();//�ʱ�ȭ(��ü ����) //static�� �������.
			

	me.func01();  //static�� �������.
		// ������ ��ü�� func01�޼ҵ� ����
	//me.func02(); //������ ��ü�� func02�޼ҵ� ����
	//func03();

	//func01(); // static�� �������.
	//com.bit.day06.Ex03.func01();  //�ٸ� Ŭ������ �������

   }

   public void func01(){ //static
	System.out.println("func01�� ����Դϴ�");
	//func02();
	func03();
	return;
   } 

   public void func02(){
	System.out.println("func02�� ����Դϴ�");
   }

   public static void func03(){
	Ex03 you = new Ex03();
	//you.func02();
   }

}