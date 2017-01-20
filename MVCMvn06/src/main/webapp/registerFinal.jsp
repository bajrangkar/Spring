<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title><fmt:message key="title"/></title>
<link rel="stylesheet" type="text/css" href="css/next.css"/>	
</head>
<body><center>
<form:form method="post" commandName="student">
<table>
	<tr>
		<td align="right" class="formLabelClass">Student RegistrationForm</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass"><p>Student ID:</p></td>
		<td class="formLabelClass">${student.studentID}</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass">First Name:</td>
		<td class="formLabelClass">${student.fname}</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass">Last Name:</td>
		<td class="formLabelClass">${student.lname}</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass"><p>Email ID:</p></td>
		<td class="formLabelClass">${student.email}</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass"><p>Phone No:</p></td>
		<td class="formLabelClass">${student.phone}</td>
	</tr>
	<tr>
	<td align="right" class="formLabelClass">Suitable Timings</td>
	<td class="formLabelClass">
		<c:forEach var="x" items="${student.timings}">
		${x}
		</c:forEach>
	</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass">Gender</td>
		<td class="formLabelClass">${student.gender}</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass">Qualification</td>
		<td class="formLabelClass">${student.qualification}</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass">Remarks</td>
		<td>${student.remarks}</td>
	</tr>
</table>
</form:form>
</center>
</body>
</html>
