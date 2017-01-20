<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Spring MVC 04</title>
<link rel="stylesheet" type="text/css" href="css/next.css"/>	
</head>
<body>
<jsp:include page="header.jsp"/>
<h1 align="right"><a href="<c:url value="/home.next"/>">Home</a></h1>
<h1 align="center">Enter Your Query</h1>
<center>
<form:form method="post" commandName="query">
<table>
	<tr>
		<td>
			<form:textarea path="message" cssClass="formFieldClass" rows="5" cols="50"/>
			<form:errors path="message" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td align="center">
			<input type="submit" value="Post Query" class="formButtonClass"/>
		</td>
	</tr>
</table>
</form:form>
</center>
</body>
</html>
