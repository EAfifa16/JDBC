package com.tama.org.Simple_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionJDBC {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement ps = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");

			con.setAutoCommit(false);

			int id = 15;
			String firstName = "sumit";
			String lastName = "singh";
			String email = "singh@gmail";
			long phone = 98989;

			String sql = "insert into Student values(?,?,?,?,?)";

			ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			ps.setString(2, firstName);
			ps.setString(3, lastName);
			ps.setString(4, email);
			ps.setLong(5, phone);

			int x = ps.executeUpdate();

			con.commit();

			if (x == 1) {
				System.out.println("inserted");
			}

			else {

				System.out.println("failed");
			}
		}

		catch (

		Exception e) {
			e.printStackTrace();

		}
		
		finally {
			
			try{
				
				if(con!=null) con.close();
				if(ps!=null) ps.close();
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
 