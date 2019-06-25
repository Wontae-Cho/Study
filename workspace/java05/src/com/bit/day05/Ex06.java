class Ex06{

   public static void main(String[] args){
	int item1 = 4;
	int item2 = 1;
	int item3 = 2;
	String bar = "-------------------------------------";
	System.out.println(" BIT 편의점");
	System.out.println(bar);
	System.out.println(" 물품\t|수량\t|가격\t|금액");
	System.out.println(bar);
	System.out.println(" 생수\t|"+item1+"\t|1000\t|"+ item1*1000);
	System.out.println(" 쌀과자\t|"+item2+"\t|1200\t|"+ item2*1200);
	System.out.println(" 커피\t|"+item3+"\t|900\t|"+item3*900);
	System.out.println(bar);
	System.out.println(" 합계\t:"+(item1*1000+item2*1200+item3*900)+"원");
	System.out.println(bar);

   }

}