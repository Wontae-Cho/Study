/*




*/
class Ex12{

   public static void main(String[] args){
	int i = 100; //밖에서 i를 선언
	System.out.println("start : " +i);
	for(i=0; i<5; i++) {
		System.out.println("Hello world!" + i);
	}
	System.out.println("end : "+i);
	//System.out.println(i); i는 출력할 수 없다. for문 밖으로 빠져 나왔기 때문에.
   }

}