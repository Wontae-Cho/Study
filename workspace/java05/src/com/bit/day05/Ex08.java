class Ex08{

   public static void main(String[] args){
	//su�� 1004�϶� ¦�� ���� Ȧ�� ���� ����Ͻÿ�.
	int su = 1005;
	
	if(su%2 == 0){ //0�� 1�� false true��� �����ʱ� ������ true false�� �;��Ѵ�.
		System.out.println(su+"�� "+"¦���Դϴ�.");
	}else{  	//if(su%2 != 0)
		System.out.println(su+"�� "+"Ȧ���Դϴ�.");
	}
	System.out.println("---------------------------------");
	//su2�� ������� �������� ����Ͻÿ�
	int su2 = 0;

	if(su2 >= 0){
		System.out.println("��� �Դϴ�");
		if(su2 == 0){
			System.out.println("0 �Դϴ�.");
		}
	}else{
		System.out.println("���� �Դϴ�");
	}
	
	/*
	if(su2 < 0){          else�� ��ſ� �� ������ �־��� ��쿡�� 0�ϰ�� ��µ��� �ʴ´�.
		System.out.println("���� �Դϴ�");
	}
	*/
	
	System.out.println("---------------------------------");
	// ch = 'A'�϶� , �������� �������� �������� Ư���������� ����Ͻÿ� A = 65
	char ch = 'b';
	//int num =(int)ch; �ٸ� ���

	if(65 <= ch && ch <= 90) { // if(num >=(int)'A'&& num <=(int)'Z') �ٸ����
		System.out.println("���� �빮�� �Դϴ�.");
	}else if(97 <= ch && ch <= 122) { // if(num >=(int)'a'&& num <=(int)'z') �ٸ����
		System.out.println("���� �ҹ��� �Դϴ�.");
	}else if(48 <= ch && ch <= 57) { // if(num >=(int)'1'&& num <=(int)'9') �ٸ����
		System.out.println("���� �Դϴ�.");
	}else if(32 <= ch && ch <= 47) {
		System.out.println("Ư������ �Դϴ�.");
	}



   }

}
