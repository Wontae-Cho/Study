package com.bit.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex08Student {
	static List<int[]> list = new ArrayList<int[]>();

	static File file = new File(".\\files\\data.obj");

	public static void main(String[] args) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// �ִ� ������ �о����.
		InputStream is = null;
		DataInputStream dis = null;

		try {
			is = new FileInputStream(file);
			dis = new DataInputStream(is);
			while (true) {
				int su = dis.read();
				if (su == -1) {
					break;
				}
				int[] stu = new int[4];
				stu[0] = dis.readInt();
				stu[1] = dis.readInt();
				stu[2] = dis.readInt();
				stu[3] = dis.readInt();
				list.add(stu);
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (dis != null) {
					dis.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------------------");
		System.out.println("�л������������α׷�(ver 0.3.0)");
		System.out.println("---------------------------------------------");
		String input = null;
		int num = 201900; // �й�.

		if (!list.isEmpty()) { // list�� ������� �ʴٸ�.
			int lastIdx = list.size() - 1;
			int[] stu = list.get(lastIdx);
			num = stu[0];
		}

		while (true) {
			System.out.print("1.���� 2.�Է� 0.����>");
			input = sc.nextLine();
			if ("0".equals(input)) {
				break;
			}
			if ("2".equals(input)) {

				int[] stu = new int[4];
				stu[0] = ++num;
				System.out.print("����>");
				input = sc.nextLine();
				stu[1] = Integer.parseInt(input);
				System.out.print("����>");
				input = sc.nextLine();
				stu[2] = Integer.parseInt(input);
				System.out.print("����>");
				input = sc.nextLine();
				stu[3] = Integer.parseInt(input);
				list.add(stu);
				
			} else if ("1".equals(input)) {
				System.out
						.println("---------------------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out
						.println("---------------------------------------------");
				for (int i = 0; i < list.size(); i++) {
					int[] stu = list.get(i);
					System.out.println(stu[0] + "\t" + stu[1] + "\t" + stu[2]
							+ "\t" + stu[3]);
				}
			} else if ("3".equals(input)) {
				System.out.println("����Ǿ����ϴ�.");
				save();
			}// if end
		}// while end
			// �ڷᱸ���� ��� �ִ°͵��� ����.(����)
		save();
		System.out.println("�̿����ּż� �����մϴ�.");

	}// main end

	public static void save() {
		OutputStream os = null;
		DataOutputStream dos = null;

		try {
			os = new FileOutputStream(file);
			dos = new DataOutputStream(os);
			for (int i = 0; i < list.size(); i++) {
				dos.write(1); // �˻�� �л��� ������ ���� ���� �տ� 1����Ʈ�� �ٴ´�.
				int[] stu = list.get(i);
				dos.writeInt(stu[0]);
				dos.writeInt(stu[1]);
				dos.writeInt(stu[2]);
				dos.writeInt(stu[3]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) {
					dos.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}// class end
