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
				+ "�л������������α׷�(ver 0.1.1)"+"\n"
				+ "--------------------------------------------" + "\n");
		System.out.print(title);
		String input = null;
		while (true) {
			System.out.print("1.��ü���� 2.��� 3.���� 4.���� 0.���� ");
			input = sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")){
				System.out.println("�й�|����|����|����|�հ�|���");
				System.out.println(data);
			}else if(input.equals("2")){
				
				num++;
				input =1900+num+"";
				System.out.print(1900+num+"�� ����>");
				input+="|"+sc.nextLine();
				System.out.print(1900+num+"�� ����>");
				input+="|"+sc.nextLine();
				System.out.print(1900+num+"�� ����>");
				input+="|"+sc.nextLine();
				data+="\n"+input;			
			}else if(input.equals("3")){
				System.out.print("������ �й�>");
				input = sc.nextLine();
				int i = 0;
				String[] stu = data.split("\n");
				for (i = 0; i < stu.length; i++) {
					if(stu[i].startsWith(input)){break;}
				}
				stu[i]=input;
				System.out.print(input+"�� ����>");
				stu[i]+="|"+sc.nextLine();
				System.out.print(input+"�� ����>");
				stu[i]+="|"+sc.nextLine();
				System.out.print(input+"�� ����>");
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
