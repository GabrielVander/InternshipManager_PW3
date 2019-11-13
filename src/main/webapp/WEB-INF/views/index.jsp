<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Contacts List</title>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
    </tr>
    <c:forEach items="${ contacts }" var="contact">
        <tr>
            <td>${ contact.id }</td>
            <td>${ contact.name }</td>
            <td>${ contact.email }</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>