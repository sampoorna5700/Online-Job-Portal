package com.sam.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginerror")
public class LoginError extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    {
    	doPost(req,res);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    {
    	String Confirm = req.getAttribute("errMessage").toString();
    	if(Confirm != null)
    	{
    		HttpSession session = req.getSession();
    		session.setAttribute("error", Confirm);
    		req.getRequestDispatcher("LoginError.jsp");
    	}
    	
    	else {
    		
    		HttpSession session = req.getSession();
    		session.setAttribute("errorMessage", Confirm);
    	}
    }
}
