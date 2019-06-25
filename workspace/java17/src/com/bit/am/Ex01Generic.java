package com.bit.am;

class Ball{
	
	public void play(){
		System.out.println("굴러간다");
	}
}

class Baseball extends Ball{
	
	public void work(){
		System.out.println("돈을 벌어준다");
	}
}

class Box<T>{ //Generic사용법.
				//T = type
				//E = element
				//V = value
				//K = key
	private T ball;
	
	public void set(T ball){//전달받은 숫자를 필드에 있는 su에게 대입.
		this.ball = ball;//전달받은 su
	}
	public T get(){
		return this.ball; //필드에 있는 수를 반환함.
	}
	
}


public class Ex01Generic {

	public static void main(String[] args) {
		Box<Baseball> box = new Box<Baseball>();
		box.set(new Baseball()); 	// 다형성에 따라서 값을 집어넣을 수 있다.
		
		Baseball ball = (Baseball) box.get(); //다형성에 따라서 업캐스팅 됨으로 강제형변환 해줘야함.
		ball.play();
//		ball.work();
		box.get().play();
		box.get().work();
		
		
	}

}
