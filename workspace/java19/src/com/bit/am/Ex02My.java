package com.bit.am;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;





//C:\java\eclipse\io>dir
// C 드라이브의 볼륨: 취업반
// 볼륨 일련 번호: 7695-1B3B
//
// C:\java\eclipse\io 디렉터리
//
//2019-04-22  오전 09:47    <DIR>          .
//2019-04-22  오전 09:47    <DIR>          ..
//2019-04-22  오전 09:47    <DIR>          directory
//2019-04-22  오전 10:53                15 testfile1.txt
//               1개 파일                  15 바이트
//               3개 디렉터리  78,892,220,416 바이트


public class Ex02My {


	public static void main(String[] args) {
		String filepath = "C:\\java\\eclipse\\workspace\\java19";
		java.io.File java19 = new File(filepath);
		
		String[] javapath = java19.list();
		for(int i=0; i<javapath.length; i++){
			int dir =0;
			int fil = 0;
			long time = java19.lastModified(); //수정시간.
			Date date = new Date(time); //시간을 알아내고
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm"+"\t");
			String filepath1 = filepath +"\\"+javapath[i];
			File file = new File(filepath1);
			System.out.print(sdf.format(date));
			if(file.isDirectory()){ //디렉토리인지 확인.
				System.out.print("<DIR>"+"\t");
				System.out.println(file.getName());
				dir++;
			}else{ //false = file일 경우
				System.out.print(file.length());
				System.out.println(file.getName());
				fil++;
			}
//			System.out.println(sdf.format(date) + javapath[i]);
		}

	}

}
