package com.bit.day08;

public class Ex06{
	
  public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int input =0;
	int money =0;
	System.out.println("-------------------------------");
	System.out.println("��Ʈ����DC���");
	System.out.println("-------------------------------");
	while(true){
		System.out.print("1.�Ա� 2.��� 3.�ܾ׺��� 0.����>");
		input = sc.nextInt();
		if(input==1){//�Աݱ��
			money += push(sc);

		}else if(input==2){//��ݱ��
			money -= pull(sc);

		}else if(input==3){//�ܾ׺���
			show(money);

		}else if(input==0){//����
			System.out.println("�̿����ּż� �����մϴ�");
			break;
		}else{//�׿��� ����
			System.out.println("�ٽ� Ȯ���ϰ� �Է����ּ���");
			continue;
		}
		
		
	}
	
  }
  public static int push(java.util.Scanner sc){ // �Ա�.
	//java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("�Աݾ�>");
	return sc.nextInt();
  }
  public static int pull(java.util.Scanner sc){
	//java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("��ݾ�>");
	return sc.nextInt();

  }
  public static void show(int su){
	System.out.println("���� �ܰ� : "+su+"��");
	return ;
  }

}