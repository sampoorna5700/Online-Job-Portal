package com.sam.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sam.Dao.AddJobDao;
import com.sam.model.AddJobModel;

@WebServlet("/addjob")
public class AddJob extends HttpServlet{
	AddJobDao addjobdao = new AddJobDao();
	AddJobModel addjobmodel = new AddJobModel();
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		doPost(req,res);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		String CompanyName = req.getParameter("tcompanyName");
		String Language = req.getParameter("tlanguage");
		String Date = req.getParameter("tdate");
		String Address = req.getParameter("taddress");
		String Title  = req.getParameter("jobtitle");
		String Description = req.getParameter("tdescription");
		
		
		addjobmodel.setCompanyName(CompanyName);
		addjobmodel.setLanguage(Language);
		addjobmodel.setDate(Date);
		addjobmodel.setAddress(Address);
		addjobmodel.setDescription(Description);
		addjobmodel.setTitle(Title);
		addjobdao.addJob(addjobmodel);		
		
		
		
	}

}
