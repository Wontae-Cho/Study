package com.bit.am;


class Pan{
	public void draw(){
		System.out.println("���� �ߴ�");
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
	public void draw(){ //�������̵�
		if(size.equals("2B")){
			System.out.print("���� �β��� ");
		}else if(size.equals("4B")){
			System.out.print("�β��� ");
		}
		System.out.println("���� �ߴ�");
	}
}

class Ballpan extends Pan{
	private String color;
	
	public Ballpan(){
		this.color = "����";
	}
	public Ballpan(String color){
		this.color = color;
	}
	public void draw(){
		System.out.println(color+"�� ���� �ߴ�");
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
		Box2<?> box2 = new Box2<Pan>(); //Ballpan , Pancil, Pan �ڽ��� �� ��Ҹ� ������ �� ����
										// Ballpan�� ���ϸ� Ballpan��, Pancil�� ���ϸ� Pancil�� ��´�.
										// ��, �����ڸ� �ڵ������� �������� �ʰ� �������� ���������� �����ϵ��� �� �� �ִ�.
										// <> = �߷�Ÿ��. �տ� ���� ���� ������ �װ��� ���� ����ش�. 1.7���� �߰�.
										// ex) Box2<Pan> box = new Box2<>();
										// <?> ��ü ���������� ������ ���� ���Ѱ�.
		Box2<Pan> box = (Box2<Pan>)box2;// ���߿� ������. ���� ĳ������ �������.
		box.set(new Ballpan("�ʷ�")); //box�� ���� ���� ������
		box.get().draw(); //box���� ���� ���� �� �ִ�.
		box.set(new Ballpan());
		box.get().draw();
		box.set(new Pancil());
		box.get().draw();
		box.set(new Pancil(4));
		box.get().draw();

	}

}
