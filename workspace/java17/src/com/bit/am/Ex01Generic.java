package com.bit.am;

class Ball{
	
	public void play(){
		System.out.println("��������");
	}
}

class Baseball extends Ball{
	
	public void work(){
		System.out.println("���� �����ش�");
	}
}

class Box<T>{ //Generic����.
				//T = type
				//E = element
				//V = value
				//K = key
	private T ball;
	
	public void set(T ball){//���޹��� ���ڸ� �ʵ忡 �ִ� su���� ����.
		this.ball = ball;//���޹��� su
	}
	public T get(){
		return this.ball; //�ʵ忡 �ִ� ���� ��ȯ��.
	}
	
}


public class Ex01Generic {

	public static void main(String[] args) {
		Box<Baseball> box = new Box<Baseball>();
		box.set(new Baseball()); 	// �������� ���� ���� ������� �� �ִ�.
		
		Baseball ball = (Baseball) box.get(); //�������� ���� ��ĳ���� ������ ��������ȯ �������.
		ball.play();
//		ball.work();
		box.get().play();
		box.get().work();
		
		
	}

}
