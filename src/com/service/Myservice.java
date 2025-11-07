package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.Mydao;
import com.entity.Employee;

public class Myservice {
public ArrayList<Employee> getdata() throws ClassNotFoundException, SQLException {
	Mydao a = new Mydao();
	ArrayList<Employee> getdata = a.getdata();
	return getdata;
}
}
