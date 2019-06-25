package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Sender {
	// �����͸� ������ ��.

	public static void main(String[] args) {
		String ip = "localhost";
		int port = 5000;
		
		DatagramSocket dgs = null;
		DatagramPacket dgp = null;
		try {
			InetAddress addr = InetAddress.getByName(ip);
			dgs = new DatagramSocket();
			String msg = "Nice UDP";
			dgp = new DatagramPacket(msg.getBytes(),msg.length(),addr,port);
									// ������ , ������ , ����(InetAddress), ��Ʈ��ȣ
			dgs.send(dgp);
			
			msg = "�ȳ��ϼ���";
			dgp = new DatagramPacket(msg.getBytes(),msg.getBytes().length, addr,port);
			dgs.send(dgp);
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			dgs.close();
		}
		
		
	}

}
