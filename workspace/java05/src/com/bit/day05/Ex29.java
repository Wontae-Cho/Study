/*
--------------------------
���� (ver 0.0.1)
--------------------------
ù��° ����> 5(�ӽ�)
�ι�° ����> 3(�ӽ�)
+(1),-(2),x(3),/(4)>
5+3 = 8
���(1), ����(0)>0
�̿����ּż� �����մϴ�.

*/
class Ex29{

   public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);
	char ch = '+';
	boolean isTakeNum = true;
	int result = 0;

	while(isTakeNum) { // �Է¹޴� �κ�
		boolean isContinue= true; //result3
		boolean isGetOutcome = true; //result2

		System.out.print("ù��° ���ڸ� �Է����ּ��� : ");
		int su1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է����ּ��� : ");
		int su2 = sc.nextInt();
		while(isGetOutcome) { //�������� ��� �κ�
			isGetOutcome = false;
			System.out.print("+(1), -(2), x(3), /(4)");
			System.out.print("������ ������ �������ּ��� : ");
			int choice = sc.nextInt();
			if(choice == 1){ //����
				result = plus(su1, su2); //������
				myPrint(su1, su2, '+', result);
				ch='+';
			}else if(choice == 2){ //����
				result = minus(su1, su2);
				myPrint(su1, su2, '-', result);
				ch='-';
			}else if(choice == 3){ //����
				result = multi(su1, su2);
				myPrint(su1, su2, '*', result);
				ch='x';
			}else if(choice == 4){ //������
				result = div(su1, su2);
				myPrint(su1, su2, '/', result);
				ch='/';
			}else{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				isGetOutcome = true;
			}
			//myPrint(su1, su2, ch, result);
		}
		while(isContinue){
			System.out.print("����Ϸ��� (1) �����Ϸ��� (0)�� �Է����ּ��� : ");
			int replayExit = sc.nextInt();
			if(replayExit == 1) {
				isGetOutcome = true;
				isContinue = false;
			}else if(replayExit == 0){
				System.out.println("�̿����ּż� �����մϴ�");
				isTakeNum = false;
				isContinue = false;
			}else{
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				isContinue = true;
			}
		}
		
	}
	
   } 	//main end

   public static void myPrint(int su1, int su2, char ch, int result){ 	//��±��
	System.out.println("��� : "+su1+ch+su2+"="+result);
   }
   /*
   public static int calcul(int su1, int su2, int choice){ //������
	int num=0;
	if(choice==1){
		num=su1+su2;
	}else if(choice==2){
		num=su1-su2;
	}else if(choice==3){
		num=su1*su2;
	}else if(choice==4){
		num=su1/su2;
	}else
	return num;
   }
   */

   public static int plus(int su1, int su2){
	//System.out.println("��� : "+su1+"+"+su2+"="+(su1+su2));
	return su1+su2;
   }
   public static int minus(int su1, int su2){
	//System.out.println("��� : "+su1+"-"+su2+"="+(su1-su2));
	return su1-su2;
   }
   public static int multi(int su1, int su2){
	//System.out.println("��� : "+su1+"x"+su2+"="+(su1*su2));
	return su1*su2;
   }
   public static int div(int su1, int su2){
	//System.out.println("��� : "+su1+"/"+su2+"="+(su1/su2));
	if(su2==0){
		return 0;
	}
	return su1/su2;
   }
   /*
   public static int input(){
	//0,1
	java.util.Scanner sc = new.java.util.Scanner(System.in);
	int su=0;
	boolean boo = true;
	while(boo){
		System.out.println("<���(1), ����(0)>");
		su = sc.nextInt();
		if(su==0||su==1){
		boo=false;
		}
	return su;
   }
   public static int input2(){
	//1,2,3,4 1<= <=4
	java.util.Scanner sc = new.java.util.Scanner(System.in);
	int su=0;
	boolean boo = true;
	while(boo){
		System.out.println("+(1), -(2), x(3), /(4)");
		su = sc.nextInt();
		if(su==1||su==2||su==3||su==4){
		boo=false;
		}
	return su;
   }
   */





} //class end