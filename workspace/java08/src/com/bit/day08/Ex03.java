package com.bit.day08;

public class Ex03{
	int su;
/*
	������ ������ �����ڴ� ����Ʈ �������϶���
	�����ڰ� �������� ���� �ÿ��� �����ڸ� �������.
	�������� �̸��� Ŭ������� ������.
	�����ڴ� ���� ���� �� �� ����.
	return�� ���������� return value�� �Ұ���.
	�� �����ڴ� �»���ü�� void��� �� �� �ִ�.
	�����ڴ� �ʵ尪�� �ʱ�ȭ�� �� �� �ִ�.
*/

   public Ex03(){ //����Ʈ ������
	su = 1234;  //�ʵ尪�� �ʱ�ȭ
	System.out.println("su="+su);
	return;
   }

   public Ex03(int a){
	su = a;
	System.out.println("���� �ִ� ��ü ����");
   }

   public static void main(String[] args){
	String msg1="";
	String msg2=new String();
	System.out.println(msg2);
	
	Ex03 me = new Ex03(); //�������� ȣ�� (����X)
	Ex03 you = new Ex03(5678); //�������� ȣ�� (����O)
	me.func01();
	return; //void�̱� ������ ������ return

   }

   public void func01(){
	System.out.println("��ɼ���");
	return; //void�̱� ������ ������ return
   }

}