class Ex31BreakContinue{

   public static void main(String[] args){
	// return : �޼ҵ��� ���Ḧ �ǹ���.
	// break, continue
	java.util.Scanner sc = new java.util.Scanner(System.in);
	while(true){
	System.out.print("�����Ͻ÷��� 0 �ƴϸ� ���:");
	int su=sc.nextInt();
		if(su==0){
			//return; //���θ޼ҵ��� return
			break;
			//System.exit(0); //���α׷��� �����Ű�� �� �ٸ� ���.
		}
	}
	System.out.println("�̿����ּż� �����մϴ�."); //return�� ��쿡�� �ƿ� ��µ��� �ʴ´�.(�޼ҵ��� ����)
							//System.exit(0)�� ��쿡�� �ƿ� ��µ��� �ʴ´�.(�޼ҵ��� ����)
							//������ break�� ��쿡�� �ݺ����� �������°���̱� ������ �Ʒ� ������ ��°���
	//System.exit(0)�� ��쿡�� vm��ü�� �������� ���̱� ������ �������� �ʴ�.


   }

   public static void func1(){
	//return; //��ȯ�� ���� ���� ���(void)���� ���������ϴ�.
	for(int i=0; i<5; i++){
		if(i>=3){
			//break; //������ ���� ������ ������.
			//continue; 3���� ������ ���� ����. 
				//�ݺ������� coutinue�� ������ ���� �Ʒ��� �ڵ带 ���� �ʰ� ó������ ���ư���.
				//�ݺ����� Ƚ���� �ݺ������� ���� �Ʒ��� �ڵ���� ������� �ʴ´�.
			return; //�޼ҵ尡 ����Ǳ⶧���� �� ������ �ڵ�� ������� �ʴ´�.
		}
		System.out.println("i="+i);
	}
   }

}
