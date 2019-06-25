package com.bit.am;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02Lec {

	public static void main(String[] args) {
		String input = "C:\\java\\eclipse\\workspace\\java19\\";
		File file = new File(input);
		if (file.exists()) {
			if (file.isDirectory()) {
				String[] item = file.list();
				for (int i = 0; i < item.length; i++) {
					String target = item[i];
					File temp = new File(target);
					long time = temp.lastModified();
					Date date = new Date(time);
					SimpleDateFormat sdf = null;
					sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
					System.out.print(sdf.format(date)+"\t");
					if(temp.isFile()){
						System.out.print("\t"+temp.length());
					}else{
						System.out.print("<DIR>\t");
					}
					System.out.println("\t"+temp.getName());
				}
			} else {
				Date date = new Date(file.lastModified());
				SimpleDateFormat sdf = null;
				sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
				System.out.print(sdf.format(date)+"\t");
				System.out.print("\t"+file.length());
				System.out.println(file.getName());
			}

		} else {
			System.out.println("경로를 다시 확인해주세요");
		}

	}
}
