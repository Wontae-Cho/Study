package com.bit.day08;

public class Ex09{

   public static void main(String[] args){
	// A~Z���� ����Ͻÿ� //�迭�� �̿��ؼ�
	int cnt = 'Z'-'A'+1;	

	char[] chs=new char[cnt];
	for(int i =0; i<cnt; i++){
		chs[i]=(char)('A'+i);
	}
	System.out.println("�迭�� ���� : "+cnt);
	System.out.println("�迭�� ���� : "+chs.length); //�迭�� ����� �˼� �ְ� �����ִ� length
	for(int i =0; i<cnt; i++){
		System.out.println(chs[i]);
	}

   }

}