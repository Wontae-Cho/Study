class Ex03{

   public static void main(String[] args){
	//���� = Variable
	int x; // ������ ����(�ڷ��� ������) - �޸�(�������)�� Ȯ�� 
	x=3;   // ������ �ʱ�ȭ(������ = value) - Ȯ���� ������ ���ʷ� ������ ��
	int b = 1234; //������ ����� �ʱ�ȭ�� ���ÿ�

	System.out.println(x);
	x=2;
	System.out.println(2+3.14); //�����߻� 
	System.out.println((200+314)/100.0); //�Ǽ��� ����� �� ���� ��
	System.out.println(b);

	boolean result;
	result = true;   //��  / ���ڿ��� �ƴ� Ű����. 
	result = false; //���� / ���ڿ��� �ƴ� Ű����.
	System.out.println(true); //booleanŸ���� ���
	System.out.println("ab"); //a�� b ���̿� ���͸� �Է��ϰ� ������ �����ڵ带 ã�ƺ��� �ȴ�.
	System.out.println("a\nb"); //�Ǵ� ���๮�� \n (Window������ (\r\n)�� ���๮�ڷ� �޾Ƶ��δ�.)
	System.out.println("\uac00"); //�����ڵ� '��' ���
	System.out.println("\uac10"); //�����ڵ� '��' ���
	System.out.println('\''); // ��������ǥ(') ���
	System.out.println("'A'");
	System.out.println("A\r\nB");
	//��|��Iil 0 o O

   }

}