package com.tama.org.Simple_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementJDBCInsert {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			
			int id=5;
			String firstName="alok";
			String lastname="singh";
			String email="alok@gmail";
			long phone=66666;
			
			String sql=String.format("insert into Student values(%d,'%s','%s','%s',%d)", id, firstName, lastname, email, phone);
			
			st=con.createStatement();
			
			int x=st.executeUpdate(sql);
			
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
				if(st!=null) st.close();
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
