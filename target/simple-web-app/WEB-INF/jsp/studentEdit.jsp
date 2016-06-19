<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
    <head>
        <title>Student Edit</title>
        <link rel="stylesheet" type="text/css" href="css/style.css"/>
    </head>
    <body>
        <h2>Student</h2>    
            <table>
                <form:form method="POST" action="/simple-web-app/store?id=${student.id}" 
                   commandName="student" >
                    <tr>
                        <td><form:label path="id">ID</form:label></td>
                        <td><form:input path="id" disabled="true" value="${student.id}"/></td>
                    </tr>
                    <tr>
                        <td><form:label path="name">Name</form:label></td>
                        <td><form:input path="name" value="${student.name}"/></td>
                        <td><form:errors path="name" cssClass="error" /></td>
                    </tr>
                    <tr>
                        <td><form:label path="surname">Surname</form:label></td>
                        <td><form:input path="surname" value="${student.surname}"/></td>
                        <td><form:errors path="surname" cssClass="error" /></td>
                    </tr>
                    <tr>
                        <td><form:label path="bornDate">Born date</form:label></td>
                        <td><form:input path="bornDate" placeholder="dd-MM-yyyy"
                                    value="${bornDate}"/></td>
                        <td><form:errors path="bornDate" cssClass="error" /></td>
                    </tr>
                    <tr>
                        <td><form:label path="gender">Gender</form:label></td>
                            <td>
                            <form:radiobutton path="gender" value="MALE" />Male 
                            <form:radiobutton path="gender" value="FEMALE" />Female
                        </td>
                        <td><form:errors path="gender" cssClass="error" /></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Edit"/>
                        </td>
                    </tr>
                </form:form>
                <tr>
                    <form:form method="GET" action="/simple-web-app/student" >
                        <td>
                            <input type="submit" value="Back"/>
                        </td>
                    </form:form>
                </tr>
            </table>  
        
    </body>
</html>
