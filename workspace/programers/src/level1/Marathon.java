package level1;

import java.util.Iterator;

public class Marathon {

	public static void main(String[] args) {
		String[] people = new String[] { "1", "2", "3", "4"}; 	//
		String[] comple = new String[] { "1", "2", "3"};		//
		Marathon me = new Marathon();
		me.solution(people, comple);
//		System.out.println(people.length);
//		System.out.println(comple.length);
//		System.out.println(people.length+comple.length);												//23

	}

	public String solution(String[] participant, String[] completion) {
		String same = "s";
		for(int i=0; i<participant.length; i++){
			for(int j=0; j<completion.length; j++){
				if(participant[i].equals(completion[j])){
					participant[i]=same;
					completion[j]=same;
				}else{
					System.out.print(participant[i]+" ");
				}
			}
			System.out.println();
		}
		String answer = "";
		return answer;
	}

}
