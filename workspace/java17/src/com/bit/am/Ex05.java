package com.bit.am;

class ¥��{
	
}

class «��{
	
}


class Box4<T1,T2>{
	T1 a1;
	T2 a2;
	
	public void set(T1 b1, T2 b2){
		this.a1 = b1;
		this.a2 = b2;
	}
	
	
}

public class Ex05 {

	public static void main(String[] args) {
		¥�� c1 = new ¥��();
		«�� c2 = new «��();
		Box4<¥��,«��> box = new Box4<¥��,«��>();
		box.set(c1, c2);
//		box.set(c2, c1); //������ �ٲ�� ���� c1, c2�� �ƴ� ��� �ٸ� ���� ���͵� ����
	}

}











