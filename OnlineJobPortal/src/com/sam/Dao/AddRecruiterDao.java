package com.sam.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sam.model.AddRecruiterModel;


public class AddRecruiterDao {
	
	public int insert(AddRecruiterModel Add)
	{
		int i= 0;
		try(Connection con = Dao.getConnection())
		{
			PreparedStatement ps = con.prepareStatement("insert into users values(?,?,?,?,?,?,?)");
			ps.setString(1, Add.getFirstName());
			ps.setString(2, Add.getLastName());
			ps.setString(3, Add.getLoginId());
			ps.setString(4, Add.getPassword());
			ps.setString(5, Add.getDOB());
			ps.setString(6, Add.getGender());
			ps.setString(7, Add.getRole());
			i=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
		
	}

}
