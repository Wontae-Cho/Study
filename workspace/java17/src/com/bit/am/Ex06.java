package com.bit.am;


public class Ex06 {


	public static void main(String[] args) {
		Box06<? super Integer> box1 = new Box06<Number>(); //객체의 범위를 제한할 수 있음.
		box1.set(1111);
		Box06<Double> box2 = new Box06<Double>();
		box2.set(3.14);
		Number num = new Integer(33433);
		Box06<Number> box4 = new Box06<Number>();
		box4.set(num);
//		Box06<String> box3 = new Box<String>(); //제네릭을 숫자로 제한했기때문에 문자열이 들어갈 수 없음.
//		box3.set("메세지");

	}

}


class Box06<T extends Number>{ //박스의 쓰임새를 제약 = 제네릭에게 상속을 받도록해서 제약할 수 있다.
								// 이 상황에서는 Number를 상속받았기 때문에 숫자를 제외한 것들은 제약된다.
								// 즉, Number는 물론이고 Number가 가지고 있는 것들은 허용. 나머지것들은 허용하지 않는다.
	T t;
	public void set(T t){
		this.t = t;
	}
	public T get(){
		return t;
	}
}