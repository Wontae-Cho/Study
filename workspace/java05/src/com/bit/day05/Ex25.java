/*
����, ����, �� ����
ex)
--------------------------------------------
����,����,�� ����
--------------------------------------------
����(1),����(2),��(3), ����(0)>1
COM : ����
YOU : ����
��� : �����ϴ�.

����(1),����(2),��(3), ����(0)>2
COM : ����
YOU : ����
��� : �̰���ϴ�.
����(1),����(2),��(3), ����(0)>2
COM : ����
YOU : ����
��� : �����ϴ�.
����(1),����(2),��(3), ����(0)>0
�̿����ּż� �����մϴ�.

*/
class Ex25{

   public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("--------------------------------------------");
	System.out.println("����, ����, �� ����");
	System.out.println("--------------------------------------------");
	boolean result = true;

//1. �̱��� 2. ����� 3.����� 0. ��

	while(result) {
		System.out.print("����(1),����(2),��(3),����(0)"); //���� 1
		double ran = Math.random(); // ������.
		int com = (int)(ran*3)+1;
		int choiceNum = sc.nextInt();
		if(choiceNum == 0) {
				System.out.println("�̿����ּż� �����մϴ�");
				result = false;
		}
		String win = "��� : �̰���ϴ�";
		String loose = "��� : �����ϴ�";
		String draw = "��� : �����ϴ�";
		String youScissors = "YOU:����";
		String youRock = "YOU:����";
		String youPaper = "YOU:��";
		String comScissors = "COM:����";
		String comRock = "COM:����";
		String comPaper = "COM:��";
		
		switch(choiceNum){ //�����Ǵ� 
			case 1 : //������ ������ ���
				System.out.println(youScissors);
				if(com == 1) {
					System.out.println(comScissors);
					System.out.println(draw);
				}else if(com == 2) {
					System.out.println(comRock);
					System.out.println(loose);
				}else if(com == 3) {
					System.out.println(comPaper);
					System.out.println(win);
				}
				break;
			case 2 : //������ ������ ���
				System.out.println(youRock);
				if(com == 1) {
					System.out.println(comScissors);
					System.out.println(win);
				}else if(com == 2) {
					System.out.println(comRock);
					System.out.println(draw);
				}else if(com == 3) {
					System.out.println(comPaper);
					System.out.println(loose);
				}
				break;
			case 3 : //������ ���� ���
				System.out.println(youPaper);
				if(com == 1) {
					System.out.println(comScissors);
					System.out.println(loose);
				}else if(com == 2) {
					System.out.println(comRock);
					System.out.println(win);
				}else if(com == 3) {
					System.out.println(comPaper);
					System.out.println(draw);
				}
				break;
			//default : //1,2,3,0 ���� ���ڰ� �ԷµǾ��� ���
				//System.out.println("�߸��Է��ϼ˽��ϴ�. �ٽ� �Է����ּ���");

		}
	System.out.println("------------------------------------------------------");
			
	}
	/*
	System.out.println("COM : ����");
	System.out.println("YOU : ����");
	System.out.println("��� : �����ϴ�.");
	System.out.print("����(1),����(2),��(3),����(0)") //���� 2
	int rock = sc.nextInt();
	System.out.println("COM : ����");
	System.out.println("YOU : ����");
	System.out.println("��� : �̰���ϴ�.");
	System.out.println("COM : ����");
	System.out.println("YOU : ����");
	System.out.println("��� : �����ϴ�.");
	System.out.print("����(1),����(2),��(3),����(0)") //���� 0
	System.out.println("�̿����ּż� �����մϴ�.");
	*/
	
	
	



   }

}