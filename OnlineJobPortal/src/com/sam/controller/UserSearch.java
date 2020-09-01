package com.sam.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sam.Dao.UserProfileDao;
import com.sam.Dao.UserSearchDao;
import com.sam.model.UserProfileModel;

@WebServlet("/UserSearch")
public class UserSearch extends HttpServlet {
	UserSearchDao usersearch = new UserSearchDao();
	UserProfileModel userprofilemodel = new UserProfileModel();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		doPost(req,res);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String FirstName = req.getParameter("tfirstname");
		
		userprofilemodel.setFirstName(FirstName);
		try {
			
			ArrayList<UserProfileModel> SearchUser = usersearch.SearchUser(userprofilemodel);
			req.setAttribute("SearchUser",SearchUser );
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		req.getRequestDispatcher("UserList.jsp").forward(req,res);
		
	}
}
