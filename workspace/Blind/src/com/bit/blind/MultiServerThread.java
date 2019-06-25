package com.bit.blind;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * ������ Ŭ���̾�Ʈ�� ���� ��ü�� �����ϱ� ���� Ŭ����
 * ������ Socket ��ü�� �����ϰ� MultiServer�� Collection�� ������ �ձ� ������ �ٸ� Ŭ���̾�Ʈ���� �޼����� ���� �� �ִ�.
 * 
 * msg�� object�� �ְ� ����
 */
public class MultiServerThread implements Runnable {
	public Socket socket;
	public MultiServer ms;
	public ObjectInputStream ois;
	public ObjectOutputStream oos;

	public MultiServerThread(MultiServer multiServer) {
		this.ms = multiServer;	//
		
		
	}

	public void run() {
		boolean isStop = false;
		
		socket = ms.getSocket();		//MultiServer���� ������ ��ü�� ��ȯ�Ѵ�.
		try {
			ois = new ObjectInputStream(socket.getInputStream());	//Socket ��ü�� ����Ʈ�Է½�Ʈ���� �����ϰ�, �̰����� ois ��ü�� �����Ѵ�.
			oos = new ObjectOutputStream(socket.getOutputStream());	//Socket ��ü�� ����Ʈ��½�Ʈ���� �����ϰ�, �̰����� oos ��ü�� �����Ѵ�.
			
			String msg = null;
			
			
			if(this.ms.getList().size()==2){
				broadCasting("id#Q#q0");
			}
			
			while(!isStop){
				
				msg = (String)ois.readObject();			//�Է¹��� ois�� ���ڿ��� �д´�.
				String[] str  = msg.split("#");			//���۵� ���ڿ��� <���̵�>#<chat>#msg�� �̷���� �ִ�.
				if(str[2].equals("exit")){
					broadCasting(msg);					//���� ������ �˸���.
					isStop = true;						//���ڿ� �ޱ⸦ ��ģ��.
				}else{
					broadCasting(msg);					//���� ������ �˸���.
				}
			}
			
			ms.getList().remove(this);					//��Ƽ������ �ִ� �����带 �����ϴ� collection���� �� �����带 �����Ѵ�.
			System.out.println(socket.getInetAddress() +" ���������� �����Ͽ����ϴ�.");	//�ش� ������ ���� �޼��� ���
			System.out.println("serverList size : "+ ms.getList().size());		//�ش� ������ ���ŵ� collection�� ũ�⸦ ���
		} catch (Exception e) {	//���� ��Ȳ�� �߻��� ���
			e.printStackTrace();
			ms.getList().remove(this);		//�ش� ������ ����
			System.out.println(socket.getInetAddress() +" ������������ �����Ͽ����ϴ�.");	//�ش� ������ ���� �޼��� ���
			System.out.println("serverList size : "+ ms.getList().size());		//�ش� ������ ���ŵ� collection�� ũ�⸦ ���
		}
		
	}


	//�ش� �����尡 collection �� �ִ� ��� ��Ƽ���������带 �ҷ��� �޼����� ������.
	public void broadCasting(String msg) {
		for (MultiServerThread tempMst : ms.getList()) {
			tempMst.send(msg);
		}
	}

	//�޼����� ������Ʈ�� �Ἥ ������.
	public void send(String msg) {
		try {
			oos.writeObject(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}