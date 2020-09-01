<%-- <%@page import="com.sam.Dao.UserSearchDao"%>--%>
<%@include file="head.html"%>
<%@include file="Home_nav.html"%>
 <%-- <%@ page import = "com.sam.Dao.FetchUserListDao"%>
<%@ page import = "com.sam.model.UserProfileModel" %>
<%@ page import ="java.util.ArrayList"%>
<%@ page import = "java.util.Iterator" %>--%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


 
<head>
<link rel ="Stylesheet" href ="UserList.css?version=2" >
</head>

<%-- <% FetchUserListDao fetchuserlist = new FetchUserListDao();%>
<%
 
list = fetchuserlist.FetchUserDetails();--%>
<%-- 
UserSearchDao userSearch=new UserSearchDao();
ArrayList<UserProfileModel> list=new ArrayList<UserProfileModel>();

String firstName = request.getParameter("tfirstname");
 if(firstName != null && firstName != "")
{
	
	list=userSearch.getUserDetailsByName(firstName);
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		UserProfileModel userdetails = itr.next();--%> 
		
	<!-- 
	<td style = "width:20%;"><a style ="padding : 5px;" href ="#Edit">Edit</a><a  href ="#Delete" >Delete</a></td>
</tr> -->
<%--}

	<%} %>

	
<% else{--%>
<div class ="add-box">
<form action ="UserSearch" method ="post">
<h2 style = "position: relative;
    bottom: 30px;
    right: 30px;">User List</h2>
    <input style ="border-radius: 4px;
    outline: none;
    width: 60%;
    border: 1px solid #E9E9E9;
    border-color: dodgerblue;
    padding: 5px 9px;" type = "text" placeholder ="FirstName" name ="tfirstname">
   <input type ="submit" class ="Search-hyperlink" value = "Search"></button>
    </form>
    
 
	
	<table border ="1" class ="table">
<tr style ="height: 20px;">
	
	<th>FirstName</th>
	<th>LastName</th>
	<th>Email or Phone</th>
	<th>Edit</th>
</tr>
<tr style= "height:10px;">

	<c:forEach items = "${SearchUser}" var="list">
	
    <tr>
    <td style="width:20%;">${list.firstName}</td>
	<td style="width:20%;">${list.lastName}</td>
	<td style="width:20%;">${list.loginId}</td>
	<td style = "width:20%;"><a style ="padding : 5px;" href ="#Edit">Edit</a><a href ="#Delete">Delete</a></td>
	</tr>
	</c:forEach>
 </tr>

  <tr style= "height:10px;">
	<c:forEach items = "${userList}" var="list">
    <tr><td style="width:20%;">${list.firstName}</td>
	<td style="width:20%;">${list.lastName}</td>
	<td style="width:20%;">${list.loginId}</td>
	<td style = "width:20%;"><a style ="padding : 5px;" href ="#Edit">Edit</a><a href ="deleteuserdao?id=${list.firstName}">Delete</a></td>
	</tr>
	</c:forEach>

 </tr>

	
	

   

<%-- Iterator<UserProfileModel> itr = list.iterator(); --%> 

    
    


</table>
</div>
</body>
<%-- <jsp:forward page="AddUser.jsp"/>--%>

