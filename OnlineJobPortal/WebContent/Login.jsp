 <html>
<head>
<link rel = "Stylesheet" href="Login.css?version=4">
</head>
<body class="body">
<form action="loginservlet" method="post">
 <div class="content">
     <div class ="loginform">
          
      	 <h2> Sign in here</h2>
       		<div class="textfield1">
         		<input type = "text" placeholder="Email or Phone" name = "temail"  required ="">
      		</div>
      		 <div class="textfield2">
         		<input type = "password" placeholder="Password" name = "tpassword"  required ="">
      		 </div>
      			 <p class="para">
         			<a href ="#hyperlink" class="hyperlink">Forgot Password?</a>
       			 </p>
      		 <div class="submit-button">
       			<button type = "submit" name="tbutton"  >Sign In</button>
       		 </div>
       			<p class="signup-end">
      			 <span>Don't have an Account?</span>
       <a href ="UserLogin.html">Register</a>
        </p>
     </div>
  </div>
  </form>
</body>

</html>
