package com.bit.day08;

public class Ex10{

  public static void main(String[] args){

	/*
		�� �� �� ��  
		�� �� �� �� 
		�� �� �� �� 
		�� �� �� �� 
	*/
	//String[] box1={"�� �� �� ��","�� �� �� ��","�� �� �� ��","�� �� �� ��"}
	String[] box1=new String[4];
	for(int i=0; i<box1.length; i++){
		box1[i] = "�� �� �� ��";
	}
	//String[] box2={"��","�� ��","�� �� ��","�� �� �� ��"}
	String[] box2 = new String[4];
	for(int i=0; i<box2.length; i++){
		box2[i]="";
		for(int j=0; j<=i; j++){
			box2[i] += "�� ";
		}
	}

  }

}