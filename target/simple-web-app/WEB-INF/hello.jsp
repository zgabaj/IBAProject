<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP IBA</title>
  </head>
  <body>
    <c:if test="${x > 0}">
        <c:forEach begin="1" end="${x}" varStatus="loop">
            <h3>Hello IBA!</h3>
        </c:forEach>
    </c:if>
    
  </body>
</html>
