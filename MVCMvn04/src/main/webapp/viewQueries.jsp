<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Spring MVC 04</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1 align="right"><a href="<c:url value="/home.next"/>">Home</a></h1>
<center>
<h1>
List Of Queris<br/>
<c:forEach var="x" items="${list}">
${x}<br/>
</c:forEach></h1>
</center>
</body>
</html>
