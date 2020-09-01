package com.sam.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sam.model.AddJobModel;

public class FetchJobListDao {
	
	public ArrayList<AddJobModel> fetchJob() throws SQLException
	{
		ArrayList<AddJobModel> list = new ArrayList<AddJobModel>();
		
		try(Connection con = Dao.getConnection() )
		{
			PreparedStatement ps = con.prepareStatement("Select *from JobList");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				AddJobModel item = new AddJobModel();
				item.setCompanyName(rs.getString("CompanyName"));
				item.setLanguage(rs.getString("Language"));
				item.setDate(rs.getString("Date"));
				item.setAddress(rs.getString("Address"));
				item.setTitle(rs.getString("Title"));
				list.add(item);
				
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

}
