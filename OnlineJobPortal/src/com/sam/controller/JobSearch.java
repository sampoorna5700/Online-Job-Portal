package com.sam.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sam.Dao.JobSearchDao;
import com.sam.model.AddJobModel;

@WebServlet("/searchjob")
public class JobSearch extends HttpServlet {
	JobSearchDao jobsearchdao = new JobSearchDao();
	AddJobModel addjobmodel = new AddJobModel();
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		doPost(req,res);
	}
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException
	{
		String CompanyName = req.getParameter("tjobsearch");
		
		addjobmodel.setCompanyName(CompanyName);
		ArrayList<AddJobModel> searchedJob = jobsearchdao.searchJob(addjobmodel);
		req.setAttribute("SearchedJob", searchedJob);
		req.getRequestDispatcher("UserJobList.jsp").forward(req, res);
	}

}
