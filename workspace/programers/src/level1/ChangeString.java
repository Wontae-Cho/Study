package level1;

public class ChangeString {

	public static void main(String[] args) {
		solution("try hello world");
		// �ҹ��ڰ� 32 �� ŭ.

	}

	public static String solution(String s) {
		String answer = "";
		String[] cut = s.split(" ",-1);
		for (int i = 0; i < cut.length; i++) {
			char[] ch = cut[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				// ¦����°�� �빮�� //Ȧ����°�� �ҹ��� 0,2,4,
				if (j == 0) {
					if(ch[j]>='a'&&ch[j]<='z'){
						answer += (char) (ch[j] - 32);//�ҹ��ڰ��
					}else if(ch[j]>='A'&&ch[j]<='Z'){ //�빮���ΰ��.
						answer += (char) (ch[j]); //�׳�.
					}
				} else if (j % 2 != 0) {
					if(ch[j]>='a'&&ch[j]<='z'){ //�ҹ����� ���
						answer += (char) (ch[j]);
					}else if(ch[j]>='A'&&ch[j]<='Z'){//�빮���� ���
						answer += (char) (ch[j]+32);
					}
				} else if (j % 2 == 0) {
					if(ch[j]>='a'&&ch[j]<='z'){
						answer += (char) (ch[j] - 32);//�ҹ����� ���
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
