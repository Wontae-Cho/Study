package com.bit.thread;

// 스레드에서 동시에 일을 할 수 있는 방법
// 스레드도 객체이지만 힙 영역에 두고 있는 것이아니라 stac영역에 올려서 일을 처리하는 것이다.
// 이 때 우리가 알고 있는 선입 후출의 방법으로 쌓는 것이 아니라 
// 옆으로 두어서 번갈아가면서 일을 진행하게 된다.

class Ex100 extends Thread{
	static int result;
	int start;
	int end;
	
	public Ex100(int start, int end) {
		this.start = start;
		this.end = end;
		
	}
	// "임계영역"에 빠진다라고 표현함
	// 동기화
	// 동기화 방법 1. synchronized 
//	public synchronized void plus(int su){
		// 해당매서드를 끝내지 않고 쓰레드로 넘어가는 상황이 발생함
		// 따라서 기존 결과값이 넘어가지 않고, 새로운 결과로 덮어씌워지는 결과를 가져옴.
		// 중간에 멈춰서 이뤄진 일이므로 그를 막기위한 방법들을 "동기화" 라고한다.
		// synchronized 선언을 하게 되면 무조건 코드의 끝까지 진행할 수 있도록 해준다.
		// 즉, 스레드 객체가 일하는 동안 다른 스레드 객체는 일을 하지 못하는 것.
		// 이 매서드가 실행되는 동안 다른 스레드는 밖에서 대기한다고 보는게 맞다.
		// 스레드에 안전하냐 불안전하냐를 따지는 것이 이 내부로직에 싱크로나이즈드의 여부이다.
	
	// 동기화 방법 2.
	// 블럭동기화
	public void plus(int su){
//		result += su;
		int hap = 0;
		
		synchronized(this){
			// 아래 두코드가 동시에 이뤄질 수 있도록 하는방법.
			// 특정 임계영역을 제한하는 방법. 오차가 생길 수 있는 부분만 제한.
			// 싱크로나이즈가 이뤄지는 부분을 최소화하여서 일을 좀 더 유동적으로 처리할 수 있다.
			// 즉 밖에서 메서드가 대기하는 상황을 줄임으로써 성능의 제한을 최소화 하는 것.
			// 메서드 전체를 싱크로나이즈 하는 것 보다 이와 같은 방법이 더 좋은 방법이라고 할 수 있다.
			// 블럭동기화가 여러개 있을 때 
			hap = result + su;
			result = hap;
		}
	}
	static Object key = new Object();
	public void minus(int su){
//		result += su;
		int hap = 0;
		
		synchronized(key){
			//key를 가지고 들어오는 것과 같기 때문에. 위의 블럭와 별개로 스레드의 진행이 이뤄질 수 있다.
			hap = result - su;
			result = hap;
		}
	}
	
	public void run() {
		for(int i=start; i<end+1; i++){
			plus(i);
			System.out.println(this.getName()+"연산중..");
		}
		System.out.println(result);
	}
}

public class Ex01 {
	// 500500
	// 고의로 잘못된 결과를 낼 수 있도록 한 것.
	// Thread의 잘못된 사용의 예를 위해서.
	// Thread는 
	
	public static void main(String[] args) {
		// 1 ~ 50까지를 누적하는 객체.
		Ex100 ex100 = new Ex100(1,50);
		// 51~ 100까지를 누적하는 객체.
		Ex100 ex200 = new Ex100(51,100);
		ex100.start();
		ex200.start();
		try {
			// 조인을 통해 메인이 쓰레드가 모두 끝났을 때 끝날 수 있도록 해줌.
			ex100.join();
			ex200.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("1~100까지의 합은 "+result);
	}

}
