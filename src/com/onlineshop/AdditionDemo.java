package com.onlineshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.onlineshop.AdditionDemo;
import com.onlineshopConnection.ConnectionTest;

public class AdditionDemo {
	Connection connection = null;
	PreparedStatement ps = null;
	
	private void getAddition(int a,int b,int c)
			throws SQLException {
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement("insert into addition(a,b,c)values(?,?,?) ");
			
			ps.setInt(1, a);
			ps.setInt(2, b);
			ps.setInt(3, c);
			//ps.setInt(3, c);
			int i = ps.executeUpdate();
			System.out.println("Record is inserted successfully..");
			System.out.println("------------------------------------------------------------------------------------------------");

			
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			connection.close();
			ps.close();
		}

	}
	
public static void main(String[] args) throws SQLException {
	Scanner sc = new Scanner(System.in);
	// for (int i = 0; i < 3; i++) {
	System.out.println("Enter value1>>");
	int a1 = sc.nextInt();
	System.out.println("Enter value2>>");
	int b1 = sc.nextInt();
	
	int c = a1+ b1;
	
	AdditionDemo add = new AdditionDemo();
	
		add.getAddition(a1, b1,c);
	
	
}
}