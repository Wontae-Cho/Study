package level1;

public class OnlyNumber {


	public static void main(String[] args) {
		OnlyNumber me = new OnlyNumber();
		
		System.out.println(me.solution("13456"));

	}

	public boolean solution(String s) {
		boolean answer = true;
		String msg = s;
		char[] ch = msg.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch.length == 4 || ch.length == 6) {
			}else{
				answer = false;
			}
			if (ch[i] >= '0' && ch[i] <= '9') {

			} else {
				answer = false;
			}
		}
		return answer;
	}

}
