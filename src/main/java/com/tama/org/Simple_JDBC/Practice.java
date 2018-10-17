package com.tama.org.Simple_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;

public class Practice {

	public static void main(String[] args) {

		// Connection con = null;
		// Statement st = null;
		//
		// try {
		//
		// Class.forName("com.mysql.jdbc.Driver");
		//
		// con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root",
		// "root");
		//
		// String sql = "DELETE FROM student WHERE id =17";
		//
		// st = con.prepareStatement(sql);
		//
		// int x = st.executeUpdate(sql);
		//
		// if (x == 1) {
		// System.out.println("inserted value");
		// }
		// else {
		// System.out.println("value not inserted");
		// }
		// }
		// catch (Exception e) {
		// e.printStackTrace();
		// }
		// finally {
		// try {
		// if (con != null)
		// con.close();
		// if (st != null)
		// st.close();
		// }
		// catch (Exception e) {
		// e.printStackTrace();
		// }
		// }

		// Connection con = null;
		// Statement st = null;
		// ResultSet rs = null;
		//
		// try {
		//
		// Class.forName("com.mysql.jdbc.Driver");
		// con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root",
		// "root");
		//
		// String sql = "select * from student";
		//
		// st = con.createStatement();
		//
		// rs = st.executeQuery(sql);
		//
		// while (rs.next()) {
		// int id = rs.getInt(1);
		// String firstName = rs.getString(2);
		// String lastName = rs.getString(3);
		// String email = rs.getString(4);
		// long phone = rs.getLong(5);
		//
		// System.out.println(id + "\t" + firstName + "\t" + lastName + "\t" + email +
		// "\t" + phone + "\n");
		// }
		// }
		// catch (Exception e) {
		// e.printStackTrace();
		// }
		// finally {
		// try {
		// if (con != null)
		// con.close();
		// if (st != null)
		// st.close();
		// if (rs != null)
		// rs.close();
		// }
		// catch (Exception e) {
		// e.printStackTrace();
		// }
		// }

		// Connection con=null;
		// Statement st=null;
		//
		// try {
		//
		// Class.forName("com.mysql.jdbc.Driver");
		// con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root",
		// "root");
		//
		// int id=17;
		// String firstName="rony";
		// String lastName="debottam";
		// String email="d@gmail";
		// long phone=66996;
		//
		// String sql=String.format("insert into Student
		// values('%d','%s','%s','%s','%d')", id, firstName, lastName, email, phone);
		//
		// st = con.createStatement();
		//
		// int x = st.executeUpdate(sql);
		//
		// if(x==1) {
		// System.out.println("record inserted");
		// }
		// else {
		// System.out.println("record not inserted");
		// }
		//
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		//
		// finally {
		// try {
		// if (con != null)
		// con.close();
		// if (st != null)
		// st.close();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// }

		// Connection con = null;
		// PreparedStatement ps = null;
		//
		// try {
		//
		// Class.forName("com.mysql.jdbc.Driver");
		// con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root",
		// "root");
		//
		// int id = 18;
		// String firstName = "ayan";
		// String lastName = "ghatak";
		// String email = "g@gmail";
		// int phone = 898989;
		//
		// String sql = "insert into student values(?,?,?,?,?)";
		//
		// ps = con.prepareStatement(sql);
		//
		// ps.setInt(1, id);
		// ps.setString(2, firstName);
		// ps.setString(3, lastName);
		// ps.setString(4, email);
		// ps.setLong(5, phone);
		//
		// int x = ps.executeUpdate();
		//
		// if (x == 1) {
		// System.out.println("record inserted");
		// } else {
		// System.out.println("record not inserted");
		// }
		//
		// } catch (Exception e) {
		// e.printStackTrace();
		// } finally {
		// try {
		// if (con != null)
		// con.close();
		// if (ps != null)
		// ps.close();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// }
	}
}
