package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/*
 * 날짜 : 2022/01/13
 * 이름 : 김병현
 * 내용 : 자바 데이터베이스 프로그래밍(JDBC) 실습하기 교재p557
 */
public class Sub1_JDBCTest {
	public static void main(String[] args) {
		
		final String HOST = "jdbc:mysql://54.180.160.240:3306/kimbhun123";
		final String USER = "kimbhun123";
		final String PASS = "1234";
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");		
		
					
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
		
			if(conn != null) {
				System.out.println("데이터베이스 접속 성공!!!");
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("JDBC 프로그램 종료...");
	}
}
