package com.bit.pm;

interface Ex666{
	void func04();
}

interface Ex661 extends Ex06Interface,Ex666{
	/*public final(��������)*/ int su = 1234;
	//�������̽��� ���� ��Ӱ��� �̶��� extends�� ���.
	public abstract void func02();
	public void func03(); //������ �߻�޼��� �ۿ� ���������ϱ� ������ ��������.
}

public class Ex07InterfaceMain extends Object implements Ex661{
	//�߻�Ŭ������ ��ӹ޾ұ⶧���� �߻�Ŭ������ �Ǵ���??
	//�������̵��� �ϴ���. �� �� �ϳ��� �� �ؾ���.
	public void func02(){}
	public void func03(){}
	public void func04(){}
	
	public void func01(){
		System.out.println("func01().....");	}

	public static void main(String[] args) {
		
		Ex07InterfaceMain me = new Ex07InterfaceMain();
		me.func01();
		me.func02();
		me.func03();
		Ex06Interface you = new Ex07InterfaceMain();
		you.func01();
//		you.func02(); //�θ�Ÿ������ �ֱ⶧���� �Ұ���
//		you.func03(); //�θ�Ÿ������ �ֱ⶧���� �Ұ���
		Ex661 you2 = new Ex07InterfaceMain();
//		you2.func01();//Ex66�� func01�� ������ ���� �ʾ� ����
		you2.func02();
		you2.func03();
		System.out.println(you2.su);

	}

}
