package com.tama.org.Simple_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementJDBCRetrieve {

	public static void main(String[] args) {

		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			
			int id=2;
			
			String sql=String.format("select * from Student where id=%d", id);
			
			st=con.createStatement();
			
			rs=st.executeQuery(sql);
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
	
		finally {
			try {
				
				if(st!=null) st.close();
				if(con!=null) con.close();
				if(rs!=null) rs.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
