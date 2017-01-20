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
		<td align="right" class="formLabelClass">Student Registration Form</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass"><p>Student ID:</p></td>
		<td class="formLabelClass">
			<form:input path="studentID" cssClass="formFieldClass"/>
			<form:errors path="studentID" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass"><p>First Name:</p></td>
		<td class="formLabelClass">
			<form:input path="fname" cssClass="formFieldClass"/>
			<form:errors path="fname" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass"><p>Last Name:</p></td>
		<td class="formLabelClass">
			<form:input path="lname" cssClass="formFieldClass"/>
			<form:errors path="lname" cssClass="error"/>
		</td>
	</tr>
	<tr>
	<td align="center" colspan="2">
		<input type="submit" name="_cancel" value="Cancel" class="formButtonClass"/>
		<input type="submit" name="_target1" value="Next" class="formButtonClass"/>
		<input type="submit" name="_target3" value="Finish" class="formButtonClass"/>
	</td>
	</tr>
</table>
</form:form>
</center>
</body>
</html>
