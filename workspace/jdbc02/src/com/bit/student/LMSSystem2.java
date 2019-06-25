package com.bit.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class LMSSystem2 {
	/*
	 * ---------------------------------------------------
	 * �����������α׷�(ver 0.5.1)
	 * ---------------------------------------------------
	 * 1. �л���� 2. �л����� 3.�л�����
	 * 4. �������� 5. �����Է� 6.�������� 0.����>
	 * ��� (�й�,�̸�)
	 * ���� (�й�,����,����,����)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("�����������α׷�(ver 0.5.1)");
		System.out.println("--------------------------------------");
		String input = null;
		//�й� - �����ͺ��̽��κ��� �޾Ƴ�����.
		int stunum = 0;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		// id�� pw�Է��� �ʿ�� ��
		Properties prop = new Properties();
		prop.put("user", id);
		prop.put("password", pw);
		// ����̹� �ε�
		OracleDriver driver = new OracleDriver();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// ����
		while(true){
			System.out.print("1. �л���� 2. �л����� 3.�л�����\n 4. �������� 5. �����Է� 6.�������� 0.���� > ");
			input = sc.nextLine();
			// ����
			if(input.equals("0")){break;}
			// �л����
			if(input.equals("1")){
				// �����ͺ��̽��κ��� �й��� �ƽ��� +1 �� �޾ƿ;���
				// ó�� ����� ������ �� �� ����. ���� null �϶� 0���� �����ؾ���.
				// select max(num) from student01;
				String enrollsql = "select nvl(max(stunum),0)+1 from student";
				// nullvalue = 1�̰� �ƴҶ��� max(num)+1�� ��.
				try {
					conn = DriverManager.getConnection(url,prop);
					// conn = DriverManager.getConnection("jdbc:oracle:thin:scott/tiger@localhost:1521:xe");
					// getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "scott", "tiger");
					stmt = conn.createStatement();
					rs = stmt.executeQuery(enrollsql);
					// Ŀ���� �ű��
					rs.next();
					stunum = rs.getInt(1);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}finally{
					try {
						if(rs!=null){rs.close();}
						if(stmt!=null){stmt.close();}
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				// �й��Է�
				System.out.print("�й� > ");
				input = sc.nextLine();
				stunum = Integer.parseInt(input);
				// �̸��Է�
				System.out.print("�̸� > ");
				String stuname = sc.nextLine();
				String sql = "insert into student (stunum,stuname) values(";
				sql+=stunum+",'"+stuname+"')";
				try {
					conn=DriverManager.getConnection(url,prop);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					try {
						if(stmt!=null){stmt.close();}
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			// �л�����
			}else if(input.equals("2")){
				//������ �������� .. �й�
				System.out.print("�й� > ");
				input=sc.nextLine();
				// input �¿��� ������ �߶���.
				input = input.trim(); 
				int target = 0;
				try{
					target = Integer.parseInt(input);
				}catch(java.lang.NumberFormatException e){
					System.out.println("�Է��� �߸��Ǿ����ϴ�");
					continue;
				}
				int result = 0;
				String parentsSql="delete from student where stunum = "+target;
				String childSql = "delete from studentscore where num="+target;
				try {
					conn=DriverManager.getConnection(url,prop);
					stmt = conn.createStatement();
					stmt.executeUpdate(childSql);
					result = stmt.executeUpdate(parentsSql);
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					try {
						if(stmt!=null){stmt.close();}
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(result>0){
					System.out.println("�����Ǿ����ϴ�.");
				}else{
					System.out.println("\t���������ʽ��ϴ�.");
				}
			// �л�����
			}else if(input.equals("3")){
				System.out.println("--------------------------------------");
				System.out.println("�й�\t�̸�");
				System.out.println("--------------------------------------");
				String showsql = "select * from student order by stunum asc";
				try {
					conn=DriverManager.getConnection(url,prop);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(showsql);
					// rs.next()�� Ʈ���� ��츸 �ϸ� �Ǵϱ�
					while(rs.next()){
						System.out.print(rs.getInt(1)+"\t"); //�й�
						System.out.println(rs.getString(2)); //�̸�
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					try {
						if(rs!=null){rs.close();}
						if(stmt!=null){stmt.close();}
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			// ��������
			}else if(input.equals("4")){
				System.out.print("�й� > ");
				input=sc.nextLine();
				// input �¿��� ������ �߶���.
				input = input.trim();
				try{
					stunum = Integer.parseInt(input);
				}catch(java.lang.NumberFormatException e){
					System.out.println("�Է��� �߸��Ǿ����ϴ�");
					continue;
				}
				System.out.println("--------------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("--------------------------------------");
				String showsql = "select * from studentscore where num ="+stunum;
				try {
					conn=DriverManager.getConnection(url,prop);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(showsql);
					// rs.next()�� Ʈ���� ��츸 �ϸ� �Ǵϱ�
					while(rs.next()){
						System.out.print(rs.getInt(1)+"\t"); //�й�
						System.out.print(rs.getInt(2)+"\t"); //����
						System.out.print(rs.getInt(3)+"\t"); //����
						System.out.println(rs.getInt(4)); //����
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					try {
						if(rs!=null){rs.close();}
						if(stmt!=null){stmt.close();}
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			// �����Է�
			}else if(input.equals("5")){
				// �й��� �����ͼ� �װ��� student ���̺��� �ִ� ������ Ȯ���ؾ���.
				// ������ ������ �Է�����.. �й�
				System.out.print("�й� > ");
				input=sc.nextLine();
				// input �¿��� ������ �߶���.
				input = input.trim();
				try{
					stunum = Integer.parseInt(input);
				}catch(java.lang.NumberFormatException e){
					System.out.println("�Է��� �߸��Ǿ����ϴ�");
					continue;
				}
				// ���������Է�
				System.out.print("���� > ");
				input = sc.nextLine();
				int kor = Integer.parseInt(input);
				// ���������Է�
				System.out.print("���� > ");
				input = sc.nextLine();
				int eng = Integer.parseInt(input);
				// ���������Է�
				System.out.print("���� > ");
				input = sc.nextLine();
				int math = Integer.parseInt(input);
				String sql = "insert into studentscore (num,kor,eng,math) values(";
				sql+=stunum+","+kor+","+eng+","+math+")";
				try {
					conn=DriverManager.getConnection(url,prop);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
				} catch (SQLException e) {
//					e.printStackTrace();
					System.out.println("�ش��й��� ���������ʾ� !! ");
				} finally{
					try {
						if(stmt!=null){stmt.close();}
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			// ��������
			}else if(input.equals("6")){
				// ������ �������� .. �й�
				System.out.print("�й� > ");
				input = sc.nextLine();
				int target = Integer.parseInt(input);
				int result = 0;
				// ���������Է�
				System.out.print("���� > ");
				input = sc.nextLine();
				int kor = Integer.parseInt(input);
				// ���������Է�
				System.out.print("���� > ");
				input = sc.nextLine();
				int eng = Integer.parseInt(input);
				// ���������Է�
				System.out.print("���� > ");
				input = sc.nextLine();
				int math = Integer.parseInt(input);
				String sql = "update studentscore set kor=";
				sql += kor+",eng="+eng+",math="+math+" where num="+target;
				try {
					conn = DriverManager.getConnection(url,id,pw);
					stmt = conn.createStatement();
					result = stmt.executeUpdate(sql);
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						if(stmt!=null){stmt.close();}
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(result>0){
					System.out.println("�����Ϸ�");
				}else{
					System.out.println("\tErr)��������");
				}
			}else{
				System.out.println("�޴��� �ٽ� Ȯ���Ͻð� �Է����ּ���.");
			}
		}
		System.out.println("�̿����ּż� �����մϴ�.");
	}
}