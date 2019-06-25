package com.bit.blind;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;

/**
 * �������� �����Ǿ� ������ �޼����� �����ϴ� �κ��� Evnet �κп� ���� �Ǿ� �ִ�.
 * Ŭ���̾�Ʈ�� �޼����� û���ϱ� ���� MultiClientThread�� ����ϰ� �ִ�.
 */
public class MultiClient implements ActionListener {

	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	//�������� �����ϱ� ���� �� ���۳�Ʈ���� ����
	private JFrame mainJFrame = new JFrame("Blind Chatting");	//������ �ʱ�ȭ
	
	private JPanel selectMainJPanel = new JPanel();
	private JPanel timerImgPanel = new JPanel();
	private JLabel timerJLabel = new JLabel("<html><h1>00:00</h1></html>",JLabel.CENTER);
	private ImageIcon opponentImg = new ImageIcon(".\\data\\main1.png");
	private JLabel opponentImgLabel = new JLabel(opponentImg); 
	private JPanel questSelectPanel;
	private JLabel questionJLabel = new JLabel("<html><h1>* Blind Chatting*</h1></html>",JLabel.CENTER) ;			//������ �����ִ� ta
	
	private JPanel leftRightPanel = new JPanel();
	private JButton leftJBtn = new JButton(new ImageIcon(".\\data\\yes.png"));
	private JButton rightJBtn = new JButton(new ImageIcon(".\\data\\no.png"));		//������ ���� �¿� ��ư
	private ImageIcon greenLightOff = new ImageIcon(".\\data\\greenlight(off).png");
	private ImageIcon greenLightOn = new ImageIcon(".\\data\\greenlight(on).png");
	private JLabel greenLightLabel = new JLabel(greenLightOff);
	private JPanel questionAndLight = new JPanel(new GridBagLayout());
	private GridBagConstraints gbc = new GridBagConstraints();
	

	private JPanel chatMainJPanel = new JPanel();
	private JTextField inputWindowJTF = new JTextField(30);				//30���� ������ ���� tf�� �ʱ�ȭ
	private JTextArea chatWindowJTA = new JTextArea("", 10, 50);		//10�� 50�� ���ڸ� ���� ta�� �ʱ�ȭ
	private JLabel idJLB, ipJLB;
	private JPanel inputJPanel, myInfoJPanel;
	private JButton sendJBtn = new JButton(new ImageIcon(".\\data\\sendImg.png"));
	
	private Color chatColor = new Color(240, 249, 255);
	private Color idColor = new Color(186, 223, 254);
	
	
	
	private String ip, id;
	
	//������
	public MultiClient(String ip, String argId){
		this.ip =ip;
		this.id = argId;
		
		
		mainJFrame.setLayout(new GridLayout(1,2));
		
		
		idJLB = new JLabel("My ID : [["+id+"]]");	//�ڽ��� ���̵带 ǥ���� ��
		ipJLB = new JLabel("IP : "+ ip);
		
		
		////////////////////////////////////
		//â�� ����(���ð� ���õ� �κ�)
		selectMainJPanel.setLayout(new GridLayout(2,1));
		timerImgPanel.setLayout(new BorderLayout());
		timerImgPanel.add(opponentImgLabel);
		timerImgPanel.add(timerJLabel , BorderLayout.NORTH);
		selectMainJPanel.add(timerImgPanel);
		
		questSelectPanel = new JPanel();
		questSelectPanel.setLayout(new GridLayout(2,1));		
		gbcSetting(0, 0, 1, 1, 8.0, 1.0);
		questionAndLight.add(questionJLabel,gbc);
		
		gbcSetting(6, 0, 1, 1, 1.0, 1.0);
		questionAndLight.add(greenLightLabel,gbc);
		questionAndLight.setBackground(Color.white);
		
		///���� �׸�����Ʈ �̹����� �����ؾ��� ��
		greenLightLabel.setEnabled(true);
		questSelectPanel.add(questionAndLight);
		
		
		leftRightPanel.setLayout(new GridLayout(1,2));
		leftRightPanel.add(leftJBtn);
		leftRightPanel.add(rightJBtn);
		leftJBtn.setEnabled(false);
		rightJBtn.setEnabled(false);
		leftJBtn.setPreferredSize(new Dimension(200,200));
		rightJBtn.setPreferredSize(new Dimension(200,200));
		
		questSelectPanel.add(leftRightPanel);	
		selectMainJPanel.add(questSelectPanel);
		
		
		
		
		////////////////////////////////////
		//â�� ������(ä�ð� ���õ� �κ�)
		chatMainJPanel.setLayout(new BorderLayout());
		//��ܿ� Ŭ���̾�Ʈ �ڽ��� id �� ip �� �����ϴ� �κ�
		upSideUiSetting();	
		
		//�߾ӿ� ��ȭ������ ǥ���� ta�� �����ϴ� �κ�
		middleSideUiSetting();
		
		//�ϴܿ� Ŭ���̾�Ʈ�� �Է¿� ��� �� TF�� Button �� �����ϴ� �κ�
		downSideUiSetting();
		
		//���� ������ ������ ���ð� ���õ� ������, ������ ä�ð� ���õ� ������
		mainJFrame.add(selectMainJPanel);
		mainJFrame.add(chatMainJPanel);
		
		
		leftJBtn.addActionListener(this);
		rightJBtn.addActionListener(this);
		inputWindowJTF.addActionListener(this);
		sendJBtn.addActionListener(this);
		
		//������ܿ� �ִ� xǥ�� ��� Ȱ��ȭ
		mainJFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					oos.writeObject(id+"#chat#exit");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
			
			public void windowOpened(WindowEvent e) {
				inputWindowJTF.requestFocus();
			}
		});
		
		chatWindowJTA.setEditable(false);	//ä��â�� ���� ������ ����
		
		Toolkit toolK = Toolkit.getDefaultToolkit();
		Dimension dimen = toolK.getScreenSize();
		int screenH = dimen.height;
		int screenW = dimen.width;
		
		mainJFrame.pack();	//�����ӳ��� ����������Ʈ���� ���̾ƿ��� �µ��� �������� ����� ���ߴ� �۾��̴�.
		mainJFrame.setSize(1000, 800);
		mainJFrame.setLocation((screenW-mainJFrame.getWidth())/2, (screenH -mainJFrame.getHeight())/2);
		mainJFrame.setResizable(false);
		mainJFrame.setVisible(true);		

	}

	





	private void gbcSetting(int x, int y, int width, int height, double weightX, double weightY) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.weightx = weightX;
		gbc.weighty = weightY;
		gbc.fill =1;
	}







	public static void main(String[] args) throws IOException {
		JFrame.setDefaultLookAndFeelDecorated(true);
		Scanner sc = new Scanner(System.in);
//		String ip = "1.235.65.2";
		String ip = "192.168.0.34";
//		String ip = "localhost";
//		String id = "������";
//		String id = "���̸�";
		String id = args[0];
		
		MultiClient mc = new MultiClient(ip, id);
		mc.init();
		sc.close();

	}


	//������ ip�� ������ �����ϰ� stream�� �ʱ�ȭ, ��ƼŬ���̾�Ʈ������ ��ü�� �����ϰ� �����带 ������
	public void init() throws  IOException {
		socket = new Socket(ip, 5001);
		System.out.println("connected ...");
		oos = new ObjectOutputStream(socket.getOutputStream());
		ois = new ObjectInputStream(socket.getInputStream());
		MultiClientThread mct = new MultiClientThread(this);
		Thread thr = new Thread(mct);
		thr.start();
		oos.writeObject(id+"#enterance#"+id+"���� �����ϼ̽��ϴ�.");
		
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String msg = inputWindowJTF.getText();
		
		//�Է�â tf���� �׼��� �Ͼ����
		if(obj ==inputWindowJTF){
			//�Է�â�� ���� ������ �����ϴ� �޼���
			onActionInputWindow(msg);
		}else if(obj == sendJBtn){//�����ư�� ��������
			//���� ��ư�� �������� �����ϴ� �޼���
			onActionSendJBtn();
		}else if(obj == leftJBtn || obj ==rightJBtn) {	//������ ���� ��ư�� ���� ���
			//���ù�ư�� �������� �����ϴ� �޼���
			onActionSelectJBtn(obj == leftJBtn);
			
		}
	}
	
	//���ù�ư�� �������� �����ϴ� �޼���
	public void onActionSelectJBtn(boolean isLeft) {
		//� �޼����� ��������
		String zeroOne;
		if(isLeft){
			zeroOne = "0";
		}else{
			zeroOne = "1";
		}
		try {
			oos.writeObject(id+"#ans#"+zeroOne);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//�亯�� �ٲ� �� ������ ��Ȱ��ȭ ��Ŵ
		leftJBtn.setEnabled(false);
		rightJBtn.setEnabled(false);
	}

	//���� ��ư�� �������� �����ϴ� �޼���
	public void onActionSendJBtn() {
		onActionInputWindow(inputWindowJTF.getText());
	}

	public void onActionInputWindow(String msg) {
		if(msg==null || msg.length() ==0){//tf�� ������ ���� ���
			//���â ���
			JOptionPane.showMessageDialog(mainJFrame, "���� ���ÿ�","���",JOptionPane.WARNING_MESSAGE);
		}else{//tf�� ������ �ִ� ���
			try {
				//msg�� ����
				oos.writeObject(id+"#chat#"+msg);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			//������ �ۼ��� ���� ����
			inputWindowJTF.setText("");
		}	
	}

	//��ܿ� Ŭ���̾�Ʈ �ڽ��� id �� ip �� �����ϴ� �κ�
	public void upSideUiSetting() {
		myInfoJPanel = new JPanel();
		myInfoJPanel.setBackground(idColor);
		myInfoJPanel.setLayout(new BorderLayout());
		myInfoJPanel.add(idJLB, BorderLayout.CENTER);
		myInfoJPanel.add(ipJLB, BorderLayout.EAST);
		chatMainJPanel.add(myInfoJPanel, BorderLayout.NORTH);
		
	}	
		
	//�߾ӿ� ��ȭ������ ǥ���� ta�� �����ϴ� �κ�
	public void middleSideUiSetting() {
		chatWindowJTA.setBackground(chatColor);
		
		//TA�� ������ ���� á���� ��ũ���� �ڵ����� �Ʒ��� �������� ��
		DefaultCaret caret = (DefaultCaret)chatWindowJTA.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		
		//ä��â ta�� �������δ� �����̰�, �������δ� �������� �ʰ��Ѵ�.
		JScrollPane jsp = new JScrollPane(chatWindowJTA, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatMainJPanel.add(jsp, BorderLayout.CENTER);
		
	}			
		
	//�ϴܿ� Ŭ���̾�Ʈ�� �Է¿� ��� �� tf�� btn �� �����ϴ� �κ�
	public void downSideUiSetting() {
		inputJPanel = new JPanel();
		inputJPanel.setBackground(Color.YELLOW);
		inputJPanel.setLayout(new BorderLayout());
		sendJBtn.setPreferredSize(new Dimension(30,30));
		inputJPanel.add(sendJBtn, BorderLayout.EAST);
		inputJPanel.add(inputWindowJTF, BorderLayout.CENTER);
		chatMainJPanel.add(inputJPanel, BorderLayout.SOUTH);	
	}			
	
	public ObjectInputStream getOis(){
		return ois;
	}
	
	public ObjectOutputStream getOos() {
		return oos;
	} 
	
	public  JTextArea getchatWindowJTA(){
		return chatWindowJTA;
	}
	
	public String getId(){
		return id;
	}

	public void exit() {
		System.exit(0);
		
	}

	public JLabel getTimerJLabel() {
		return timerJLabel;
	}

	public void setQuestionJLabel(String q){
		questionJLabel.setText(q);
	}
	
	public JTextField getInputWindowJTF() {
		return inputWindowJTF;
	}
	public JButton getRightJBtn() {
		return rightJBtn;
	}
	public JButton getLeftJBtn() {
		return leftJBtn;
	}
	
	public JLabel getOpponentImgLabel() {
		return this.opponentImgLabel;
	}
	public ImageIcon getOpponentImg() {
		return opponentImg;
	}



	public void setOpponentImg(ImageIcon opponentImg) {
		this.opponentImg = opponentImg;
	}



	public void setOpponentImgLabel(JLabel opponentImgLabel) {
		this.opponentImgLabel = opponentImgLabel;
	}
	public JPanel getTimerImgPanel() {
		return timerImgPanel;
	}
	
	public JLabel getGreenLightLabel(){
		return this.greenLightLabel;
	}
}