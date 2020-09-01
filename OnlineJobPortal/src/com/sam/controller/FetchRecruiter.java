package com.sam.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sam.Dao.FetchRecruiterDetails;
import com.sam.model.AddRecruiterModel;

@WebServlet("/fetchrecruiter")
public class FetchRecruiter extends HttpServlet{
	FetchRecruiterDetails fetchrecruiterdetails = new FetchRecruiterDetails();
	//AddRecruiterModel addrecruitermodel = new AddRecruiterModel();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		doPost(req,res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		ArrayList<AddRecruiterModel> recruiterList = fetchrecruiterdetails.fetch();
		req.setAttribute("recruiterList",recruiterList);
		req.getRequestDispatcher("RecruiterList.jsp").forward(req, res);;
		
	}
	
}
