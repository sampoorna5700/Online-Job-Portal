package com.sam.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;

@WebServlet("/appliedjob")
public class AppliedJob extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		doPost(req,res);
	}
	protected void doPost(HttpServletRequest req ,HttpServletResponse res)
	{
		String CompanyName = req.getParameter("CompanyName");
		String Language = req.getParameter("Language");
		long millis=System.currentTimeMillis(); 
		String date = new Date(millis).toString();
		String Title = req.getParameter("Title");
		
	}
}
