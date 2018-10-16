package com.tama.org.Simple_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableresultSet {
	
	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			
			st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			String sql="select * from Student";
			
			rs=st.executeQuery(sql);
			
			System.out.println("\n printing in forward direction \n");
				while(rs.next()) {
				int id=rs.getInt(1);
				String firstName=rs.getString(2);
				String lastName=rs.getString(3);
				String email=rs.getString(4);
				long phone=rs.getLong(5);
				
				System.out.println(id+"\t"+firstName+"\t"+lastName+"\t"+email+"\t"+phone);
				}
				
			System.out.println("\n printing in reverse direction \n");
				while(rs.previous()) {
				int id=rs.getInt(1);
				String firstName=rs.getString(2);
				String lastName=rs.getString(3);
				String email=rs.getString(4);
				long phone=rs.getLong(5);
					
				System.out.println(id+"\t"+firstName+"\t"+lastName+"\t"+email+"\t"+phone);	
				}
				
			System.out.println("\n 1st record \n");
				rs.first();
			
				int id=rs.getInt(1);
				String firstName=rs.getString(2);
				String lastName=rs.getString(3);
				String email=rs.getString(4);
				long phone=rs.getLong(5);
				
				System.out.println(id+"\t"+firstName+"\t"+lastName+"\t"+email+"\t"+phone);
			}
		

		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				if(con!=null) con.close();
				if(st!=null) st.close();
				if(rs!=null) rs.close();
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
