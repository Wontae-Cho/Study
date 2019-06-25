package com.bit.project;

import java.io.IOException;

public class JMultiClientThread extends Thread {
	private JMultiClient mc;

	public JMultiClientThread(JMultiClient mc) {
		this.mc = mc;
	}

	public void run() {
		String message = null;
		String[] receivedMsg = null;
		boolean isStop = false;
		while (!isStop) {

			try {
				message = (String) mc.getOis().readObject();
				receivedMsg = message.split("#");
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
				isStop = true;
			}
			System.out.println(receivedMsg[0]+","+receivedMsg[1]);
			if(receivedMsg[1].equals("exit")){
				if(receivedMsg[0].equals(mc.getId())){
					mc.exit();
				}else{
					mc.getJta().append(receivedMsg[0] +"¥‘¿Ã ¡æ∑· «œºÃΩ¿¥œ¥Ÿ."+	System.getProperty("line.separator"));
					mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
				}
			}else{
				mc.getJta().append(receivedMsg[0] + ": "+receivedMsg[1]+System.getProperty("line.separator"));
				mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
			}

		}

	}

}
