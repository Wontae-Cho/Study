package com.bit.am;

public class Ex03 {


	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();
		Object obj3 = obj;
		
//		System.out.println(obj.equals(obj));  //true
//		System.out.println(obj.equals(obj2)); //false
//		System.out.println(obj.equals(obj3)); //true
		
//		System.out.println(obj.toString());
//		System.out.println(obj.getClass()); // Ŭ������ ���� ����
//		int su = obj.hashCode(); 	//10����
//		String code = Integer.toHexString(su); //10���� ������ 16������ �ٲ�
//		System.out.println(code);
		Ex03 me = new Ex03();
		Ex03 you  = new Ex03();
		Ex03 me2=null;
		me2 = (Ex03)me.clone();
	
		System.out.println(me.equals(me2));	// ���������� ��� true ���� ������ ��쿡�� false
		System.out.println(me.equals(you));	// ���� false�̳� equals �޼ҵ带 �������̵� ��.
		System.out.println(me);
		System.out.println(you);
		
//		System.out.println(me);
//		System.out.println(me.toString()); //�� Ŭ������ ���� ���� @ �ؽ��ڵ尪. =>������Ʈ�� �ִ� ��ɵ��� �̿��Ѱ�.
		
		
	}
	public int hashCode(){
		return 1111;
	}
	public boolean equals(Object obj){
		
//		return this.hashCode() == obj.hashCode();
		return this.toString().equals(obj.toString());
	}
	public Object clone(){
//		return new Ex03(); //��������
		return this;	//���� ����
	}
	
//	public String toString(){
//		return "�ٲ�";
//	}
	
	

}
