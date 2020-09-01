<%@include file="head.html"%>
<%@include file="Home_nav.html"%>


<head>
<link rel ="Stylesheet" href="AddRecruiter.css?version=4">
<body>
 <div class="add-box">
 <form action="AddRecruiter" >
 <h3>Add Recruiter</h3>
  <table class="input" cellspacing="15" cellpadding="10">
	<tr >
		<td>First Name</td> <td><input type="text" name="fname" required ></td></tr>
		
	<tr>
		<td>Last Name</td> <td><input type="text" name="lname" required></td></tr>
		
	<tr >
		<td>Login Id</td> <td><input type="email" name="email" required></td></tr>
		
	<tr >
		<td>Password</td> <td><input type="password" name = "tpassword" required></td></tr>
		
	<tr >
		<td>Confirm Password</td> <td><input type="Password" name="confirmpassword" required></td></tr>
		
	<tr>
		<td>Date Of Birth</td> <td><input type="date" name="dob" style="width:160;" required></td></tr>
		
	<tr >
		<td>Gender</td> <td><input type="text" name="gender" required> 
		<!--  <input type="radio" name="gender2">Female</td> -->
	</tr> 
	<tr>
		<td><input type = "hidden" name ="recruiterRole" value = "Recruiter"></td></tr>
  </table>
  <input type = "submit" value="Save" style="position: absolute;
    top: 75%;
    left: 35%;
    background: #a4efbb;
    width: 100px ; border:1px solid; border-radius:6px;height:27px">
 </form>
 </div>
 
</body>