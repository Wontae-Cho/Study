class Ex32ReturnBreakExit{

   public static void main(String[] args){

	func();
	System.out.println("�̿����ּż� �����մϴ�");
   }

   public static void func(){
	java.util.Scanner sc = new java.util.Scanner(System.in);

	while(true){
		System.out.print("1.return 2.break 3.exit");
		int su = sc.nextInt();
		if(su==1){
			return; //ȣ���������� �ٽ� ���ư��Ƿ� func end�� ������� �ʴ´�.
		}else if(su==2){
			break; // �ݺ����� Ż���̹Ƿ� func end���� ������ش�.
		}else if(su==3){
			System.exit(0); //��������. ��������~�̸��̾�
		}

	}
	System.out.println("func end");

   }
}