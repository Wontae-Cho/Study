package com.bit.day11;

public class Ex08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// A~Z Ãâ·Â
		// A(a)~~~ Z(z)
		char ch1 = 'A';
		char ch2 = 'a';
		while(true){
			System.out.print(ch1+"("+ch2+")");
			if(ch1 != 'Z'){
				System.out.print(",");
			}else{
				return;
			}
			ch1++;
			ch2++;
		}
		
//		char ch = 'A';
//		int gap = 'a'-'A';
//		for(int i=0; i<'Z'-'A'+1; i++){
//			if(i!=0){
//				System.out.print(',');
//			}
//			System.out.print((char)(ch+i));
//			System.out.print('(');
//			System.out.print((char)(ch+i+gap));
//			System.out.print(')');
//		}
	}

}
