package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/*
 * ��¥ : 2022/01/13
 * �̸� : �躴��
 * ���� : �ڹ� �����ͺ��̽� ���α׷���(JDBC) �ǽ��ϱ� ����p557
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
				System.out.println("�����ͺ��̽� ���� ����!!!");
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("JDBC ���α׷� ����...");
	}
}
