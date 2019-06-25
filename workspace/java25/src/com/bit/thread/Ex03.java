package com.bit.thread;

/*
 * 예전에 쓰던 방식의 스레드 제어방법.
 * 
 *  현재도 사용할 수 있지만 권장하는 방식이 아님. 하지만 직관성이 좋다는 장점이 있음.
 *  
 *  앞서 봤던 yield는 runnable 상태로 보내는 것에 반해서
 *  suspend는 blocked 상태로 보낸다. 
 *  resume 했을 때 runnable로 보내고
 *  stop 할 때 강제적으로 dead로 보내버린다.
 *  따라서 앞서 봤던 코딩의 형식보다 강제성을 많이 띄는 상황이 연출된다.
 * 
 */
class Ex203 extends Thread{
	
	public void run() {
		int a = 0;
		while(true){
			System.out.println(++a + "working");
		}
	};
}


public class Ex03 {
	
	public static void main(String[] args) {
		Ex203 you = new Ex203();
		
		you.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		you.suspend(); // 일시정지
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		you.resume(); // 재시작
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		you.stop(); // 종료
	}

}
