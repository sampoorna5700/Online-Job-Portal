package com.sam.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sam.model.AddJobModel;

public class AddJobDao {
	public int addJob(AddJobModel add)
	{
	int i=0;
	
		try(Connection con = Dao.getConnection())
		{
		PreparedStatement ps = con.prepareStatement("insert into JobList values(?,?,?,?,?,?)");
		ps.setString(1,add.getCompanyName());
		ps.setString(2, add.getLanguage());
		ps.setString(3, add.getDate());	
		ps.setString(4, add.getAddress());	
	    ps.setString(5, add.getDescription());	
	    ps.setString(6,add.getTitle());
		i=ps.executeUpdate();
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return i;
}

}
