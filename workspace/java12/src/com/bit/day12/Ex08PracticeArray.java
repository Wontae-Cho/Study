package com.bit.day12;
//���̳�.
class LottoBall {
	// ���°�� ���� ������.
	int num;
	int count = 0;

}

public class Ex08PracticeArray {

	public static void main(String[] args) {
		// count = 1~6, ������ ������, ������ �Ȼ�����.
		// �ζ� ��ȣ ������ / math.random();
		// 6���� ��ȣ�� ����. / 5 + 1(���ʽ� ��ȣ)
		// �Ӽ� = �����, SBS, �ð�(20:40)
		// 1~45 ������������. �ߺ�X, 5���� �������� ���������� ������ �ϳ��� �׳�.
		// ��ü�����ڵ�, ���������ڵ�,�ܸӸ�

		// for(int i=0; i<6; i++){
		// System.out.print((int)(Math.random()*45)+" ");
		// }
		int choice = 0; // ���° ������-1
		java.util.Random random = new java.util.Random();
		LottoBall[] house = new LottoBall[45];
		for (int i = 0; i < house.length; i++) {
			house[i] = new LottoBall(); // Lotto��� ��ü�� �����ϰ�
			house[i].num = i + 1; // ���°�� ���� ��ȣ���� �� �� �ְ����ִ� ��.
		}

		int[] saveBalls = new int[6];
		// 1��°�� ���� ��ȣ = 20;
		// 20��° ���� ǥ�ø��ؾ���.
		// 6�� ���� ������ ���� �ݺ�
		while (choice < 6) {
			// �������� ���� �޾�
			int selNum = random.nextInt(45);
			// selNum�� saveBalls[0] ���� ��.

			// ���õ� ���� �ش��ϴ� ���� count(���° ��������, �Ȼ������� 0)�� 0�̸�
			if (house[selNum].count == 0) { // ���� ��ȿ� �ִ� 45���� ����
				// ���� ���� ��ȣ�� �����ϴ� �迭�� ���õ� ���� ����
				// �� �ε���(choice)�� ���° ��������
				saveBalls[choice] = house[selNum].num;
				// choice ���� ����
				choice++;
				// �ش��ϴ� ���� count�� choice�� ����
				house[selNum].count = choice;
				System.out.print(house[selNum].num+" ");
			}
			// else{
			// System.out.println(house[selNum].num +"�� ���� �̹� ���� ��");
			// }
		}//saveBalls�� ����Ǿ��ִ� ���� �������� ����.
		System.out.println();
		System.out.println("-----------------");
//		for (int i = 0; i < saveBalls.length; i++) {
//			System.out.println(saveBalls[i]);
//		}
//		
		int temp=0;
		for(int i=0; i<5; i++){
			for(int j=i+1; j<6; j++){
				if(saveBalls[i] > saveBalls[j]){
					temp = saveBalls[i];
					saveBalls[i] = saveBalls[j];
					saveBalls[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("-----------------");
		for (int i = 0; i < saveBalls.length; i++) {
			System.out.print(saveBalls[i]+" ");
		}
		

	}

}
