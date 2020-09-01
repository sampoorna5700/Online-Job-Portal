<%@ include file ="head.html"%>


<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
	<Link rel="Stylesheet" href="JobDescription.css">
</head>
<table border = 1></table>
<c:forEach items = "${Description}" var = "Job">
<tr>
	<td>${Job.description}</td>
</tr>
 </c:forEach>
  </table>