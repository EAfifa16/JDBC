package com.tama.org.Simple_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedstatementJDBCRetrive {

	public static void main(String[] args) {

		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			
			int id=4;
			
			String sql="select * from student where id=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			rs=ps.executeQuery();
				while(rs.next()) {
					int id1=rs.getInt(1);
					String firstName=rs.getString(2);
					String lastName=rs.getString(3);
					String email=rs.getString(4);
					long phone=rs.getLong(5);
					
					System.out.println(id1+"\t"+firstName+"\t"+lastName+"\t"+email+"\t"+phone);
				}
				
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {}
		
	}

}
