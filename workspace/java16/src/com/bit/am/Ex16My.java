package com.bit.am;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex16My {

	public static void main(String[] args) {
		//로또번호생성기.
//		System.out.println((int)(Math.random()*45)+1);
		Set Lotto = new TreeSet();//인터페이스
		while(true){
			if(Lotto.size()==6){break;}
			int a = (int)(Math.random()*45)+1;
			Lotto.add(a);
//			System.out.println(a);
		}

		Iterator ite = Lotto.iterator();
		
		for(int i=0; i<6; i++){
			int ball = (int)ite.next();
			System.out.print(ball+" ");
		}
//		
		

	}

}
