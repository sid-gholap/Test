package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.entity.Employee;
import com.service.Myservice;

public class Mycontroller {

	public void getdata() throws ClassNotFoundException, SQLException {
		Myservice c = new Myservice();
		System.out.println(" c.getdata()"); 
	}
}
