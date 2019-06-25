package com.bit.day08;

public class Ex05{
   int su;

   public Ex05(){ //持失切 昔切X = default持失切
	su = 100;
	System.out.println("param蒸澗 持失切");
	System.out.println("su="+su);
   }

   public Ex05(int su){ //持失切 昔切O
	this.su=su;
	System.out.println("int param 持失切");
	System.out.println("su="+su);
   }

   public static void main(String[] args){

	Ex05 me = new Ex05(100);
	me.func01(me);

   }

   public void func01(Ex05 me){ //me=爽社葵.
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