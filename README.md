# IBAProject

Level 1-2
- create maven project in Netbeans 
- create SimpleServlet 
- add dependency plugin because of [WARNING] Warning: selected war files include a WEB-INF/web.xml which will be ig
nored
- configure web.xml

Level 3
- create hello.jsp for checking x parametrf from URL 
- add dependency for jstl
- change url pattern in web.xml to "/hello"
- change SimpleServlet : set attribute for loop in hello.jsp 

Level 4
- add dependency for spring framework
- refactor SimpleServlet to SpringController : two methods for mapping url with parmeter and without
- add spring-config.xml file 
- change web.xml configuration 
- some small changes in hello.jsp

Level 5
- create simple class Student and GenderEnum
- refactor SpringController to StudentController : tow methods for GET and POST request method
- add tow new jsp :  one for input form and one for output
- delete hello.jsp
- add folder for jsp files and change config in spring-config.xml
- change servlet name and url pattern in web.xml

