package com.bit.day13;

public class Ex12Lecture {
	
	static String data = "1901|80|77|69\n" 
						+ "1902|88|97|69\n"
						+ "1903|90|93|89\n"
						+ "1904|71|77|69\n";
	
	public static void main(String[] args) {
		int num = 4;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String title = ("--------------------------------------------" + "\n"
				+ "학생성적관리프로그램(ver 0.1.1)"+"\n"
				+ "--------------------------------------------" + "\n");
		System.out.print(title);
		String input = null;
		while (true) {
			System.out.print("1.전체보기 2.등록 3.수정 4.삭제 0.종료 ");
			input = sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("학번|국어|영어|수학|합계|평균");
				System.out.println(data);
			}else if(input.equals("2")){
				
				num++;
				input =1900+num+"";
				System.out.print(1900+num+"번 국어>");
				input+="|"+sc.nextLine();
				System.out.print(1900+num+"번 영어>");
				input+="|"+sc.nextLine();
				System.out.print(1900+num+"번 수학>");
				input+="|"+sc.nextLine();
				data+="\n"+input;			
			}else if(input.equals("3")){
				System.out.print("수정할 학번>");
				input = sc.nextLine();
				int i = 0;
				String[] stu = data.split("\n");
				for (i = 0; i < stu.length; i++) {
					if(stu[i].startsWith(input)){break;}
				}
				stu[i]=input;
				System.out.print(input+"번 국어>");
				stu[i]+="|"+sc.nextLine();
				System.out.print(input+"번 영어>");
				stu[i]+="|"+sc.nextLine();
				System.out.print(input+"번 수학>");
				stu[i]+="|"+sc.nextLine();
				data="";
				for (int j = 0; j < stu.length; j++) {
					if(j!=0){data+="\n";}
					data+=stu[j];
				}
			}
		}

	}

}
