<%@ include file ="head.html" %>
<%@ include file="Recruiter_nav.html" %>

<html>
<head><link rel="Stylesheet" href="Home.css"></head>
  	<body>
  	<span style="position: absolute;
    right: 85px;
    top: 25px;
    font-size: 18px;
">
   Hello, <%=session.getAttribute("Editor")%>
  	</span>
		<span class="div"> Welcome to Job Portal.</span>
		<form action = "logoutservlet">
			<span><input type = "submit" value ="LogOut" Style= "border:solid; width:50px; border-color: #c1f9fc; position:absolute; right:25px; top:25px; cursor:pointer;"></span>
       </form>
	</body>
</html>