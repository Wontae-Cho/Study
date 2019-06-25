package com.bit.db01;

import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class OracleTester {

	public static void main(String[] args) {
		// 1. ����Ŭ�� ����
		// 		= ����̹��� ������ ��ü ������ �ؾ���.
		oracle.jdbc.driver.OracleDriver driver = null;
		driver = new OracleDriver();
		
		// 2. ������ ������ �����ؾ� ��.
		// jdbc:oracle:<drivertype>@ip:port:sid
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	// �ּ�
						// ���� ������ �ؾ� ������ �����ʰ� �ʿ�. �� ��Ʈ�� 1521��Ʈ��.
		Properties info = new Properties();
		info.put("user", "scott");
		info.put("password", "tiger");
		
		String sql = "insert into bonus (ename,job,sal,comm) values ('user05','new',500,50)";
		
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
		
		// �����ϴ� �κ�. ������ ������ �� ������ Ʈ����-ĳġ�� ������.
		try {
			conn = java.sql.DriverManager.getConnection(url, info);
			// ���������� ������ �� �ִ� ������Ʈ��Ʈ ��ü�� ����
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("�Է¿Ϸ�");
			
			
			// ���ӵ� ��ü�� Ȯ���� �� ����.
//			System.out.println(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(conn!=null){conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
