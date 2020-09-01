package com.sam.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sam.model.AddRecruiterModel;


public class FetchRecruiterDetails  {
	
	public ArrayList<AddRecruiterModel>  fetch() {
		ArrayList<AddRecruiterModel> list = new ArrayList<AddRecruiterModel>();
	
		
		int i= 0;
		try(Connection con = Dao.getConnection())
		{
			PreparedStatement ps = con.prepareStatement("select *from RecruiterList");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				AddRecruiterModel item = new AddRecruiterModel();
				item.setFirstName(rs.getString("FirstName"));
			    item.setLastName(rs.getString("LastName"));
			    item.setLoginId(rs.getString("LoginId"));
			    item.setPassword(rs.getString("Password"));
			    item.setDOB(rs.getString("DOB"));
			    item.setGender(rs.getString("Gender"));
			   // Iterator itr =  list.iterator();
				list.add(item);
		}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
		
	}


/*public static void main(String[] args)
{
	FetchRecruiterDetails recruiterdetails = new FetchRecruiterDetails();
	int data = recruiterdetails.fetch();
	String value = String.valueOf(data);
	
	 System.out.println(value);
}*/
}

