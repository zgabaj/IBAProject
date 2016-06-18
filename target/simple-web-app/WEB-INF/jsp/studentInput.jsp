<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>Spring MVC</title>
                <link rel="stylesheet" type="text/css" href="css/style.css"/>
    </head>
    <body>
        <h2>Student</h2>
    <form:form method="POST" action="student" commandName="student" >
        <table>
            <tr>
                <td><form:label path="name">Name</form:label></td>
                <td><form:input path="name" /></td>
                <td><form:errors path="name" cssClass="error" /></td>
            </tr>
            <tr>
                <td><form:label path="surname">Surname</form:label></td>
                <td><form:input path="surname" /></td>
                <td><form:errors path="surname" cssClass="error" /></td>
            </tr>
            <tr>
                <td><form:label path="bornDate">Born date</form:label></td>
                <td><form:input path="bornDate" /></td>
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
                <td colspan="4">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>  
    </form:form>
</body>
</html>
