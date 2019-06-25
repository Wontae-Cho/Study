package level1;

public class Decimal {


	public static void main(String[] args) {
		System.out.println(solution(5));

	}
		  public static int solution(int n) {
		      int answer = 0;
		      for(int i = 2; i<=n; i++){
		          for(int j=2; j<=i; j++){
		        	  if(i%j==0){
		        		  System.out.println(answer++);
		        	  }
		          }
		      }
		      return answer;
		  }
		

}
