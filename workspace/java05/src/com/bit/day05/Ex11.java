/*
version�� �ǹ� : ex) JDK 1.8.0_201
major version : 1
 -> ȣȯ�� 1�� �����ϴ� ��� ������ �־ ���� ȣȯ���� �����ϸ� 2�� �ö󰡰� �ڿ� ��� ���� �ʱ�ȭ�Ѵ�.
minor version : 8
 -> ������ �־ �ٲٴ� ���� �ƴ϶� ���,���, ���� � �־ ��ȭ�� ���� ��
patch(���� - bug) : 0_201
����,����.���� ������ �����ϴ� ���α׷�
���� 90 ���� 85 ���� 78
�̵��� ����� ���
���� ���� ~ ��� 90 �̻� : A / 80~90 : B / 70 ~ 80 : C / 60 ~ 70 : D / �� �� F
ex)
-----------------------------------------
�����������α׷�(ver 0.0.1)
-----------------------------------------
���� : 90	���� : 85	���� : 78
�հ� : 0000
��� : 00.00
���� : (A~F)����




*/

class Ex11{

    public static void main(String[] args){
	int kor = 90;
	int eng = 85;
	int math = 78;
	int sum = kor + eng + math;
	double avg = sum*100/3/100.0; //�Ҽ� ��°�ڸ����� �ڸ��� ��, ������������ ��Ȯ�� �� �� ���� �� ����
	String bar = "-----------------------------------------";

	// ��� �κ�
	System.out.println(bar);
	System.out.println("�����������α׷�(ver 0.0.1)");
	System.out.println(bar);
	System.out.println("���� : " + kor + '\t' + "���� : " + eng + '\t' +  "���� : " + math);
	System.out.println("�հ� : " + sum);
	System.out.println("��� : "+ avg);
	System.out.print("���� : ");
	// ���� ���
	/*
	if(avg >= 90) {
			System.out.println(" A ");
	}else if(avg >= 80) {
			System.out.println(" B ");
	}else if(avg >= 70) {
			System.out.println(" C ");
	}else if(avg >= 60) {
			System.out.println(" D ");
	}else{
			System.out.println(" F ");
	}
	*/
	switch((int)avg/10) {
		case 10 :
		case 9 : 
			System.out.println(" A ");
			break;
		case 8 : 
			System.out.println(" B ");
			break;
		case 7 : 
			System.out.println(" C ");
			break;
		case 6 : 
			System.out.println(" D ");
			break;
		default : 
			System.out.println(" F ");
			break;
	}




    }

}