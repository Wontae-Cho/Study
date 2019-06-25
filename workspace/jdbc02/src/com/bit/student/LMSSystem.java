package com.bit.student;

import java.util.Properties;
import java.util.Scanner;
// java sql�� *�� ����Ʈ
import java.sql.*;

import oracle.jdbc.driver.OracleDriver;

public class LMSSystem {

	public static void main(String[] args) {
		// �����������α׷� (ver 0.5.0)
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("�����������α׷� (ver 0.5.0)");
		System.out.println("--------------------------------------");
		
		String input = null;
		//�й� - �����ͺ��̽��κ��� �޾Ƴ�����.
		int num = 0;
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
		
		while(true){
			System.out.print("1.���� 2.������� 3.�������� 4.���� 0.���� > ");
			input = sc.nextLine();
			// ����
			if(input.equals("0")){break;}
			// �������
			if(input.equals("2")){
				// �����ͺ��̽� ���� ���
				
				
				// �����ͺ��̽��κ��� �й��� �ƽ��� +1 �� �޾ƿ;���
				// ó�� ����� ������ �� �� ����. ���� null �϶� 0���� �����ؾ���.
				// select max(num) from student01;
				String sql2 = "select nvl(max(num),0)+1 from student01";
				// nullvalue = 1�̰� �ƴҶ��� max(num)+1�� ��.
				
				try {
					conn = DriverManager.getConnection(url,prop);
					// conn = DriverManager.getConnection("jdbc:oracle:thin:scott/tiger@localhost:1521:xe");
					// getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "scott", "tiger");
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql2);
					// Ŀ���� �ű��
					rs.next();
					num = rs.getInt(1);
					
					
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
				
				String sql = "insert into student01 (num,kor,eng,math) values(";
				sql+=num+","+kor+","+eng+","+math+")";
				
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
				
				
				
			// ��������
			}else if(input.equals("1")){
				System.out.println("--------------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("--------------------------------------");
				String sql = "select * from student01 order by num asc";
				try {
					conn=DriverManager.getConnection(url,prop);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					// rs.next()�� Ʈ���� ��츸 �ϸ� �Ǵϱ�
					while(rs.next()){
						System.out.print(rs.getInt(1)+"\t"); //�й�
						System.out.print(rs.getInt(2)+"\t"); //����
						System.out.print(rs.getInt(3)+"\t"); //����
						System.out.println(rs.getInt(4)+"\t"); //����
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
				
			// ����
			}else if(input.equals("4")){
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
				
				String sql="delete from student01 where num = "+target;
				
				try {
					conn=DriverManager.getConnection(url,prop);
					stmt = conn.createStatement();
					result = stmt.executeUpdate(sql);
					
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
				
				
			// ����
			}else if(input.equals("3")){
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
				
				String sql = "update student01 set kor=";
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
