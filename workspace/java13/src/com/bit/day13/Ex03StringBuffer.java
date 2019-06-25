package com.bit.day13;

public class Ex03StringBuffer {

	public static void main(String[] args) {
//		Ball ball = new Ball(1);
//		System.out.println(ball);
		// String에서 제공하는 여러 기능(메소드)들을 사용했을 때 반환이 String이라면
		// 새로운 객체를 만들어낸 결과를 보여준다.
		java.lang.StringBuffer msg1 = new StringBuffer("java"); //StringBuffer의 사용법.
		StringBuffer msg2 = new StringBuffer("World");
//		StringBuffer msg3 = msg1+msg2;
//		String msg4="abc";
//		String msg5 = msg4.concat("123");
		
//		String msg3 = msg1.toString()+msg2.toString(); //스트링과 스트링일 때의 내부연산 방법.
		
		//추가
		StringBuffer msg3 = msg1.append(msg2);
		System.out.println(msg3);
		
		//수정. 
		msg3.replace(4,5,"w"); //replace는 객체를 생성하는것이 아니라 자기 자신을 바꿔버림.
						//메모리를 효율적으로 사용할 수 있으나, 실행오류를 일으킬 수 있는 가능성이 높다.
						//활용은 하는것이 좋지만 조심해서 써야한다.
		System.out.println(msg3);
		System.out.println(msg1);
		
		msg1.append("! ! ! ! ");
		System.out.println(msg1);
		msg1.append(1234);
		System.out.println(msg1);
		
		//삭제
		msg1.delete(4, 9); //.delete(index 시작, index 끝)
		System.out.println(msg1);
		
		// 추가
		msg1.insert(4, "web"); //중간에 끼워넣기.
		System.out.println(msg1);
		System.out.println("length : "+msg1.length());
		
		StringBuffer msg5 = new StringBuffer("     java web     ");
		msg5.trimToSize();
		System.out.println(msg5);
		System.out.println(msg5.length());
		System.out.println(msg5.capacity());
		
		msg5.setLength(100); // 길이를 설정.
		System.out.println(msg5);
		System.out.println(msg5.length());
		System.out.println(msg5.capacity());
	}

}
