package com.sam.controller;


import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sam.Dao.LoginDao;
import com.sam.model.LoginModel;
 

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
private static final long serialVersionUID = 1L; 
public LoginServlet() {
}
protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException, IOException
{
	doPost(req,res);
}
 
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
    String userName = request.getParameter("temail");
    String password = request.getParameter("tpassword");
 
    LoginModel loginBean = new LoginModel();
 
    loginBean.setUserName(userName);
    loginBean.setPassword(password);
 
    LoginDao loginDao = new LoginDao();
 
    try
    {
        String userValidate = loginDao.authenticateUser(loginBean);
 
        if(userValidate.equals("Admin_Role"))
        {
            System.out.println("Admin's Home");
 
            HttpSession session = request.getSession(); //Creating a session
            session.setAttribute("Admin", userName); //setting session attribute
            request.setAttribute("userName", userName);
 
            request.getRequestDispatcher("Home.jsp").forward(request, response);
        }
        else if(userValidate.equals("Recruiter_Role"))
        {
            System.out.println("Recruiter's Home");
 
            HttpSession session = request.getSession();
            session.setAttribute("Editor", userName);
            request.setAttribute("userName", userName);
 
            request.getRequestDispatcher("RecruiterHomePage.jsp").forward(request, response);
        }
        else if(userValidate.equals("User_Role"))
        {
            System.out.println("User's Home");
 
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(10*60);
            session.setAttribute("User", userName);
            request.setAttribute("userName", userName);
 
            request.getRequestDispatcher("UserPage.jsp").forward(request, response);
        }
       
        else
        {
            System.out.println("Error message = "+userValidate);
            request.setAttribute("errMessage", userValidate);
 
            request.getRequestDispatcher("loginerror").forward(request, response);
        }
    }
    catch (IOException e1)
    {
        e1.printStackTrace();
    }
    catch (Exception e2)
    {
        e2.printStackTrace();
    }
} //End of doPost()
}