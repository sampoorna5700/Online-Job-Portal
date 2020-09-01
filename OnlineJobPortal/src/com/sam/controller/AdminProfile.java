package com.sam.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sam.Dao.AdminDao;
import com.sam.model.Admin;




@WebServlet("/adduser")
public class AdminProfile extends HttpServlet {
	AdminDao Admindao = new AdminDao();
	 Admin user = new Admin();
	protected  void doGet(HttpServletRequest req,HttpServletResponse res ) throws IOException, ServletException {
		doPost(req,res);

	}
	protected void  doPost(HttpServletRequest req,HttpServletResponse res ) throws IOException, ServletException
	{
		
		String username = req.getParameter("temail");
		String password = req.getParameter("tpassword");
		if(username != null && username != "" || password != null && password != "")
		{//if(username.isEmpty())
		//{
		// message.put("name",Enter username)
		//}
		HttpSession session = req.getSession();
		user.setUsername(username);
		user.setPassword(password);
		session.setAttribute("cred", user);
		Admindao.insert(user);
		    /*else{
		        req.setAttribute("messages", messages);
		        req.getRequestDispatcher("form.jsp").forward(req, res); 
		    } */
		

		RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
		rd.forward(req,res);
		}
		else 
		{
			res.getWriter().write("Plz Enter Username and Password");
		}
		
		//res.sendRedirect("second");
		
	}
}
	 



