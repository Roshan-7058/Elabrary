package com.cdackolkata.dao;

import java.sql.*;

import oracle.jdbc.OracleDriver;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sys as sysdba", "Roshan@123");
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
