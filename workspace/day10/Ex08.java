package com.bit.day10;

class Ex09{

  public static void main(String[] args){
	Ex09 me = new Ex09();
	me.func01();
	//me.func02();

  }

  public void func01(){
	System.out.println("�θ�Ŭ������ ���");

  }

  public void func03(){
	System.out.println("static �θ�Ŭ���� ���");

  }

}

public class Ex08 extends com.bit.day10.Ex09{ //(extends java.lang.Object)������ ������ �ڵ����� ��� �޴´�.
  int su1 = 1234;
	//����� �� ������ �ڵ��� ����.
	//Ex09�̸鼭 Ex08�̴�. Ex08�� ����� �翬�� ��밡��.
	//����� �� �ϳ��� class�� ��ӹ޴´�.
	//������ ������ Ŭ������ ��ӹ޴°��� �ִٸ� �� ���� �͵� ��ӹ޴� �Ͱ� ����.
	//���� ��� Ŭ������ ���������� ObjectŬ������ ��ӹ޴´�.
	//�θ�Ŭ���� ���忡���� �ڽ�Ŭ������ ����� ������� ���Ѵ�.
	//����� ����� �׻� non-static�� �Ǿ���Ѵ�.(������ �����ϳ� ������� ���ƾ� �Ѵ�.)
	//���� ����� ���� ���, �ڽĿ��� �ִ� ����� ����ȴ�. ������ ��������� �� ���ִ�.
		//=�������̵�


  public static void main(String[] args){

	Ex08 me = new Ex08();
	//Ex08 you = new Ex08();
	me.func01();
	me.func02();
	//Ex08.func03(); //(X)
	//Ex09.func03(); //(O)
	me.func03();

	//System.out.println(me);	

	String msg = me.toString();
	System.out.println(msg);
	//System.out.println(me.equals(you));
	//System.out.println(me.hashCode());


  }

  public void func02(){
	System.out.println("�ڽ�Ŭ������ ���");
  }

  public void func03(){
	System.out.println("�޼��� �������̵�..");
  }


}