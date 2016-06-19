<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Spring MVC</title>
    </head>
    <body>
        <h2>Student Information</h2>
        <table>
            <tr>
                <td>Name</td>
                <td>${student.name}</td>
            </tr>
            <tr>
                <td>Surname</td>
                <td>${student.surname}</td>
            </tr>
            <tr>
                <td>Born date</td>
                <td>${bornDate}</td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>${student.gender}</td>
            </tr>
            <tr>
                <form:form method="GET" action="/simple-web-app/student" >
                    <td colspan="4">
                        <input type="submit" value="Student List"/>
                    </td>
                </form:form>
            </tr>
        </table>  
    </body>
</html>