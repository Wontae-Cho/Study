class Ex04{

    public static void main(String[] args){

	double w;
	w = 3;

	System.out.println(w); //3�� ������ ���ο��� 3�� double������ ��ȯ���� 3.0���� ��µ�.

	char ch;
        ch = 32+65; //(char)�� �տ� �ٿ��� ������ 97.0�� int������ ��ȯ��ų �� �ִ�.

	System.out.println(ch);
	ch = (char)(ch+1);       //98
	System.out.println(ch);
	ch = (char)(ch+1);       //99
	System.out.println(ch);
	ch = (char)(ch+1);       //100
	System.out.println(ch);
	//ch = ch+1;               //101 
	//System.out.println(ch);

	double a = 3.14;
	int b;
	b = (int)a; //���� �� ��ȯ
	System.out.println(b);

	System.out.println((char)97); // 97�� ������ char�� ���� �� ��ȯ���� a�� ��µǵ��� ��.

//byte(1) short(2) int(4) long(8) float(4) double(8)
// -----------------------------------> �ڵ� �� ��ȯ
// ���� �� ��ȯ <----------------------------------- 

	int c = 0;
	c = c+1;
	System.out.println(c);
	//c = c+1;
	c++;
	System.out.println(c); // (c++) �������� �켱 ������ ������ ���� �״�� ���� �Ѿ �� ���� ������.
	//c = c+1;
	c++;
	System.out.println(c); // (++c) �������� ���� ������ ���� ������Ű�� ������ ��
	c--;
	System.out.println(c);
	c--;
	System.out.println(c);
	
	int su=1;
	System.out.println((++su)+(su++)+(su)+(su));
                            //2 + 2 + 3 + 3 = 10
	System.out.println(100+((2*3)/6)*100-100);

    }

}