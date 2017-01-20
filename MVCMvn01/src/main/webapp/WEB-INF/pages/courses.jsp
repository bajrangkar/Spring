<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h1>Course Information : </h1>
	<ul>
		<c:forEach items="${AL}" var="cou">
		<li><h1>${cou}</h1></li>
		</c:forEach>	
	</ul>
</body>
</html>