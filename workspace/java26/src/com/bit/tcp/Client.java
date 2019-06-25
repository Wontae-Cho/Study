package com.bit.tcp;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
// ���α׷��� ���� �� Ŭ��¡, Ŭ����� �� �����ؾ��Ѵ�.
// Ŭ���̾�Ʈ�� ���� �ߴ� ���ڼ����� Ŭ���̾�Ʈ�� �ٸ����� ����.
// ����, Ui�� �߰���.
public class Client extends Frame implements ActionListener{
	TextArea  ta;
	TextField tf;
	OutputStream os;
	// ���⸦ �̺�Ʈ�� �Ͼ�� �� ����ϱ� ���ؼ� �ʵ�� ���� ������.
	
	public Client() {
		// ȭ�鱸��.
		ta = new TextArea();
		tf = new TextField();
		tf.addActionListener(this);
		
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add(ta,BorderLayout.CENTER);
		p.add(tf,BorderLayout.SOUTH);
		
		add(p);
		setBounds(100,100,500,400);
		setVisible(true);
		init();
	}
	public void actionPerformed(ActionEvent arg0) {
		String msg = tf.getText();
		tf.setText("");
		System.out.println(msg);
		msg+="\n";
		try {
			os.write(msg.getBytes());
			// �̺�Ʈ�� ���� �� ���� ����������� close�� �ʿ� ����.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void init(){
		// ��� �о����.
		String ip = "localhost";
//		String ip = "192.168.0.61";
		int port = 5000;
		
		Socket sock = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			sock = new Socket(ip,port);
			is = sock.getInputStream();
			os = sock.getOutputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			System.out.println("client start...");
			
			while(true){
				String msg = br.readLine();
				ta.append(msg+'\n');
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock!=null){sock.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Client me = new Client();
	}


}
