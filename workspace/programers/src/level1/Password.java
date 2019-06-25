package level1;

public class Password {

	public static void main(String[] args) {
		solution("abc",10);
	}
	public static String solution(String s, int n) {
		String answer = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+10);
		}
	      
		return answer;
	}

}
