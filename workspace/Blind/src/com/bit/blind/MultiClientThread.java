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
 * 다른 클라이언트의 메세지를 청취하여  MultiClient의 jTextArea창에 메세지를 출력하는 역할을 한다.
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
			
			//ois로 읽어 들인다.
			try {
				readMsg = (String)this.mc.getOis().readObject();
				idSubjectContent = readMsg.split("#");
				
			}catch (Exception e) {
				e.printStackTrace();
				isStop = true;
			}
			
			System.out.println(Arrays.toString(idSubjectContent));
			
			//프로토콜 chat(채팅)일때
			//exit인식
			//채팅창에 대화내용 추가
			if(idSubjectContent[1].equals("chat")){	//나가는 메세지가 나오면
				onChat();	
			}
			
			//프로토콜 Q(질문)일때 
			//질문 setting, 버튼 활성화, 채팅 비활성화
			else if(idSubjectContent[1].equals("Q")){ // 질문만오는 경우.
				onQuestion();
			}
			
			//프로토콜 mySituation(나의 상황)일때
			///문제 있음
			else if(idSubjectContent[1].equals("mySituation")){
				onMySituation();	
			}
			
			else if(idSubjectContent[1].equals("notice") ){
				onNotice();
			}
			//프로토콜 ans(선택에 대한 답변)일때
			else if (idSubjectContent[1].equals("ans")){
				onAnswer();	
			}
			
			//프로토콜 ans(선택에 대한 답변)일때
			else if (idSubjectContent[1].equals("enterance")){
				onEnterance();	
			}
		}	
	}
	
	

	

	//////////////////////////////////////////////
	/////////////////메서드 영역/////////////////////
	//////////////////////////////////////////////
	
	

	//프로토콜 chat(채팅)일때
	//exit인식
	//채팅창에 대화내용 추가
	public void onChat() {
		//exit 메세지 일때
		if(idSubjectContent[2].equals("exit")){
			if(idSubjectContent[0].equals(this.mc.getId())){//그 메세지의 id가 나일떄
				this.mc.exit();	//종료
			}else {	//다른 id일때
				this.mc.getchatWindowJTA().append(idSubjectContent[0]+" 님이 종료하셨습니다."+System.getProperty("line.separator"));
				timer.cancel();	///나의 카운터를 중지
			}
		}
		//exit 메세지가 아닐때
		else{
			if(idSubjectContent[0].equals(this.mc.getId())){//그 메세지의 id가 나일떄
				//id 부분을 나로 바꾸고 내용 출력
				this.mc.getchatWindowJTA().append("나 : "+ idSubjectContent[2]+System.getProperty("line.separator"));
			}else {	//다른 id일때
				//상대방 id와 내을 그대로 출력
				this.mc.getchatWindowJTA().append(idSubjectContent[0]+ " : "+ idSubjectContent[2]+System.getProperty("line.separator"));
			}
		}
		
	}	
	
	//선택상황인지 채팅상황인지를 나에게 나타내는 selectChatString(idSubjectContent[2])
	public void onMySituation() {
		if(idSubjectContent[0].equals(this.mc.getId())){
			this.mc.getchatWindowJTA().append(idSubjectContent[2]+System.getProperty("line.separator"));
		}
	}	
	
	//메세지를 알려(버튼이 클릭되 않았을 때만 작동
	public void onNotice() {
		this.mc.getchatWindowJTA().append(idSubjectContent[2]+System.getProperty("line.separator"));
	}	
	//프로토콜 Q(질문)일때 
	//질문 setting, 버튼 활성화, 채팅 비활성화
	public void onQuestion() {
		if(isFirstQuestion){ // 0번째 질문. (안내문)
			setEnableJBtn(true);
			mc.getInputWindowJTF().setEditable(false);
			startTimer(SELECT_TIME);
			mc.setQuestionJLabel(question[questionIdx]);
			isFirstQuestion = false;
			questionIdx++;
		}else if(idSubjectContent[0].equals(this.mc.getId())){ // 0번째 질문이 아닌 것이 왔을때.
			System.out.println("받은 id : "+idSubjectContent[0] + ", questionIdx : "+questionIdx);
			mc.setQuestionJLabel(question[questionIdx]);
			questionIdx++;
		}else{
			System.out.println("흘려보낸  id : "+idSubjectContent[0]);
		}
		
	}			
	
	//프로토콜 ans(선택에 대한 답변)일때
	//보낸 아이디를 비교해서 나의 답과 상대의 답을 구분해서 저장
	//나의 답을 표시
	public void onAnswer() {
		if(idSubjectContent[0].equals(this.mc.getId())){
			myCurrentAns = idSubjectContent[2];
			if(idSubjectContent[2].equals("0")){
				this.mc.getchatWindowJTA().append("나는 YES를 선택하였습니다."+System.getProperty("line.separator"));
			}else if( idSubjectContent[2].equals("1")){
				this.mc.getchatWindowJTA().append("나는 NO를 선택하였습니다."+System.getProperty("line.separator"));
			}	
		}else{
			opponentCurrentAns =idSubjectContent[2];
		}
		
		
	}

	//프로토콜 enterance(채팅창 입장)일때
	private void onEnterance() {
		if(!idSubjectContent[0].equals(this.mc.getId())){
			if(opponentId.equals("")) {
				this.mc.getchatWindowJTA().append(idSubjectContent[2]+System.getProperty("line.separator"));
				opponentId = idSubjectContent[0];
				System.out.println("나 : "+this.mc.getId() +", 상대방 : "+opponentId);
				mc.getOpponentImgLabel().setIcon(resizeImg(".\\picture\\"+opponentId+"_blur.jpg"));
				try {
					this.mc.getOos().writeObject(mc.getId() +"#enterance#"+mc.getId()+"님이 입장하셨습니다.");
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
		//카운트다운이 끝났을때
    	if (countDownSec <= 1) {
    		//모든 질문이 끝났을때
    		if(questionIdx >= questionLen){

    			//최종 결정
    			//두 사람 모두 마음에 든다고 한 경우	> 매칭 성공
    			if(myCurrentAns.equals("0") && opponentCurrentAns.equals("0")){
    				try {
						mc.getOos().writeObject(mc.getId()+"#mySituation#"+finalMsgArr[0]);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    				///상대방 사진 ~
    				
    				mc.getInputWindowJTF().setEditable(true);
    				mc.getGreenLightLabel().setIcon(new ImageIcon(".\\data\\greenlight(on).png"));
    				mc.getOpponentImgLabel().setIcon(resizeImg(".\\picture\\"+opponentId+".jpg"));
    			}
    			//한 사람이라도 마음에 든다고 하지 않은 경우 	> 매칭 실패
    			else {
    				try {
						mc.getOos().writeObject(mc.getId()+"#mySituation#"+finalMsgArr[1]);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    				//채팅 비활성화
    				mc.getInputWindowJTF().setEditable(false);
    				
    				///상대방 사진 ~
        			mc.getOpponentImgLabel().setIcon(new ImageIcon(".\\data\\misMatch.png"));
    				
    			}
    			
    			//버튼 비활성화
    			setEnableJBtn(false);
    			//타이머 종료
    			timer.cancel();
    			return 0;
    		}
		
    		if(isOverSelectTime){//	>대화 시간을로 전환
    			//대화 모드
    			//나의 결과를 쏘고
    			//상대방의 받아들이고, 판단 
    			//버튼 비활성화
    			//채팅창 활성화
    			chatMode();
    			
    		}else{	//대화가 끝난 시간일때	> 선택 시간으로 전환   
    			//선택모드
    			selectMode();	
    		}
    	}

    	//끝나지 않으면 카운트다운초를 -1해준다.
    	return --countDownSec;
	}

	public static void selectMode() {
		try {
			mc.getGreenLightLabel().setIcon(new ImageIcon(".\\data\\greenlight(off).png"));
			mc.getOos().writeObject(mc.getId()+"#mySituation#"+"<<선택 시간입니다.>>");
			mc.getOos().writeObject(mc.getId()+"#Q#q");
			mc.getOos().writeObject(mc.getId()+"#ans#2");	//일단 투표를 안한 상태
			mc.getInputWindowJTF().setEditable(false);
			setEnableJBtn(true);
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		countDownSec = SELECT_TIME;
		//채팅창을 비활성황
		
		isOverSelectTime = true;	
	}

	public static void setEnableJBtn(boolean isTrue) {
		mc.getRightJBtn().setEnabled(isTrue);
		mc.getLeftJBtn().setEnabled(isTrue);
	}

	//대화 모드
	//시간 세팅
	//선택 결과 판단 
	//버튼 비활성화
	//채팅창 활성화
	public static void chatMode() {
		//시간 세팅
		countDownSec = CHAT_TIME;
		
		//선택 결과 판단 
		compareAns();
		
		try {
			mc.getOos().writeObject(mc.getId()+"#mySituation#"+"<<대화 시간입니다.>>");
			
			//채팅창 활성화
			mc.getInputWindowJTF().setEditable(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		isOverSelectTime = false;
		
		//버튼 비활성화
		setEnableJBtn(false);		
	}


	public static void compareAns() {
		//선택했는지 판단	> 선택 완료
		if(myCurrentAns.equals("2")){
			try {
				mc.getOos().writeObject(mc.getId()+"#notice#<<"+mc.getId()+"님은 선택하지 않았습니다>>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//선택이 종료되고 최종 선택한 답을 저장한다.
		myAns +=myCurrentAns;
		opponentAns += opponentCurrentAns;
		System.out.println("myAns : " + myAns +", opAns : "+opponentAns);
		
		//내가 선택을 했고, 나의 결과와 상대의 결과가 같은경우
		if(myCurrentAns.equals(opponentCurrentAns)){
			if(!myCurrentAns.equals("2")) {
				///그린라이트를 킨다. > 켜진 그린라이트이미지 
				mc.getGreenLightLabel().setIcon(new ImageIcon(".\\data\\greenlight(on).png"));
				
				try {
					//나에게 결과를 알린다.
					mc.getOos().writeObject(mc.getId()+"#mySituation#<<상대방과 같은 선택을 하셨습니다.>>");
				} catch (IOException e) {
					//e.printStackTrace();
				}
			}
					
		}
		//상대방의 답과 나의 답이 다를때
		else{
			///그린라이트를 끈다.
			
			
			try {
				mc.getOos().writeObject(mc.getId()+"#mySituation#<<상대방과 다른 선택을 하셨습니다.>>");
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
