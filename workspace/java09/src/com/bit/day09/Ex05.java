package com.bit.day09;

public class Ex05{
  //����
  int su1=1234; 	//�ν��Ͻ��ʵ�
  static int su2=4321; 	//Ŭ��������
	//�ʵ�� ������ �� ���� ���� �����ϱ� �����ϴ� ���� ����.

  public Ex05(){
	//��ü ��������
	su1=1000; //��ü ���������� ������ �ʱ�ȭ�� ����. final�� ���� ����.
  }
	//�����ڵ� ���������� �޼��� ���� ��ġ��Ű�� ���� ����.

  public static void main(String[] args){
	System.out.println(com.bit.day09.Ex05.su2); 	//������ ���� ȣ�� ���
	System.out.println(Ex05.su2);			//���� ��Ű�� �ȿ� �ֱ⿡ ��Ű�� ��������
	System.out.println(su2);			//���� ��Ű�� ���� Ŭ�����ȿ� �ֱ⿡ Ŭ������ ��������
	func01();			//���� Ŭ���� �ȿ��� ������ �޼��� ȣ����
	Ex05.func01();			//���� ��Ű������ ������ �޼��� ȣ����
	com.bit.day09.Ex05.func01();	//������ �޼��� ȣ����

	Ex05 me = new Ex05(); //��ü����
	//com.bit.day09.Ex05 me = new com.bit.day09.Ex05(); //���� ������ ȣ�� �� ��ä ����.
	System.out.println(me.su1);
	me.func02();
  }

  //�޼���
  public static void func01(){
	System.out.println("static �޼���");	//static �ȿ��� this��°��� ������ �� ����.
						//this�� �ּҸ� ǥ���ϴ� ���̱⿡ static�� �ּҰ� ����.(�̹� �ε��Ǿ� �ִ°�)
	com.bit.day09.Ex05.func04();
  }
  public void func02(){
	System.out.println("non-static �޼���"+su1);
	this.func03();
  }

  public void func03(){
	System.out.println("non-static �޼���");
  }

  public static void func04(){
	System.out.println("non-static �޼���");
  }


}