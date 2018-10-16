package com.tama.org.Simple_JDBC;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class SimpleCachedRowSet {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			RowSetFactory factory = RowSetProvider.newFactory();
			CachedRowSet crs = factory.createCachedRowSet();

			crs.setUrl("jdbc:mysql://localhost:3306/JDBC");
			crs.setUsername("root");
			crs.setPassword("root");

			crs.setCommand("select id, firstName, lastName, email, phone from student");

			crs.execute();
			while (crs.next()) {
				int id = crs.getInt(1);
				String firstName = crs.getString(2);
				String lastName = crs.getString(3);
				String email = crs.getString(4);
				long phone = crs.getLong(5);

				System.out.println(id + "\t" + firstName + "\t" + lastName + "\t" + email + "\t" + phone);
			}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
