package com.bit.ui;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex07Dialog extends Frame {
	// ���̾�α�
	// ���̾�α� �ڽ��� ����� ���� ��.
	
	public Ex07Dialog() {
		setTitle("�θ�â");
		
		
		
		
		setSize(500,300);
		setLocation(100,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex07Dialog me = new Ex07Dialog();
		
		// �������� �������� ������ ���ڷ� �����.
//		Dialog dia = new Dialog(me);// ���ڷ� ��Ʈ���� ���� �� �װ��� Ÿ��Ʋ����.
// ���ڷ� true of false�� �� �� �ִµ� true�� ��� �ڽ�â�� ���������� �θ�â�� ���� �Ұ�
		
		FileDialog dia = new FileDialog(me,"�ڽ�â",FileDialog.SAVE); //(���Ӵ��,Ÿ��Ʋ,���(0,1))
//			0 = Load  = FileDialog.LOAD
//			1 = Save  = FileDialog.SAVE

//			dia.setTitle("�ڽ�â");
			dia.setSize(300,200);
			dia.setLocation(200, 200);
			dia.setVisible(true);
			// LOAD�� ���
			// ������ ��θ� ������.
			// ��θ� �����ͼ� �о� (read In) IO�� �����.
			System.out.println(dia.getDirectory());
			// SAVE�� ���
			// ������ ��ο��ٰ� ����.
			// ������ ������쿡�� ���� ������쿡�� �����.
			
			// ������ ������.
			System.out.println(dia.getFile());
			
	}

}
