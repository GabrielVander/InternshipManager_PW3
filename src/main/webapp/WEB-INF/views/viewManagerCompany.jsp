<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean id="all" scope="request" class="org.internship.controller.CompanyController" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de controle de estágio</title>
</head>
<body>
	<h1>Manager Companies</h1>
    <table>
    <thead>
        <th>CNPJ</th>
        <th>E-mail</th>
        <th>Name</th>
        <th>Adress</th>
        <th>Available Vacancies</th>
        <th>Internships</th>
        <th>Supervisors</th>
    </thead>
    <tbody>
	<c:forEach items="${ companies }" var="company">
        <tr>
            <td>${ company.cnpj }</td>
            <td>${ company.email }</td>
            <td>${ company.name }</td>
            <td>${ company.adress }</td>
            <td>
                <c:forEach items="${ company.vacancies }" var="vancancy">
                    <span>${vacancy};</span><br>
                </c:forEach>
            </td>
            <td>
                <c:forEach items="${ company.internships }" var="internship">
                    <span>${internship}</span><br>
                </c:forEach>
            </td>
            <td>
                <c:forEach items="${ company.supervisors }" var="supervisor">
                    <span>${supervisor}</span><br>
                </c:forEach>
            </td>
            <td>
                <a href="./deleteCompany/${company.id}">Remove</a>
                <a href="./editCompany/${student.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
    </table>
</body>
</html>