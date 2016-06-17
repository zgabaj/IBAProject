<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>Spring MVC</title>
    </head>
    <body>
        <h2>Student</h2>
        <form:form method="POST" action="student" commandName="student" >
            <table>
                <tr>
                    <td>Name</td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>Surname</td>
                    <td><form:input path="surname" /></td>
                </tr>
                <tr>
                    <td>Born date</td>
                    <td><form:input path="bornDate" /></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <form:radiobutton path="gender" value="MALE" />Male 
                        <form:radiobutton path="gender" value="FEMALE" />Female
                    </td>
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
