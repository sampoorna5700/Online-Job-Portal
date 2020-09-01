package com.sam.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sam.Dao.JobDescriptionDao;
import com.sam.model.AddJobModel;

@WebServlet("/jobdescription")
public class JobDescription extends HttpServlet {
		AddJobModel adddescription = new AddJobModel();
		JobDescriptionDao jobdescription = new JobDescriptionDao();
	
		protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException
		{
			doPost(req,res);
		}
		
		protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException
		{
			String CompanyName = req.getParameter("id");
			adddescription.setCompanyName(CompanyName);
			
			try {
				ArrayList<AddJobModel> description = jobdescription.fetchDescription(adddescription);
				req.setAttribute("Description", description);
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
			req.getRequestDispatcher("JobDescription.jsp").forward(req,res);
			
		}

}
