package com.bit.day09;

public class Ex03{


  public static void main(String[] args){
	String msg = "Java Web Spring"; //�ϴ� ���ڷ� �ٲ�.

	System.out.println("Q1+-------------------------------------------");
	/* 
		�� �� ���� ���.
	cnt=0;
	char[] chs1=msg.toCharArray();
	for(int i = 0; i<chs1.length; i++){
		if(chs1[i] == ' '){
			chs++;
	}
	System.out.println(msg+"���� ������ ������ "+cnt1+"�� �Դϴ�.");
	}
	*/
	int cnt1 = 0;
	//Q1
	byte[] bys1 = msg.getBytes();
	for(int i = 0; i<bys1.length; i++){ // ���ڷ� �ϳ��� �̾����ϱ� �˻���.
		if(bys1[i] == ' '){
			//System.out.println((char)bys[i]);  //����...
			//ī����
			cnt1++;//cnt = cnt+1;
		}
	}
	System.out.println(msg+"���� ������ ������ "+cnt1+"�� �Դϴ�.");


	System.out.println("Q2+-------------------------------------------");	
	//Q2 �ϴ� ���ڷ� �ٲٰ� ���ڵ� ���̿��� �빮�ڸ� �̾�.
	/*
	cnt=0;
	char[] ch2=msg.toCharArray();
	for(int i = 0; i=ch2.length; i++){
		if(ch2[i] >'A' && ch2[i]<'Z'){
			cnt++;
		}


	*/
	int cnt2 = 0;
	byte[] bys2 = msg.getBytes();
	for(int i = 0; i<bys2.length; i++){ // ���ڷ� �ϳ��� �̾����ϱ� �˻���.
		if(bys2[i]>'A' && bys2[i]<'Z'){
			//System.out.println((char)bys2[i]);  //����...
			//ī����
			cnt2++;//cnt = cnt+1;
		}
	}
	System.out.println(msg+"���� �빮���� ������ "+cnt2+"�� �Դϴ�.");
	//msg.getBytes();

	System.out.println("Q3+-------------------------------------------");
	int gap = 'a'-'A'; // �ҹ��ڿ� gap��ŭ�� ���� �빮�ڰ� ��.
	char[] chs3 = msg.toCharArray();
	for(int i=0; i<chs3.length; i++){
		if(chs3[i]>=97 && chs3[i]<='z'){
			chs3[i]-=gap;
		}
	}
	String msg2 = new String(chs3);
	System.out.println(msg2);

	String msg3="";
	for(int i=0; i<msg.length(); i++){
		char ch4=msg.charAt(i);
		if(ch4>='a' && ch4<='z'){
			msg3+=(char)(ch4-gap);
		}else{
			msg3+=ch4;
		}
	}
	System.out.println(msg3);

	System.out.println("Q4+-------------------------------------------");
	String[] msgs=new String[1];
	int cnt3=1;
	//String[] msgs=null;
	for(int i =0; i<msg.length(); i++){
		char ch3=msg.charAt(i);
		if(ch3==' '){
			cnt3++;
			msgs=new String[cnt3];
		}
	}
	// msgs ����Ȯ��.
	for(int i=0; i<msgs.length; i++){
		msgs[i]="";
	}
	// {"","",""}
	int cnt4=0;
	for(int i=0; i<msg.length(); i++){
		char ch4=msg.charAt(i);
		if(ch4==' '){
			cnt4++;
		}else{
			msgs[cnt4]+=msg.charAt(i);
		}
	}
	for(int i=0; i<msgs.length; i++){
		System.out.println(msgs[i]);
	}

  }


}