/*
���� - ����, �ʱ�ȭ (�ڷ���)


*/
class Ex07{
   public static void main(String[] args){
	int a = 100;
	//a = a+1; //101
	//a += 1;  //101
	//a++;     //101 ����� ������ ������ �ٸ���. ���� 1�������� �ƴ϶� �� �ܿ��� ����� �� ����.
	//a += 2; // = (a = a+2)
	//a -=50; // a = a - 50
	//a *= 2; // a = a * 2;
	//a /= 2; // a = a / 2;
	//a %= 3; // a = a % 3;
	//a >>= 1; // a = a >> 1; ��ĭ ���������� 
	//a <<= 1; // a = a << 1; ��ĭ ��������

	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false); // &&�����ڴ� ������� true && true�� ��쿡�� true�� ���
	System.out.println("-----------------------");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false); // ||�����ڴ� ������� false || false�� ��쿡�� false�� ���
	System.out.println("-----------------------");
	System.out.println(!true); //true�� �ݴ밪�� ���
	System.out.println(!false); //false�� �ݴ밪�� ���
   }

}
