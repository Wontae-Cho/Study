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
 * 스윙으로 구성되어 있으며 메세지를 전송하는 부분이 Evnet 부분에 구형 되어 있다.
 * 클라이언트의 메세지를 청취하기 위해 MultiClientThread를 사용하고 있다.
 */
public class MultiClient implements ActionListener {

	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	//프레임을 제어하기 위해 각 컴퍼넌트들을 빼줌
	private JFrame mainJFrame = new JFrame("Blind Chatting");	//프레임 초기화
	
	private JPanel selectMainJPanel = new JPanel();
	private JPanel timerImgPanel = new JPanel();
	private JLabel timerJLabel = new JLabel("<html><h1>00:00</h1></html>",JLabel.CENTER);
	private ImageIcon opponentImg = new ImageIcon(".\\data\\main1.png");
	private JLabel opponentImgLabel = new JLabel(opponentImg); 
	private JPanel questSelectPanel;
	private JLabel questionJLabel = new JLabel("<html><h1>* Blind Chatting*</h1></html>",JLabel.CENTER) ;			//질문을 보여주는 ta
	
	private JPanel leftRightPanel = new JPanel();
	private JButton leftJBtn = new JButton(new ImageIcon(".\\data\\yes.png"));
	private JButton rightJBtn = new JButton(new ImageIcon(".\\data\\no.png"));		//질문에 답할 좌우 버튼
	private ImageIcon greenLightOff = new ImageIcon(".\\data\\greenlight(off).png");
	private ImageIcon greenLightOn = new ImageIcon(".\\data\\greenlight(on).png");
	private JLabel greenLightLabel = new JLabel(greenLightOff);
	private JPanel questionAndLight = new JPanel(new GridBagLayout());
	private GridBagConstraints gbc = new GridBagConstraints();
	

	private JPanel chatMainJPanel = new JPanel();
	private JTextField inputWindowJTF = new JTextField(30);				//30글자 간격을 가진 tf로 초기화
	private JTextArea chatWindowJTA = new JTextArea("", 10, 50);		//10행 50열 글자를 가진 ta로 초기화
	private JLabel idJLB, ipJLB;
	private JPanel inputJPanel, myInfoJPanel;
	private JButton sendJBtn = new JButton(new ImageIcon(".\\data\\sendImg.png"));
	
	private Color chatColor = new Color(240, 249, 255);
	private Color idColor = new Color(186, 223, 254);
	
	
	
	private String ip, id;
	
	//생성자
	public MultiClient(String ip, String argId){
		this.ip =ip;
		this.id = argId;
		
		
		mainJFrame.setLayout(new GridLayout(1,2));
		
		
		idJLB = new JLabel("My ID : [["+id+"]]");	//자신의 아이드를 표시할 라벨
		ipJLB = new JLabel("IP : "+ ip);
		
		
		////////////////////////////////////
		//창의 왼쪽(선택과 관련된 부분)
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
		
		///꺼진 그린라이트 이미지를 세팅해야할 곳
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
		//창의 오른쪽(채팅과 관련된 부분)
		chatMainJPanel.setLayout(new BorderLayout());
		//상단에 클라이언트 자신의 id 와 ip 를 관리하는 부분
		upSideUiSetting();	
		
		//중앙에 대화내용을 표시할 ta를 관리하는 부분
		middleSideUiSetting();
		
		//하단에 클라이언트가 입력에 사용 할 TF와 Button 을 관리하는 부분
		downSideUiSetting();
		
		//메인 프레임 좌측엔 선택과 관련된 내용을, 우측엔 채팅과 관련된 내용을
		mainJFrame.add(selectMainJPanel);
		mainJFrame.add(chatMainJPanel);
		
		
		leftJBtn.addActionListener(this);
		rightJBtn.addActionListener(this);
		inputWindowJTF.addActionListener(this);
		sendJBtn.addActionListener(this);
		
		//우측상단에 있는 x표시 기능 활성화
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
		
		chatWindowJTA.setEditable(false);	//채팅창에 직접 접근을 막음
		
		Toolkit toolK = Toolkit.getDefaultToolkit();
		Dimension dimen = toolK.getScreenSize();
		int screenH = dimen.height;
		int screenW = dimen.width;
		
		mainJFrame.pack();	//프레임내에 서브컴포넌트들의 레이아웃에 맞도록 윈도우의 사이즈를 맞추는 작업이다.
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
//		String id = "서강준";
//		String id = "아이린";
		String id = args[0];
		
		MultiClient mc = new MultiClient(ip, id);
		mc.init();
		sc.close();

	}


	//정해진 ip로 서버와 연결하고 stream을 초기화, 멀티클라이언트스레드 객체를 생성하고 스레드를 실행함
	public void init() throws  IOException {
		socket = new Socket(ip, 5001);
		System.out.println("connected ...");
		oos = new ObjectOutputStream(socket.getOutputStream());
		ois = new ObjectInputStream(socket.getInputStream());
		MultiClientThread mct = new MultiClientThread(this);
		Thread thr = new Thread(mct);
		thr.start();
		oos.writeObject(id+"#enterance#"+id+"님이 입장하셨습니다.");
		
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String msg = inputWindowJTF.getText();
		
		//입력창 tf에서 액션이 일어났을때
		if(obj ==inputWindowJTF){
			//입력창의 동작 했을때 제어하는 메서드
			onActionInputWindow(msg);
		}else if(obj == sendJBtn){//종료버튼을 눌렀을때
			//종료 버튼을 눌렀을때 제어하는 메서드
			onActionSendJBtn();
		}else if(obj == leftJBtn || obj ==rightJBtn) {	//문제에 대해 버튼을 누른 경우
			//선택버튼을 눌렀을때 제어하는 메서드
			onActionSelectJBtn(obj == leftJBtn);
			
		}
	}
	
	//선택버튼을 눌렀을때 제어하는 메서드
	public void onActionSelectJBtn(boolean isLeft) {
		//어떤 메세지를 쓸것인지
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
		
		//답변을 바꿀 수 없도록 비활성화 시킴
		leftJBtn.setEnabled(false);
		rightJBtn.setEnabled(false);
	}

	//종료 버튼을 눌렀을때 제어하는 메서드
	public void onActionSendJBtn() {
		onActionInputWindow(inputWindowJTF.getText());
	}

	public void onActionInputWindow(String msg) {
		if(msg==null || msg.length() ==0){//tf의 내용이 없는 경우
			//경고창 출력
			JOptionPane.showMessageDialog(mainJFrame, "글을 쓰시오","경고",JOptionPane.WARNING_MESSAGE);
		}else{//tf의 내용이 있는 경우
			try {
				//msg를 전송
				oos.writeObject(id+"#chat#"+msg);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			//이전에 작성된 글을 삭제
			inputWindowJTF.setText("");
		}	
	}

	//상단에 클라이언트 자신의 id 와 ip 를 관리하는 부분
	public void upSideUiSetting() {
		myInfoJPanel = new JPanel();
		myInfoJPanel.setBackground(idColor);
		myInfoJPanel.setLayout(new BorderLayout());
		myInfoJPanel.add(idJLB, BorderLayout.CENTER);
		myInfoJPanel.add(ipJLB, BorderLayout.EAST);
		chatMainJPanel.add(myInfoJPanel, BorderLayout.NORTH);
		
	}	
		
	//중앙에 대화내용을 표시할 ta를 관리하는 부분
	public void middleSideUiSetting() {
		chatWindowJTA.setBackground(chatColor);
		
		//TA의 내용이 가득 찼을때 스크롤이 자동으로 아래로 내려가게 함
		DefaultCaret caret = (DefaultCaret)chatWindowJTA.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		
		//채팅창 ta는 수직으로는 움직이고, 수평으로는 움직이지 않게한다.
		JScrollPane jsp = new JScrollPane(chatWindowJTA, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatMainJPanel.add(jsp, BorderLayout.CENTER);
		
	}			
		
	//하단에 클라이언트가 입력에 사용 할 tf와 btn 을 관리하는 부분
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
