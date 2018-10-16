package com.tama.org.Simple_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchUpdate {
	
	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		
		
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			
			st=con.createStatement();
			
			String s1="insert into Student values(9, 'tam', 'mul', 'gmail', 9999)";
			st.addBatch(s1);
			
			String s2="insert into Student values(10, 'fra', 'das', 'yahoo', 8888)";
			st.addBatch(s2);
			
			String s3="insert into Student values(11, 'har', 'ras', 'gmail', 7777)";
			st.addBatch(s3);
			
			String s4="insert into Student values(12, 'ani', 'pan', 'yahoo', 6666)";
			st.addBatch(s4);
			
			String s5="insert into Student values(13, 'pra', 'bar', 'gmail', 5555)";
			st.addBatch(s5);
			
			int x[]=st.executeBatch();
				for(int i=0; i<x.length; i++) {
					System.out.println(x[i]);
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
			
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
