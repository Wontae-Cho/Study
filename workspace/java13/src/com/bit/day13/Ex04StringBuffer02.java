package com.bit.day13;

public class Ex04StringBuffer02 {


	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(5);
						//인자로 숫자를 전달 할 경우 default 사이즈를 지정할 수 있다.
		
		System.out.println(sb.length()); 
		System.out.println(sb.capacity()) ; 
									//값이 있을 경우 = 들어온 문자열의 해당하는 공간 + default
									//값이 없을 경우 = 미리 할당해놓은 공간. default = 16 / 34 / 70
		
		for(int i=0; i<6; i++){
			sb.append('a');
			System.out.print(sb);
			System.out.println(",capacity :"+sb.capacity());
		}
		sb.trimToSize(); //안쓰는 버퍼공간을 잘라냄. (=최적화)
		System.out.println(",capacity :"+sb.capacity());
		

	}

}
