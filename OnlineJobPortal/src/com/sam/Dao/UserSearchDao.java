package com.sam.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;

import com.sam.model.UserProfileModel;

public class UserSearchDao {
	
	public ArrayList<UserProfileModel>  SearchUser(UserProfileModel user) throws SQLException 
	{
		ArrayList<UserProfileModel> list = new ArrayList<UserProfileModel>();
		int i=0;
		try(Connection con = Dao.getConnection();)
		{
			//UserProfileModel userprofile = new UserProfileModel();
			PreparedStatement ps = con.prepareStatement("Select *from userList where FirstName like ? ");
			ps.setString(1, "%" + user.getFirstName() + "%");		
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				UserProfileModel userItem=new UserProfileModel();
				userItem.setFirstName(rs.getString("FirstName"));
				userItem.setLastName(rs.getString("LastName"));
				userItem.setLoginId(rs.getString("Email"));
			
				list.add(userItem);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
	/*public ArrayList<UserProfileModel>  getUserDetailsByName(String firstName) throws SQLException 
	{
		ArrayList<UserProfileModel> list = new ArrayList<UserProfileModel>();
		int i=0;
		try(Connection con = Dao.getConnection();)
		{
			UserProfileModel userprofile = new UserProfileModel();
			PreparedStatement ps = con.prepareStatement("Select *from UserList where FirstName = ? ");
			ps.setString(1,firstName);		
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				userprofile.setFirstName(rs.getString("FirstName"));
				userprofile.setLastName(rs.getString("LastName"));
				userprofile.setEmail(rs.getString("Email"));
				
				list.add(userprofile);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}*/

}
