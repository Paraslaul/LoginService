package com.Login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	String sql="select * from login where uname=? and pass=?";
	String url="jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false";
	String username = "root";
	String password = "Paras@123";
	public boolean check(String uname, String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,uname);
			st.setString(2,pass);
			ResultSet set = st.executeQuery();
			if(set.next()) {
				return true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}

}
