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

	
//	actionListener���� ����ؾߵż� ���������
	
	JTextArea txLog = new JTextArea();
	JTextField txID ;
//	JTextField txPW ;
	JPasswordField txPW;
	
	String txtID;
	
	MyActionListener myBTListener = new MyActionListener();
	
	public Login(){

		
		BorderLayout mainLayout = new BorderLayout(); //���η��̾ƿ�
		setLayout(mainLayout);
		
		
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc =new GridBagConstraints();
		gbc.fill=GridBagConstraints.NONE;
		Panel center = new Panel();
		center.setLayout(gbl);
	
		Panel north = new Panel(); 

		JButton btnOK ;
		
	    JLabel lbLG = new JLabel("����ε�");
	    north.add(lbLG);
		add(north,BorderLayout.NORTH);
	    
		

	   
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		txID = new JTextField("���̵�",10);
		txID.addMouseListener(this);
		center.add(txID,gbc);
	   
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
//		txPW = new JTextField("��й�ȣ",10);
		txPW = new JPasswordField("��й�ȣ",10);
		txPW.addMouseListener(this);
		txPW.addFocusListener(fl);
		
		center.add(txPW,gbc);
		
		
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		btnOK = new JButton("�α���");
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
			//��Ŀ���� ��й�ȣ�� ���� ���� �����
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
			
			//�̺�Ʈ�� �߻��� ������ ���ڿ��� ���·� ��ȯ
			String name = e.getActionCommand();
			
			//����� ID, PW�� ����� ����
			File dataFile = new File(".\\data\\login.txt");
			
			String readData;
			StringTokenizer st;
			//ID, PW ��ĭ �˻縦 ���� �ʱⰪ ����
			String loginID = "";
			String loginPW = "";
			
			loginID = txID.getText();
			loginPW = txPW.getText();
			
			if(name.equals("�α���")){ //�α��� ����
				
				boolean check = false;
				
				txID.setText("");
				txPW.setText("");
				
				//Login frame���� txID �Ǵ� txPW field�� ��ĭ�̸� 
				if(loginID.equals("") || loginPW.equals("")){
					//id, pw Ȯ���϶�� �޼��� ���̾�α� ���
					JOptionPane.showMessageDialog(null, "���̵� ��й�ȣ�� Ȯ�� �ϼ���","LoginError",
							JOptionPane.ERROR_MESSAGE);
					
				}else{//id, pw ��ĭ�� �ƴ� ��
					
					try {
						BufferedReader br = new BufferedReader(new FileReader(dataFile));
						while((readData= br.readLine())!= null) {//���� ������ null�� �ƴ� ������ ����
							//id, pw ������ @
							st = new StringTokenizer(readData, "@");
						
							txtID = st.nextToken();
							String txtPW = st.nextToken();
							
							if(loginID.equals(txtID) && loginPW.equals(txtPW)){
								//�α��� ���� üũ�� true�� �ٲ�
								check = true; 
								break; 	//while break
							}else{
								check = false;//id , pw ���� ���� ��
							}
						}
						if(check == true){//�������� true��
							setVisible(false);//�α��� ȭ�� ����
							
							LoginListMultiClient.main(new String[] {txtID});
						}else{//������ false
							JOptionPane.showMessageDialog(null,//ID, PW Ȯ���϶�� MessageDialog ���
									"���̵� ��й�ȣ�� Ȯ���ϼ���", "LoginError",
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
