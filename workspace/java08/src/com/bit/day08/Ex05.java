package com.bit.day08;

public class Ex05{
   int su;

   public Ex05(){ //������ ����X = default������
	su = 100;
	System.out.println("param���� ������");
	System.out.println("su="+su);
   }

   public Ex05(int su){ //������ ����O
	this.su=su;
	System.out.println("int param ������");
	System.out.println("su="+su);
   }

   public static void main(String[] args){

	Ex05 me = new Ex05(100);
	me.func01(me);

   }

   public void func01(Ex05 me){ //me=�ּҰ�.
	int su = 9999;
	System.out.println(this.su);
	me.func02();
	//this

   }

   public void func02(){
	this.func03();


   }

   public void func03(){


   }

}