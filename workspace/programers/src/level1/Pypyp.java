package level1;

public class Pypyp {


	public static void main(String[] args) {

	}
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        int cnt1=0;
	        int cnt2=0;

	        char[] ch = s.toCharArray();
		    for(int i=0; i < ch.length; i++){
		        if(ch[i]=='p'||ch[i]=='P'){
		        	cnt1++;
		        }else if(ch[i]=='y'||ch[i]=='Y'){
		        	cnt2++;
		        }
		    }
	        if(cnt1==cnt2){
	            answer = true;
	        }else if(cnt1!=cnt2){
	            answer = false;
	        }
	        


	        return answer;
	    }
	}

}
