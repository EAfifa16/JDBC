package com.tama.org.Simple_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementJDBCInsert {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			
			int id = 6;
			String firstName="samar";
			String lastName="quadri";
			String email="quadri@gmail";
			long phone=55555;
			
			String sql="insert into student values(?,?,?,?,?)";
			
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, id);
			ps.setString(2, firstName);
			ps.setString(3, lastName);
			ps.setString(4, email);
			ps.setLong(5, phone);
			
			int x=ps.executeUpdate();
			
			if(x==1) {
				System.out.println("inserted");
			}
			
			else {
				System.out.println("failed");
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				if(con!=null) con.close();
				if(ps!=null) ps.close();
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
