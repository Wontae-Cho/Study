class Ex17{

  public static void main(String[] args){
	int a=100;
	//int a=1234; //a�� 2�� �����߱⶧���� ���� -> �޸𸮰� � a�� �����;� ���� �𸣰� �Ǳ⶧����

	a++;


	String msg=args[0]; //�Է�.
	//String msg="java";
	if(msg=="java"){
		System.out.println("���Դϴ�");
	}else{
		System.out.println("����");
	}

	if(true){
		System.out.println("������ ��");
	}

	if(false){
		System.out.println("������ ��");
	}else if(true){
		System.out.println("�� �ٸ� ������ ��"); 	//����� �߰� ����
	}else{  
		System.out.println("������ ����");	//�ݵ�� ����ȴٴ� ����.
	}
	/* else if
	if(����){
	}else{
		if(����){}
	}
	*/

	System.out.println("=========="+msg+"============");

	switch(3){ //if���� �������� �� ����, ���������ε� ����.
			// ��ȣ�ȿ��� ������ �ƴ� ������ ���� �;��Ѵ�.
		case 1:
		System.out.println("1�Դϴ�");
		break; //Ż���� �����ִ� ����
		case 2:
		System.out.println("2�Դϴ�");
		break;
		case 3:
		System.out.println("3�Դϴ�");
		break;
		case 4:
		System.out.println("4�Դϴ�");
		break;
		default:
		System.out.println("�����Դϴ�");
	}


  }

}