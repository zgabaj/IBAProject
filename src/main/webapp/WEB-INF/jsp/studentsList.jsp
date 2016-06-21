
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students List</title>
    </head>
    <body>
        <h1>Students List</h1>
        <table>
            <tr>               
                <form:form method="GET" action="/simple-web-app/add" >
                    <td colspan="4">
                        <input type="submit" value="Add Student"/>
                    </td>
                </form:form>
            </tr>
            <c:forEach items = "${students}" var="student">
                <tr>
                    <td>
                         <c:out value="${student.id}"/>
                         <c:out value="${student.name}"/>
                         <c:out value="${student.surname}"/>

                    </td>
                    <form:form method="POST" action="/simple-web-app/edit?id=${student.id}">           
                        <td colspan="4">
                            <input type="submit" value="Edit"/>
                        </td>
                    </form:form>
                    <form:form method="POST" action="/simple-web-app/view?id=${student.id}">           
                        <td colspan="4">
                            <input type="submit" value="View"/>
                        </td>
                    </form:form>
                </tr>
            </c:forEach>
        </table>  
    </body>
</html>
