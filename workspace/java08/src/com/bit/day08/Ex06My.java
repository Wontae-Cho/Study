package com.bit.day08;

public class Ex06My{
	static int balance = 0; //�����ܾ�

  public static int deposit(java.util.Scanner sc){ //�Ա�. ���
	//java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("�Աݾ�>");
	return sc.nextInt();

  }

  public static int withdraw(java.util.Scanner sc){ //���. ���
	//java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("�����>");
	return sc.nextInt();
  }


  public static void main(String[] args){
	int plus = 0;
	int minus = 0;
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("-------------------------------");
	System.out.println("��Ʈ���� DC���");
	System.out.println("-------------------------------");
	int choice = 0;
	Ex06My me = new Ex06My();
	while(true){
		System.out.print("1.�Ա� 2.��� 3.�ܾ׺��� 0.����>");
		choice = sc.nextInt();
		if(choice==1){//�Աݱ��

			me.balance += me.deposit(sc);

		}else if(choice==2){//��ݱ��

			me.balance -= me.withdraw(sc);

		}else if(choice==3){//�ܾ׺���
			System.out.println("�ܾ� : " + me.balance);

		}else if(choice==0){//����
			System.out.println("�̿����ּż� �����մϴ�");
			break;
		}else{//�׿��� ����
			System.out.println("�ٽ� Ȯ���ϰ� �Է����ּ���");
			continue;
		}
		
		
	}
	
  }

}