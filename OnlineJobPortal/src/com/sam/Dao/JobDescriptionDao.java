package com.sam.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sam.model.AddJobModel;



public class JobDescriptionDao {
	public ArrayList<AddJobModel> fetchDescription(AddJobModel desc) throws SQLException
	{
		ArrayList<AddJobModel> List =  new ArrayList<AddJobModel>();
		try(Connection con = Dao.getConnection())
		{
			PreparedStatement ps = con.prepareStatement("Select Description from JobList where CompanyName = ?");
			ps.setString(1, desc.getCompanyName());
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				AddJobModel item = new AddJobModel();
				item.setDescription(rs.getString("Description"));
				List.add(item);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return  List;
	}
}
