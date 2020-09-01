package com.sam.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sam.Dao.FetchJobListDao;
import com.sam.model.AddJobModel;
@WebServlet("/userjoblist")
public class UserJobList extends HttpServlet{
	FetchJobListDao fetchjobdao = new FetchJobListDao();
	AddJobModel jobmodel = new AddJobModel();
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		doPost(req,res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		try {
			ArrayList<AddJobModel> UserJobList = fetchjobdao.fetchJob();
			req.setAttribute("UserJobList", UserJobList);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		req.getRequestDispatcher("UserJobList.jsp").forward(req, res);
	}

}



