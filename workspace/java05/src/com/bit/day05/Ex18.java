/*
	���
�ݺ���
while�ݺ��� -����� �߿�. ��������� �������ص���. �׳� ������ ���������� ��� ���ư�.
	while(����){
		���๮;
	}
*/
class Ex18{

    public static void main(String[] args){
	// 1~5���� ���
	int su=1;
	while(su<6){ //true or false ��.
		System.out.println("su="+su++);
	}
	
	//Ȧ�����
	su=1;
	while(su<=10){
		System.out.println("su="+su);
		su+=2;
	}
	/*
	int a;
	a = 1234;
	
	if(false){
		a=4321;
		//System.out.println(a); if�� �ȿ��� a�� 4321�̹Ƿ� 4321 ���
	}
	System.out.println(a); //if���� false�̱� ������ �״�� �����ͼ� 1234 ���
				//if���� true�� ��� �ʱ�ȭ���� 4321�� �ٲ� 4321 ���
	=================================================================================
	int a;
	int b=3;
	
	if(b>2){ //���ǿ��� �ʱ�ȭ�� �̷����� �ʾƼ� �����߻�.
		a=1234;
		a=4321;
	}
	System.out.println(a);

	int i=1234;
	for(i=0; i<5; i++){
		int su=1111;	//����Ǵ� �κ��� �ٽ� �ݺ��� ������ for�������� �� ������ ��������.
		su++;		//�ٽ� ����� ���� 1111�� +1���Ѱ��� ��µȴ�.
		System.out.println(i+","+su);
	}
	//System.out.println(su); //for�� �ȿ��� su�� ����������Ŭ�� ����Ǿ��� ������ �ۿ��� ���Ұ�.
	System.out.println(i); //for�� �ȿ��� i�� ����������Ŭ�� ����Ǿ��� ������ �ۿ��� ���Ұ�.
				//�� for�� �ۿ��� ����� �ʱ�ȭ�� ���� ��쿡�� i�� ����������Ŭ�� ����ֱ⿡ ��°���.
	//�ݺ����̳� ���ǹ� ���ο��� ������ �����ϴ� ���� �Ϲ������� ���� �ʴ�. ������ �ǵ��ϰ� �ʿ��� ��쿡�� �ᵵ ����.
	*/


    }

}