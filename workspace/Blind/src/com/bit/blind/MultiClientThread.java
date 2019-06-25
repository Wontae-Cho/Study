package com.bit.blind;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * �ٸ� Ŭ���̾�Ʈ�� �޼����� û���Ͽ�  MultiClient�� jTextAreaâ�� �޼����� ����ϴ� ������ �Ѵ�.
 */

public class MultiClientThread extends Thread implements ClientData {
	static private MultiClient mc;
	
	static int countDownSec;
	static Timer timer;
	static String countDownMinSecStr;
	static boolean isOverSelectTime = true;
	static int questionIdx =0;
	
	static String myAns = "";
	static String myCurrentAns = "2";
	static String opponentAns = "";
	static String opponentCurrentAns = "2";
	static String opponentId = "";
	
	String readMsg = null;
	String[] idSubjectContent = null;
	boolean isStop = false;
	boolean isFirstQuestion = true;

	public MultiClientThread(MultiClient mc) {
		this.mc = mc;
	}

	public void run() {

		while(!isStop){
			
			//ois�� �о� ���δ�.
			try {
				readMsg = (String)this.mc.getOis().readObject();
				idSubjectContent = readMsg.split("#");
				
			}catch (Exception e) {
				e.printStackTrace();
				isStop = true;
			}
			
			System.out.println(Arrays.toString(idSubjectContent));
			
			//�������� chat(ä��)�϶�
			//exit�ν�
			//ä��â�� ��ȭ���� �߰�
			if(idSubjectContent[1].equals("chat")){	//������ �޼����� ������
				onChat();	
			}
			
			//�������� Q(����)�϶� 
			//���� setting, ��ư Ȱ��ȭ, ä�� ��Ȱ��ȭ
			else if(idSubjectContent[1].equals("Q")){ // ���������� ���.
				onQuestion();
			}
			
			//�������� mySituation(���� ��Ȳ)�϶�
			///���� ����
			else if(idSubjectContent[1].equals("mySituation")){
				onMySituation();	
			}
			
			else if(idSubjectContent[1].equals("notice") ){
				onNotice();
			}
			//�������� ans(���ÿ� ���� �亯)�϶�
			else if (idSubjectContent[1].equals("ans")){
				onAnswer();	
			}
			
			//�������� ans(���ÿ� ���� �亯)�϶�
			else if (idSubjectContent[1].equals("enterance")){
				onEnterance();	
			}
		}	
	}
	
	

	

	//////////////////////////////////////////////
	/////////////////�޼��� ����/////////////////////
	//////////////////////////////////////////////
	
	

	//�������� chat(ä��)�϶�
	//exit�ν�
	//ä��â�� ��ȭ���� �߰�
	public void onChat() {
		//exit �޼��� �϶�
		if(idSubjectContent[2].equals("exit")){
			if(idSubjectContent[0].equals(this.mc.getId())){//�� �޼����� id�� ���ϋ�
				this.mc.exit();	//����
			}else {	//�ٸ� id�϶�
				this.mc.getchatWindowJTA().append(idSubjectContent[0]+" ���� �����ϼ̽��ϴ�."+System.getProperty("line.separator"));
				timer.cancel();	///���� ī���͸� ����
			}
		}
		//exit �޼����� �ƴҶ�
		else{
			if(idSubjectContent[0].equals(this.mc.getId())){//�� �޼����� id�� ���ϋ�
				//id �κ��� ���� �ٲٰ� ���� ���
				this.mc.getchatWindowJTA().append("�� : "+ idSubjectContent[2]+System.getProperty("line.separator"));
			}else {	//�ٸ� id�϶�
				//���� id�� ���� �״�� ���
				this.mc.getchatWindowJTA().append(idSubjectContent[0]+ " : "+ idSubjectContent[2]+System.getProperty("line.separator"));
			}
		}
		
	}	
	
	//���û�Ȳ���� ä�û�Ȳ������ ������ ��Ÿ���� selectChatString(idSubjectContent[2])
	public void onMySituation() {
		if(idSubjectContent[0].equals(this.mc.getId())){
			this.mc.getchatWindowJTA().append(idSubjectContent[2]+System.getProperty("line.separator"));
		}
	}	
	
	//�޼����� �˷�(��ư�� Ŭ���� �ʾ��� ���� �۵�
	public void onNotice() {
		this.mc.getchatWindowJTA().append(idSubjectContent[2]+System.getProperty("line.separator"));
	}	
	//�������� Q(����)�϶� 
	//���� setting, ��ư Ȱ��ȭ, ä�� ��Ȱ��ȭ
	public void onQuestion() {
		if(isFirstQuestion){ // 0��° ����. (�ȳ���)
			setEnableJBtn(true);
			mc.getInputWindowJTF().setEditable(false);
			startTimer(SELECT_TIME);
			mc.setQuestionJLabel(question[questionIdx]);
			isFirstQuestion = false;
			questionIdx++;
		}else if(idSubjectContent[0].equals(this.mc.getId())){ // 0��° ������ �ƴ� ���� ������.
			System.out.println("���� id : "+idSubjectContent[0] + ", questionIdx : "+questionIdx);
			mc.setQuestionJLabel(question[questionIdx]);
			questionIdx++;
		}else{
			System.out.println("�������  id : "+idSubjectContent[0]);
		}
		
	}			
	
	//�������� ans(���ÿ� ���� �亯)�϶�
	//���� ���̵� ���ؼ� ���� ��� ����� ���� �����ؼ� ����
	//���� ���� ǥ��
	public void onAnswer() {
		if(idSubjectContent[0].equals(this.mc.getId())){
			myCurrentAns = idSubjectContent[2];
			if(idSubjectContent[2].equals("0")){
				this.mc.getchatWindowJTA().append("���� YES�� �����Ͽ����ϴ�."+System.getProperty("line.separator"));
			}else if( idSubjectContent[2].equals("1")){
				this.mc.getchatWindowJTA().append("���� NO�� �����Ͽ����ϴ�."+System.getProperty("line.separator"));
			}	
		}else{
			opponentCurrentAns =idSubjectContent[2];
		}
		
		
	}

	//�������� enterance(ä��â ����)�϶�
	private void onEnterance() {
		if(!idSubjectContent[0].equals(this.mc.getId())){
			if(opponentId.equals("")) {
				this.mc.getchatWindowJTA().append(idSubjectContent[2]+System.getProperty("line.separator"));
				opponentId = idSubjectContent[0];
				System.out.println("�� : "+this.mc.getId() +", ���� : "+opponentId);
				mc.getOpponentImgLabel().setIcon(resizeImg(".\\picture\\"+opponentId+"_blur.jpg"));
				try {
					this.mc.getOos().writeObject(mc.getId() +"#enterance#"+mc.getId()+"���� �����ϼ̽��ϴ�.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			

		}
		
	}	

	
	

	public void startTimer(int setTimeSec){
		int delay = 1000;
		int period = 1000;
		
		timer = new Timer();
		countDownSec = setTimeSec+1;
    	timer.scheduleAtFixedRate(new TimerTask() {

    		public void run() {
    			System.out.println("in run , countDownSec : "+countDownSec);
    			mc.getTimerJLabel().setText("<html><h1>"+secToClock(setcountDownSec())+"</h1></html>");
    	    	
    		}
    	}, delay, period);
    	
	}

	public static int setcountDownSec() {
		//ī��Ʈ�ٿ��� ��������
    	if (countDownSec <= 1) {
    		//��� ������ ��������
    		if(questionIdx >= questionLen){

    			//���� ����
    			//�� ��� ��� ������ ��ٰ� �� ���	> ��Ī ����
    			if(myCurrentAns.equals("0") && opponentCurrentAns.equals("0")){
    				try {
						mc.getOos().writeObject(mc.getId()+"#mySituation#"+finalMsgArr[0]);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    				///���� ���� ~
    				
    				mc.getInputWindowJTF().setEditable(true);
    				mc.getGreenLightLabel().setIcon(new ImageIcon(".\\data\\greenlight(on).png"));
    				mc.getOpponentImgLabel().setIcon(resizeImg(".\\picture\\"+opponentId+".jpg"));
    			}
    			//�� ����̶� ������ ��ٰ� ���� ���� ��� 	> ��Ī ����
    			else {
    				try {
						mc.getOos().writeObject(mc.getId()+"#mySituation#"+finalMsgArr[1]);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    				//ä�� ��Ȱ��ȭ
    				mc.getInputWindowJTF().setEditable(false);
    				
    				///���� ���� ~
        			mc.getOpponentImgLabel().setIcon(new ImageIcon(".\\data\\misMatch.png"));
    				
    			}
    			
    			//��ư ��Ȱ��ȭ
    			setEnableJBtn(false);
    			//Ÿ�̸� ����
    			timer.cancel();
    			return 0;
    		}
		
    		if(isOverSelectTime){//	>��ȭ �ð����� ��ȯ
    			//��ȭ ���
    			//���� ����� ���
    			//������ �޾Ƶ��̰�, �Ǵ� 
    			//��ư ��Ȱ��ȭ
    			//ä��â Ȱ��ȭ
    			chatMode();
    			
    		}else{	//��ȭ�� ���� �ð��϶�	> ���� �ð����� ��ȯ   
    			//���ø��
    			selectMode();	
    		}
    	}

    	//������ ������ ī��Ʈ�ٿ��ʸ� -1���ش�.
    	return --countDownSec;
	}

	public static void selectMode() {
		try {
			mc.getGreenLightLabel().setIcon(new ImageIcon(".\\data\\greenlight(off).png"));
			mc.getOos().writeObject(mc.getId()+"#mySituation#"+"<<���� �ð��Դϴ�.>>");
			mc.getOos().writeObject(mc.getId()+"#Q#q");
			mc.getOos().writeObject(mc.getId()+"#ans#2");	//�ϴ� ��ǥ�� ���� ����
			mc.getInputWindowJTF().setEditable(false);
			setEnableJBtn(true);
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		countDownSec = SELECT_TIME;
		//ä��â�� ��Ȱ��Ȳ
		
		isOverSelectTime = true;	
	}

	public static void setEnableJBtn(boolean isTrue) {
		mc.getRightJBtn().setEnabled(isTrue);
		mc.getLeftJBtn().setEnabled(isTrue);
	}

	//��ȭ ���
	//�ð� ����
	//���� ��� �Ǵ� 
	//��ư ��Ȱ��ȭ
	//ä��â Ȱ��ȭ
	public static void chatMode() {
		//�ð� ����
		countDownSec = CHAT_TIME;
		
		//���� ��� �Ǵ� 
		compareAns();
		
		try {
			mc.getOos().writeObject(mc.getId()+"#mySituation#"+"<<��ȭ �ð��Դϴ�.>>");
			
			//ä��â Ȱ��ȭ
			mc.getInputWindowJTF().setEditable(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		isOverSelectTime = false;
		
		//��ư ��Ȱ��ȭ
		setEnableJBtn(false);		
	}


	public static void compareAns() {
		//�����ߴ��� �Ǵ�	> ���� �Ϸ�
		if(myCurrentAns.equals("2")){
			try {
				mc.getOos().writeObject(mc.getId()+"#notice#<<"+mc.getId()+"���� �������� �ʾҽ��ϴ�>>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//������ ����ǰ� ���� ������ ���� �����Ѵ�.
		myAns +=myCurrentAns;
		opponentAns += opponentCurrentAns;
		System.out.println("myAns : " + myAns +", opAns : "+opponentAns);
		
		//���� ������ �߰�, ���� ����� ����� ����� �������
		if(myCurrentAns.equals(opponentCurrentAns)){
			if(!myCurrentAns.equals("2")) {
				///�׸�����Ʈ�� Ų��. > ���� �׸�����Ʈ�̹��� 
				mc.getGreenLightLabel().setIcon(new ImageIcon(".\\data\\greenlight(on).png"));
				
				try {
					//������ ����� �˸���.
					mc.getOos().writeObject(mc.getId()+"#mySituation#<<����� ���� ������ �ϼ̽��ϴ�.>>");
				} catch (IOException e) {
					//e.printStackTrace();
				}
			}
					
		}
		//������ ��� ���� ���� �ٸ���
		else{
			///�׸�����Ʈ�� ����.
			
			
			try {
				mc.getOos().writeObject(mc.getId()+"#mySituation#<<����� �ٸ� ������ �ϼ̽��ϴ�.>>");
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
	
	}

	private static String secToClock(int sec){
		int clockMin = sec/60;
		int clockSec = sec%60;
		countDownMinSecStr = String.format("%02d", clockMin) +":"+String.format("%02d", clockSec);
		return countDownMinSecStr;
	}
	
	public static ImageIcon resizeImg(String string) {
		ImageIcon imageIcon = new ImageIcon(string); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(360, 360,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back 
		return imageIcon;
	}


}
