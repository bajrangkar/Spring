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
	<td align="center" colspan="2">
		<input type="submit" name="_target1" value="Previous" class="formButtonClass"/>
		<input type="submit" name="_cancel" value="Cancel" class="formButtonClass"/>
		<input type="submit" name="_target3" value="Finish" class="formButtonClass"/>
	</td>
	</tr>
</table>
</form:form>
</center>
</body>
</html>
