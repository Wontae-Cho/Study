package com.bit.day12;
//파이널.
class LottoBall {
	// 몇번째로 뽑힌 것인지.
	int num;
	int count = 0;

}

public class Ex08PracticeArray {

	public static void main(String[] args) {
		// count = 1~6, 있으면 뽑힌공, 없으면 안뽑힌공.
		// 로또 번호 생성기 / math.random();
		// 6개의 번호를 생성. / 5 + 1(보너스 번호)
		// 속성 = 토요일, SBS, 시간(20:40)
		// 1~45 오름차순으로. 중복X, 5개는 오름차순 마지막으로 나오는 하나는 그냥.
		// 객체지향코딩, 절차지향코딩,잔머리

		// for(int i=0; i<6; i++){
		// System.out.print((int)(Math.random()*45)+" ");
		// }
		int choice = 0; // 몇번째 볼인지-1
		java.util.Random random = new java.util.Random();
		LottoBall[] house = new LottoBall[45];
		for (int i = 0; i < house.length; i++) {
			house[i] = new LottoBall(); // Lotto라는 객체를 생성하고
			house[i].num = i + 1; // 몇번째로 뽑힌 번호인지 알 수 있게해주는 것.
		}

		int[] saveBalls = new int[6];
		// 1번째로 뽑은 번호 = 20;
		// 20번째 볼에 표시를해야해.
		// 6번 볼을 뽑을때 까지 반복
		while (choice < 6) {
			// 랜덤으로 값을 받아
			int selNum = random.nextInt(45);
			// selNum이 saveBalls[0] 으로 들어가.

			// 선택된 수에 해당하는 볼의 count(몇번째 뽑혔는지, 안뽑혔으면 0)가 0이면
			if (house[selNum].count == 0) { // 만약 통안에 있는 45개의 숫자
				// 뽑힌 볼의 번호를 저장하는 배열에 선택된 수를 저장
				// 그 인덱스(choice)는 몇번째 뽑혔는지
				saveBalls[choice] = house[selNum].num;
				// choice 값을 증가
				choice++;
				// 해당하는 볼의 count를 choice로 만듬
				house[selNum].count = choice;
				System.out.print(house[selNum].num+" ");
			}
			// else{
			// System.out.println(house[selNum].num +"이 수는 이미 뽑힌 수");
			// }
		}//saveBalls에 저장되어있는 값을 오름차순 정렬.
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
