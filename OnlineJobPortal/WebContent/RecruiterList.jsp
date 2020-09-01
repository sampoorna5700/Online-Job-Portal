<%@include file="head.html"%>
<%@include file="Home_nav.html"%>
<head>
<Link rel = "Stylesheet" href="RecruiterList.css?version=1">
</head>
<body>
 
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%--   <% FetchRecruiterDetails fetchrecruiterdetails  = new FetchRecruiterDetails(); %>
<%ArrayList<AddRecruiterModel> list= fetchrecruiterdetails.fetch();%>
<%Iterator<AddRecruiterModel> itr = list.iterator(); %> --%>
<div class="add-box">
<h2 style = "position: relative;
    bottom: 30px;
    right: 30px; ">Recruiter List</h2>
<table border ="1" style ="text-align:center; ">
<th>FirstName</th>
<th>LastName</th>
<th>LoginId</th>
<th>Date Of Birth</th>
<th>Gender</th>

<%--   <% while(itr.hasNext()) {
	AddRecruiterModel recruiterdetails = itr.next();--%> 
	
<tr>
<c:forEach items = "${recruiterList}" var="List">
<tr>
<td style="width:20%;">${List.firstName}</td>
<td style="width:20%;">${List.lastName}</td>
<td style="width:20%;">${List.loginId}</td>
<td style="width:40%;">${List.DOB}</td>
<td style="width:20%;">${List.gender}</td>
</tr>
</c:forEach>
</tr>
<%-- -- <%}%> -->--%>
</table>
</div>
</body>
