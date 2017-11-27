<%-- 
    Document   : ConductorServlet
    Created on : 26/11/2017, 12:01:40 PM
    Author     : jairo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Information</title>
    </head>
    <body>
        <h1>Student Information</h1>
        <form action="./ConductorServlet" method="POST">
            <table>
                <tr>
                    <th> Student ID</th>
                    <th><input type="text" name="studentId" value="${conductor.id}"/> </th>
                </tr>
                <tr>
                    <th> First Name</th>
                    <th> <input type="text" name="firstname" value="${conductor.nombre}"/></th>
                </tr>
                <tr>
                    <th> Last Name</th>
                    <th><input type="text" name="lastname" value="${conductor.cedula}"/> </th>
                </tr>
                <tr>
                    <th> Year Level</th>
                    <th> <input type="text" name="yearLevel" value="${conductor.tipoPago}"/></th>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Anadir"/>
                        <input type="submit" name="action" value="Editar"/>
                        <input type="submit" name="action" value="Borrar"/>
                        <input type="submit" name="action" value="Buscar"/>
                    </td>
                </tr>
            </table>
        </form>
        <br>
        <table border="1">
            <th>Student Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Year Level</th>
            <c:forEach items="${allConductores}" var="conductor">
                <tr>
                    <td>${conductor.nombre}</td>
                    <td>${conductor.cedula}</td>
                    <td>${conductor.tipoPago}</td>
                    <td>${conductor.id}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
