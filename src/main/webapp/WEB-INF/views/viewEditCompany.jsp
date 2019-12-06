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
    <form method="POST" action="./editCompany/${id}">
        <label for="cnpj">CNPJ</label>
        <input type="text" name="cnpj" value="" id="cnpj" readonly/>

        <label for="name">Name</label>
        <input type="text" name="name" value="" id="name"/>

        <label for="email">E-mail</label>
        <input type="text" name="email" value="" id="email"/>

        <label for="cnpj">Adress</label>
        <input type="text" name="adress" value="" id="adress" readonly/>

        <h5>Vacancies</h5>
        <table>
            <thead>
                <tr>Title</tr>
                <tr>Description</tr>
                <tr>Requirements</tr>
                <tr>Options</tr>
            </thead>
            <tbody>
                <c:forEach items="${vancancies}" var="vacancy">
                    <td>${vacancy.title}</td>
                    <td>${vacancy.description}</td>
                    <td>${vacancy.requirements}</td>
                    <td>
                        <a href="./editVancancy/${vacancy.id}">Edit</a>
                        <a href="./deleteVacancy/${vancancy.id}">Remove</a>
                    </td>
                </c:forEach>
            </tbody>
        </table>

        <h5>Internship</h5>
        <table>
            <thead>
                <tr>Description</tr>
                <tr>Start Date</tr>
                <tr>End Date</tr>
                <tr>Options</tr>
            </thead>
            <tbody>
                <c:forEach items="${internships}" var="internship">
                    
                    <td>${internship.description}</td>
                    <td>${internship.startDate}</td>
                    <td>${internship.endDate}</td>
                    <td>
                        <a href="./editInternship/${internship.id}">Edit</a>
                        <a href="./deleteInternship/${internship.id}">Remove</a>
                    </td>
                </c:forEach>
            </tbody>
        </table>

        <h5>Supervisors</h5>
        <table>
            <thead>
                <tr>CPF</tr>                
            </thead>
            <tbody>
                <c:forEach items="${supervisors}" var="supervisor">                    
                    <td>${supervisor.cpf}</td>
                    <td>
                        <a href="./editSupervisor/${supervisor.id}">Edit</a>
                        <a href="./deleteSupervisor/${supervisor.id}">Remove</a>
                    </td>
                </c:forEach>
            </tbody>
        </table>



    </form>
</body>
</html>