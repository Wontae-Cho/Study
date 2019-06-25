package com.bit.example;

import java.net.*;
import java.io.*;

// ������.
public class MultiServerThread implements Runnable{
	private Socket socket;
	private MultiServer ms;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	public MultiServerThread(MultiServer ms){
		this.ms = ms;
	}
	public synchronized void run(){
		boolean isStop = false;
		try{
			// ������ private ������ �Ǿ��ֱ� ������ get�ż��带 ����ؼ� ������.
			socket = ms.getSocket();
			// ���Ͽ� �ִ� ������ inputstream���� �а� �� objectinputstream���� ����ó��.
			ois = new ObjectInputStream(socket.getInputStream());
			// ���� ��������. outputstream ���Ͽ� �ִ� ������ ���µ��� Ȱ��.
			oos = new ObjectOutputStream(socket.getOutputStream());
			// ���ϳ����� �������� ����.
			String message = null;
			while(isStop){
				// ois�� ���ؼ� object�κ��� ���� ������ (String)���� ĳ�����ؼ� message�� ����.
				message = (String)ois.readObject();
				// message�� #�� �������� �ڸ� ���� String�迭�� ����.
				String[] str = message.split("#");
				// String�迭�� ����� ������ 1��°�� "exit" �� ���.
				if(str[1].equals("exit")){
					// broadCasting�ż��忡 message�� �����ϰ�
					broadCasting(message);
					// isStop�� true�� �ٲ� �����ǵ���.
					isStop = true;
					// String�迭�� ����� ������ ù��°�� exit�� �ƴҰ��
				}else{
					// broadCasting�ż��忡 message�� ����
					broadCasting(message);
				}
			}
			// ���������� �������� ��.
			// ��Ƽ�������� ����Ʈ�� �޾ƿͼ� �� ��ä�� ����.
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress()+"���������� �����ϼ̽��ϴ�");
			System.out.println("list size : "+ms.getList().size());
		}catch(Exception e){
			// ������������ �������� ��.
			// ��Ƽ�������� ����Ʈ�� �޾ƿͼ� �� ��ä�� ����.
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress()+"������������ �����ϼ̽��ϴ�");
			System.out.println("list size : "+ms.getList().size());
		}
	}
	// �ٸ� ���Ͽ��� �޼����� ������ �޼���.
	public void broadCasting(String message)throws IOException{
		// ��Ƽ�������� list�� �����ͼ� ��� ������ ������ ����.
		for(MultiServerThread ct : ms.getList()){
			// ���� �޼����� send�޼��忡 ������.
			ct.send(message);
		}
	}
	// �ش簴ü�� message�� ���� ����.
	public void send(String message)throws IOException{
		// broadCasting���� ���޹��� ������ oos�� ���ؼ� Object�� ��.
		oos.writeObject(message);
	}
}
