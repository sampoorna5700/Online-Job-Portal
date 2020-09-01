<%@include file = "head.html"%>
<%@ include file ="User_nav.html"%>
<head>
	<link rel="StyleSheet" href="UserPage.css">
</head>
<body>
	<span style="position: absolute;
    right: 80px;
    top: 25px;
    font-size: 18px;
    
">
		Hello, <%=session.getAttribute("User") %>
		</span> 
	<div class="register-confirmation">
	
	
		<span style="text-align: center; padding-top: 7px; font-family: sans-serif; position:absolute; left:45%;">Welcome to Job Portal.</span>
		
	</div>
	<form action = "logoutservlet">
	
<span><input type = "submit" value ="LogOut" Style= "border:solid; width:50px; border-color: #c1f9fc; position:absolute; right:25px; top:25px; cursor:pointer;"></span>
</form>
</body>