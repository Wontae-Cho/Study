package com.bit.pm;

//import com.bit.pm.Scanner; //Ŭ�������� ����س��� ���� �ֿ켱���� ��.
//import java.util.*; // ���� ��Ű�� �ȿ� �ִ� ��� Ŭ����.
//					// �� �𸦶� ���ϵ�� �� �� ������ ���� ������ �ƴϴ�.
//					// �ֱٿ��� �� �Ⱦ����� ����ϴ� ���̴�.
//					// ���� Ŭ�������� import�Ұ����ϴ�. ��Ű������ �޶�.
//import java.lang.Math;
import static com.bit.pm2.Ex01.su;
import static com.bit.pm2.Ex01.func01;
	//static import = static���� ����Ȱ͵鸸 �ٷ� �����ͼ� ����� �� �ֵ��� ����.
	// non - static�� �Ұ���.

public class Ex10Import {
//	static int su = 4321; ���� �̸��Ͻ� �ڱ����� �ִ� ���� �켱.

	public static void main(String[] args) {
		System.out.println(/*com.bit.pm2.Ex01.*/su);
		/*com.bit.pm2.Ex01(import�߱⶧������������)*/func01();
//		func02(); //non-static�̶� �Ұ�����.
		
		
		
		//��ǥ���� �ܺ�Ŭ���� �̿�,���� ���.
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		//import ������ ��ĳ�� �̿���
//		Scanner sc= null;
//		Scanner sc = new Scanner(System.in);

//		com.bit.pm.Scanner sc2 = new com.bit.pm.Scanner();
//		sc2.func01(); //��������� ��Ű����θ� ���� �̿��������� ��� ����.

	}

}
