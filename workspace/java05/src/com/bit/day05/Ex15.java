/* 
Q4. ������ 7���� ����ϼ���.
*/

class Ex15{

   public static void main(String[] args){
	int dan=7;
	/*
	1�ܰ�
	System.out.println("7x1 = 7");
	System.out.println("7x2 = 14");
	System.out.println("7x3 = 21");
	System.out.println("7x4 = 28");
	System.out.println("7x5 = 35");
	System.out.println("7x6 = 42");
	System.out.println("7x7 = 49");
	System.out.println("7x8 = 56");
	System.out.println("7x9 = 63");

	2�ܰ�
	System.out.println("dan + x1 = (dan*1)");
	System.out.println("dan + x2 = (dan*2)");
	System.out.println("dan + x3 = (dan*3)");
	System.out.println("dan + x4 = (dan*4)");
	System.out.println("dan + x5 = (dan*5)");
	System.out.println("dan + x6 = (dan*6)");
	System.out.println("dan + x7 = (dan*7)");
	System.out.println("dan + x8 = (dan*8)");
	System.out.println("dan + x9 = (dan*9)");

	3�ܰ�
	*/
	for(int i = 1; i<10; i++){
	System.out.println(dan + "x" + i + "=" + (dan*i));
	}
	System.out.println("-----------------------------");
	/*
	Q5. ������ ����Ͻÿ�.
	3+6+9+12+15+18+21+24+27 = ???
	(3*1)+(3*2)+(3*3)+(3*4)+(3*5)+(3*6)+(3*7)+(3*8)+(3*9)
	*/
	/*
	for(int i = 1; i<=9; i++){ //���� �˶�.
		System.out.print(3*i);
		if(i==9){
			System.out.print("=");
		}else{
			System.out.print("+");
		}
	}
	*/
	int sum2=0;
	for(int i = 1; i<=9; i++){ //���� �𸦶�. �������� ��������.
		if(i!=1){
			System.out.print("+");
		}
		System.out.print(3*i);
		sum2+=3*i; // sum2=sum2+(3*i);
	}
	System.out.println("="+sum2);

   }


}