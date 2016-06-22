<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>Stdent Add</title>
        <link rel="stylesheet" type="text/css" href="css/style.css"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script type="text/javascript" src="js/jquery.validate.min.js"></script>
        <script type="text/javascript" src="js/additional-methods.min.js"></script>
        <script type="text/javascript" src="js/studentValidation.js"></script>
    </head>
    <body>
        <h2>Student</h2>

        <form:form id="form" method="POST" action="/simple-web-app/add" commandName="student" >
            <table>        
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input  path="name" /></td>
                </tr>
                <tr>
                    <td><form:label path="surname">Surname</form:label></td>
                    <td><form:input path="surname" /></td>
                </tr>
                <tr>
                    <td><form:label path="bornDate">Born date</form:label></td>
                    <td><form:input path="bornDate" id="datepicker" placeholder="dd/mm/yyyy" /></td>
                </tr>
                <tr>
                    <td><form:label path="gender">Gender</form:label></td>
                        <td class="gender">
                        <form:radiobutton path="gender" value="MALE" />Male 
                        <form:radiobutton path="gender" value="FEMALE" />Female
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Submit"/>
                    </td>
                </tr>
            </table>
        </form:form>
        <form:form method="GET" action="/simple-web-app/student" >
            <table>
                <tr>
                    <td><input type="submit" value="Back"/></td>
                </tr>
            </table>  
        </form:form>

    </body>
</html>
