<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <body>
    <jsp:include page="header.jsp"/>
    <h1 align="center">Spring Home</h1>
    <h3>
    	<a href="<c:url value="/postQuery.next"/>">Post Spring Query</a><br/>
    	<a href="<c:url value="/viewQueries.next"/>">View Spring Queries</a><br/>
    	<a href="<c:url value="/changePassword.next"/>">Change Password</a><br/>
    	<a href="<c:url value="/changeEmail.next"/>">Change Email</a><br/>
    </h3>
  </body>
</html>
