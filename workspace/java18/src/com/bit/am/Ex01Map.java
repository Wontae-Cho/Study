package com.bit.am;

import java.util.Iterator;
import java.util.Set;

public class Ex01Map {
	static class Test{}


	public static void main(String[] args) {
		// Map (key, value) key가 index의 해당한다고 볼 수 있다.
						// key, value가 어떤 자료형이든 상관없다.
						// key가 중복이되면 수정이 이뤄지기때문에 중복이 불가하다.
						// value 값의 중복은 상관없다. 해당 key가 가지는 value이기 때문에.
		java.util.Map map1 = new java.util.HashMap();
		map1.put(0, "ab");
//		map1.put(1, "abced");
		map1.put(5, 1);
		map1.put("a", null);
		map1.put('a',123434);
		map1.put(null, 'a');
//		map1.put(new Test(), 'a');
		
		
		//삭제
		map1.remove(5);
		
		Set keys = map1.keySet();
		
		//map의 전체내용을 출력하는 방법1 - 일반적인 방법
		Iterator ite = keys.iterator();
		while(ite.hasNext()){
			Object key =ite.next();
			System.out.println("key : "+key+", value : "+map1.get(key));
		}
		
		//map의 전체내용을 출력하는 방법2 - 자료가 몇개 없을 때의 특수한 방법.
//		Object[] keys = {0,5,"a",'a',null};
//		for (int i = 0; i < keys.length; i++) {
//			System.out.println(map1.get(keys[i]));
//		}
		
		//내가 넣은 값을 내가 정한 key(index)에서 찾을 수 있다.
//		System.out.println(map1.get(3));
//		System.out.println(map1.get(5));
//		System.out.println(map1.get(10));
		
		//수정
//		map1.put(5, "1234a"); // 중복된 key는 수정이 이뤄진다.
		
		//삭제
//		map1.put(5, null); //삭제 또한 수정과 같은 방법으로 null을 넣어주면 삭제.
		
		
	}

}
