package com.bit.blind.login;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Login extends JFrame implements MouseListener{
	
	FocusListen fl = new FocusListen();

	
//	actionListener에서 사용해야돼서 선언밖으로
	
	JTextArea txLog = new JTextArea();
	JTextField txID ;
//	JTextField txPW ;
	JPasswordField txPW;
	
	String txtID;
	
	MyActionListener myBTListener = new MyActionListener();
	
	public Login(){

		
		BorderLayout mainLayout = new BorderLayout(); //메인레이아웃
		setLayout(mainLayout);
		
		
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc =new GridBagConstraints();
		gbc.fill=GridBagConstraints.NONE;
		Panel center = new Panel();
		center.setLayout(gbl);
	
		Panel north = new Panel(); 

		JButton btnOK ;
		
	    JLabel lbLG = new JLabel("블라인드");
	    north.add(lbLG);
		add(north,BorderLayout.NORTH);
	    
		

	   
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		txID = new JTextField("아이디",10);
		txID.addMouseListener(this);
		center.add(txID,gbc);
	   
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
//		txPW = new JTextField("비밀번호",10);
		txPW = new JPasswordField("비밀번호",10);
		txPW.addMouseListener(this);
		txPW.addFocusListener(fl);
		
		center.add(txPW,gbc);
		
		
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		btnOK = new JButton("로그인");
		center.add(btnOK,gbc);
		
		
		
		add(center,BorderLayout.CENTER);
//		addWindowListener(this);
	    
		setBounds(100,100,400,300);
	    setVisible(true);
	    setResizable(false);
	    
	    btnOK.requestFocus(true);
	    btnOK.addActionListener(myBTListener);
	}
	
	
	class FocusListen implements FocusListener{

		public void focusGained(FocusEvent e) {
			//포커스가 비밀번호로 가면 값이 비워짐
			if(txPW==e.getSource()){
				txPW.setText("");
			}
			
		}

		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Login log = new Login();

	}
	
	class MyActionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			//이벤트가 발생한 원인을 문자열의 형태로 반환
			String name = e.getActionCommand();
			
			//사용자 ID, PW이 저장된 파일
			File dataFile = new File(".\\data\\login.txt");
			
			String readData;
			StringTokenizer st;
			//ID, PW 빈칸 검사를 위해 초기값 설정
			String loginID = "";
			String loginPW = "";
			
			loginID = txID.getText();
			loginPW = txPW.getText();
			
			if(name.equals("로그인")){ //로그인 누름
				
				boolean check = false;
				
				txID.setText("");
				txPW.setText("");
				
				//Login frame에서 txID 또는 txPW field가 빈칸이면 
				if(loginID.equals("") || loginPW.equals("")){
					//id, pw 확인하라는 메세지 다이어로그 출력
					JOptionPane.showMessageDialog(null, "아이디 비밀번호를 확인 하세요","LoginError",
							JOptionPane.ERROR_MESSAGE);
					
				}else{//id, pw 빈칸이 아닐 때
					
					try {
						BufferedReader br = new BufferedReader(new FileReader(dataFile));
						while((readData= br.readLine())!= null) {//파일 라인이 null이 아닐 때까지 읽음
							//id, pw 구분자 @
							st = new StringTokenizer(readData, "@");
						
							txtID = st.nextToken();
							String txtPW = st.nextToken();
							
							if(loginID.equals(txtID) && loginPW.equals(txtPW)){
								//로그인 검증 체크를 true로 바꿈
								check = true; 
								break; 	//while break
							}else{
								check = false;//id , pw 같지 않을 때
							}
						}
						if(check == true){//검증값이 true면
							setVisible(false);//로그인 화면 숨김
							
							LoginListMultiClient.main(new String[] {txtID});
						}else{//검증값 false
							JOptionPane.showMessageDialog(null,//ID, PW 확인하라는 MessageDialog 출력
									"아이디 비밀번호를 확인하세요", "LoginError",
									JOptionPane.ERROR_MESSAGE);
						}
						
						br.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException ie) {
						// TODO Auto-generated catch block
						
						System.out.println(ie.getMessage());
					}
					
				}
			}
		}
		
	}

	public void mouseClicked(MouseEvent e) {
		if(txID==e.getSource()){
			txID.setText("");
		}if(txPW==e.getSource()){
			txPW.setText("");
		}
		
	}


	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
