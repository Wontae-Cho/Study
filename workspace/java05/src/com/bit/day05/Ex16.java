/*

*/

class Ex16{

   public static void main(String[] args){
	int a;  //������ ����
	//a = a; //�ʱ�ȭ 16�������� �ƴ��� �а� ����.
	a = 0xa; //16���� ǥ�� 0x + @
	System.out.println("10 ="  +" "+0xa); //16������ �ִ´ٰ��ؼ� ������ �ƴ϶� ��Ȳ�� �°Խ���Ѵ�.
	System.out.println("11 ="  +" "+0xb); // ���� �����ڸ� int�� 10���� ������ �⺻ default�̹Ƿ� ���� 2�� ó���ϰ� �ȴ�.
	System.out.println("12 ="  +" "+0xc);
	System.out.println("13 ="  +" "+0xd);
	System.out.println("14 ="  +" "+0xe);
	System.out.println("15 ="  +" "+0xf);
	System.out.println("16 ="  +" "+0x10);
	System.out.println("8����"); //���� �տ� 0�� ����. Ȱ�뺸�ٴ� ������ ����.
	System.out.println("6=6," +06);
	System.out.println("7=7," +07);
	System.out.println("8=010," +010);
	System.out.println("9=011," +011);
	System.out.println("10=012," +012);
	System.out.println("...");
	System.out.println("15=017," +017);
	System.out.println("16=020," +020);
	System.out.println("================");
	//boolaen boo=true;	//1bit (true or false), ����� ���� ����.
	byte su1; 
	su1=127; 	// 256(8bit) -128 ~ 127(0�� ����)
	su1++;		// -128�� ��.
	System.out.println("su1=" +su1);
	short su2;
	su2 =32767;	// -32768 ~ 32767
	su2++;		// byte�� ���������� �ƽøذ��� ������ -�� ��.
	System.out.println("su2="+su2);
	int su3;
	su3=2147483647; // 2147483648�� �Է½� �����߻�.
	su3++;		// byte�� ���������� �ƽøذ��� ������ -�� ��.
	System.out.println("su3="+su3);
	long su4;
	//su4=2147483648; //int�� �ִ�����̻��Ͻ� �޸𸮰��� �Ѿ�������� ���� ǥ���� ���־����.
			//cpu�� ���� ������ int�̱� ������ long���� ǥ���� int�������� ������ �ٽ� ���ϴ� ���� ����.
	su4=2147483648L; 
	System.out.println("su4="+su4);
	double su5,su6; //���������� �Ǽ��� ǥ���� �� ���⿡ ��Ȯ���� �����ϰ� �ٻ簪�� �����Ѵ�.
			//���� ��Ȯ�� ���� ���Ѵٸ� ��������� �� �Ŀ� �Ǽ��� �ٲ�����Ѵ�.
	su5=3.1400000001; //�ٻ簪�� �ν��� �ִ� ���� �ƴ϶� ���������� �ִ�. ��� �� ���� ��찡 �� ����.
	su6=1.0000000001; //����,������������ �� ������ �� Ŀ�� �� �ִ�.
	System.out.println("su5="+su5);
	System.out.println(su5+su6);
	float su7;
	//su7=3.14;	//default�� double�� ���⶧���� �����߻�
	su7=3.14f;
	char ch1,ch2; //�����ڵ�ε� ǥ�� ���� //u+@ @=16����
	ch1='a'; //���ڴ� ���̳ʽ� ǥ���� ���⿡ -�� ���Ͻ� �����߻�. ���ڸ� ��������� �װͿ� �ش��ϴ� ���� ǥ��.
	ch2=44032;
	System.out.println(ch1); //���ڸ� ó�����ϱ⿡ ������� ���ڸ� ���ڸ� ���� ǥ����. ex)'1' != 1
	System.out.println("1:"+(int)'1'); //���� 1�� ����49�� ���
	System.out.println("2:"+(int)'2'); //���� 2�� ����50�� ���
	System.out.println('a'); // = System.out.println(ch1);
	System.out.println((int)'��'); //'��'�� ������ �ִ� ��.
	System.out.println(ch2); 





   }



}