package com.bit.am;

import java.util.ArrayList;


class Target{
	int su=1111;
}

public class Ex07UseArrayList {


	public static void main(String[] args) {
		java.util.ArrayList arr = new java.util.ArrayList();
		
		arr.add(111);
		arr.add("string");
		arr.add('a');
		arr.add(false);
		Target tar = new Target();
		arr.add(tar);
		arr.add(new int[]{1,3,5,9});
			// 자료형과 형태 생략불가능.
		
//		System.out.println(arr.get(1));
//		String msg = (String)arr.get(1);
//		System.out.println(msg);
//		int su = (int)/*(Integer)*/arr.get(0);
//		System.out.println(su);
//		Target target = (Target)arr.get(4);
//		System.out.println(target.su);
//		int[] temp=(int[])arr.get(4);
		
//		System.out.println(java.util.Arrays.toString(temp));
		
//		System.out.println(arr.size());
		
		//삭제 remove(index or value)
		arr.remove(1);
		arr.remove(false); //숫자가 아닌 경우 입력학 value값을 찾아서 같은 것이 있으면 삭제함.
		arr.remove(tar);
		
		//수정
		arr.set(2,1234);
		
		//끼워넣기 = add(index,value)
		arr.add(1,"두번째");
		
			
		for(int i=0; i<arr.size();i++){
			System.out.println(arr.get(i));
		}
		
		System.out.println("---------------------------------------------");
		System.out.println(arr.indexOf("두번째")); //value값이 어디 있는지 찾음.어떤 index에 들어가있는지 없을시 -1
													// indexOf(value)
		ArrayList arr2 = new ArrayList();
		System.out.println(arr2.isEmpty());			// 내용이 비었는지 true or false
//		arr.clear(); 								// 내용을 싹 지움.
//		arr2.removeAll(arr); //주소값을 비교해서 같은 값이 있으면 그 값을 지움.
		System.out.println("---------------------------------------------");

		//복사
		ArrayList arr3 = new ArrayList(arr); //생성자의 인자로 컬렉션프레임워크를 집어넣으면 복사함.
//		ArrayList arr3= (ArrayList)arr.clone(); //clone()은 Object를 반환함 따라서 강제형변환 해야한다.
		for(int i=0; i<arr3.size(); i++){
			System.out.println(arr3.get(i));
		}
		
		System.out.println("---------------------------------------------");
		
		Object[] objs = arr.toArray();
		for(int i=0; i<objs.length; i++){
			Object obj=objs[i];
			System.out.println(obj);
		}
		

	}

}
