package com.sam.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sam.model.UserProfileModel;

@WebServlet("/deleteuserdao")
public class DeleteUserDao extends HttpServlet{
	/*protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		doPost(req,res);
	}*/
	protected void doGet(HttpServletRequest req,HttpServletResponse res ) throws ServletException, IOException
	{
		String userId = req.getParameter("id");
		
		int i=0;
		try(Connection con = Dao.getConnection())
		{
			PreparedStatement ps = con.prepareStatement("delete from Users where FirstName = ?");
			ps.setString(1,userId);
			ps.executeUpdate();
		
			int a=0;
		PreparedStatement pr = con.prepareStatement("select *from Users");
		ResultSet rs = pr.executeQuery();
		while(rs.next())
		{
			 a =i+1;
	    }
		System.out.println("Rows deleted are " + a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//return i;
		req.getRequestDispatcher("UserList.jsp").forward(req, res);;
		
	}

}
