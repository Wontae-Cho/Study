package com.bit.day12;

public class aaa {

	public static void main(String[] args) {
		int temp;
		int[] arr1 = new int[]{9,6,2,7,1};
		for(int i=0; i<arr1.length-1; i++){
			for(int j=i+1; j<arr1.length; j++){
				if(arr1[i]>arr1[j]){
					temp = arr1[j]; ///temp에 j값.
					arr1[j] = arr1[i]; // j에 i값
					arr1[i] = temp; //i에 temp값.
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		
		int a = 10;
		int b = 20;
		
		int temp1=0;
		if(a<b){
			temp1 = b;
			b = a;
			a = temp1;
		}
		String msg = "";
		String msg1 = " ";
		System.out.println(msg.equals(msg1));
		
		

	}
	

}
