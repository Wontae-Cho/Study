package com.bit.db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

public class UserList {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		OracleDriver dirver = new OracleDriver();
		Properties prop = new Properties();
		prop.put("user", user); // "user" �� ������ �̸���.
		prop.put("password", password);
		
		// Ŭ��� ���� �η� �ۿ� ����.
		Connection conn = null;
		Statement stmt = null;
		// �Է�,����,������ �޸� ������� ���� �ٽ� �޾ƾ� ������ �ʿ�.
		ResultSet rs = null;
		
		try {
			//����
			conn=DriverManager.getConnection(url,prop);
			//����
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select ename,job,sal,comm from bonus");
			
			System.out.println("------------------------------------------------");
			System.out.println("ename\tjob\tsal\tcomm");
			System.out.println("------------------------------------------------");
			
			while(rs.next()){
				System.out.print(rs.getObject(1));
				System.out.print("\t");
				System.out.print(rs.getObject(2));
				System.out.print("\t");
				System.out.print(rs.getObject(3));
				System.out.print("\t");
				System.out.println(rs.getObject(4));
			}
			System.out.println("------------------------------------------------");
//			
//			System.out.println(rs.next());
//			System.out.print(rs.getObject(1));
//			System.out.print(rs.getObject(2));
//			System.out.print(rs.getObject(3));
//			System.out.println(rs.getObject(4));
//			
			// �������� '��' �ε��� 
//			System.out.println(rs.getObject(5));
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
				
		
	}

}
