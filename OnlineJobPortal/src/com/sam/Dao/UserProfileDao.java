package com.sam.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sam.model.AddRecruiterModel;
import com.sam.model.UserProfileModel;

public class UserProfileDao {
	
		int i=0;
		public int Add (UserProfileModel userprofile)
		{
			
			try(Connection con = Dao.getConnection())
			{
				PreparedStatement ps = con.prepareStatement("insert into Users values(?,?,?,?,?,?)");
				ps.setString(1, userprofile.getFirstName());
				ps.setString(2, userprofile.getLastName());
				ps.setString(3, userprofile.getLoginId());
				ps.setString(4, userprofile.getPassword());
				ps.setString(5, userprofile.getGender());
				ps.setString(6, userprofile.getRole());
				i=ps.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
			return i;
			
		}

	}



