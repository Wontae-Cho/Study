package com.bit.am;


public class Ex06 {


	public static void main(String[] args) {
		Box06<? super Integer> box1 = new Box06<Number>(); //��ü�� ������ ������ �� ����.
		box1.set(1111);
		Box06<Double> box2 = new Box06<Double>();
		box2.set(3.14);
		Number num = new Integer(33433);
		Box06<Number> box4 = new Box06<Number>();
		box4.set(num);
//		Box06<String> box3 = new Box<String>(); //���׸��� ���ڷ� �����߱⶧���� ���ڿ��� �� �� ����.
//		box3.set("�޼���");

	}

}


class Box06<T extends Number>{ //�ڽ��� ���ӻ��� ���� = ���׸����� ����� �޵����ؼ� ������ �� �ִ�.
								// �� ��Ȳ������ Number�� ��ӹ޾ұ� ������ ���ڸ� ������ �͵��� ����ȴ�.
								// ��, Number�� �����̰� Number�� ������ �ִ� �͵��� ���. �������͵��� ������� �ʴ´�.
	T t;
	public void set(T t){
		this.t = t;
	}
	public T get(){
		return t;
	}
}