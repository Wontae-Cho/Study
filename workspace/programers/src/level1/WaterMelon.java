package level1;

public class WaterMelon {

	public static void main(String[] args) {
		WaterMelon me = new WaterMelon();
		me.solution(10);


	}
	 public String solution(int n) {
	      String answer = "";
	      for(int i=1; i<=n; i++){
	          if(i%2!=0){
	              answer += "��";
	          }else if(i%2==0){
	              answer += "��";
	          }
	      }
	      System.out.println(answer);
	      return answer;
	  }
	}