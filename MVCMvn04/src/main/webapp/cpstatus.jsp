<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
<jsp:include page="header.jsp"/>
<h1 align="right"><a href="<c:url value="/home.next"/>">Home</a></h1>
<h1>
${msg}<br/>
</h1>
</body>
</html>
