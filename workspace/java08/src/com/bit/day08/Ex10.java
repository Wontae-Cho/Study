package com.bit.day08;

public class Ex10{

  public static void main(String[] args){

	/*
		бс бс бс бс  
		бс бс бс бс 
		бс бс бс бс 
		бс бс бс бс 
	*/
	//String[] box1={"бс бс бс бс","бс бс бс бс","бс бс бс бс","бс бс бс бс"}
	String[] box1=new String[4];
	for(int i=0; i<box1.length; i++){
		box1[i] = "бс бс бс бс";
	}
	//String[] box2={"бс","бс бс","бс бс бс","бс бс бс бс"}
	String[] box2 = new String[4];
	for(int i=0; i<box2.length; i++){
		box2[i]="";
		for(int j=0; j<=i; j++){
			box2[i] += "бс ";
		}
	}

  }

}