package com.bit.day09;

public class Ex06{
  


  public static void main(String[] args){
	int[] arr={4,2,5,1,3};
	int temp=0;
	for(int i=0; i<arr.length-1; i++){ //맨처음꺼는 비교를 위해서 그냥 꺼냄.
		for(int j=i+1; j<arr.length; j++){
			if(arr[i]>arr[j]){
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}

	//배열 순서대로 출력.
	for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();




  }



}