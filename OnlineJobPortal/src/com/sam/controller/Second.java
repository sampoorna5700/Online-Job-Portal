package com.sam.controller;


	import java.io.IOException;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import com.sam.Dao.AdminDao;
import com.sam.model.Admin;

	
	@WebServlet("/second")
	public class Second extends HttpServlet {
		 
		Admin user  = new Admin();
		
		public  void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
		{
			doPost(req,res);
		}
		
		public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
		{
		String name = "Sam";
		req.setAttribute("Userlist",name);
		req.getRequestDispatcher("Index.jsp").forward(req, res);;
			
		}
	

}
