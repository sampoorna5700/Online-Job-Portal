package com.sam.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sam.model.LoginModel;

public class LoginDao {
	
	
	
	 
	public String authenticateUser(LoginModel login)
	{
	    String userName = login.getLoginId();
	    String password = login.getPassword();
	 
	    
	    Statement statement = null;
	    ResultSet resultSet = null;
	 
	    String userNameDB = "";
	    String passwordDB = "";
	    String roleDB = "";
	    //String Confirmation = ""
	    try(Connection conn = Dao.getConnection())
	    {
	       
	        PreparedStatement ps = conn.prepareStatement("select LoginId,Password,Role from users");
	        
	        resultSet = ps.executeQuery();
	 
	        while(resultSet.next())
	        {
	            userNameDB = resultSet.getString("LoginId");
	            passwordDB = resultSet.getString("Password");
	            roleDB = resultSet.getString("Role");
	 
	            if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Admin"))
	            return "Admin_Role";
	            else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Recruiter"))
	            return "Recruiter_Role";
	            else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("User"))
	            return "User_Role";
	        }
	    }
	    catch(SQLException e)
	    {
	        e.printStackTrace();
	    }
	    return "Invalid user credentials";
	}
	}

