package com.bit.day11;

public class Ex11 {
	static int num2=2222;
	int num1=1111; //����ʵ�
	int num3;
	
//	public Ex11(){ //�����ڰ� ���� ��쿡�� �̷��� ���·� ����Ʈ �����ڰ� �����Ǿ��ִ�.
//		
//	}
	public Ex11(){
		this(2222); //�ٸ� �����ڸ� ȣ���� �� ����.
					//this();�� �������� super�� ����� �� ����. ��ü�� 2�������� ����� �������⶧����.
		System.out.println("��ü ����");
	}
	public Ex11(int s){ //��ü ���������� �� �ѹ��� �̷���.
		super(); //�����Ǿ��ִ� ����.
					//�ٽ� ȣ���ϴ� ���� �ٸ� ��ü�� ������.
		num3=s; //�ڷ����� ����ʵ忡 ����������Ѵ�.
		System.out.println("��ü ����");
	}

	public static void main(String[] args) {
		Ex11 me = new Ex11();
		me/*�ش簴ü*/.func01();
		System.out.println(me.num2);
		me.num2++; //����ƽ������ me��ü���� �����ߴ��� you��ü���� ������ ��.
					// �̷��� ����ؼ��� �ȵ�.
		Ex11 you = new Ex11();
		System.out.println(you.num2);
		System.out.println(me.num2);

	}
	static void func03(){
		//System.out.println(this); //this�� static���� ����� �� ����.
	}
	
	
	void func01(){ //public, default, private
		System.out.println(this);
		System.out.println("non-static func01()...");
		this.func02(); //this.�� �����Ǿ�����.
					//�ٷ����� this�� ����� ���� ���ִ°��� ����.
					//this�� non-static������ ���. ��ü�� ����Ű�°��̱� ������.
	}
	
	void func02(){
		System.out.println("non-staic func02()...");
	}

}
