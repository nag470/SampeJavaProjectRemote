<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>FirstName</th>
                <th>LastName</th>
                <th>Email</th>
                <th>Phone</th>
            </tr>
            <c:forEach var="per" items="${listPersons}">
                <tr>
                    <td><c:out value="${per.firstName}" /></td>
                    <td><c:out value="${per.lastName}" /></td>
                    <td><c:out value="${per.email}" /></td>
                    <td><c:out value="${per.phone}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div> 
<a href="/SampleWeb/index.jsp">Add Users</a>
</body>
</html>