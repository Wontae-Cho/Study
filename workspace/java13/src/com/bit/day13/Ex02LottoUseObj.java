package com.bit.day13;

class Ball {
	final int num;
	boolean mark;
	String color = "Èò»ö";
	
	public Ball(int su) {
		num = su;
		mark = false;
		if(num<10){
			color= "³ë¶û»ö";
		}else if(num<20){
			color= "ÆÄ¶û»ö";
		}else if(num<30){
			color= "»¡°­»ö";
		}else if(num<40){
			color= "°ËÁ¤»ö";
		}
	}
	
	
	
}

public class Ex02LottoUseObj {

	public static void main(String[] args) {
		Ball[] box = new Ball[45];
		
		for (int i = 0; i < box.length; i++) {
			box[i] = new Ball(i+1);
		}
		
		int[] note = new int[6];
		
		for (int i = 0; i < note.length; i++) {
			int ran = (int)(Math.random()*45);
			Ball ball = box[ran];
			if(ball.mark){//true¶ó¸é
				i--;
				continue;
			}
			note[i] = box[ran].num;
			ball.mark=true;
		}
		
		for(int i =0; i<note.length; i++){
			System.out.print(note[i] + " ");
//			System.out.println(Ball.num+" "+Ball.color);
		}


	}

}
