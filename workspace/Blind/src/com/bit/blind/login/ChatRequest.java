package com.bit.blind.login;

// 서버와 연결.
import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
 
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

import com.bit.blind.MultiClient;
 
public class ChatRequest extends JDialog {
	static JButton acceptBtn = new JButton("수 락");
	static JButton declineBtn = new JButton("거 절");
	static private LoginListMultiClient llmc; 
	static private String opponentId;
 
    private static final long serialVersionUID = 1L;
 
    public ChatRequest(String opponentId,LoginListMultiClient llmc) {
    	this.llmc = llmc;
    	this.opponentId = opponentId;
        setTitle("Blind Chatting");
        System.out.println("creating the window..");
        // set the position of the window
        Point p = new Point(400, 400);
        setLocation(p.x, p.y);
 
        // Create a message
        JPanel messagePanel = new JPanel();
        messagePanel.add(new JLabel("<html>"+opponentId+"님이 1:1 대화를 요청하셨습니다. <br/>수락하시겠습니까?</html>",JLabel.CENTER));
        // get content pane, which is usually the
        // Container of all the dialog's components.
        getContentPane().add(messagePanel);
 
        // Create a button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(acceptBtn);
        buttonPanel.add(declineBtn);
        // set action listener on the button
        acceptBtn.addActionListener(new MyActionListener());
        declineBtn.addActionListener(new MyActionListener());
        getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setSize(300, 150);
        setVisible(true);
    }
 
    // override the createRootPane inherited by the JDialog, to create the rootPane.
    // create functionality to close the window when "Escape" button is pressed
    public JRootPane createRootPane() {
        JRootPane rootPane = new JRootPane();
        KeyStroke stroke = KeyStroke.getKeyStroke("ESCAPE");
        Action action = new AbstractAction() {
             
            private static final long serialVersionUID = 1L;
 
            public void actionPerformed(ActionEvent e) {
                System.out.println("escaping..");
                setVisible(false);
                dispose();
            }
        };
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(stroke, "ESCAPE");
        rootPane.getActionMap().put("ESCAPE", action);
        return rootPane;
    }
 
    // an action listener to be used when an action is performed
    // (e.g. button is pressed)
    class MyActionListener implements ActionListener {
 
        //close and dispose of the window.
        public synchronized void actionPerformed(ActionEvent e) {
        	if(e.getSource() == declineBtn){
        		 System.out.println("거절 확인 메세지...");
        		 /// 거절메세지 보내기.
        		 try {
					llmc.getOos().writeObject(llmc.getId()+"#request#"+opponentId+"#decline");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
                 setVisible(false);
                 dispose();
                 
        	}
        	else{
        		System.out.println("수락 확인 메세지");
        		/// 수락메세지 보내기.
        		 try {
 					llmc.getOos().writeObject(llmc.getId()+"#request#"+opponentId+"#accept");
 					MultiClient.main(new String[] {llmc.getId()});
 				} catch (IOException e1) {
 					e1.printStackTrace();
 				}
                  setVisible(false);
                  dispose();
                  
        	}
           
        }
    }
 
    public static void main(String[] a) {
    	ChatRequest dialog = new ChatRequest("서강준",new LoginListMultiClient("localhost", "아이린"));
        // set the size of the window
        
    }
}