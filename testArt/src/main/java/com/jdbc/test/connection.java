package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import ch.qos.logback.core.pattern.parser.FormattingNode;

public class connection {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","9558342421gbp");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM actor");
		rs.next();
		System.out.println(rs.getInt(1) +" "+ rs.getString(2)+" "+rs.getString(3) +" "+rs.getString(4));
		con.close();
	}

}
