package com.bit.db01;

import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class OracleTester {

	public static void main(String[] args) {
		// 1. 오라클에 접속
		// 		= 드라이버를 가지고 객체 생성을 해야함.
		oracle.jdbc.driver.OracleDriver driver = null;
		driver = new OracleDriver();
		
		// 2. 접속의 정보를 전달해야 함.
		// jdbc:oracle:<drivertype>@ip:port:sid
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	// 주소
						// 서로 소통을 해야 함으로 리스너가 필요. 그 포트가 1521포트임.
		Properties info = new Properties();
		info.put("user", "scott");
		info.put("password", "tiger");
		
		String sql = "insert into bonus (ename,job,sal,comm) values ('user05','new',500,50)";
		
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
		
		// 접속하는 부분. 접속의 실패할 수 있으니 트라이-캐치로 구성됨.
		try {
			conn = java.sql.DriverManager.getConnection(url, info);
			// 쿼리문장을 보내줄 수 있는 스테이트먼트 객체를 생성
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("입력완료");
			
			
			// 접속된 객체를 확인할 수 있음.
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
