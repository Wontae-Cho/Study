package com.bit.day13;

class Ball {
	final int num;
	boolean mark;
	String color = "���";
	
	public Ball(int su) {
		num = su;
		mark = false;
		if(num<10){
			color= "�����";
		}else if(num<20){
			color= "�Ķ���";
		}else if(num<30){
			color= "������";
		}else if(num<40){
			color= "������";
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
			if(ball.mark){//true���
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
