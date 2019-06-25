package com.bit.am;


class Pan{
	public void draw(){
		System.out.println("선을 긋다");
	}
}

class Pancil extends Pan{
	final String size;
	
	public Pancil(){
		this.size = "HB";
	}
	
	public Pancil(int size){ 
		this.size=size+"B";
	}
	public void draw(){ //오버라이딩
		if(size.equals("2B")){
			System.out.print("조금 두꺼운 ");
		}else if(size.equals("4B")){
			System.out.print("두꺼운 ");
		}
		System.out.println("선을 긋다");
	}
}

class Ballpan extends Pan{
	private String color;
	
	public Ballpan(){
		this.color = "검정";
	}
	public Ballpan(String color){
		this.color = color;
	}
	public void draw(){
		System.out.println(color+"색 선을 긋다");
	}
}

class Box2<T>{
	private T pan;
	
	public <T>Box2(){
		
	}
	
	public T get(){
		return pan;
	}
	
	public void set(T pan){
		this.pan = pan;
	}
	
}

public class Ex03Generic2 {


	public static void main(String[] args) {
		Box2<?> box2 = new Box2<Pan>(); //Ballpan , Pancil, Pan 박스에 들어갈 요소를 제어할 수 있음
										// Ballpan을 명세하면 Ballpan만, Pancil을 명세하면 Pancil만 담는다.
										// 즉, 생성자를 코딩시점에 결정하지 않고 생성자의 생성시점에 결정하도록 할 수 있다.
										// <> = 추론타입. 앞에 명세된 것이 있으면 그것을 따라서 잡아준다. 1.7에서 추가.
										// ex) Box2<Pan> box = new Box2<>();
										// <?> 객체 생성시점에 결정을 하지 못한것.
		Box2<Pan> box = (Box2<Pan>)box2;// 나중에 결정함. 따라서 캐스팅을 해줘야함.
		box.set(new Ballpan("초록")); //box에 팬을 집어 넣으면
		box.get().draw(); //box에서 팬을 꺼낼 수 있다.
		box.set(new Ballpan());
		box.get().draw();
		box.set(new Pancil());
		box.get().draw();
		box.set(new Pancil(4));
		box.get().draw();

	}

}
