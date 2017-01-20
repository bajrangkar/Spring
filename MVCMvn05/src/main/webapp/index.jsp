<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <body>
    <jsp:include page="header.jsp"/>
    <h1 align="center">Contact Home</h1>
    <h3>
    	<a href="<c:url value="contacts/addContact.next"/>">Add Contact</a><br/>
    	<a href="<c:url value="contacts/updateContact.next"/>">Update Contact</a><br/>
    	<a href="<c:url value="contacts/deleteContact.next"/>">Delete Contact</a><br/>
    	<a href="<c:url value="contacts/viewContact.next"/>">View Contact</a><br/>
    </h3>
  </body>
</html>