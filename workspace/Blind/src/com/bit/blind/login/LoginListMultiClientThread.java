package com.bit.blind.login;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.bit.blind.MultiClient;

/**
 * 다른 클라이언트의 메세지를 청취하여  MultiClient의 jTextArea창에 메세지를 출력하는 역할을 한다.
 */

public class LoginListMultiClientThread extends Thread implements ClientData {
	static private LoginListMultiClient llmc;

	
	String readMsg = null;
	String[] idSubjectContent = null;
	boolean isStop = false;

	public LoginListMultiClientThread(LoginListMultiClient llmc) {
		this.llmc = llmc;
	}

	@Override
	public void run() {

		while(!isStop){
			
			//ois로 읽어 들인다.
			try {
				readMsg = (String)this.llmc.getOis().readObject();
				System.out.println("readMsg : "+readMsg);
				idSubjectContent = readMsg.split("#");
				
				
				
			}catch (Exception e) {
				e.printStackTrace();
				isStop = true;
			}
			
			//프로토콜 enterance(입장)일때
			if (idSubjectContent[1].equals("enterance")){
				onEnterance();	
			}
			//프로토콜 exit(퇴장)일때 
			else if (idSubjectContent[1].equals("exit")){
				onExit();	
			}
			//프로토콜 exit(아이디 요청)일때 
			else if(idSubjectContent[1].equals("giveYourId")) {
				//나의 아이디를 보내준다.
				onPostMyId();
			}else if(idSubjectContent[1].equals("request")) {
				//나의 아이디를 보내준다.
				onRequest();
			}
			
			
		}
		System.out.println(llmc.getId()+"가 퇴장합니다.");
		
		//종료
		try {
			System.out.println(llmc.getId()+"가 퇴장합니다.");
			this.llmc.getOos().writeObject(llmc.getId()+"#exit#"+llmc.getId()+"가 퇴장합니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.llmc.exit();
	}
	

	public void onEnterance() {
		//해당 아이디를 리스트에서 추가 시킴
		//아이디가 나인경우(내가 입장한 경우
		if(idSubjectContent[0].equals(llmc.getId())) {
			boolean isExist = false;
			for (int i = 0; i < llmc.chatContactListModel.size(); i++) {
				//채팅접속리스트에 이미 있는 접속자라면
				if(llmc.chatContactListModel.get(i).equals(idSubjectContent[0]+"(나)")) {
					isExist = true;	//존재한다로 바꿔준다
				}
			}
			
			//존재하지 않는 id라면 추가 시킨다.
			if(!isExist) {
				llmc.chatContactListModel.addElement(idSubjectContent[0]+"(나)");
				//다른 접속자에게 접속자 리스트를 달라고 함
				try {
					///보내긴 하는데 해당 내용을 다른 클라이언트가 받질 못하네?
					this.llmc.getOos().writeObject(llmc.getId()+"#giveYourId#+id주센");
					System.out.println("onEnterance :: "+llmc.getId()+"#giveYourId#+id주센");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
		//아이디가 내가 아닌경우( 내가 들어간 이후 추가로 들어온 경우)
		else {
			boolean isExist = false;
			for (int i = 0; i < llmc.chatContactListModel.size(); i++) {
				//채팅접속리스트에 이미 있는 접속자라면
				if(llmc.chatContactListModel.get(i).equals(idSubjectContent[0])) {
					isExist = true;	//존재한다로 바꿔준다
				}
			}
			
			//존재하지 않는 id라면 추가 시킨다.
			if(!isExist) {
				llmc.chatContactListModel.addElement(idSubjectContent[0]);
			}
			
		}
		
		
	}
	
	public void onExit() {
		//해당 아이디를 리스트에서 제거 시킴
		llmc.chatContactListModel.removeElement(idSubjectContent[0]);	
	}
	
	//
	public void onPostMyId() {
		//내가 보낸 메세지가 아닌경우에
		//나의 입장여부를 알란다
		if(!idSubjectContent[0].equals(llmc.getId())) {
			try {
				llmc.getOos().writeObject(llmc.getId()+"#enterance#");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		
	}
	
	public void onRequest() {
		
		
		if(!idSubjectContent[0].equals(llmc.getId())){
			//채팅요청에 대한 답변일때
			if(idSubjectContent.length == 4){
				if(idSubjectContent[3].equals("accept")){
					try {
						MultiClient.main(new String[] {llmc.getId()});
						this.llmc.getOos().writeObject(llmc.getId()+"#exit#"+llmc.getId()+"가 퇴장합니다.");
						
					} catch (IOException e) {
						//e.printStackTrace();
					}
				}else if(idSubjectContent[3].equals("decline")){
					JOptionPane.showMessageDialog(null, "상대방이 채팅요청을 거절했습니다.");
				}
			}
			//채팅요청이 들어온 경우
			else if (idSubjectContent.length == 3 && idSubjectContent[2].equals(llmc.getId())){

				 new ChatRequest(idSubjectContent[0], this.llmc);
			}
		}else if(idSubjectContent[0].equals(llmc.getId())){
			if(idSubjectContent.length == 4 && (idSubjectContent[3].equals("accept"))){
				
					try {
						
						this.llmc.getOos().writeObject(llmc.getId()+"#exit#"+llmc.getId()+"가 퇴장합니다.");
						
					} catch (IOException e) {
						//e.printStackTrace();
					}
			}
		}
		
	}
	
	



}
