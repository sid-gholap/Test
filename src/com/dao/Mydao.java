package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.entity.Employee;

public class Mydao {

	public ArrayList<Employee> getdata() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/colleg","root","sid1");
		//PreparedStatement st= conn.prepareStatement("select*from Employee");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from Employee");
		ArrayList<Employee> e = new ArrayList<Employee>();
		while(rs.next()) {
			
			int a = rs.getInt(1);
			String b = rs.getString(2);
			int c = rs.getInt(3);
			
			Employee g = new Employee();
			g.setEmpid(a);
			g.setName(b);
			g.setSalary(c);
			e.add(g);
		}
		return e;
	}
	
}
