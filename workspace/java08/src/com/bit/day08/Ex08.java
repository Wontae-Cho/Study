package com.bit.day08;
/*
�迭 - ����Ÿ�Ժ���
�ڷ���[] �迭�� = new �ڷ���[�迭������];
ȣ�� �迭��[�ε���]
�ε��� ������ 0���� �ݵ�� ���ӵ�, ��ȣ�� ���� �迭������-1

����� �ʱ�ȭ ���� �ڷ���[] ������ = new �ڷ���[]{��,��,��,��...};
		ex) int[] array2=new int[]{1,3,5,7,9};
�翬�� �ڷ����� ������ �ڷ����� �����ؾ��Ѵ�.
//	int[] array3={1,3,5,7,9}; // �̷��� ����ؼ� �迭�� ǥ���� �� ������ 
//				//������ ���ؼ� ������ �������� �������� ����.
//	int[] array2=new int[]{1,3,5,7,9};
*/



public class Ex08{

  public static void main(String[] args){ //args��� String�迭.
	//System.out.println("args[0]="+args[0]);

	//args�� ������ �� �� �� �ְ� �װ��� ����, tab�� �̿��ؼ� ������ �� �ִ�.

	int a1=10;
	int a2=11;
	int a3=12;
	int a4=13;
	int a5=14;

	int[] array = new int[5]; //�迭�� ���� - ����Ȯ��
	//��Ʈ�� ���� 5���� ���� �� �ִ� ��������� Ȯ���ش޶�
	//array[0]=10;		//�ʱ�ȭ - ���� ����
	//array[1]=11;
	//array[2]=12;
	//array[3]=13;
	//array[4]=14;
	//array[5]=15;
	for(int i = 0; i<5; i++){
		array[i]=10+i;
	}

	for(int i=0; i<5; i++){
		System.out.println("array["+i+"]="+array[i]);
	}

	int[] array2=new int[]{1,3,5,7,9};
	String[] strs = new String[]{"java","web","db","framework"};
	for(int i=0; i<4; i++){
		System.out.println(strs[i]);
	}

	int[] array3={1,3,5,7,9}; // �̷��� ����ؼ� �迭�� ǥ���� �� ������ 
				//������ ���ؼ� ������ �������� �������� ����.


  }


}