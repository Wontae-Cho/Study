package com.bit.day12;

class Target1{
	int su1 = 1000;
	int su2 = 2000;
	int su3 = 3000;
	String msg = "�ʱⰪ";
	void func01(){
		System.out.println("Target1�� ���");
	}	
}

public class Ex03ObjectArray {

	public static void main(String[] args) {
		Target1[] arr = new Target1[3]; //��ü�� �ּҸ� ���� �迭�� ��.
										//���� ���߹迭�� ������ ������ ����
		arr[0] = new Target1();
		arr[1] = new Target1();
		arr[2] = new Target1();
		
		arr[1].msg ="�ٲ�";
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i].su1); //�ϳ��� ��ü�� ���� 3���� ����.
			System.out.println(arr[i].msg);	//���� ���߹迭�� ������ ȿ���� ����.
			System.out.println(arr[i].su3);	//int�迭�� int���� ���� �� �ִ°Ϳ� ���ؼ�
											//��ü�� �迭�� ��ä�ο� �ڷ����� ���� �� �ִ�.
											//���� ��ü�� ����� ������ �Ǹ�, �� ��ɵ� ǥ���� �� �ִ�.
			System.out.println("---------------------");
//			Target1 temp = arr[i];
//			temp.func01(); 		//==arr[i].func01();

//			System.out.println(arr[i].su1);
//			System.out.println(arr[i].msg);
		}

	}

}
