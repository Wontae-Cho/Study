package level1;

public class ChangeString {

	public static void main(String[] args) {
		solution("try hello world");
		// 소문자가 32 더 큼.

	}

	public static String solution(String s) {
		String answer = "";
		String[] cut = s.split(" ",-1);
		for (int i = 0; i < cut.length; i++) {
			char[] ch = cut[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				// 짝수번째는 대문자 //홀수번째는 소문자 0,2,4,
				if (j == 0) {
					if(ch[j]>='a'&&ch[j]<='z'){
						answer += (char) (ch[j] - 32);//소문자경우
					}else if(ch[j]>='A'&&ch[j]<='Z'){ //대문자인경우.
						answer += (char) (ch[j]); //그냥.
					}
				} else if (j % 2 != 0) {
					if(ch[j]>='a'&&ch[j]<='z'){ //소문자의 경우
						answer += (char) (ch[j]);
					}else if(ch[j]>='A'&&ch[j]<='Z'){//대문자인 경우
						answer += (char) (ch[j]+32);
					}
				} else if (j % 2 == 0) {
					if(ch[j]>='a'&&ch[j]<='z'){
						answer += (char) (ch[j] - 32);//소문자의 경우
					}else if(ch[j]>='A'&&ch[j]<='Z'){
						answer += (char) (ch[j]);
					}
				}
			}
			if (cut.length - 1 != i) {
				answer += " ";
			}
		}
		System.out.println(answer);
		return answer;
	}

}
