package com.bit.am;

class Â¥Àå{
	
}

class Â«»Í{
	
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
		Â¥Àå c1 = new Â¥Àå();
		Â«»Í c2 = new Â«»Í();
		Box4<Â¥Àå,Â«»Í> box = new Box4<Â¥Àå,Â«»Í>();
		box.set(c1, c2);
//		box.set(c2, c1); //¼ø¼­°¡ ¹Ù²î¸é ¿À·ù c1, c2°¡ ¾Æ´Ñ ¾î¶°ÇÑ ´Ù¸¥ °ÍÀÌ µé¾î¿Íµµ ¿À·ù
	}

}











