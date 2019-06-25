package com.bit.ui;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex07Dialog extends Frame {
	// 다이얼로그
	// 다이얼로그 박스를 상당히 많이 씀.
	
	public Ex07Dialog() {
		setTitle("부모창");
		
		
		
		
		setSize(500,300);
		setLocation(100,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex07Dialog me = new Ex07Dialog();
		
		// 누구에게 종속적인 것인지 인자로 줘야함.
//		Dialog dia = new Dialog(me);// 인자로 스트링을 넣을 시 그것을 타이틀로함.
// 인자로 true of false가 올 수 있는데 true일 경우 자식창이 꺼지기전에 부모창에 접근 불가
		
		FileDialog dia = new FileDialog(me,"자식창",FileDialog.SAVE); //(종속대상,타이틀,모드(0,1))
//			0 = Load  = FileDialog.LOAD
//			1 = Save  = FileDialog.SAVE

//			dia.setTitle("자식창");
			dia.setSize(300,200);
			dia.setLocation(200, 200);
			dia.setVisible(true);
			// LOAD의 경우
			// 파일의 경로를 가져옴.
			// 경로를 가져와서 읽어 (read In) IO가 적용됨.
			System.out.println(dia.getDirectory());
			// SAVE의 경우
			// 파일의 경로에다가 쓰기.
			// 파일이 있을경우에는 쓰고 없을경우에는 만들기.
			
			// 파일을 가져옴.
			System.out.println(dia.getFile());
			
	}

}
