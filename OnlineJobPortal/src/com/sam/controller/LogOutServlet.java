package com.sam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logoutservlet")
public class LogOutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException

	{
		doPost(req,res);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		hs.invalidate();
		req.getRequestDispatcher("Login.jsp").forward(req,res);
		
	}
}
