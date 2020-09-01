package com.sam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sam.Dao.DeleteUserDao;
import com.sam.model.UserProfileModel;

@WebServlet("/deleteuser")
public class DeleteUser extends HttpServlet {
	
	UserProfileModel deleteUser = new UserProfileModel();
	DeleteUserDao deleteuserdao = new DeleteUserDao();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		doPost(req,res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		//String FirstName = req.getParameter("firstname");
		//deleteUser.setFirstName(FirstName);
		//deleteuserdao.delete();
		//req.setAttribute(name, o);
        req.getRequestDispatcher("UserList.jsp").forward(req, res);
	}

}
