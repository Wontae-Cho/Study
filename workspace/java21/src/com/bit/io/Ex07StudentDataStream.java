package com.bit.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex07StudentDataStream {

	public static void main(String[] args) {
		File file = new File(".\\files\\data.obj");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------------------------------");
		System.out.println("학생성적관리프로그램(ver 0.3.0)-DataStream");
		System.out.println("---------------------------------------------");
		String input = null;
		InputStream is = System.in; // is에 스캐너를 부여함.
		FileInputStream fis = null;
		DataInputStream dis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		isr = new InputStreamReader(is);
		br = new BufferedReader(isr);

		int num = 20190001;
		try {
			while (true) {
				System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
				input = br.readLine();
				if ("0".equals(input)) {
					break;
				}
				if ("2".equals(input)) {
					List<Integer> list = new ArrayList<Integer>();
					try {
						fis = new FileInputStream(file);
						dis = new DataInputStream(fis);
//						while (true) {
//							int su = dis.read();
//							if (su == -1) {
//								break;
//							}
//							list.add(dis.readInt());// 4byte - 학번
//							list.add(dis.readInt());// 4byte - 국어
//							list.add(dis.readInt());// 4byte - 영어
//							list.add(dis.readInt());// 4byte - 수학
//
//						}
						fos = new FileOutputStream(file,true); //boolean값을 주면 append
						dos = new DataOutputStream(fos);
//						for (int i = 0; i < list.size(); i++) {
//							if (i % 5 == 0) {
//								dos.write(1);
//							}else{
//								dos.writeInt(list.get(i));
//							}
//						}
						dos.flush();
						dos.write(1); // 데이터를 구분하기 위한 1바이트
						dos.writeInt(num++);
						System.out.print("국어>");
						input = br.readLine();
						dos.writeInt(Integer.parseInt(input));
						System.out.print("영어>");
						input = br.readLine();
						dos.writeInt(Integer.parseInt(input));
						System.out.print("수학>");
						input = br.readLine();
						dos.writeInt(Integer.parseInt(input));
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (dis != null) {
								dis.close();
							}
							if (dos != null) {
								dos.close();
							}
							if (fis != null) {
								fis.close();
							}
							if (fos != null) {
								fos.close();
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} else if ("1".equals(input)) {
					System.out
							.println("---------------------------------------------");
					System.out.println("학번\t국어\t영어\t수학");
					System.out
							.println("---------------------------------------------");
					try {
						fis = new FileInputStream(file);
						dis = new DataInputStream(fis);

						while (true) {
							int su = dis.read();
							if (su == -1) {
								break;
							}
							int num1 = dis.readInt();
							int kor1 = dis.readInt();
							int eng1 = dis.readInt();
							int math1 = dis.readInt();
							System.out.println(num1 + "\t" + kor1 + "\t" + eng1
									+ "\t" + math1);
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (dis != null) {
								dis.close();
							}
							if (fis != null) {
								fis.close();
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (isr != null) {
					isr.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("이용해주셔서 감사합니다.");
		}
	}
}
