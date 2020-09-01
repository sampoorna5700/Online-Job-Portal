package com.sam.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sam.Dao.FetchUserListDao;
import com.sam.model.UserProfileModel;
@WebServlet("/fetchuser")
public class FetchUser extends HttpServlet{
	FetchUserListDao fetchuserlistdao = new FetchUserListDao();
	//ArrayList<UserProfileModel> list = new ArrayList<UserProfileModel>();
 protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException
 {
	 doPost(req,res);
 }
 
 protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException
 {
 ArrayList<UserProfileModel> List =  fetchuserlistdao.FetchUserDetails();
	  
	    //HttpSession session = req.getSession();
	/* Iterator itr = List.iterator();;
	 while(itr.hasNext())
	 {
		 String list = itr.next().toString();
	
		 System.out.println(list);
	 }*/
    req.setAttribute("userList",List);
	RequestDispatcher rd= req.getRequestDispatcher("UserList.jsp");
	rd.forward(req,res);
	 
	//res.sendRedirect("UserList.jsp");
 }
}
