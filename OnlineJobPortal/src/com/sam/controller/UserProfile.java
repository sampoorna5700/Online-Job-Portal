package com.sam.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sam.Dao.FetchUserListDao;
import com.sam.Dao.UserProfileDao;
import com.sam.model.UserProfileModel;

@WebServlet("/userprofile")
public class UserProfile extends HttpServlet {
	
	UserProfileDao userprofiledao = new UserProfileDao();
	UserProfileModel userprofilemodel = new UserProfileModel();
	/*FetchUserListDao fetchuserlistdao = new FetchUserListDao();
	ArrayList<UserProfileModel> list = new ArrayList<UserProfileModel>();*/
   protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
   {
	   doPost(req,res);
   }
   
   protected void doPost(HttpServletRequest req,HttpServletResponse res)  throws IOException, ServletException
   {
	   String FirstName = req.getParameter("firstname");
	   String LastName = req.getParameter("tlastname");
	   String Email = req.getParameter("temail");
	   String Password =req.getParameter("tpassword");
	   String Gender = req.getParameter("tgender");
	   String User_Role  = req.getParameter("userRole");
	   userprofilemodel.setFirstName(FirstName);
	   userprofilemodel.setLastName(LastName);
	   userprofilemodel.setLoginId(Email);
	   userprofilemodel.setPassword(Password);
	   userprofilemodel.setGender(Gender);
	   userprofilemodel.setRole(User_Role);
	    userprofiledao.Add(userprofilemodel);
	//   ArrayList<UserProfileModel> List =  fetchuserlistdao.FetchUserDetails();
	  
	    //HttpSession session = req.getSession();
	/* Iterator itr = List.iterator();;
	 while(itr.hasNext())
	 {
		 String list = itr.next().toString();
	
		 System.out.println(list);
	 }
 *///req.setAttribute("userList",List);
	RequestDispatcher rd= req.getRequestDispatcher("RegistrationConfirmation.jsp");
	rd.forward(req,res);
	 
	//res.sendRedirect("UserList.jsp");
   }																																					
 
}
