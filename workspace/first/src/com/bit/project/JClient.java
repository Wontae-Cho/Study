package com.bit.project;

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
// 프로그램이 꺼질 때 클로징, 클로즈드 를 구분해야한다.
// 클라이언트는 어제 했던 에코서버의 클라이언트와 다를것이 없다.
// 단지, Ui만 추가함.
public class JClient extends Frame implements ActionListener{
	TextArea  ta;
	TextField tf;
	OutputStream os;
	// 쓰기를 이벤트가 일어났을 때 사용하기 위해서 필드로 빼서 구성함.
	
	public JClient() {
		// 화면구성.
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
		// UI구성 이후에 실행될 부분.
		init();
		
	}
	public void actionPerformed(ActionEvent arg0) {
		// TextField로 부터 가져온 내용을 String msg에 저장함
		String msg = tf.getText();
		// TextField 창을 비움.
		tf.setText("");
//		System.out.println(msg);
		// 위에 msg에 개행문자를 추가함.
		msg+="\n";
		try {
			// msg를 바이트로 바꾸고 그것을 OutStream을 통해 쓴다. 
			os.write(msg.getBytes());
			// 이벤트가 있을 때 마다 쏴줘야함으로 close가 필요 없음.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void init(){
		// 계속 읽어야함.
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
//				String msg+= sock.getInetAddress() +" : ";
				String msg = br.readLine();
				ta.append(msg+'\n');
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null){sock.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		JClient me = new JClient();
	}


}
