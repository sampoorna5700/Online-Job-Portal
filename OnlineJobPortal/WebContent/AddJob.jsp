<%@include file = "head.html"%>
<%@include file ="Recruiter_nav.html" %>
<head>
<link rel="Stylesheet"  href="AddJob.css?version=5">
 
</head>
<body>
<div class="add-box">
<form action ="addjob" >
<table style="padding:10% 15%;" cellspacing="15" cellpadding="10" >
<h3>Add Job</h3>
 <tr>
 <td>Company Name</td><td><input type ="text" name="tcompanyName" required=""></td>
 </tr>
 <tr>
 <td>Language</td><td><input type="text" name="tlanguage" required=""></td>
 </tr>
 <tr>
 <td>Date</td><td><input type="Date" name="tdate" required=""></td>
 </tr>
 <tr>
 <td>Address</td><td><textarea  name="taddress" rows="2" cols="20"  required=""></textarea> </td>
 </tr>
 <tr>
 <td>Title </td><td><input type = "text" name ="jobtitle" ></td>
 </tr>
 <tr>
 <td >Description</td><td><textarea rows="2" cols="20" name="tdescription" id="tdescription" required></textarea>
 </tr>
</table>
 <input type = "submit" value="Save" style="position: absolute;
    top: 75%;
    left: 35%;
    background: cornflowerblue;
    width: 100px">
</div>
</form>



</body>
<script src=https://cdnjs.cloudflare.com/ajax/libs/ContentTools/1.6.12/content-tools.js></script>
<script>
<%--ClassicEditor
        .create( document.querySelector( '#tdescription' ) )
        .then( tdescription => {
                console.log( tdescription );
        } )
        .catch( error => {
                console.error( error );
        } );
</script>--%>


