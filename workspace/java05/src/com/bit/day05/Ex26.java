/*
�޼ҵ�(method) (�ϴ��� �Լ��� �ؼ��ص� ����)
- ������ ���ֹ��� �ʴ´�. ���κ��� �ռ� �־ ��� ����
- ��, ������ ���� ���� �Ұ��ϴ�.
- �����ϳ��� �޼ҵ�� �󸶵��� ����� �� �� �ִ�.
- �޼ҵ� ���ο��� �ٸ� �޼ҵ��� ȣ�⵵ ����
- �ڵ��� ���뼺
- �޼ҵ��� �̸��� �ߺ��Ұ�
- �޼ҵ��� ���� �����ڷν���,���ڸ� ���� 
  ù���ڴ� ����ҹ��ڷ� ����
- �޼ҵ��� ȣ�� : �޼ҵ��(�Ķ����) ������쿡�� ()�� ǥ���� �������. 
                  �������� ���� ���� �ִ�.
- ȣ�� ������ �ش� �޼ҵ�� ���� �����ϰ� ������ ȣ���� ������ �ٽ� ���ư�.
- return�� ���� ������� ��ȯ�� �� �ִµ� �� ��쿡�� void�� �ƴ� �ش� ��� ���� �ڷ����� ��������Ѵ�.
	ex) public static (int) �޼ҵ��(�Ű�����)
	    �ڷ��� ��ġ �ſ� �߿�.
- return �Ʒ� �ڵ带 ���� �ÿ��� �� �ڵ�� ������� �ʴ´�.
  ������ return�� if ���� �Լ��� ���� ������ �־��� ��쿡�� ����� �� �ִ�.
- �Ű����� == ����, �Ķ���� : ȣ������ �޴� ���� ������ �ڷ����̿�����. ������ ���� ���� ��
		������ ��Ŵ.(�ڷ��� ��ġ �ʼ�)
  ex)
	public static void �޼ҵ��(�Ű�����){
		���๮;
	}
*/

class Ex26{
	// Ŭ������ �������
	// 1.�޼ҵ� (���ε� �ϳ��� �޼ҵ�)

   public static void main(String[] args){
	System.out.println("���� ����");
	int a;
	a=100;
	System.out.println("a="+a);
	func3(100, 50.0, "�� ���ɴϴ�");
	int su = func4();
	func2();

	System.out.println(su+"���� ��");

   }	//main end
   public static int func4(){
	System.out.println("2+3�� �����ϰڽ��ϴ�");
	int x=2;
	int y=3;
	int z = x+y;
	return z;

   }


   public static void func3(int num1, double num2, String msg){ //�޵��� �Ǿ� �ִµ� �������� ������ ����.
				      // ���޹޴� �Ű������� �ڷ����� �޶� ����
	System.out.println("num1="+num1+",num2="+num2+msg);
   }

   public static void func1(){
	System.out.println("���ο� ���1");
	func2();
	System.out.println("���ο� ���1 ��");
   }	//func1 end
   public static void func2(){
	System.out.println("���ο� ���2");
	return;
   }	//func2 end


}	//class end