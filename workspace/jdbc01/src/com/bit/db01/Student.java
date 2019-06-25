package com.bit.db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

class StudentData{
	
}

public class Student {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stuNum = 0;
		String stuName = "";
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		int sumScore = korScore+engScore+mathScore;
		double avgScore = sumScore / 3.0;
		
		// 데이터베이스 구성
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		String selectSql = "select stuNum,stuName,korScore,mathScore,engScore,sumScore,avgScore from student"; // 보기
		String updateSql = "update student set korScore,engScore,mathScore where (학번)"; // 수정
		String deleteSql = "delete from student where (학번)"; // 삭제 
		
		OracleDriver driver = new OracleDriver();
		Properties prop = new Properties();
		prop.put("user", user);
		prop.put("password", password);
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(url,prop);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(selectSql);
			
			System.out.println("----------------------------------------");
			System.out.println("학생 성적 관리 프로그램(ver. database)");
			System.out.println("----------------------------------------");
			
			String input = "";
			
			while(true){
				System.out.println("---------------------------------------------");
				System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
				input=sc.nextLine();
				System.out.println("---------------------------------------------");
				if(input.equals("0")){break;} // 종료
				if(input.equals("1")){ //보기
					System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
					while(rs.next()){
						System.out.print(rs.getObject(1));
						System.out.print("\t");
						System.out.print(rs.getObject(2));
						System.out.print("\t");
						System.out.print(rs.getObject(3));
						System.out.print("\t");
						System.out.print(rs.getObject(4));
						System.out.print("\t");
						System.out.print(rs.getObject(5));
						System.out.print("\t");
						System.out.print(rs.getObject(6));
						System.out.print("\t");
						System.out.println(rs.getObject(7));
					}
					System.out.println("------------------------------------------------");
					
				}else if(input.equals("2")){ //추가
					String insertSql = "insert into student (stuNum,stuName,korScore,mathScore,engScore,sumScore,avgScore)"; // 추가
					
					
					
					System.out.print("이름>");
					stuName = sc.nextLine();
					
					System.out.print("국어점수>");
					input = sc.nextLine();
					korScore = Integer.parseInt(input);
					
					System.out.print("영어점수>");
					input = sc.nextLine();
					engScore = Integer.parseInt(input);
					
					System.out.print("수학점수>");
					input = sc.nextLine();
					mathScore = Integer.parseInt(input);
					
					sumScore = korScore+engScore+mathScore;
					avgScore = sumScore / 3.0;
					insertSql += "values("+stuNum+",'"+stuName+"',"+korScore+","+engScore+","+mathScore+
							","+sumScore+","+avgScore+")";
					System.out.println(insertSql);
					
					stmt.executeUpdate(insertSql);
					
					
				}else if(input.equals("3")){ //수정
					
				}else if(input.equals("4")){ //삭제
					
				}
				
			}
			System.out.println("이용해주셔서 감사합니다.");
			
			
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

	}

}
