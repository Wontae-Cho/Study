package com.bit.blind.login;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultCaret;

import com.bit.blind.MultiClient;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 스윙으로 구성되어 있으며 메세지를 전송하는 부분이 Evnet 부분에 구형 되어 있다.
 * 클라이언트의 메세지를 청취하기 위해 LoginListMultiClientThread를 사용하고 있다.
 */
public class LoginListMultiClient extends JFrame implements Serializable ,ActionListener {
	
	

	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	GridBagLayout gb  = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	private JPanel imgPanel = new JPanel();
	private ImageIcon opponentImg = resizeImg(".\\data\\blindMainImg.png");
	private JLabel imgLabel = new JLabel(opponentImg);
	private JTextArea imgArea = new JTextArea();
	
	DefaultListModel<String> chatContactListModel = new DefaultListModel<String>();
	JList chatContactList = new JList(chatContactListModel);
	
	
	
	
	private static String ip, id;
	
	//생성자
	public LoginListMultiClient(String ip, String argId){
		setLayout(gb);
		
		gbc.fill = GridBagConstraints.BOTH;
		
		
		
		this.ip =ip;
		this.id = argId;
		
	
		setTitle("Login List");

		setSize(500, 460);
		
		// 사진라벨..
		JLabel lblMessages = new JLabel("사진");
		gbcSetting(0,0,1,1,.4,1.);
		add(new JLabel(),gbc);
		gbcSetting(1,0,2,1,2.0,1.0);
		add(lblMessages,gbc);

		JLabel lblMembers = new JLabel("멤버");
		gbcSetting(3,0,1,1,1.0,1.0);
		add(lblMembers,gbc);
		
		imgPanel.add(imgLabel);
		gbcSetting(0,1,3,5,3.0,5.0);
		add(imgPanel,gbc);
		
		
		chatContactListModel.add(0, "서강준");
		chatContactListModel.add(1, "아이유");
		chatContactListModel.add(2, "수지");
		chatContactListModel.add(3, "김수현");
		
		chatContactList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		gbcSetting(3,1,4,1,4.0,1.0);
		add(chatContactList,gbc);
		gbcSetting(4,1,1,1,1.0,1.0);
		add(new JLabel("khjbkj"),gbc);
		MouseListener mouseListener = new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {
		        if (e.getClickCount() == 2) {
		        	String selectedId = (String) chatContactList.getSelectedValue();
		        	
		        	///채팅요청을 보냄
		        	try {
						oos.writeObject(id+"#request#"+selectedId);
					} catch (IOException e1) {
						//e1.printStackTrace();
					}
		        	
		        }else if(e.getClickCount() == 1) {
		        	String selectedId = (String) chatContactList.getSelectedValue();
		        	if(selectedId.indexOf("(나)")==-1) {
		        		imgLabel.setIcon(resizeImg(".\\picture\\"+selectedId+"_blur.jpg"));
		        	}else {
		        		imgLabel.setIcon(resizeImg(".\\picture\\"+selectedId.substring(0, selectedId.indexOf("(나)"))+".jpg"));
		        	}
		        	
		        	
		        	
		        }
		    }
		};
		chatContactList.addMouseListener(mouseListener);
		
		///종료버튼을 누른 경우
		///oos.writeObject(this.id+"#exit#님이 퇴장하셨습니다.");
		///

		    
		
		

		setVisible(true);
		setResizable(false);
			

	}



	private ImageIcon resizeImg(String string) {
		ImageIcon imageIcon = new ImageIcon(string); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(240, 240,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back 
		return imageIcon;
	}



	private void gbcSetting(int x, int y, int width, int height, double weightX, double weightY) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.weightx = weightX;
		gbc.weighty = weightY;
	
	}



	public static void main(String[] args) throws IOException {
		JFrame.setDefaultLookAndFeelDecorated(true);
		Scanner sc = new Scanner(System.in);
//		String ip = "1.235.65.2";
//		String ip = "localhost";
		String ip = "192.168.0.34";
//		String id = "송해";
//		String id = "아이린";
//		String id = "차은우";
		
		System.out.println(Arrays.toString(args));
		String id = args[0];
		
		LoginListMultiClient mc = new LoginListMultiClient(ip, id);
		mc.init();
		sc.close();

	}


	//정해진 ip로 서버와 연결하고 stream을 초기화, 멀티클라이언트스레드 객체를 생성하고 스레드를 실행함
	public void init() throws  IOException {
		socket = new Socket(ip, 5000);
		System.out.println("connected ...");
		oos = new ObjectOutputStream(socket.getOutputStream());
		ois = new ObjectInputStream(socket.getInputStream());
		LoginListMultiClientThread mct = new LoginListMultiClientThread(this);
		Thread thr = new Thread(mct);
		thr.start();
		oos.writeObject(id+"#enterance#"+id+"님이 입장하셨습니다.");
		
	}
	
				
	public JLabel getImgLabel() {
		return imgLabel;
	}
	
	
	public ObjectInputStream getOis(){
		return ois;
	}
	
	public ObjectOutputStream getOos() {
		return oos;
	} 
	
	
	public String getId(){
		return id;
	}

	public void exit() {
		System.exit(0);
		
	}




	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
