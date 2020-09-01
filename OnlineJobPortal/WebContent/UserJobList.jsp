<%@ include file ="head.html"%>
<%@include file= "User_nav.html" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
	<Link rel= "Stylesheet" href="UserJobList.css?versio=6">
</head>
<body>
	<div class = "add-box">
	<h2 style = "position: relative;
    bottom: 30px;
    right: 30px; ">Job List</h2>
		<table border ="1">
			<th>CompanyName</th>
			<th>Language</th>
			<th>Posted Date</th>
			<th>Address</th>
			<th>Title</th>
			<div>
			<form action ="searchjob">
				
					
					<input style ="border-radius: 4px;
   					     outline: none;
  						  width: 60%;
   						 border: 1px solid #E9E9E9;
 						   border-color: dodgerblue;
  							  padding: 5px 15px;" type = "text" placeholder ="CompanyName" name ="tjobsearch"></input>
   <input type ="submit" class ="JobSearch-hyperlink" value = "Search"></input>
				
			</form>
			</div>
			<tr>
			<c:forEach items = "${SearchedJob}" var="job">
			<tr>
			<td>${job.companyName}</td>
			<td>${job.language}</td>
			<td>${job.date}</td>
			<td>${job.address}</td>
			<td>${job.title}</td>
			<td style = "width:20%;"><a  href ="" class="Search-hyperlink">Apply</a><a href ="#Delete">Delete</a></td>
			</tr>
			</c:forEach>
			</tr>
			<tr>
			<c:forEach items ="${UserJobList}" var = "JobList">
			<tr>
			<td>${JobList.companyName}</td>
			<td>${JobList.language}</td>
			<td>${JobList.date}</td>
			<td>${JobList.address}</td>
			<td>${JobList.title}</td>
			<td style = "width:20%;"><a  href ="#Edit" class="Search-hyperlink">Apply</a><a href ="deleteuserdao?id=${list.firstName}">Delete</a></td>
			</tr>
			</c:forEach>
			</tr>
		</table>
	</div>
</body>