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
                <td>${name}</td>
            </tr>
            <tr>
                <td>Surname</td>
                <td>${surname}</td>
            </tr>
            <tr>
                <td>Born date</td>
                <td>${bornDate}</td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>${gender}</td>
            </tr>
        </table>  
    </body>
</html>