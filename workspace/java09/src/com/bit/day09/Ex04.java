/*
Q1. ���밪�� ��ȯ�޴� abs(-123) -> 123 �޼��带 ����ÿ�.

Q2. 1/2+2/3+3/4+4 .....99998/99999+99999/100000=???
   //������ ��� - ������ ��ǻ�ʹ� ����� �Ǳ⿡ �Ʒ��ִ� ����� �� �� ���ѹ����.
   sum = 0.0;
   for(int i=2; i<=1000000; i++){
	sum+=(1-1.0/i);
   }

Q3. func01(5,1,3)
	return String���� �������� ���ڿ��� ���Ϲ޵��� �϶�

Q4. {5,1,3}
	�������� �迭�� ����Ͻÿ�.
*/


package com.bit.day09;

public class Ex04{

  public static void main(String[] args){
	//Q1.
	int su=abs(-123);
	System.out.println(abs(-123));

	System.out.println(div(1000000));
	//String msg = func01(5,1,3));
	//System.out.println(msg);

	int[] arr={5,1,3};
	int temp=0;
	
	if(arr[0]<arr[1] && arr[0]<arr[2] && arr[1]>arr[2]){
			temp=arr[1];
			arr[1]=arr[2];
			arr[2]=temp;
	}
	else if(arr[1]<arr[0] && arr[1]<arr[2]){ //arr[1]���� ������
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		if(arr[1] > arr[2]){
			temp=arr[1];
			arr[1]=arr[2];
			arr[2]=temp;
		}	//{1,3,5}
	}
	else if(arr[2]<arr[0] && arr[2]<arr[1]){ //arr[2]���� ������
		if(arr[1] < arr[2]){
			temp=arr[0];
			arr[0]=arr[2];
			arr[2]=temp;
		}		
		if(arr[1] > arr[2]){
			temp=arr[1];
			arr[1]=arr[2];
			arr[2]=temp;
		}	//{3,5,1}
	}
	for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}
  }
  //Q1.
  public static int abs(int num){ //���밪.
	if(num>0){
		num = -num;
		//a*=-1;
	}

	return 	num;

  }
  //Q2.
  public static double div(int num){ //num = 1000000
	double sum=0.0;
	for(int i=0; i<num; i++){
		sum+=i*1.0/(i+1); //
	}
	return sum;

  }
 /*
  //Q3.
  public static String func01(int n1, int n2, int n3){
	String msg = "";
	if(n1<n2&&n1<n3&&){	
			msg+="n1 < ";
			if(n2<n3){msg+="n2 < n3";}
			else if(n3<n2){msg+="n3 < n2"}
	}else if(n2<n3 && n2<n1){
			msg+="n2 < ";
			if(n1<n3){msg+="n1 < n3";}
			else if(n3<n1){msg+="n3 < n1";}
	}else if(n3<n1 && n3<n2){	
			msg+="n3 < ";
			if(n2 < n1){msg+="n2 < n1";}
			else{msg+="n1 < n2";}
			
	}
	System.out.println("���ೡ");

	return msg;
  }
  */



}