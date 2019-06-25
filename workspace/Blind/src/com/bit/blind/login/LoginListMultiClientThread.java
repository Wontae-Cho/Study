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
 * �ٸ� Ŭ���̾�Ʈ�� �޼����� û���Ͽ�  MultiClient�� jTextAreaâ�� �޼����� ����ϴ� ������ �Ѵ�.
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
			
			//ois�� �о� ���δ�.
			try {
				readMsg = (String)this.llmc.getOis().readObject();
				System.out.println("readMsg : "+readMsg);
				idSubjectContent = readMsg.split("#");
				
				
				
			}catch (Exception e) {
				e.printStackTrace();
				isStop = true;
			}
			
			//�������� enterance(����)�϶�
			if (idSubjectContent[1].equals("enterance")){
				onEnterance();	
			}
			//�������� exit(����)�϶� 
			else if (idSubjectContent[1].equals("exit")){
				onExit();	
			}
			//�������� exit(���̵� ��û)�϶� 
			else if(idSubjectContent[1].equals("giveYourId")) {
				//���� ���̵� �����ش�.
				onPostMyId();
			}else if(idSubjectContent[1].equals("request")) {
				//���� ���̵� �����ش�.
				onRequest();
			}
			
			
		}
		System.out.println(llmc.getId()+"�� �����մϴ�.");
		
		//����
		try {
			System.out.println(llmc.getId()+"�� �����մϴ�.");
			this.llmc.getOos().writeObject(llmc.getId()+"#exit#"+llmc.getId()+"�� �����մϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.llmc.exit();
	}
	

	public void onEnterance() {
		//�ش� ���̵� ����Ʈ���� �߰� ��Ŵ
		//���̵� ���ΰ��(���� ������ ���
		if(idSubjectContent[0].equals(llmc.getId())) {
			boolean isExist = false;
			for (int i = 0; i < llmc.chatContactListModel.size(); i++) {
				//ä�����Ӹ���Ʈ�� �̹� �ִ� �����ڶ��
				if(llmc.chatContactListModel.get(i).equals(idSubjectContent[0]+"(��)")) {
					isExist = true;	//�����Ѵٷ� �ٲ��ش�
				}
			}
			
			//�������� �ʴ� id��� �߰� ��Ų��.
			if(!isExist) {
				llmc.chatContactListModel.addElement(idSubjectContent[0]+"(��)");
				//�ٸ� �����ڿ��� ������ ����Ʈ�� �޶�� ��
				try {
					///������ �ϴµ� �ش� ������ �ٸ� Ŭ���̾�Ʈ�� ���� ���ϳ�?
					this.llmc.getOos().writeObject(llmc.getId()+"#giveYourId#+id�ּ�");
					System.out.println("onEnterance :: "+llmc.getId()+"#giveYourId#+id�ּ�");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
		//���̵� ���� �ƴѰ��( ���� �� ���� �߰��� ���� ���)
		else {
			boolean isExist = false;
			for (int i = 0; i < llmc.chatContactListModel.size(); i++) {
				//ä�����Ӹ���Ʈ�� �̹� �ִ� �����ڶ��
				if(llmc.chatContactListModel.get(i).equals(idSubjectContent[0])) {
					isExist = true;	//�����Ѵٷ� �ٲ��ش�
				}
			}
			
			//�������� �ʴ� id��� �߰� ��Ų��.
			if(!isExist) {
				llmc.chatContactListModel.addElement(idSubjectContent[0]);
			}
			
		}
		
		
	}
	
	public void onExit() {
		//�ش� ���̵� ����Ʈ���� ���� ��Ŵ
		llmc.chatContactListModel.removeElement(idSubjectContent[0]);	
	}
	
	//
	public void onPostMyId() {
		//���� ���� �޼����� �ƴѰ�쿡
		//���� ���忩�θ� �˶���
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
			//ä�ÿ�û�� ���� �亯�϶�
			if(idSubjectContent.length == 4){
				if(idSubjectContent[3].equals("accept")){
					try {
						MultiClient.main(new String[] {llmc.getId()});
						this.llmc.getOos().writeObject(llmc.getId()+"#exit#"+llmc.getId()+"�� �����մϴ�.");
						
					} catch (IOException e) {
						//e.printStackTrace();
					}
				}else if(idSubjectContent[3].equals("decline")){
					JOptionPane.showMessageDialog(null, "������ ä�ÿ�û�� �����߽��ϴ�.");
				}
			}
			//ä�ÿ�û�� ���� ���
			else if (idSubjectContent.length == 3 && idSubjectContent[2].equals(llmc.getId())){

				 new ChatRequest(idSubjectContent[0], this.llmc);
			}
		}else if(idSubjectContent[0].equals(llmc.getId())){
			if(idSubjectContent.length == 4 && (idSubjectContent[3].equals("accept"))){
				
					try {
						
						this.llmc.getOos().writeObject(llmc.getId()+"#exit#"+llmc.getId()+"�� �����մϴ�.");
						
					} catch (IOException e) {
						//e.printStackTrace();
					}
			}
		}
		
	}
	
	



}
