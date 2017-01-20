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
		<td align="right" class="formLabelClass"><p>Name:</p></td>
		<td class="formLabelClass">
			<form:input path="name" cssClass="formFieldClass"/>
			<form:errors path="name" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass"><p>Email ID:</p></td>
		<td class="formLabelClass">
			<form:input path="email" cssClass="formFieldClass"/>
			<form:errors path="email" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass"><p>Phone No:</p></td>
		<td class="formLabelClass">
			<form:input path="phone" cssClass="formFieldClass"/>
			<form:errors path="phone" cssClass="error"/>
		</td>
	</tr>
	<tr>
	<td align="right" class="formLabelClass">Suitable Timings</td>
	<td class="formLabelClass">
		<form:checkbox path="timings" value="07:30AM-09:30AM"/>07:30AM-09:30AM<br/>
		<form:checkbox path="timings" value="10:30AM-02:30PM"/>10:30AM-02:30PM<br/>
		<form:checkbox path="timings" value="04:00PM-06:00PM"/>04:00PM-06:00PM<br/>
		<form:checkbox path="timings" value="06:30PM-08:30PM"/>06:30PM-08:30PM<br/>
		<form:checkbox path="timings" value="Weekends"/>Weekends(Only Advance)<br/>
		<form:errors path="timings" cssClass="error"/>
	</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass">Gender</td>
		<td class="formLabelClass">
			<form:radiobutton path="gender" value="Male"/>Male<br/>
			<form:radiobutton path="gender" value="Female"/>Female<br/>
			<form:errors path="gender" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass">Qualification</td>
		<td class="formLabelClass">
			<form:select path="qualification" cssClass="formFieldClass">
			<form:option value="-----Select option-----"/>
			<form:option value="MCA"/>
			<form:option value="BCA"/>
			<form:option value="MSc"/>
			<form:option value="BSc"/>
			</form:select>
			<form:errors path="qualification" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td align="right" class="formLabelClass">Remarks</td>
		<td>
			<form:textarea path="remarks" cssClass="formFieldClass" rows="5" cols="40" />
			<form:errors path="remarks" cssClass="error"/>
		</td>
	</tr>
	<tr>
		<td>
			<input type="submit" value="Register Now" class="formButtonClass"/>
		</td>
	</tr>
</table>
</form:form>
</center>
</body>
</html>
