package com.sam.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sam.model.Admin;

public class AdminDao {
	public int insert(Admin u)
	{
		int i= 0;
		try(Connection con = Dao.getConnection())
		{
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
			ps.setString(1,u.getUsername());
			ps.setString(2, u.getPassword());
			i=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
		
	}

}
