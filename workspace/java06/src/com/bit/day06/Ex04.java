package com.bit.day06;

public class Ex04{

   public static void main(String[] args){
	java.util.Scanner sc = null;		//��ü����
	int su=0;
	while(true){				//�ݺ��� �ϳ��� ��ü�� ����� ��.
		sc = new java.util.Scanner(System.in);	//��ü�� �ʱ�ȭ.
							//���峭 ��ü�� ��������.
		try{
			su = sc.nextInt();	//���ڰ� �ƴ� ���ڳ� �ٸ��� �޾��� �� ����.
		}catch(Exception e){}
		System.out.println("su="+su);
	}
	/*
	Ex04 me;	// Ex04�� �ڷ���.
	//me=null;	// default��. undefine. �������� ����, ������ �Ұ���.
			// �ٸ������� ������ �̷����� ���ؼ� �ӽ������� �� �� ����.
	me = new Ex04(); //me = new Ex04();

	//me = null;	//���� ����� ���� ��.

	//me.func01(); //null ���Խ� ����Ű�°� ���� ����ܰ迡�� ��������.
	Ex04 me2 = new Ex04();
	me.func03(new Ex04());

	//int su = me.func02();
	//System.out.println("su="+su);
	*/


   } //main end

  public void func01(){
	System.out.println("non-static method...");
   }

   public int func02(){
	System.out.println("non-static method return int");
	return 100;
   }

   public void func03(Ex04 you){
	System.out.println("non func03 run...");
	you.func01();
   }

} //class end