package com.tama.org.Simple_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SimpleJDBCInsert {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");

			String sql = "insert into Student values(4, 'harsh', 'rastogi', 'rastogi@gmail', 66666)";

			st = con.createStatement();

			int x = st.executeUpdate(sql);

			if (x == 1) {
				System.out.println("inserted");
			}

			else {
				System.out.println("failed");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			try {
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}