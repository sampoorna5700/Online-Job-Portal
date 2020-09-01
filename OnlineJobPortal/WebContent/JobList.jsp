<%@include file ="head.html"%>
<%@include file ="Recruiter_nav.html"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c" %>

<head>
	<link rel ="Stylesheet" href="JobList.css">
</head>
<body>
	<div class="add-box">
	<h2 style = "position: relative;
    bottom: 30px;
    right: 30px; ">Recruiter List</h2>
		<table border="1" >
		<th>Company Name</th>
		<th>Language</th>
		<th>Date of Apply</th>
		<th>Address</th>
		<th>Title</th>


   <c:forEach items = "${JobList}" var="joblist">
	<tr>
    <td style="width:20%;"><a href ="jobdescription?id=${joblist.companyName}">${joblist.companyName}</a></td>
	<td style="width:20%;">${joblist.language}</td>
	<td style="width:20%;">${joblist.date}</td>
	<td style="width:20%;">${joblist.address}</td>
	<td style="width:80%;">${joblist.title}</td>
	<td style = "width:20%;"><a style ="padding : 5px;" href ="#Edit">Edit</a><a href ="#Delete">Delete</a></td>
	</tr>
   </c:forEach>
	
		
		</table>
	</div>
</body>