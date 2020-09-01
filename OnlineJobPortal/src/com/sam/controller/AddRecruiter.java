package com.sam.controller;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sam.Dao.AddRecruiterDao;
import com.sam.Dao.FetchRecruiterDetails;
import com.sam.model.AddRecruiterModel;

@WebServlet("/AddRecruiter")
public class AddRecruiter extends HttpServlet {
	AddRecruiterModel addrecruitermodel = new AddRecruiterModel();
	AddRecruiterDao addrecruiterdao =  new AddRecruiterDao();
	FetchRecruiterDetails recruiterdetails = new FetchRecruiterDetails();
 protected void doGet(HttpServletRequest req, HttpServletResponse res)
 {
	 doPost(req,res);
 }
 protected void doPost(HttpServletRequest req, HttpServletResponse res)
 {
	 String FirstName = req.getParameter("fname");
	 String LastName = req.getParameter("lname");
	 String LoginId = req.getParameter("email");
	 String Password = req.getParameter("tpassword");
	 // String ConfirmPassword = req.getParameter("confirmpassword");
	 String DOB = req.getParameter("dob");
	 String Gender = req.getParameter("gender");
	 String Rec_Role = req.getParameter("recruiterRole");
	  
	  addrecruitermodel.setFirstName(FirstName);
	  addrecruitermodel.setLastName(LastName);
	  addrecruitermodel.setLoginId(LoginId);
	  addrecruitermodel.setPassword(Password);
	  addrecruitermodel.setDOB(DOB);
	  addrecruitermodel.setGender(Gender);
	  addrecruitermodel.setRole(Rec_Role);
	 // HttpSession session =req.getSession();
	 // session.setAttribute("Recruiter", addrecruitermodel);
	  addrecruiterdao.insert(addrecruitermodel);
	//  recruiterdetails.fetch();
 }
}
