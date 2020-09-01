package com.sam.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sam.model.AddJobModel;

public class JobSearchDao {
	public ArrayList<AddJobModel> searchJob(AddJobModel add)
	{
		ArrayList<AddJobModel> List = new ArrayList<AddJobModel>();
		try(Connection con = Dao.getConnection())
		{
			PreparedStatement ps = con.prepareStatement("Select *from JobList where CompanyName like ?");
			ps.setString(1, "%" + add.getCompanyName() + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				AddJobModel item = new AddJobModel();
				item.setCompanyName(rs.getString("CompanyName"));
				item.setLanguage(rs.getString("Language"));
				item.setDate(rs.getString("Date"));
				item.setAddress(rs.getString("Address"));
				item.setTitle(rs.getString("Title"));
				List.add(item);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return List;
	}

}
