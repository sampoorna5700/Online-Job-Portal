package com.sam.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpSession;

import com.sam.model.AddRecruiterModel;
import com.sam.model.UserProfileModel;

public class FetchUserListDao {
	 
	
		
				public ArrayList<UserProfileModel>  FetchUserDetails() {
				ArrayList<UserProfileModel> list = new ArrayList<UserProfileModel>();
			
				
				//int i= 0;
				try(Connection con = Dao.getConnection())
				{
					PreparedStatement ps = con.prepareStatement("select *from Users where role ='user'");
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						UserProfileModel item = new UserProfileModel();
						item.setFirstName(rs.getString("FirstName"));
					    item.setLastName(rs.getString("LastName"));
					    item.setLoginId(rs.getString("LoginId"));
					   
					   
					   // Iterator itr =  list.iterator();
						list.add(item);
						 
						
				  }
				} catch (Exception e) {
					System.out.println(e);
				}
				return list;
				
			}

	}


